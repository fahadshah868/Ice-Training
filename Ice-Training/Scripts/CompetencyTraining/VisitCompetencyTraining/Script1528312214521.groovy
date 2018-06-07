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

Mobile.verifyElementExist(findTestObject('MainScreenEelements/Validate_ApplicationMainScreen'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MainScreenEelements/CompetencyTraining'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CompetencyTraining/Validate_DistributionProductScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/DistributionProduct'), 0)

MobileBuiltInKeywords.delay(1)

Mobile.verifyElementText(findTestObject('CompetencyTraining/Validate_DSFScreen'), 'Please select DSF')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/DSF'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CompetencyTraining/Validate_ProgramsScreen'), 'Programs')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/Program'), 0)

MobileBuiltInKeywords.delay(1)
