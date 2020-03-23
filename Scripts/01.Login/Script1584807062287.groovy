import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable as GlobalVariable

KeywordUtil.logInfo("Login to WS")
	Mobile.startApplication(GlobalVariable.pathapk, false)
	Mobile.takeScreenshot()
	
//Check session, if user has logged in, it will be logged out by automation
CustomKeywords.'ui.start.checkpage'()

CustomKeywords.'ui.go.toLoginPage'()
	
KeywordUtil.logInfo("Input email")
	Mobile.setText(findTestObject('/loginform/LoginWithEmail/input_Email'), 
		GlobalVariable.email, 10)

KeywordUtil.logInfo("Input password")
	Mobile.setText(findTestObject('/loginform/LoginWithEmail/input_password'), 
		GlobalVariable.password, 10)
	Mobile.takeScreenshot()
	
KeywordUtil.logInfo("Tap button Lanjutkan")
	Mobile.tap(findTestObject('/loginform/LoginWithEmail/button_Lanjutkan'), 10)

	if (Mobile.waitForElementPresent(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/LengkapiProfile/text_LengkapiProfil'), 10)) {
		Mobile.takeScreenshot()
		CustomKeywords.'ui.input.lengkapiProfile'()
	}
	
KeywordUtil.logInfo("Check user has logged in")
	Mobile.verifyElementExist(findTestObject('/home/menu_Profile'), 240)
	Mobile.takeScreenshot()
	
	
	