package pages
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class emulatorIWP30 {
	/**
	 * Refresh browser
	 */


	@Keyword
	def getData(int row) {

		println("Hello World")
		def MV = findTestData('IWP30PayNowCC').getValue('MV', row)
		println(MV)
		
		
		def Amount = findTestData('IWP30PayNowCC').getValue('Amount', row)
		
			println(Amount)
		
			def CAN = findTestData('IWP30PayNowCC').getValue('CAN', row)
		
			println(CAN)
		
			def Action = findTestData('IWP30PayNowCC').getValue('Action', row)
		
			println(Action)
		
			def Lang = findTestData('IWP30PayNowCC').getValue('Lang', row)
		
			println(Lang)
		
			def Fname = findTestData('IWP30PayNowCC').getValue('Fname', row)
		
			println(Fname)
		
			def Lname = findTestData('IWP30PayNowCC').getValue('Lname', row)
		
			println(Lname)
		
			def AL1 = findTestData('IWP30PayNowCC').getValue('AL1', row)
		
			println(AL1)
		
			def AL2 = findTestData('IWP30PayNowCC').getValue('AL2', row)
		
			println(AL2)
		
			def Country = findTestData('IWP30PayNowCC').getValue('Country', row)
		
			println(Country)
		
			def City = findTestData('IWP30PayNowCC').getValue('City', row)
		
			println(City)
		
			def State = findTestData('IWP30PayNowCC').getValue('State', row)
		
			println(State)
		
			def ZIP = findTestData('IWP30PayNowCC').getValue('ZIP', row)
		
			println(ZIP)
		
			def Order = findTestData('IWP30PayNowCC').getValue('Order', row)
		
			println(Order)
		
			def CompanyName = findTestData('IWP30PayNowCC').getValue('CompanyName', row)
		
			println(CompanyName)
		
			def Email = findTestData('IWP30PayNowCC').getValue('Email', row)
		
			println(Email)
		
			def UDF1 = findTestData('IWP30PayNowCC').getValue('UDF1', row)
		
			println(UDF1)
		
			def UDF2 = findTestData('IWP30PayNowCC').getValue('UDF2', row)
		
			println(UDF2)
		
			def UDF3 = findTestData('IWP30PayNowCC').getValue('UDF3', row)
		
			println(UDF3)
		
			def UDF4 = findTestData('IWP30PayNowCC').getValue('UDF4', row)
		
			println(UDF4)
		
			def UDF5 = findTestData('IWP30PayNowCC').getValue('UDF5', row)
		
			println(UDF5)
		
			def UDF6 = findTestData('IWP30PayNowCC').getValue('UDF6', row)
		
			println(UDF6)
		
			def UDF7 = findTestData('IWP30PayNowCC').getValue('UDF7', row)
		
			println(UDF7)
		
			def UDF8 = findTestData('IWP30PayNowCC').getValue('UDF8', row)
		
			println(UDF8)
		
			def UDF9 = findTestData('IWP30PayNowCC').getValue('UDF9', row)
		
			println(UDF9)
		
			def UDF10 = findTestData('IWP30PayNowCC').getValue('UDF10', row)
		
			println(UDF10)
		
		
		
		
		
		
		
	}





	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}
}