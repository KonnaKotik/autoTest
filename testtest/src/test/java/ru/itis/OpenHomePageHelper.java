package ru.itis;

import org.junit.Assert;

public class OpenHomePageHelper extends BaseHelper {
    private String homePage = "https://grouple.co/";

    public OpenHomePageHelper(ApplicationManager applicationManager ) {
        super(applicationManager);
    }


    public void openHomePage() {
        driver.get(homePage);
        Assert.assertEquals(driver.getCurrentUrl(), homePage);
    }


}
