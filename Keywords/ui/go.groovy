package ui

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable

public class go {

	@Keyword
	def toLoginPage(){


		KeywordUtil.logInfo("tap menu login")
		Mobile.tap(findTestObject('/home/menu_Login'), 60)
		Mobile.waitForElementPresent(findTestObject('/loginform/text_Skipkeepbrowsing'), 10)
		Mobile.takeScreenshot()

		KeywordUtil.logInfo("tap continue with email")
		Mobile.tap(findTestObject('/loginform/button_ContinueWithEmail'), 10)
		Mobile.waitForElementPresent(findTestObject('/loginform/LoginWithEmail/text_Header'), 10)
		Mobile.takeScreenshot()
	}

	@Keyword
	def signOut(){

		KeywordUtil.logInfo("tap button profile")
		Mobile.tap(findTestObject('/home/menu_Profile'), 10)
		Mobile.waitForElementPresent(findTestObject('/home/ProfilSaya/text_ProfilSaya'), 10)
		Mobile.takeScreenshot()

		KeywordUtil.logInfo("tap button more")
		Mobile.tap(findTestObject('/home/ProfilSaya/more'), 120)
		Mobile.waitForElementPresent(findTestObject('/home/ProfilSaya/more_menu/button_Terapkan'), 10)
		Mobile.takeScreenshot()

		KeywordUtil.logInfo("tap button Terapkan")
		Mobile.tap(findTestObject('/home/ProfilSaya/more_menu/button_Terapkan'), 10)
		Mobile.waitForElementPresent(findTestObject('/home/ProfilSaya/more_menu/AppSetting/text_AppSetting'), 10)
		Mobile.takeScreenshot()

		KeywordUtil.logInfo("tap button Sign out")
		Mobile.tap(findTestObject('/home/ProfilSaya/more_menu/AppSetting/button_Signout'), 10)
		Mobile.waitForElementPresent(findTestObject('/home/ProfilSaya/more_menu/AppSetting/PopUp/text_LogoutConfirm'), 10)
		Mobile.takeScreenshot()

		KeywordUtil.logInfo("tap button ya")
		Mobile.tap(findTestObject('/home/ProfilSaya/more_menu/AppSetting/PopUp/button_Ya'), 10)
		Mobile.waitForElementPresent(findTestObject('/home/menu_Login'), 10)
		Mobile.takeScreenshot()
	}
}
