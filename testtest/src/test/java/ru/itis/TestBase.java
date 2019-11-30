package ru.itis;

import org.junit.After;
import org.junit.Before;

public class TestBase {

    protected ApplicationManager applicationManager;
    protected AccountData accountData;
    protected PostData postData;

    @Before
    public void setUp() {
        applicationManager = ApplicationManager.getInstance();
        accountData = new AccountData("kotik.arina99@gmail.com", "2348Arina1999","Kirito1999" );
        postData = new PostData("Мои любимы дорамы для Вас", "1) Случайно найденный Ха Ру ваиураираиоцуиагиаокиа урикацрукираи цруикацруиа  цукраицруиа оуктиа  окиацоуиа оци");
    }
    @After
    public void tearDown() {
        applicationManager.stop();
    }
}
