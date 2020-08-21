package vlinkPages

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

import internal.GlobalVariable

public class voidCCPage {



	String Void_TranType,Void_MV,Void_RemID,Void_AppID,Void_Username,Void_Password,Void_ResFormat
	String Void_TranID,Void_OrigTranType,Void_TrackData,Void_Track1Data,Void_Track2Data,Void_TaxAmount,Void_CAN,Void_UDF2



	@Keyword
	def getDataVCC(int rowM, String dataFileM) {


		Void_TranType = findTestData(dataFileM).getValue('Void_TranType', rowM)
		println(Void_TranType)

		Void_MV = findTestData(dataFileM).getValue('Void_MV', rowM)
		println(Void_MV)

		Void_RemID = findTestData(dataFileM).getValue('Void_RemID', rowM)
		println(Void_RemID)

		Void_AppID = findTestData(dataFileM).getValue('Void_AppID', rowM)
		println(Void_AppID)

		Void_Username = findTestData(dataFileM).getValue('Void_Username', rowM)
		println(Void_Username)

		Void_Password = findTestData(dataFileM).getValue('Void_Password', rowM)
		println(Void_Password)

		Void_ResFormat = findTestData(dataFileM).getValue('Void_ResFormat', rowM)
		println(Void_ResFormat)

		Void_TranID = findTestData(dataFileM).getValue('Void_TranID', rowM)
		println(Void_TranID)

		Void_OrigTranType = findTestData(dataFileM).getValue('Void_OrigTranType', rowM)
		println(Void_OrigTranType)

		Void_TrackData = findTestData(dataFileM).getValue('Void_TrackData', rowM)
		println(Void_TrackData)

		Void_Track1Data = findTestData(dataFileM).getValue('Void_Track1Data', rowM)
		println(Void_Track1Data)

		Void_Track2Data = findTestData(dataFileM).getValue('Void_Track2Data', rowM)
		println(Void_Track2Data)

		Void_TaxAmount = findTestData(dataFileM).getValue('Void_TaxAmount', rowM)
		println(Void_TaxAmount)

		Void_CAN = findTestData(dataFileM).getValue('Void_CAN', rowM)
		println(Void_CAN)

		Void_UDF2 = findTestData(dataFileM).getValue('Void_UDF2', rowM)
		println(Void_UDF2)



		// End of getData
	}



	@Keyword
	def setDataVCC(int rowS, String dataFileS) {


		this.getDataVCC(rowS, dataFileS)


		// Verify if we are on Credit Card Void page and populate the page

		if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Original Transaction Type_original_transaction_type'), 30))
		{

			println("We are on Void Credit Card Page, start populating")





			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Transaction Type_transaction_type'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Transaction Type_transaction_type'),Void_TranType)

			}
			else {println("Transaction Type field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Message Version _message_version'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Message Version _message_version'),Void_MV)

			}
			else {println("Message Version field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Remittance Id_remittance_id'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Remittance Id_remittance_id'),GlobalVariable.VLinkSaleRemID)

			}
			else {println("Remittance ID field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Application Id_application_id'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Application Id_application_id'),Void_AppID)

			}
			else {println("Application ID field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Username_username'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Username_username'),Void_Username)

			}
			else {println("Username field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Password_password'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Password_password'),Void_Password)

			}
			else {println("Password field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Response Format_response_format'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Response Format_response_format'),Void_ResFormat)

			}
			else {println("Response Format field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Transaction ID_transaction_id'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Transaction ID_transaction_id'),GlobalVariable.VLinkSaleTranxID)

			}
			else {println("Transaction ID field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Original Transaction Type_original_transaction_type'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Original Transaction Type_original_transaction_type'),Void_OrigTranType)

			}
			else {println("Original Transaction Type field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Track Data_track_data'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Track Data_track_data'),Void_TrackData)

			}
			else {println("Track Data field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Track 1 Data_track_1_data'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Track 1 Data_track_1_data'),Void_Track1Data)

			}
			else {println("Track 1 Data field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Track 2 Data_track_2_data'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Track 2 Data_track_2_data'),Void_Track2Data)

			}
			else {println("Track 2 Data field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Tax Amount_tax_amount'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Tax Amount_tax_amount'),Void_TaxAmount)

			}
			else {println("Tax Amount field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Client Account Number_client_account_number'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Client Account Number_client_account_number'),Void_CAN)

			}
			else {println("CAN field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_user_defined2_user_defined2'),30))
			{

				WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_user_defined2_user_defined2'),Void_UDF2)

			}
			else {println("UDF2 field is either missing or not modifiable on Void Credit Card Ppage")}


			// Select the Process VLink Transaction button
			WebUI.click(findTestObject('Object Repository/Page_QAVLinkCCVoid/btn_SubmitTransaction'))
			Thread.sleep(2000)



			// End of if statement
		}
		else {println("We are not on Void Credit Card Page")}




		// End of setData
	}















}
