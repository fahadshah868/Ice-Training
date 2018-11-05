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

MobileBuiltInKeywords.tap(findTestObject('MainScreenEelements/CCSDE-Book',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CCSDE-Book/Validate_CCSDE_BookScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PosRanking/POSRanking',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('CCSDE-Book/PosRanking/Validate_ProgramsScreen',[('package'):ProjectConstants.packagename]), 'Programs')

CustomKeywords.'com.ct.qa.keywords.CCSDEBookKeywords.visitProgramsForPosRanking'()

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PosRanking/Programs_BackButton',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CCSDE-Book/Validate_CCSDE_BookScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PriceList/PriceList',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('CCSDE-Book/PriceList/Validate_PriceListOptionsScreen',[('package'):ProjectConstants.packagename]), 'Options')

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PriceList/TradePrice',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.waitForElementPresent(findTestObject('CCSDE-Book/PriceList/Validate_PriceListDetailScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('CCSDE-Book/PriceList/Validate_PriceListDetailScreen',[('package'):ProjectConstants.packagename]), 'PRICE LIST')

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PriceList/PriceListDetailScreen_BackButton',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('CCSDE-Book/PriceList/Validate_PriceListOptionsScreen',[('package'):ProjectConstants.packagename]), 'Options')

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PriceList/RetailPrice',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.waitForElementPresent(findTestObject('CCSDE-Book/PriceList/Validate_PriceListDetailScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('CCSDE-Book/PriceList/Validate_PriceListDetailScreen',[('package'):ProjectConstants.packagename]), 'PRICE LIST')

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PriceList/PriceListDetailScreen_BackButton',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('CCSDE-Book/PriceList/Validate_PriceListOptionsScreen',[('package'):ProjectConstants.packagename]), 'Options')

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PriceList/PriceListOptions_BackButton',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CCSDE-Book/Validate_CCSDE_BookScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/CycleActivities/CycleActivities',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('CCSDE-Book/CycleActivities/Validate_CycleActivitiesScreen',[('package'):ProjectConstants.packagename]), 'CYCLE ACTIVITES')

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/CycleActivities/CycleActivities_BackButton',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CCSDE-Book/Validate_CCSDE_BookScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/ViewTVC/ViewTVC',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CCSDE-Book/ViewTVC/Validate_TVCListScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/ViewTVC/TVC',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.delay(5)

MobileBuiltInKeywords.pressBack()

MobileBuiltInKeywords.verifyElementExist(findTestObject('CCSDE-Book/ViewTVC/Validate_TVCListScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/ViewTVC/TVC_BackButton',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CCSDE-Book/Validate_CCSDE_BookScreen',[('package'):ProjectConstants.packagename]), 0)

MobileBuiltInKeywords.pressBack()

MobileBuiltInKeywords.verifyElementExist(findTestObject('MainScreenEelements/Validate_ApplicationMainScreen',[('package'):ProjectConstants.packagename]), 0)

