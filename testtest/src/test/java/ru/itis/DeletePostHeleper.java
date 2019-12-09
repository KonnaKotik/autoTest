package ru.itis;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class DeletePostHeleper extends BaseHelper {

    public DeletePostHeleper(ApplicationManager applicationManager ) {
        super(applicationManager);
    }
    public void deletePost(PostData data, AccountData user) {

        driver.findElement(By.linkText("Посты")).click();
        driver.findElement(By.linkText("Ваш блог")).click();

        driver.findElement(By.linkText(data.getTitle())).click();
        driver.findElement(By.linkText("Удалить")).click();

      //  assertThat(driver.switchTo().alert().getText(), is("Точно грохаем? Назад дороги нет"));
        driver.switchTo().alert().accept();
      //  Assert.assertEquals(driver.findElement(By.cssSelector("tr:nth-child(1) .label")).getText(), "удалено");

    }


}
