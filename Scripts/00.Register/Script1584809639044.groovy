import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable as GlobalVariable

def date = new Date()
def sdf = new SimpleDateFormat("yyyMMddhhmmSS")
	String newDate = sdf.format(date)
	println (newDate)

KeywordUtil.logInfo("Login to WS")
	Mobile.startApplication(GlobalVariable.pathapk, true)

//Check session, if user has logged in, it will be logged out by automation
CustomKeywords.'ui.start.checkpage'()

CustomKeywords.'ui.go.toLoginPage'()
	
KeywordUtil.logInfo("tap signup")
	Mobile.tap(findTestObject('/loginform/LoginWithEmail/button_Register'), 10)
	Mobile.waitForElementPresent(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/text_SignUp'), 10)
	
//Input data variable
String fullname = 'User Mobile'
String email = 'usermobile@'+newDate+'mailinator.com'
String password = 'usertest1234'
		
KeywordUtil.logInfo("input fullname")
	Mobile.setText(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/input_Fullname'), 
		fullname, 10)
	
KeywordUtil.logInfo("input email")
	Mobile.setText(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/input_Email'), 
		email, 10)
	
KeywordUtil.logInfo("input password")
	Mobile.setText(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/input_Password'), 
		password, 10)
	
KeywordUtil.logInfo("thick agreement")
	Mobile.checkElement(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/checkbox_Agreement'), 10)	
	Mobile.takeScreenshot()
	
KeywordUtil.logInfo("Click button Lanjutkan")
	Mobile.tap(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/button_Lanjutkan'), 10)
	Mobile.verifyElementExist(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/LengkapiProfile/button_PleaseWait'), 10)
	Mobile.takeScreenshot()
	
CustomKeywords.'ui.input.lengkapiProfile'()
	
KeywordUtil.logInfo("Click button Lanjutkan")
	Mobile.tap(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/LengkapiProfile/button_Lanjutkan'), 10)
	Mobile.takeScreenshot()

KeywordUtil.logInfo("Check user has logged in")
	Mobile.verifyElementExist(findTestObject('/home/menu_Profile'), 240)
	Mobile.takeScreenshot()

	