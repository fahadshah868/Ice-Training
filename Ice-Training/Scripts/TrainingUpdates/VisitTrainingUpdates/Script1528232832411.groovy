import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.ct.qa.constants.ProjectConstants
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

MobileBuiltInKeywords.tap(findTestObject('MainScreenEelements/TrainingUpdates',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.waitForElementPresent(findTestObject('TrainingUpdates/Validate_TrainingUpdatesScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/Validate_TrainingUpdatesScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.tap(findTestObject('TrainingUpdates/DSFTrainingStats/DSFTrainingStats',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/DSFTrainingStats/Validate_DSFTrainingStats',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.tap(findTestObject('TrainingUpdates/DSFTrainingStats/DSFTrainingStats_BackButton',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/Validate_TrainingUpdatesScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.tap(findTestObject('TrainingUpdates/CapabilityChampions/CapabilityChampions',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/CapabilityChampions/Validate_NationalZonalScreen',[('package'):ProjectConstants.packagename]), 
    0)

MobileBuiltInKeywords.tap(findTestObject('TrainingUpdates/CapabilityChampions/NationalChampions',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/CapabilityChampions/Validate_ASMTSEScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.tap(findTestObject('TrainingUpdates/CapabilityChampions/ASM',[('package'):ProjectConstants.packagename]), 0)

Mobile.waitForElementPresent(findTestObject('TrainingUpdates/CapabilityChampions/Validate_NationalChampionsScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('TrainingUpdates/CapabilityChampions/Validate_NationalChampionsScreen',[('package'):ProjectConstants.packagename]), 
    'NATIONAL CHAMPIONS')

MobileBuiltInKeywords.tap(findTestObject('TrainingUpdates/CapabilityChampions/NationalChampions_BackButton',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/CapabilityChampions/Validate_ASMTSEScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.tap(findTestObject('TrainingUpdates/CapabilityChampions/TSE',[('package'):ProjectConstants.packagename]), 0)

Mobile.waitForElementPresent(findTestObject('TrainingUpdates/CapabilityChampions/Validate_NationalChampionsScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('TrainingUpdates/CapabilityChampions/Validate_NationalChampionsScreen',[('package'):ProjectConstants.packagename]), 
    'NATIONAL CHAMPIONS')

MobileBuiltInKeywords.tap(findTestObject('TrainingUpdates/CapabilityChampions/NationalChampions_BackButton',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/CapabilityChampions/Validate_ASMTSEScreen',[('package'):ProjectConstants.packagename]), 0)

Mobile.pressBack()

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/CapabilityChampions/Validate_NationalZonalScreen',[('package'):ProjectConstants.packagename]), 
    0)

MobileBuiltInKeywords.tap(findTestObject('TrainingUpdates/CapabilityChampions/ZonalChampions',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/CapabilityChampions/Validate_CenterSouthNorthScreen',[('package'):ProjectConstants.packagename]), 
    0)

CustomKeywords.'com.ct.qa.keywords.TrainingUpdates.visitAsmTseZoneForZonalChampions'()

MobileBuiltInKeywords.tap(findTestObject('TrainingUpdates/CapabilityChampions/CenterSouthNorthScreen_BackButton',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/CapabilityChampions/Validate_NationalZonalScreen',[('package'):ProjectConstants.packagename]), 
    0)

MobileBuiltInKeywords.pressBack()

MobileBuiltInKeywords.verifyElementExist(findTestObject('TrainingUpdates/Validate_TrainingUpdatesScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.pressBack()

MobileBuiltInKeywords.verifyElementExist(findTestObject('MainScreenEelements/Validate_ApplicationMainScreen',[('package'):ProjectConstants.packagename]), 0)

