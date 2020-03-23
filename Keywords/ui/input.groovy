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

public class input {
	
	@Keyword
	def lengkapiProfile(){
			
	KeywordUtil.logInfo("Click calendar")
		Mobile.tap(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/LengkapiProfile/calendar'), 10)
		Mobile.waitForElementPresent(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/LengkapiProfile/date/date_year'), 10)
		Mobile.takeScreenshot()
		
	KeywordUtil.logInfo("Click Year")
		Mobile.tap(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/LengkapiProfile/date/date_year'), 10)
		Mobile.scrollToText("2009")
		Mobile.scrollToText("2002")
		Mobile.scrollToText("1998")
		Mobile.takeScreenshot()
		Mobile.delay(1)
		
	KeywordUtil.logInfo("Select Year")
		Mobile.tap(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/LengkapiProfile/date/year_2000'), 10)
		Mobile.takeScreenshot()
		
	KeywordUtil.logInfo("Click date")
		Mobile.tap(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/LengkapiProfile/date/date_1'), 10)
		Mobile.tap(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/LengkapiProfile/date/button_Ok'), 10)
		Mobile.takeScreenshot()
		
	KeywordUtil.logInfo("Select Male")
		Mobile.checkElement(findTestObject('/loginform/LoginWithEmail/RegisterWithEmail/LengkapiProfile/rb_male'), 10)
		Mobile.takeScreenshot()
		
		
	}
}
