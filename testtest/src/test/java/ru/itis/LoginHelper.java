package ru.itis;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class LoginHelper  extends BaseHelper{

    public LoginHelper(ApplicationManager applicationManager ) {
        super(applicationManager);
    }

    public void login(AccountData user) {

        driver.manage().window().setSize(new Dimension(1920, 1040));
        driver.findElement(By.linkText("Вход")).click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys(user.getUserName());
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys(user.getPassword());
        driver.findElement(By.cssSelector(".btn-block")).click();
    }
}
