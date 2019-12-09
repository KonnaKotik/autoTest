package ru.itis;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.testng.annotations.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TestBase {

    protected ApplicationManager applicationManager;
    protected AccountData accountData;
    //protected PostData postData;

    protected ObjectMapper mapper = new ObjectMapper();

    @BeforeTest
    public void setUp() {
        applicationManager = ApplicationManager.getInstance();
        accountData = new AccountData("kotik.arina99@gmail.com", "2348Arina1999","Kirito1999" );
    }
    @DataProvider(name="data-provider")
    public Object[][] dataProviderMethod() throws IOException {

        File file=new File( "testData.txt");
        FileReader fileReader=new FileReader(file);
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            line=bufferedReader.readLine() ;
        }
        System.out.println(line);
        List<PostData> string= (List<PostData>) Arrays.asList(mapper.readValue(line,PostData[].class));

        return new Object[][] { { string.get(0).getTitle(),string.get(0).getText()}, { string.get(1).getTitle(), string.get(1).getText()}};
    }

    @AfterTest
    public void tearDown() {
        applicationManager.stop();
    }
}
