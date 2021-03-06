import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.ct.qa.constants.ProjectConstants
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/ShopsList_BackButton',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('CompetencyTraining/Validate_ProgramsScreen',[('package'):ProjectConstants.packagename]), 'Programs')

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/Programs_BackButton',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('CompetencyTraining/Validate_DSFScreen',[('package'):ProjectConstants.packagename]), 'Please select DSF')

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/DSF_BackButton',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CompetencyTraining/Validate_DistributionProductScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.tap(findTestObject('CompetencyTraining/DistributionProduct_BackButton',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('MainScreenEelements/Validate_ApplicationMainScreen',[('package'):ProjectConstants.packagename]), 0)

