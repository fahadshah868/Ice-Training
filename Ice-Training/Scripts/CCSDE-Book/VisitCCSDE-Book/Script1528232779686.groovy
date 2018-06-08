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

MobileBuiltInKeywords.tap(findTestObject('MainScreenEelements/CCSDE-Book'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CCSDE-Book/Validate_CCSDE_BookScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PosRanking/POSRanking'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CCSDE-Book/PosRanking/Validate_ProgramsScreen'), 'Programs')

MobileBuiltInKeywords.delay(1)

CustomKeywords.'customkeywordscollection.CustomKeywords.visitProgramsForPosRanking'()

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PosRanking/Programs_BackButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CCSDE-Book/Validate_CCSDE_BookScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PriceList/PriceList'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CCSDE-Book/PriceList/Validate_PriceListOptionsScreen'), 'Options')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PriceList/TradePrice'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.waitForElementPresent(findTestObject('CCSDE-Book/PriceList/Validate_PriceListDetailScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CCSDE-Book/PriceList/Validate_PriceListDetailScreen'), 'PRICE LIST')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PriceList/PriceListDetailScreen_BackButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CCSDE-Book/PriceList/Validate_PriceListOptionsScreen'), 'Options')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PriceList/RetailPrice'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.waitForElementPresent(findTestObject('CCSDE-Book/PriceList/Validate_PriceListDetailScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CCSDE-Book/PriceList/Validate_PriceListDetailScreen'), 'PRICE LIST')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PriceList/PriceListDetailScreen_BackButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CCSDE-Book/PriceList/Validate_PriceListOptionsScreen'), 'Options')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/PriceList/PriceListOptions_BackButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CCSDE-Book/Validate_CCSDE_BookScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/CycleActivities/CycleActivities'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementText(findTestObject('CCSDE-Book/CycleActivities/Validate_CycleActivitiesScreen'), 'CYCLE ACTIVITES')

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/CycleActivities/CycleActivities_BackButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CCSDE-Book/Validate_CCSDE_BookScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/ViewTVC/ViewTVC'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CCSDE-Book/ViewTVC/Validate_TVCListScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/ViewTVC/TVC'), 0)

MobileBuiltInKeywords.delay(5)

MobileBuiltInKeywords.pressBack()

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CCSDE-Book/ViewTVC/Validate_TVCListScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.tap(findTestObject('CCSDE-Book/ViewTVC/TVC_BackButton'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('CCSDE-Book/Validate_CCSDE_BookScreen'), 0)

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.pressBack()

MobileBuiltInKeywords.delay(1)

MobileBuiltInKeywords.verifyElementExist(findTestObject('MainScreenEelements/Validate_ApplicationMainScreen'), 0)

MobileBuiltInKeywords.delay(1)

