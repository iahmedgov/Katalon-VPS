import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Open Browser with QA Test Harness

//WebUI.openBrowser('https://dev-algorithm.govolution.com/vrelaytest/QA/version_2_2/vrelaytest.html')


//WebUI.navigateToUrl('https://dev-algorithm.govolution.com/vrelaytest/QA/version_2_2/')

//WebUI.closeBrowser()

	def numOfRows = findTestData('IWP30PayNowCC').getRowNumbers()

println(numOfRows)

	def dataFile = "IWP30PayNowCC"


// For each row in the spreadsheet, execute the given steps	
//for (def row = 1; row <= numOfRows; row++) {
//	
//	def CCAmount = findTestData('IWP30PayNowCC').getValue('CCAmount', row)
//	
//	println ("Iteration: "+row)
//	println("CCAmount: " + CCAmount)
//		
////	if ((CCAmount != null) && (!CCAmount.isEmpty()))
//	if (!CCAmount.isEmpty())
//	{
//		println 22
//	}
//	else 
//	{ println 33}
//	
//	
//}
	
	try {
		int x = 4/0
		
		println x
		
	}
	catch (Exception exp) {
		println exp.getMessage()
	}
	