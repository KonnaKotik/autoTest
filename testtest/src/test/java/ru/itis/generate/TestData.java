package ru.itis.generate;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import ru.itis.PostData;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestData {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    private static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {
        System.out.println("Количество создаваемых объектов: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        try {
            createData(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void createData(int m) throws IOException {

        List<PostData> list=new ArrayList<>();
        int n=15;
        for(int i=0;i<m;i++){
            list.add(new PostData(getAlphaNumericString(n),getAlphaNumericString(n)));
        }
        mapper.writeValue(new File("testData.txt"),list);
    }

    private static String getAlphaNumericString(int n) {

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz"
                +"~!@#$%^&*()_+<,>.?/]}{[";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }

}