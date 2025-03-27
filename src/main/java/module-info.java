module net.windyweather.observelistview {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.windyweather.observelistview to javafx.fxml;
    exports net.windyweather.observelistview;
}