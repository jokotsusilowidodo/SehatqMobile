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

public class swipe {
	
	@Keyword
	def Left() {


	def device_Height = Mobile.getDeviceHeight()
	def device_Width = Mobile.getDeviceWidth()

	int startY = device_Height / 2
	int endY = startY
	int startX = device_Width*(3/4)
	int endX = device_Width /20

	println(startX)
	println(startY)
	println(endX)
	println(endY)
	
	KeywordUtil.logInfo("Swipe Left")
		Mobile.swipe(startX, startY, endX, endY, FailureHandling.CONTINUE_ON_FAILURE)
	
	

	}
	
	@Keyword
	def up() {
		
	KeywordUtil.logInfo("Swipe up")
		
	int device_Height = Mobile.getDeviceHeight()
	int device_Width = Mobile.getDeviceWidth()
		
	int startX = device_Width / 2
	int endX = startX
	int startY = device_Height * (9/10)
	int endY = device_Height * (1/10)
		
	KeywordUtil.logInfo("Swipe up")
		Mobile.swipe(startX, startY, endX, endY)
		
	}
}
