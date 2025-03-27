package net.windyweather.observelistview;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ObservLVController {
    public ListView lvPairsList;
    public TextField txtPairName;
    public TextField txtSource;
    public TextField txtDestination;
    public Button btnNewPair;
    public Button btnNew10Pairs;
    public Button btnDeletePair;
    public Button btnMoveUp;
    public Button btnMoveDown;
    public Button btnMoveTop;
    public Button btnDeleteAll;
    public Button btnClose;
    @FXML
    private Label welcomeText;


    //
    // Do this in one place so we can easily turn it off later
    //
    public static void printSysOut( String str ) {
        System.out.println(str);
    }

    @FXML

    public void onCloseButtonClick(ActionEvent actionEvent) {
        // Now call the stage to actually close us up
        printSysOut("Close app on button click");
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();
    }

    public void OnNewPairClick(ActionEvent actionEvent) {
    }

    public void OnBtnNew10Pairs(ActionEvent actionEvent) {
    }

    public void OnDeletePair(ActionEvent actionEvent) {
    }

    public void OnDeleteAll(ActionEvent actionEvent) {
    }

    public void OnMoveTop(ActionEvent actionEvent) {
    }

    public void OnMoveUp(ActionEvent actionEvent) {
    }

    public void OnMoveDown(ActionEvent actionEvent) {
    }
}