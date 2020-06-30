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

    // End getData
    WebUI.openBrowser('https://qa.velocitypayment.com/agency/config.do?action=editor')

    WebUI.maximizeWindow() 
	
	//Begin setData



			WebUI.selectOptionByValue(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/MV'), 
				    '3_0', true)
				
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/Amount'), 
				    '20.00')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/CAN'), 
			    '256987')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/Action'), 
			    'paynow')
			
			//WebUI.click(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/td'))
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/Lang'), 
			    'en_us')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/Fname'), 
			    'mku')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/Lname'), 
			    'dfdf')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/AL1'), 
			    '125 main')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/AL2'), 
			    'suti')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/Country'), 
			    '840')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/City'), 
			    'arlington')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/State'), 
			    'VA')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/ZIP'), 
			    '22201')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/Order'), 
			    '1234')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/CompanyName'), 
			    'comp')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/Email'), 
			    'iahmed@govolution.com')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/UDF1'), 
			    '1')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/UDF2'), 
			    '2')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/UDF3'), 
			    '3')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/UDF4'), 
			    '4')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/UDF5'), 
			    '5')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/UDF6'), 
			    '6')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/UDF7'), 
			    '7')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/UDF8'), 
			    '8')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/UDF9'), 
			    '9')
			
			WebUI.setText(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/UDF10'), 
			    '10')
			
			WebUI.click(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/Submit'))

			// End setData

//WebUI.closeBrowser()

			
			
			
}			
