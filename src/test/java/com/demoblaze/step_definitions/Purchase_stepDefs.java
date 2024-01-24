package com.demoblaze.step_definitions;

import com.demoblaze.pages.CartPage;
import com.demoblaze.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Purchase_stepDefs {
    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();

    @When("The user adds {string} product from {string} category")
    public void the_user_adds_product_from_category(String product, String category) {
        homePage.addProductFromCategory(product, category);
    }
    @When("The user removes {string} chosen product from Cart Page")
    public void the_user_removes_chosen_product_from_cart_page(String string) {
        cartPage.removeProductFromCart(string);

    }
    @When("The user places order and captures and log amount")
    public void the_user_places_order_and_captures_and_log_amount() {
        cartPage.placeOrder();
    }
    @Then("The user verifies purchase amount")
    public void the_user_verifies_purchase_amount() {
        cartPage.verifyPurchaseAmount();
    }
}
