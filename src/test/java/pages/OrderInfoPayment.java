package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.util.HashSet;
import java.util.List;
import java.util.Random;
public class OrderInfoPayment {

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
    private WebElement PayByCheck;

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
    private WebElement ConfirmOrder;

    @FindBy(css = ".alert"    )
    private WebElement Alert;


    @FindBy(css = ".account"    )
    private WebElement MyAccountLink;





    public void SelectCheckPaymentMethod(){
        PayByCheck.click();
    }

    public void ConfirmOrder(){
        ConfirmOrder.click();

    }

    public void GoToMyAccaunt(){
        MyAccountLink.click();

    }

    public String GetMessageFromAlert(){
        String text=Alert.getText();
    return text;}


    public OrderInfoPayment(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
