package ru.itis;

import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EditPostHelper extends BaseHelper {

    public EditPostHelper(ApplicationManager applicationManager) {
        super(applicationManager);
    }

    public void editPost(PostData data) {

        driver.findElement(By.linkText("Посты")).click();
        driver.findElement(By.linkText("Ваш блог")).click();
        driver.findElement(By.linkText(data.getTitle())).click();
        driver.findElement(By.id("title")).click();
        driver.findElement(By.id("title")).sendKeys("хахаха");
        driver.findElement(By.linkText("Сохранить")).click();
    }
}
