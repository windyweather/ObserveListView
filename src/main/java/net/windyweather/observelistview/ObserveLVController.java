package net.windyweather.observelistview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

// local classes
import net.windyweather.observelistview.ObservePairClass;

public class ObserveLVController {

    ObservableList<ObservePairClass> listPairs = FXCollections.observableArrayList();

    public ListView<ObservePairClass> lvPairsList;
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

    private static int intNextPair = 0;
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

    // Make a next pair name in a simple way
    private void FillPair( ObservePairClass pair ) {
        pair.sPairName = String.format("pair_%d", intNextPair);
        pair.sSource = String.format("pair_Source_%d", intNextPair);
        pair.sDestination = String.format("pair_Destination_%d", intNextPair);
        intNextPair++;
    }

    private void FillGuiFromPair( ObservePairClass pair ) {
        txtPairName.setText(pair.sPairName);
        txtSource.setText( pair.sSource);
        txtDestination.setText( pair.sDestination);
    }
    public void  MakeAPair() {
        ObservePairClass pair = new ObservePairClass();
        FillPair( pair );
        listPairs.add( pair );
        FillGuiFromPair(pair);
        // Does this display the list of pairs?
        lvPairsList.setItems( listPairs );

    }
    public void OnNewPairClick(ActionEvent actionEvent) {
        MakeAPair();
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