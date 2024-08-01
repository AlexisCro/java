package org.contact.contact;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.List;

public class ContactController {
    @FXML
    public TextField firstNameField = new TextField();
    public TextField lastNameField = new TextField();
    public TextField phoneNumberField = new TextField();
    public ListView<Contact> contactListView = new ListView<>();

    @FXML
    protected void addContact() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String phoneNumber = phoneNumberField.getText();

        System.out.println(firstName);
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        ContactRepo.CreateContact(contact);
        refreshContactList();
    }

    @FXML
    protected void deleteContact() {
        Contact contact = contactListView.getSelectionModel().getSelectedItem();

        if (contact != null) {
            ContactRepo.RemoveContact(contact);
            refreshContactList();
        }
    }

    @FXML
    protected void refreshContactList() {
        List<Contact> contacts = ContactRepo.getContacts();

        this.contactListView.getItems().setAll((contacts));
    }
}