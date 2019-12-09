package ru.itis;

import javafx.geometry.Pos;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreatePostHelper extends BaseHelper {


    public CreatePostHelper(ApplicationManager applicationManager ) {
        super(applicationManager);
    }


    public void createPost(PostData data) {


        driver.findElement(By.linkText("Посты")).click();
        driver.findElement(By.linkText("Написать пост")).click();
        driver.findElement(By.id("title")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".note-paragraph > .note-btn:nth-child(1)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.id("title")).sendKeys(data.getTitle());
        driver.findElement(By.cssSelector(".note-editable")).click();
        driver.findElement(By.cssSelector(".note-editable")).sendKeys(data.getText());


       /* {
            WebElement element = driver.findElement(By.cssSelector(".note-editable"));
            js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = '<div>уамтулоамтульмлдуьамлдмулотамоуа уомтуоаоукпа оутаошуткпаш уоаиукоашоук куйтауокта</div>'}", element);
        }*/
//        driver.findElement(By.cssSelector(".form-group:nth-child(8) > .col-sm-10 label")).click();
   //     PostData newPostData = applicationManager.getCreatePostHelper().getCreatePost();
  //      Assert.assertTrue(data.equals(newPostData));

        driver.findElement(By.id("create")).click();

    }

    public PostData getCreatePost() {
        String title = driver.findElement(By.id("title")).getAttribute("value");
        String text =  driver.findElement(By.cssSelector(".note-editable")).getText();
        return new PostData(title, text);
    }
}
