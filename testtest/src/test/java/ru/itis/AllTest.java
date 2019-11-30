package ru.itis;

import org.junit.Assert;
import org.junit.Test;



public class AllTest extends TestBase {

    @Override
    public void setUp() {
        super.setUp();

    }


   @Test
    public void allTest() {
        applicationManager.getOpenHomePageHelper().openHomePage();
        applicationManager.getLoginHelper().login(accountData);
        applicationManager.getCreatePostHelper().createPost(postData);
        applicationManager.getDeletePostHeleper().deletePost(postData, accountData);
        applicationManager.getLogoutHelper().logout(accountData);

   }



}
