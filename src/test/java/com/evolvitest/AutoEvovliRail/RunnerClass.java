package com.evolvitest.AutoEvovliRail;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".",
glue = {"com.evolvitest.AutoEvolviRail"},
tags = {
		//"@EvolviJourneys", 
		"@StandardJourneyforallDeliveryMethod",
		//"@SelectAccountWithoutExternalNumbers",
		//"@SelectAccountWithCardDetails", 
		//"@CreditCardIndividualPayment",
		//"@SingleJourneyWithAllDeliveryMethod",
		//"@SingleJourneyWithSelfPrintDeliveryMethod",
		//"@CarnetJourneyRouteStandardMethodOnly",
		//"@Railcardfor1625age",
		//"@RailcardforTwotoTogether",
		//"@TravelCardandPlusbusJourneyforfewdays",	
		//"@seasonstickets",
		//"@CancelticketfromOrderManager",
		//"@AutoRefundStandardAnytimeProcess",
		//"@UncollectedKioskTicketAutoRefund",
		//"@NonIssuesTicket", 
		
		},


format = {"pretty",
		"json:target/cucumber-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun.txt",
		"html:target/CucumberReport",
		"json:CucumberReport/cucumber.json",  
		"junit:target/cucumber-reports/extent-config.xml"
		})


public class RunnerClass {
	
	

}
