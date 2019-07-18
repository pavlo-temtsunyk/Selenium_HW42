package pageobjects;

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
public class MyAccPage {

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a ")
    private WebElement Women;

    @FindBy(css = "div.col-sm-6:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")
    private WebElement MyOrders;

    @FindBy(css = "tr.first_item > td:nth-child(3) > span:nth-child(1)")
    private WebElement OrderDetails;

    @FindBy(css = "tr.first_item > td:nth-child(3) > span:nth-child(1)")
    private WebElement OrderPrice;




    public void GoToWomens(){
        Women.click();
    }


    public void GoToMyOrders(){
        MyOrders.click();
    }

    public void GoToOrderDetails(){
        OrderDetails.click();
    }

    public String GetOrderPrice(){
        String text=OrderPrice.getText();
        return text;
    }


    public MyAccPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
