module org.calcul.bank {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.calcul.bank to javafx.fxml;
    exports org.calcul.bank;
}