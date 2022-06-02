module com.fzzkill.fml {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires java.desktop;

    opens com.fzzkill.fml to javafx.fxml;

    exports com.fzzkill.fml;
}