import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.ct.qa.constants.ProjectConstants
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

Mobile.verifyElementText(findTestObject('CompetencyTraining/Validate_FieldSalesCoachingScreen',[('package'):ProjectConstants.packagename]), 'Field Sales Coaching')

Mobile.tap(findTestObject('CompetencyTraining/FieldSalesCoachingTakePicture_ImageView',[('package'):ProjectConstants.packagename]), 0)

Mobile.verifyElementExist(findTestObject('CommonElements/Validate_CameraScreen',[('package'):ProjectConstants.packagename]), 0)

Mobile.tap(findTestObject('CommonElements/TakePhotoButton',[('package'):ProjectConstants.packagename]), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CommonElements/DoneButton',[('package'):ProjectConstants.packagename]), 0)

Mobile.verifyElementText(findTestObject('CompetencyTraining/Validate_FieldSalesCoachingScreen',[('package'):ProjectConstants.packagename]), 'Field Sales Coaching')

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('CompetencyTraining/Validate_TrainingStepsScreen',[('package'):ProjectConstants.packagename]), 'Training Steps')

