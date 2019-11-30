package ru.itis;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BaseHelper {
    public BaseHelper(ApplicationManager applicationManager) {
       this.applicationManager = applicationManager;
       this.driver = applicationManager.getDriver();
    }

    protected ApplicationManager applicationManager;
    protected WebDriver driver;
    protected JavascriptExecutor js;

}
