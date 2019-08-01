package com.evolvitest.AutoEvovliRail;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
	
		
		AddOnSeasonsTicketPage addonseasonsticketpage = new AddOnSeasonsTicketPage();
		HomePage homepage = new HomePage();
		LoginPage loginpage = new LoginPage();
		CheckoutPage checkoutpage = new CheckoutPage();
		JourneySearchPage journeysearchpage = new JourneySearchPage();
		DeliveryMethodPage deliverymethodpage = new DeliveryMethodPage();
		LogOffPage logoffpage = new LogOffPage();
		OrderConfirmationPage orderconfirmationpage = new OrderConfirmationPage();
		OrderManagerPage ordermanagerpage = new OrderManagerPage();
		PaymentConfirmationPage paymentconfirmationpage = new PaymentConfirmationPage();
		RefundManagerPage refundmanagerpage = new RefundManagerPage();
		ReservationAllocationPage reservationallocationpage = new ReservationAllocationPage();
		ReservationPreferencePage reservationpreferencepage = new ReservationPreferencePage();
		TicketingPrintingPage ticketingprintingpage = new TicketingPrintingPage();
		
		
		
		
		
		@Given("^User is on the login page$")
		public void user_is_on_the_login_page() {		    
		}
		@When("^User enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
		public void user_enter_valid_and(String arg1, String arg2) {
				loginpage.Username();
				loginpage.Password();
		}
		@When("^User click on login button$")
		public void user_click_on_login_button() {
				loginpage.Loginbtn();
		}
		@Then("^User is on HomePage of Evolvi$")
		public void user_is_on_HomePage_of_Evolvi()  {
				System.out.println("User successfully login");
		}
		@Then("^User should verify the Homepage title$")
		public void user_should_verify_the_Homepage_title()  {
				homepage.HomePageTitle();
		}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//StandardJourneyforallDeliveryMethod
		
		@When("^User enter origin and destination then click on faresearch button$")
		public void user_enter_origin_and_destination_then_click_on_faresearch_button() {
				homepage.FromLocation();
				homepage.ToLocation();
				//homepage.selectOrganisation();
				homepage.FareSearch();
		}
		@When("^User click on add to basket button and then checkout button$")
		public void user_click_on_add_to_basket_button_and_then_checkout_button() {
				//journeysearchpage.SuggestionFareSelect();
				journeysearchpage.AddToBasket();
				//journeysearchpage.addTravellerName();
				//journeysearchpage.saveButtonOnAddTravellerPop();
				checkoutpage.CheckoutButton();
				//checkoutpage.DivisionOfEmployee();
				//checkoutpage.TypeOfEmployee();
				//checkoutpage.SaveButtonDialogue();
				//checkoutpage.CheckoutButton();
		}
		@When("^User click \"([^\"]*)\" and click on Buynow button$")
		public void user_click_and_click_on_Buynow_button(String deliverymethod)  {
				deliverymethodpage.deliveryMethodExamples(deliverymethod);	    
				deliverymethodpage.BuyNowBtn();
		}
		@When("^User is agree with terms and condition and click on confirm button$")
		public void user_is_agree_with_terms_and_condition_and_click_on_confirm_button() {
				//paymentconfirmationpage.selectPaymentAccount(selectaccount);
		    	paymentconfirmationpage.TermAndCondition();
		    	paymentconfirmationpage.ConfirmButtonNoCard();
		}
		@Then("^User is able to see the reference of that order$")
		public void user_is_able_to_see_the_reference_of_that_order() {
				orderconfirmationpage.orderNumberText();
		    	orderconfirmationpage.deliverygettext();
		}
		@Then("^User click on Log Off button$")
		public void user_click_on_Log_Off_button()  {
				logoffpage.LogOffButton();
		}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//

}
