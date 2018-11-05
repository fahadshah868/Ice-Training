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

public class MarketVisitKeywords {

	AppiumDriver<MobileElement> driver = ProjectConstants.DRIVER;

	def findCurrentVisitingShop(){
		MobileElement list = driver.findElementByClassName("android.widget.ListView")
		int totalshops = list.findElementsByXPath(".//*").size()
		for(int i=1; i<= totalshops; i++){
			MobileElement shop = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]")
			String shoptext = shop.getText()
			if(shoptext.equals(ProjectConstants.CURRENTVISITING_SHOPNAME)){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				break
			}
			else{}
		}
	}
	@Keyword
	def visitShopWithDataVerification(){
		MobileElement list = driver.findElementByClassName("android.widget.ListView")
		int totalshops = list.findElementsByXPath(".//*").size()
		for(int i=1; i<= totalshops; i++){
			driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
			Mobile.callTestCase(findTestCase("Test Cases/MarketVisit/VisitTraining"), null)
			Mobile.callTestCase(findTestCase("Test Cases/MarketVisit/SaveTraining"), null)
			Mobile.callTestCase(findTestCase("Test Cases/MarketVisit/BackToMainScreen"), null)
			break
		}
	}
	@Keyword
	def visitShopWithOverwriteScenarios(){
		MobileElement list = driver.findElementByClassName("android.widget.ListView")
		int totalshops = list.findElementsByXPath(".//*").size()
		for(int i=1; i<= totalshops; i++){			
			if(i == 1){
				MobileElement shop = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]")
				ProjectConstants.CURRENTVISITING_SHOPNAME = shop.getText()
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				Mobile.callTestCase(findTestCase("Test Cases/MarketVisit/VisitTraining"), null)
				Mobile.callTestCase(findTestCase("Test Cases/MarketVisit/OverwriteTraining"), null)
				Mobile.callTestCase(findTestCase("Test Cases/MarketVisit/SaveTraining"), null)
			}
			else if(i == 2){
				MobileElement shop = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]")
				ProjectConstants.CURRENTVISITING_SHOPNAME = shop.getText()
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				Mobile.callTestCase(findTestCase("Test Cases/MarketVisit/VisitTraining"), null)
				Mobile.callTestCase(findTestCase("Test Cases/MarketVisit/SaveTraining"), null)
				findCurrentVisitingShop()
				Mobile.callTestCase(findTestCase("Test Cases/MarketVisit/OverwriteTraining"), null)
				Mobile.callTestCase(findTestCase("Test Cases/MarketVisit/SaveTraining"), null)
			}
			else{
				break
			}
		}
		Mobile.callTestCase(findTestCase("Test Cases/MarketVisit/BackToMainScreen"), null)
	}
	@Keyword
	def visitTraining(){
		MobileElement list = driver.findElementByClassName("android.widget.ListView")
		int totalassessments = list.findElementsByXPath(".//*").size()
		for(int i=1; i<= totalassessments; i++){
			driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
			Mobile.verifyElementText(findTestObject('MarketVisiting/Validate_RemarksScreen',[('package'):ProjectConstants.packagename]), 'Enter Remarks')
			Mobile.tap(findTestObject('Object Repository/MarketVisiting/TakePictureButton',[('package'):ProjectConstants.packagename]), 0)
			Mobile.verifyElementExist(findTestObject('CommonElements/Validate_CameraScreen',[('package'):ProjectConstants.packagename]), 0)
			Mobile.tap(findTestObject('CommonElements/TakePhotoButton',[('package'):ProjectConstants.packagename]), 0)
			Mobile.delay(5)
			Mobile.tap(findTestObject('CommonElements/DoneButton',[('package'):ProjectConstants.packagename]), 0)
			Mobile.verifyElementText(findTestObject('MarketVisiting/Validate_RemarksScreen',[('package'):ProjectConstants.packagename]), 'Enter Remarks')
			MobileElement remarkedittextfield = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]")
			remarkedittextfield.setValue("remarks")
			Mobile.hideKeyboard()
			Mobile.tap(findTestObject('MarketVisiting/SubmitButton',[('package'):ProjectConstants.packagename]), 0)
			Mobile.verifyElementExist(findTestObject('CommonElements/Validate_InfoPopUp',[('package'):ProjectConstants.packagename]), 0)
			Mobile.tap(findTestObject('CommonElements/InfoPopUp_OKButton',[('package'):ProjectConstants.packagename]), 0)
			Mobile.verifyElementText(findTestObject('MarketVisiting/Validate_TrainingStepsScreen',[('package'):ProjectConstants.packagename]), 'Training Steps')
		}
	}
	@Keyword
	def overwriteTraining(){
		MobileElement list = driver.findElementByClassName("android.widget.ListView")
		int totalassessments = list.findElementsByXPath(".//*").size()
		for(int i=1; i<= totalassessments; i++){
			driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
			Mobile.verifyElementText(findTestObject('MarketVisiting/Validate_RemarksScreen',[('package'):ProjectConstants.packagename]), 'Enter Remarks')
			Mobile.tap(findTestObject('Object Repository/MarketVisiting/TakePictureButton',[('package'):ProjectConstants.packagename]), 0)
			Mobile.verifyElementExist(findTestObject('CommonElements/Validate_CameraScreen',[('package'):ProjectConstants.packagename]), 0)
			Mobile.tap(findTestObject('CommonElements/TakePhotoButton',[('package'):ProjectConstants.packagename]), 0)
			Mobile.delay(5)
			Mobile.tap(findTestObject('CommonElements/DoneButton',[('package'):ProjectConstants.packagename]), 0)
			Mobile.verifyElementText(findTestObject('MarketVisiting/Validate_RemarksScreen',[('package'):ProjectConstants.packagename]), 'Enter Remarks')
			MobileElement remarkedittextfield = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]")
			remarkedittextfield.setValue("overwrite remarks")
			Mobile.hideKeyboard()
			Mobile.tap(findTestObject('MarketVisiting/SubmitButton',[('package'):ProjectConstants.packagename]), 0)
			Mobile.verifyElementExist(findTestObject('CommonElements/Validate_InfoPopUp',[('package'):ProjectConstants.packagename]), 0)
			Mobile.tap(findTestObject('CommonElements/InfoPopUp_OKButton',[('package'):ProjectConstants.packagename]), 0)
			Mobile.verifyElementText(findTestObject('MarketVisiting/Validate_TrainingStepsScreen',[('package'):ProjectConstants.packagename]), 'Training Steps')
		}
	}
}
