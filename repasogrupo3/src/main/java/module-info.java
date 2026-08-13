module pe.edu.upeu.repasogrupo3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens pe.edu.upeu.repasogrupo3 to javafx.fxml;
    exports pe.edu.upeu.repasogrupo3;
}