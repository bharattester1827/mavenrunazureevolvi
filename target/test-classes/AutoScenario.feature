@EvolviJourneys
Feature: Single Journey route
 
  Background: User logs in to website
    Given User is on the login page
    When User enter valid "Username" and "Password"
    And User click on login button
    Then User is on HomePage of Evolvi
     
     Scenario: Verify the HomePage Title
     And User should verify the Homepage title
@StandardJourneyforallDeliveryMethod    
  Scenario Outline: Standard Journey with all delivery method
  When User enter origin and destination then click on faresearch button
	And User click on add to basket button and then checkout button
	And User click "<delivery method>" and click on Buynow button
	And User is agree with terms and condition and click on confirm button
	Then User is able to see the reference of that order
	And User click on Log Off button 
    Examples:
      | delivery method    |
      | ToDelivery	       |  
      | KioskDelivery      | 
	  	| mticketDelivery    |
	  	| StandardDelivery   |
