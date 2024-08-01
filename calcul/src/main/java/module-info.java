module org.calcul.calcul {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.calcul.calcul to javafx.fxml;
    exports org.calcul.calcul;
}