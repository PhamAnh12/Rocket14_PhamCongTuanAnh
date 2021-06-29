package Exercise6Q1.entity;

import java.util.ArrayList;

public class VietnamesePhone  extends  Phone{
    private ArrayList<Contact> contacts;
    public VietnamesePhone() {
        contacts = new ArrayList<Contact>();
    }
    @Override
    public void insertContact(String name, String phone) {
         contacts.add(new Contact(name,phone));
    }

    @Override
    public void removeContact(String name) {
        contacts.removeIf(contact -> contact.getName().equals(name));
    }

    @Override
    public void updateContact(String name, String newPhone) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contact.setPhone(newPhone);
            }
        }
    }

    @Override
    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(contact);
            }
        }
    }
    public void showContact() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
