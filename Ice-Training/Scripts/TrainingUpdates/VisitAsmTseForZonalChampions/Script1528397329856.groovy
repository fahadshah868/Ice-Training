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

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/CapabilityChampions/Validate_ASMTSEScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('TrainingUpdates/CapabilityChampions/ASM'), 0)

MobileBuiltInKeywords.delay(1)

Mobile.waitForElementPresent(findTestObject('TrainingUpdates/CapabilityChampions/Validate_ZonalChampionsScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('TrainingUpdates/CapabilityChampions/Validate_ZonalChampionsScreen'), 
    'ZONAL CHAMPIONS')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('TrainingUpdates/CapabilityChampions/ZonalChampions_BackButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/CapabilityChampions/Validate_ASMTSEScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('TrainingUpdates/CapabilityChampions/TSE'), 0)

MobileBuiltInKeywords.delay(1)

Mobile.waitForElementPresent(findTestObject('TrainingUpdates/CapabilityChampions/Validate_ZonalChampionsScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('TrainingUpdates/CapabilityChampions/Validate_ZonalChampionsScreen'), 
    'ZONAL CHAMPIONS')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('TrainingUpdates/CapabilityChampions/ZonalChampions_BackButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/CapabilityChampions/Validate_ASMTSEScreen'), 0)

MobileBuiltInKeywords.delay(1)

Mobile.pressBack()

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/CapabilityChampions/Validate_CenterSouthNorthScreen'), 
    0)

MobileBuiltInKeywords.delay(1)
