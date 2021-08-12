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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.MultiBillNoCFURL)

WebUI.maximizeWindow()

		def numOfRows = findTestData('QA/EnhancedMultiBillTestData/SingleBillCCTestData').getRowNumbers()
		println("Number of Rows : " + numOfRows)
		
		
String DoExecute = Execute
if (DoExecute.toUpperCase() == "Y")
	{
		println("Value of Execute is Y")


		println("SearchString is : " + SearchString)
		
		WebUI.setText(findTestObject('Object Repository/MultiBill/input_Search_searchInput'), SearchString)
		
		WebUI.click(findTestObject('Object Repository/MultiBill/button_Search'))

		if (findTestObject('Object Repository/MultiBill/AddtoCart')) {
		    println('Add to Cart button found')
		}

		WebUI.click(findTestObject('Object Repository/MultiBill/AddtoCart'), FailureHandling.OPTIONAL)
		
		WebUI.delay(10)
		
		WebUI.verifyTextPresent('1 Item(s) Added to Cart', false)

			if (WebUI.verifyTextPresent('1 Item(s) Added to Cart', false)) {
			    println('Bill added to cart, continue executing test case')
			
			    WebUI.click(findTestObject('Object Repository/MultiBill/button_View Cart'))
			
			    WebUI.click(findTestObject('Object Repository/MultiBill/button_Checkout'))
			
			    WebUI.click(findTestObject('Object Repository/MultiBill/input_Pay by Credit or Branded Debit_paymentMethod'))
			
			    WebUI.click(findTestObject('Object Repository/MultiBill/input_Pay by Corporate Check_payNowSubmit'))
			
			    WebUI.setText(findTestObject('Object Repository/MultiBill/input__cardNumber'), CardNumber)
			
			    WebUI.setText(findTestObject('Object Repository/MultiBill/input__spc'), '125')
			
			    WebUI.selectOptionByValue(findTestObject('MultiBill/select_MM'), '5', true)
			
			    WebUI.selectOptionByValue(findTestObject('MultiBill/select_YYYY'), '2025', true)
			
			    WebUI.click(findTestObject('Object Repository/MultiBill/input_of Parcels_checkedAcceptCondition'))
			
			    WebUI.click(findTestObject('Object Repository/MultiBill/input_of Parcels_ccSubmit'))
			
			    WebUI.click(findTestObject('Object Repository/MultiBill/input_-_confirmNotifyAction'))
			
				    if (WebUI.verifyElementText(findTestObject('Object Repository/MultiBill/h3_Successful Payment Receipt'), 'Successful Payment Receipt')) {
				        println('Test Case Passed')
				    } else {
				        println('Test Case Failed')
				    }
			} else {
			    println('Bill is already paid, move on to next test case')
			}

	}
	
else
	{println("Value of Execute is NOT Y")}
