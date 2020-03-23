package ui

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.annotation.Keyword


public class start {

	@Keyword
	def checkpage(){


		if(Mobile.waitForElementPresent(findTestObject('/tourPage/text_Sakitapaya'), 20, FailureHandling.OPTIONAL)){

			Mobile.takeScreenshot()
			new ui.swipe().Left()
			Mobile.waitForElementPresent(findTestObject('/tourPage/text_butuhInfoKesehatanTerpercaaaya'), 10)
			Mobile.takeScreenshot()

			KeywordUtil.logInfo("tap button Mulai")
			Mobile.tap(findTestObject('/tourPage/button_Mulai'), 10)
			Mobile.waitForElementPresent(findTestObject('/home/search'), 10)
			Mobile.takeScreenshot()
		}else if(Mobile.waitForElementPresent(findTestObject('/home/text_menuProfile'), 1, FailureHandling.OPTIONAL)){

			new ui.go().signOut()
		}
	}
}
