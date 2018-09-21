package pack.addressbook.tests;

import org.testng.annotations.Test;
import pack.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Mickey", "Mouse", "France, Disneyland Paris, b.1", "+33 000 000 00 0", "mickey123@test.com"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
