package page_objects;

import org.openqa.selenium.By;

public class LitecartMainPage extends AbstractPage {

    private final By emailAdressFieldLocator = By.name("email");
    private final By passwordFieldLocator = By.name("password");
    private final By loginButtonLocator = By.name("login");
    private final By saleLocator = By.xpath("//div[contains(@class, 'sticker') and contains(@class, 'sale')]");

    public boolean isEmailAddressFieldPresent() {
        return isElementPresent(emailAdressFieldLocator);
    }

    public boolean isPasswordFieldPresent() {
        return isElementPresent(passwordFieldLocator);
    }

    public Boolean isLoginButtonPresent() {
        return isElementPresent(loginButtonLocator);
    }
   public Boolean isDuckPresent () {
        return isElementPresent (saleLocator);
   }
    private Boolean isElementPresent(By element) {
        return !driver.findElements(element).isEmpty();
    }

    public LitecartMainPage open() {
        driver.get("http://localhost/litecart");

        return new LitecartMainPage();
    }
}
