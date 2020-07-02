import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


// Emulator URL: https://qa.velocitypayment.com/agency/config.do?action=editor
def numOfRows = findTestData('IWP30PayNowCC').getRowNumbers()

println(numOfRows)

for (def row = 1; row <= numOfRows; row++) {
    // Begin getData	
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
	
	
	def AppID = findTestData('IWP30PayNowCC').getValue('AppID', row)

	println(AppID)
	
	def MessageVersion = findTestData('IWP30PayNowCC').getValue('MessageVersion', row)
	
	println(MessageVersion)
    

    // End getData
    WebUI.openBrowser('https://qa.velocitypayment.com/agency/config.do?action=editor')

    WebUI.maximizeWindow() 
	
	//Begin setData

									//  findTestObject('IWP30/Page_VRelay30Emulator/MV')

			WebUI.selectOptionByValue(findTestObject('IWP30/Page_VRelay30Emulator/MV'),MV, true)
				
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Amount'),Amount)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/CAN'),CAN)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Action'),Action)
			
			//WebUI.click(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/td'))
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lang'),Lang)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Fname'),Fname)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lname'),Lname)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL1'),AL1)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL2'),AL2)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Country'),Country)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/City'),City)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/State'),State)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/ZIP'),ZIP)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Order'),Order)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Company'),CompanyName)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Email'),Email)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF1'),UDF1)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF2'),UDF2)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF3'),UDF3)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF4'),UDF4)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF5'),UDF5)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF6'),UDF6)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF7'),UDF7)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF8'),UDF8)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF9'),UDF9)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF10'),UDF10)
			Thread.sleep(10000)
			
			WebUI.click(findTestObject('IWP30/Page_VRelay30Emulator/Submit'))
			
			

			// End setData

			WebUI.closeBrowser()
			
			WebUI.openBrowser('https://dev-algorithm.govolution.com/vrelaytest/QA/version_2_2/vrelaytest.html')
			WebUI.maximizeWindow()
			
			def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
			
//Verify if we are on the TestHarness page and Populate the TestHarness
						
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'), 30)) 
			{
				println("We are on Test Harness page, start populating")
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/ApplicationID'),AppID)
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/MessageVersion'),MessageVersion)
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'),genRemIDVoid)
				WebUI.click(findTestObject('Object Repository/IWP30/Page_QATestHarness/SubmitButton'))
				
			}
			else {
				
				println ("Not on Test Harness page")
			}
			
			
// Verify if we are on the Select Payment Method page and populate the page
			
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCreditCard'), 30))
			{
				println("We are on Select Payment Method page, start populating")
				WebUI.check(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCreditCard'))
				Thread.sleep(1000)
				
				WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))
				
			}
			else
			{
				println("Not on Select Payment Method page")	
			}
			
			
			
			
			
}			
