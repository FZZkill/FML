module com.fzzkill.fml {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    //Json
    requires com.google.gson;
    requires org.json;

    requires org.apache.commons.io;
    requires org.apache.logging.log4j;

    requires java.desktop;

    opens com.fzzkill.fml to javafx.fxml;

    exports com.fzzkill.fml;
}