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
public class CartPopup {

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    private WebElement checkoutbtn;

    @FindBy(css = "#total_price")
    private WebElement totalprice;





    public void GoToCheckout(){
        checkoutbtn.click();


    }

    public String CheckTotalPrice(){
       return totalprice.getText();

    }






    public CartPopup(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
