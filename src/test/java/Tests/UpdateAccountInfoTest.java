package Tests;

import Pages.LoginPage;
import Pages.UpdateContactInfoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateAccountInfoTest extends BaseTest{


    @Test
    public void UpdateAccountInfoTest(){
        new LoginPage(driver).login("ms","123456")
                .selectUpdateContactInfoLink()
                .updateInfo("marwa","Ali","maadi","cairo","egypt","11742","01142118723");

        boolean isProfileUpdatedSentenceDisplayed = driver.findElement(UpdateContactInfoPage.getProfileUpdatedSentence()).isDisplayed();
        Assert.assertTrue(isProfileUpdatedSentenceDisplayed);

        }
    }
}
