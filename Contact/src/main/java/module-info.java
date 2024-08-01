module org.contact.contact {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.contact.contact to javafx.fxml;
    exports org.contact.contact;
}