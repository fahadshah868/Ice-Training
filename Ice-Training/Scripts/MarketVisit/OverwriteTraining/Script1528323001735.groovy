import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

MobileBuiltInKeywords.verifyElementText(findTestObject('MarketVisiting/Validate_TrainingStepsScreen'), 'Training Steps')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('MarketVisiting/POSAssessment'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('MarketVisiting/Validate_POSAssessmentPopUp'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('MarketVisiting/Standard'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('MarketVisiting/JuicesInsight'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('MarketVisiting/Validate_RemarksScreen'), 'Enter Remarks')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('MarketVisiting/TakePictureButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CommonElements/Validate_CameraScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/TakePhotoButton'), 0)

MobileBuiltInKeywords.delay(5)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/DoneButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('MarketVisiting/Validate_RemarksScreen'), 'Enter Remarks')

MobileBuiltInKeywords.delay(1)

Mobile.setText(findTestObject('MarketVisiting/RemarksTextArea'), 'Overwrite Remarks', 0)

MobileBuiltInKeywords.delay(1)

Mobile.hideKeyboard()

MobileBuiltInKeywords.tap(findTestObject('MarketVisiting/SubmitButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CommonElements/Validate_InfoPopUp'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/InfoPopUp_OKButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('MarketVisiting/Validate_TrainingStepsScreen'), 'Training Steps')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('MarketVisiting/PowderInsight'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('MarketVisiting/Validate_RemarksScreen'), 'Enter Remarks')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('MarketVisiting/TakePictureButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CommonElements/Validate_CameraScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/TakePhotoButton'), 0)

MobileBuiltInKeywords.delay(5)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/DoneButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('MarketVisiting/Validate_RemarksScreen'), 'Enter Remarks')

MobileBuiltInKeywords.delay(1)

Mobile.setText(findTestObject('MarketVisiting/RemarksTextArea'), 'Overwrite Remarks', 0)

MobileBuiltInKeywords.delay(1)

Mobile.hideKeyboard()

MobileBuiltInKeywords.tap(findTestObject('MarketVisiting/SubmitButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CommonElements/Validate_InfoPopUp'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/InfoPopUp_OKButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('MarketVisiting/Validate_TrainingStepsScreen'), 'Training Steps')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('MarketVisiting/UHTInsight'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('MarketVisiting/Validate_RemarksScreen'), 'Enter Remarks')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('MarketVisiting/TakePictureButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CommonElements/Validate_CameraScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/TakePhotoButton'), 0)

MobileBuiltInKeywords.delay(5)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/DoneButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('MarketVisiting/Validate_RemarksScreen'), 'Enter Remarks')

MobileBuiltInKeywords.delay(1)

Mobile.setText(findTestObject('MarketVisiting/RemarksTextArea'), 'Overwrite Remarks', 0)

MobileBuiltInKeywords.delay(1)

Mobile.hideKeyboard()

MobileBuiltInKeywords.tap(findTestObject('MarketVisiting/SubmitButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CommonElements/Validate_InfoPopUp'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/InfoPopUp_OKButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('MarketVisiting/Validate_TrainingStepsScreen'), 'Training Steps')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('MarketVisiting/OtherMarketInsight'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('MarketVisiting/Validate_RemarksScreen'), 'Enter Remarks')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('MarketVisiting/TakePictureButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CommonElements/Validate_CameraScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/TakePhotoButton'), 0)

MobileBuiltInKeywords.delay(5)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/DoneButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('MarketVisiting/Validate_RemarksScreen'), 'Enter Remarks')

MobileBuiltInKeywords.delay(1)

Mobile.setText(findTestObject('MarketVisiting/RemarksTextArea'), 'Overwrite Remarks', 0)

MobileBuiltInKeywords.delay(1)

Mobile.hideKeyboard()

MobileBuiltInKeywords.tap(findTestObject('MarketVisiting/SubmitButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CommonElements/Validate_InfoPopUp'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/InfoPopUp_OKButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('MarketVisiting/Validate_TrainingStepsScreen'), 'Training Steps')

MobileBuiltInKeywords.delay(1)

