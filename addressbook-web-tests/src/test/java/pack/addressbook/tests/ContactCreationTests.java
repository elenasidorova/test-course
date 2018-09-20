package pack.addressbook.tests;

import org.testng.annotations.*;
import pack.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        app.initContactCreation();
        app.fillContactForm(new ContactData("Mickey", "Mouse", "France, Disneyland Paris, b.1", "+33 000 000 00 0", "mickey123@test.com"));
        app.submitContactCreation();
        app.returnToHomePage();
    }

}
