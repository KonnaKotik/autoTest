package ru.itis;


import org.testng.annotations.Test;

public class AllTest extends TestBase {

    @Override
    public void setUp() {
   super.setUp();

    }


    @Test(dataProvider = "data-provider")
    public void allTest(String title, String text) {
        applicationManager = ApplicationManager.getInstance();
        accountData = new AccountData("kotik.arina99@gmail.com", "2348Arina1999","Kirito1999" );
        System.out.println(title);
        System.out.println(text);
        PostData postData = new PostData(title, text);
        System.out.println(postData.getTitle());
        applicationManager.getOpenHomePageHelper().openHomePage();
        applicationManager.getLoginHelper().login(accountData);
        applicationManager.getCreatePostHelper().createPost(postData);
     //   applicationManager.getEditPostHelper().editPost(postData);
        applicationManager.getDeletePostHeleper().deletePost(postData, accountData);
        applicationManager.getLogoutHelper().logout(accountData);

   }



}
