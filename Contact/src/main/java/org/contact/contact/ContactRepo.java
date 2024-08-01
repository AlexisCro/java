package org.contact.contact;


import java.util.ArrayList;
import java.util.List;

public class ContactRepo {
    static List<Contact> contacts = generateContacts();

    private static List<Contact> generateContacts() {
        return new ArrayList<>(List.of(
            new Contact("Jean", "Dupont", "0665659201"),
            new Contact("Marie", "Durand", "0665659202"),
            new Contact("Paul", "Martin", "0665659203"),
            new Contact("Luc", "Bernard", "0665659204"),
            new Contact("Anna", "Lefevre", "0665659205"),
            new Contact("Claire", "Petit", "0665659206"),
            new Contact("Hugo", "Moreau", "0665659207"),
            new Contact("Laura", "Roux", "0665659208"),
            new Contact("Pierre", "Simon", "0665659209"),
            new Contact("Emma", "Lambert", "0665659210"),
            new Contact("Louis", "Girard", "0665659211"),
            new Contact("Léa", "Garnier", "0665659212"),
            new Contact("Nina", "Dupuis", "0665659213"),
            new Contact("Eliot", "Mathieu", "0665659214")
        ));
    }

    public static List<Contact> getContacts() {
        return contacts;
    }

    public static void RemoveContact(Contact contact) {
        contacts.remove(contact);
    }

    public static void CreateContact(Contact contact) {
        contacts.add(contact);
    }
}
