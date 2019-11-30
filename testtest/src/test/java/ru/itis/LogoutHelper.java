package ru.itis;

import org.openqa.selenium.By;

public class LogoutHelper extends BaseHelper {
    public LogoutHelper(ApplicationManager applicationManager ) {
        super(applicationManager);
    }
    public void logout(AccountData user) {
        driver.findElement(By.linkText(user.getLogin())).click();
        driver.findElement(By.linkText("Выход")).click();
    }
}
