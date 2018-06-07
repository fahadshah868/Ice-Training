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

MobileBuiltInKeywords.verifyElementText(findTestObject('CompetencyTraining/Validate_TrainingStepsScreen'), 'Training Steps')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/RatingonICESteps'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CompetencyTraining/Validate_RateDSFScreen'), 'Rate DSF')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/RouteManagement'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/Standard'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/RouteManagement'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/PlanTheDay'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/Standard'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/PlanTheDay'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/OutletStockCheck'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/Standard'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/OutletStockCheck'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/Merchandising'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/Standard'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/Merchandising'), 0)

MobileBuiltInKeywords.delay(1)

Mobile.pressBack()

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CompetencyTraining/Validate_TrainingStepsScreen'), 'Training Steps')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/FieldSalesCoaching'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CompetencyTraining/Validate_FieldSalesCoachingScreen'), 'Field Sales Coaching')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/FieldSalesCoachingTakePicture_ImageView'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CommonElements/Validate_CameraScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/TakePhotoButton'), 0)

MobileBuiltInKeywords.delay(5)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/DoneButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CompetencyTraining/Validate_FieldSalesCoachingScreen'), 'Field Sales Coaching')

MobileBuiltInKeywords.delay(1)

Mobile.pressBack()

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CompetencyTraining/Validate_TrainingStepsScreen'), 'Training Steps')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/CapturingPictureOfSuccess'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CompetencyTraining/Validate_PictureOfSuccessDetailScreen'), 0)

MobileBuiltInKeywords.delay(1)

CustomKeywords.'customkeywordscollection.CustomKeywords.takePictureOfSuccess'()

Mobile.pressBack()

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CompetencyTraining/Validate_TrainingStepsScreen'), 'Training Steps')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/MarketIntelligence'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CompetencyTraining/Validate_MarketIntelligenceScreen'), 'Market Intelligence (Optional)')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/MarketIntelligenceTakePicture_ImageView'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CommonElements/Validate_CameraScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/TakePhotoButton'), 0)

MobileBuiltInKeywords.delay(5)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/DoneButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CompetencyTraining/Validate_MarketIntelligenceScreen'), 'Market Intelligence (Optional)')

MobileBuiltInKeywords.delay(1)

Mobile.pressBack()

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CompetencyTraining/Validate_TrainingStepsScreen'), 'Training Steps')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/Remarks'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CompetencyTraining/Validate_RemarksScreen'), 'Enter Remarks')

MobileBuiltInKeywords.delay(1)

Mobile.setText(findTestObject('CompetencyTraining/Remarks_TextContainer'), 'Overwrite Remarks', 0)

Mobile.hideKeyboard()

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/SubmitRemarksButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CommonElements/Validate_InfoPopUp'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CommonElements/InfoPopUp_OKButton'), 0)

MobileBuiltInKeywords.delay(1)

