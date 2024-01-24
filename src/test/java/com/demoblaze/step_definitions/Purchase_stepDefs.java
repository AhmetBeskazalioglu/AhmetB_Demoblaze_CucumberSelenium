package com.demoblaze.step_definitions;

import com.demoblaze.pages.CartPage;
import com.demoblaze.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class Purchase_stepDefs {
    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();

    @When("The user adds {string} product from {string} category")
    public void the_user_adds_product_from_category(String product, String category) {
        homePage.addProductFromCategory(product, category);
    }

    @When("The user places order and captures and log amount")
    public void the_user_places_order_and_captures_and_log_amount() {
        cartPage.placeOrder();
    }
    @Then("The user verifies purchase amount")
    public void the_user_verifies_purchase_amount() {
        cartPage.verifyPurchaseAmount();
    }

    @When("The user adds following products from related category to the cart and return Home page")
    public void theUserAddsFollowingProductsFromRelatedCategoryToTheCartAndReturnHomePage(List<Map<String, String>> dataTable) {
        for (int i = 0; i < dataTable.size() ; i++) {
            String[] dataArray = dataTable.get(i).values().toArray(new String[i]);

            if (dataArray.length>=2){
                String category = dataArray[0];
                String product = dataArray[1];
                homePage.addProductFromCategory(product, category);
            }
        }

    }

    @And("The user removes {string} chosen product from {string} Page")
    public void theUserRemovesChosenProductFromPage(String product, String menuName) {
        cartPage.removeProductFromCart(product, menuName);

    }
}
