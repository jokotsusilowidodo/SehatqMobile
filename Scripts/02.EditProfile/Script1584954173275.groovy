import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable as GlobalVariable

def date = new Date()
def sdf = new SimpleDateFormat("ddhhmmSS")
	String newDate = sdf.format(date)
	println (newDate)
	
//User has login
KeywordUtil.logInfo("Login to WS")
	Mobile.startApplication(GlobalVariable.pathapk, false)
	Mobile.waitForElementPresent(findTestObject('/home/menu_Profile'), 120)
	Mobile.takeScreenshot()
	
KeywordUtil.logInfo("Tap Profile Menu")
	Mobile.tap(findTestObject('/home/menu_Profile'), 10)
	Mobile.waitForElementPresent(findTestObject('/home/ProfilSaya/text_ProfilSaya'), 10)
	Mobile.takeScreenshot()
	
KeywordUtil.logInfo("Tap Edit Profile")
	Mobile.tap(findTestObject('/home/ProfilSaya/button_EditProfile'), 10)
	Mobile.waitForElementPresent(findTestObject('/home/ProfilSaya/EditProfile/text_EditProfile'), 10)
	Mobile.takeScreenshot()
	
	//Get old data
	def tb = Mobile.getText(findTestObject('/home/ProfilSaya/EditProfile/input_TinggiBadan'), 10)
	def bb = Mobile.getText(findTestObject('/home/ProfilSaya/EditProfile/input_BeratBadan'), 10)
	def phone = Mobile.getText(findTestObject('/home/ProfilSaya/EditProfile/input_PhoneNo'), 10)
	def address = Mobile.getText(findTestObject('/home/ProfilSaya/EditProfile/input_Address'), 10)
	
	println("Tinggi = "+tb)
	println("Berat = "+bb)
	println("Phone = "+phone)
	println("Alamat = "+address)
	
	//define new data variable
	def tbNum = tb.toInteger()
	def bbNum = bb.toInteger()
	
	int tbnewNum = tbNum+1
	int bbnewNum = bbNum+1
	
	def tbNew = tbnewNum.toString()
	def bbNew = bbnewNum.toString()
	
	def phonenew = "628"+newDate
	def addressnew = address+" New"
	
KeywordUtil.logInfo("input tinggi badan")
	Mobile.setText(findTestObject('/home/ProfilSaya/EditProfile/input_TinggiBadan'), 
		tbNew, 10)
	
KeywordUtil.logInfo("input berat badan")
	Mobile.setText(findTestObject('/home/ProfilSaya/EditProfile/input_BeratBadan'), 
		bbNew, 10)

KeywordUtil.logInfo("input phone")
	Mobile.setText(findTestObject('/home/ProfilSaya/EditProfile/input_PhoneNo'), 
		phonenew, 10)
	
KeywordUtil.logInfo("input address")
	Mobile.setText(findTestObject('/home/ProfilSaya/EditProfile/input_Address'), 
		addressnew, 10)
	Mobile.takeScreenshot()
	
KeywordUtil.logInfo("Tap button Simpan")
	Mobile.scrollToText("Simpan")
	Mobile.delay(1)
	Mobile.tap(findTestObject('/home/ProfilSaya/EditProfile/button_Save'), 10)
	
KeywordUtil.logInfo("Check toast success message")
	Mobile.delay(1)
	Mobile.takeScreenshot()
	
	
KeywordUtil.logInfo("Tap Edit Profile")
	Mobile.tap(findTestObject('/home/ProfilSaya/button_EditProfile'), 10)
	Mobile.waitForElementPresent(findTestObject('/home/ProfilSaya/EditProfile/text_EditProfile'), 10)
	
	//Get newest data
	def tblatest = Mobile.getText(findTestObject('/home/ProfilSaya/EditProfile/input_TinggiBadan'), 10)
	def bblatest = Mobile.getText(findTestObject('/home/ProfilSaya/EditProfile/input_BeratBadan'), 10)
	def phonelatest = Mobile.getText(findTestObject('/home/ProfilSaya/EditProfile/input_PhoneNo'), 10)
	def addresslatest = Mobile.getText(findTestObject('/home/ProfilSaya/EditProfile/input_Address'), 10)
	
	println("Tinggi Latest = "+tblatest)
	println("Berat Latest = "+bblatest)
	println("Phone Latest = "+phonelatest)
	println("Alamat Latest = "+addresslatest)
	Mobile.takeScreenshot()
	
	//Compare data after user save 
if (tblatest==tbNew&&bblatest==bblatest&&phonenew==phonelatest&&addresslatest==addressnew) {
	KeywordUtil.markPassed("Data Succeed update")
	
		}else{
		
		KeywordUtil.markFailed("Actual data, TB = "+tblatest+" | BB = "+bblatest+" | Phone = "+phonelatest+" | Address = "+addresslatest)

}
	
	
	