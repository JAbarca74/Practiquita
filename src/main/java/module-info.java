module cr.ac.una.practiquita {
    requires javafx.controls;
    requires javafx.fxml;

    opens cr.ac.una.practiquita to javafx.fxml;
    exports cr.ac.una.practiquita;
}
