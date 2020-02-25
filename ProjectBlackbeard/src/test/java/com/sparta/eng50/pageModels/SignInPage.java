package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SignInPage extends AbstractPage{

    By emailText = By.name("email_create");
    By createAccountButton = By.xpath("//*[@id=\"SubmitCreate\"]");
    By authenticationBreadcrumb = By.xpath("//*[@id=\"columns\"]/div[1]/span[2]");

    public SignInPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AccountCreationPage enterEmailAddress(String email) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.findElement(emailText).sendKeys(email);
        webDriver.findElement(createAccountButton).click();
        return new AccountCreationPage(webDriver);
    }

    public String getBreadcrumbText(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return webDriver.findElement(authenticationBreadcrumb).getText();
    }
}
