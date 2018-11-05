package com.ct.qa.keywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.ct.qa.constants.ProjectConstants
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

import internal.GlobalVariable
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement

public class CCSDEBookKeywords {

	AppiumDriver<MobileElement> driver = ProjectConstants.DRIVER

	@Keyword
	def visitProgramsForPosRanking(){
		ArrayList<MobileElement> programs = driver.findElementsByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/*")
		for(int i=1; i<=programs.size();i++){
			driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout["+i+"]/android.widget.TextView[1]").click()
			Mobile.waitForElementPresent(findTestObject("Object Repository/CCSDE-Book/PosRanking/Validate_ZonalRankingScreen",[('package'):ProjectConstants.packagename]), 0)
			Mobile.verifyElementText(findTestObject("Object Repository/CCSDE-Book/PosRanking/Validate_ZonalRankingScreen",[('package'):ProjectConstants.packagename]), "Zonal RANKING")
			ArrayList<MobileElement> zone = driver.findElementsByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/*")
			for(int j=1; j <= zone.size(); j++){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout["+j+"]").click()
				Mobile.verifyElementText(findTestObject("Object Repository/CCSDE-Book/PosRanking/Validate_RegionalScreen",[('package'):ProjectConstants.packagename]), "Regional Ranking")
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]").click()
				Mobile.waitForElementPresent(findTestObject("Object Repository/CCSDE-Book/PosRanking/Validate_ASMRankingScreen",[('package'):ProjectConstants.packagename]), 0, FailureHandling.STOP_ON_FAILURE)
				Mobile.verifyElementText(findTestObject("Object Repository/CCSDE-Book/PosRanking/Validate_ASMRankingScreen",[('package'):ProjectConstants.packagename]), "ASM Ranking")
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]").click()
				Mobile.waitForElementPresent(findTestObject("Object Repository/CCSDE-Book/PosRanking/Validate_DistributionScreen",[('package'):ProjectConstants.packagename]), 0)
				Mobile.tap(findTestObject("Object Repository/CCSDE-Book/PosRanking/Distribution_BackButton",[('package'):ProjectConstants.packagename]), 0)
				Mobile.verifyElementText(findTestObject("Object Repository/CCSDE-Book/PosRanking/Validate_ASMRankingScreen",[('package'):ProjectConstants.packagename]), "ASM Ranking")
				Mobile.tap(findTestObject("Object Repository/CCSDE-Book/PosRanking/AsmRanking_BackButton",[('package'):ProjectConstants.packagename]), 0)
				Mobile.verifyElementText(findTestObject("Object Repository/CCSDE-Book/PosRanking/Validate_RegionalScreen",[('package'):ProjectConstants.packagename]), "Regional Ranking")
				Mobile.tap(findTestObject("Object Repository/CCSDE-Book/PosRanking/Regional_BackButton",[('package'):ProjectConstants.packagename]), 0)
				Mobile.verifyElementText(findTestObject("Object Repository/CCSDE-Book/PosRanking/Validate_ZonalRankingScreen",[('package'):ProjectConstants.packagename]), "Zonal RANKING")
			}
			Mobile.tap(findTestObject("Object Repository/CCSDE-Book/PosRanking/ZonalRanking_BackButton",[('package'):ProjectConstants.packagename]), 0)
			Mobile.verifyElementText(findTestObject("Object Repository/CCSDE-Book/PosRanking/Validate_ProgramsScreen",[('package'):ProjectConstants.packagename]), "Programs")
		}
	}
}
