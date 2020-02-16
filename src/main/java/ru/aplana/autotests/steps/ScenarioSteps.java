package ru.aplana.autotests.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ScenarioSteps {
    MainSteps mainSteps = new MainSteps();
    SearchSteps searchSteps = new SearchSteps();
    CartSteps cartSteps = new CartSteps();


    @When("^выполнен поиск товара \"(.+)\"$")
    public void searchProduct(String productName){
        mainSteps.stepSearchProduct(productName);
    }
    @When("^выбрана цена до \"(.+)\"$")
    public void limitPriceTo(String priceTo){
        searchSteps.stepLimitPriceTo(priceTo);
    }
    @When("^закрыто сообщение про cookies$")
    public void closeCookies(){
        mainSteps.stepCloseCookies();
    }
    @When("^закрыта всплывающая реклама$")
    public void closeAdvertisement(){
        mainSteps.stepCloseAdvertisement();
    }
    @When("^в корзину добавлены первые \"(.+)\" товаров, чётные:\"(.+)\"$")
    public void addProductsToCart(String quantity, String isEven){
        searchSteps.stepAddProductsToCart(quantity, isEven);
    }
    @When("^выполнен переход в корзину$")
    public void goToCart(){
        mainSteps.stepGoToCart();
    }
    @Then("^все добавленные в корзину товары присутствуют в корзине$")
    public void checkCart(){
        cartSteps.stepCheckCart();
    }
    @Then("^корзина содержит \"(.+)\" товаров$")
    public void checkProductsQuantity(String quantity){
        cartSteps.stepCheckProductsQuantity(quantity);
    }
    @When("^выполнен клик по чекбоксу опции \"(.+)\"$")
    public void clickCheckboxOption(String optionName){
        searchSteps.stepClickCheckbox(optionName);
    }
    @When("^удалены товары из корзины$")
    public void removeProductsFromCart(){
        cartSteps.stepRemoveProducts();
    }
    @Then("^корзина пуста$")
    public void checkCartEmptiness(){
        cartSteps.stepCheckCartEmptiness();
    }
    @When("^выбран бренд: \"(.+)\"$")
    public void selectBrand(String brandName){
        searchSteps.stepSelectBrand(brandName);
    }
    @Then("^генерируется отчёт$")
    public void productsInCartInfo(){
        BaseSteps.attachProducts();
        BaseSteps.attachMaxPriceProduct();
    }
}
