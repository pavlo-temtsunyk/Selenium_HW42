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
public class AddressPage {

    @FindBy(css = "#address1")
    private WebElement addressfield;

    @FindBy(css = "#city")
    private WebElement cityinput;

    @FindBy(css = "#postcode")
    private WebElement zipcodeinput;


    @FindBy(css = "#submitAddress > span")
    private WebElement saveaddressbtn;

    public void updateaddressfield(String address){
       addressfield.clear();
       addressfield.sendKeys(address);
    }

    public void updatecity(String city){
        cityinput.clear();
        cityinput.sendKeys(city);
    }
    public void updatezip(String zip){
        zipcodeinput.clear();
        zipcodeinput.sendKeys(zip);
    }


    public void saveaddress(){
        saveaddressbtn.click();
    }

    public AddressPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}




