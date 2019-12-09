package ru.itis;

import lombok.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

@Data
public class ApplicationManager {


    private static ThreadLocal<ApplicationManager> app = new ThreadLocal<ApplicationManager>();

    public static ApplicationManager getInstance() {
        if (app.get() == null) {

            ApplicationManager newInstance = new ApplicationManager();

            newInstance.getOpenHomePageHelper().openHomePage();

            app.set(newInstance);

        }

        return app.get();
    }

    private ApplicationManager() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kotik\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            js = (JavascriptExecutor) driver;
            vars = new HashMap<String, Object>();
            openHomePageHelper = new OpenHomePageHelper(this);
            loginHelper = new LoginHelper(this);
            logoutHelper = new LogoutHelper(this);
            createPostHelper = new CreatePostHelper(this);
            editPostHelper = new EditPostHelper(this);
            deletePostHeleper = new DeletePostHeleper(this);
        }

        private WebDriver driver;
        private JavascriptExecutor js;
        private Map<String, Object> vars;

        private OpenHomePageHelper openHomePageHelper;
        private LoginHelper loginHelper;
        private LogoutHelper logoutHelper;
        private CreatePostHelper createPostHelper;
        private EditPostHelper editPostHelper;
        private DeletePostHeleper deletePostHeleper;

        public void stop () {
            driver.quit();
        }

    }
