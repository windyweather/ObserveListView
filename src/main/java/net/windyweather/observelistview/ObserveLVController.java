package net.windyweather.observelistview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

// local classes
import net.windyweather.observelistview.ObservePairClass;

import java.util.Collection;

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
        for (int i=0; i<10; i++){
            MakeAPair();
        }
    }

    public void OnDeletePair(ActionEvent actionEvent) {
        int idx = lvPairsList.getSelectionModel().getSelectedIndex();
        listPairs.remove( idx );
        ClearGuiItems();
    }

    public void OnDeleteAll(ActionEvent actionEvent) {
        // no clue why this doesn't work
        //listPairs.removeAll();
        while (!listPairs.isEmpty()){
            listPairs.removeFirst();
        }
        ClearGuiItems();
    }

    /*
        Make sure item of interest is selected and visible
     */
    private void SelectAndFocusIndex( int idx ) {
        lvPairsList.getSelectionModel().select(idx);
        if (!lvPairsList.isVisible() ){
            lvPairsList.getFocusModel().focus(idx);
            lvPairsList.scrollTo( idx);
        }
        lvPairsList.scrollTo( idx);

    }
    public void OnMoveTop(ActionEvent actionEvent) {

        int idx = lvPairsList.getSelectionModel().getSelectedIndex();
        printSysOut(String.format("OnMoveTop - moving idx %d to top", idx ) );
        ObservePairClass pair = listPairs.get(idx);
        listPairs.remove(idx);
        listPairs.addFirst(pair );
        SelectAndFocusIndex( 0);
    }

    public void OnMoveUp(ActionEvent actionEvent) {
        int idx = lvPairsList.getSelectionModel().getSelectedIndex();
        if ( idx == 0 ) {
            // already at top so we are done
            printSysOut(String.format("OnMoveUp - idx %d already at top", idx ) );
            SelectAndFocusIndex( idx );
            return;
        }
        printSysOut(String.format("OnMoveUp - moving idx %d Up one item", idx ) );
        ObservePairClass pair = listPairs.get(idx);
        listPairs.remove(idx);
        listPairs.add( idx-1, pair);
        SelectAndFocusIndex( idx-1);
    }

    public void OnMoveDown(ActionEvent actionEvent) {
        int idx = lvPairsList.getSelectionModel().getSelectedIndex();
        if ( (idx+1) == listPairs.size() ) {
            // already at bottom so we are done
            printSysOut(String.format("OnMoveDown - idx %d already at bottom", idx ) );
            SelectAndFocusIndex(idx);
            return;
        }
        printSysOut(String.format("OnMoveDown - moving idx %d Down one item", idx ) );
        ObservePairClass pair = listPairs.get(idx);
        listPairs.remove(idx);
        listPairs.add( idx+1, pair);
        SelectAndFocusIndex( idx+1);
    }

    /*
        Clear out the GUI items
     */
    private void ClearGuiItems() {
        /*
            now populate the GUI items - just clear them out
         */
        txtPairName.setText( "" );
        txtSource.setText( "");
        txtDestination.setText( "");
    }
    /*
        Maybe the selection changed in the list so display the pair item in the fields
     */
    public void OnLVMouseClicked(MouseEvent mouseEvent) {
        int idx = lvPairsList.getSelectionModel().getSelectedIndex();

        printSysOut(String.format("OnLVMouseClicked - click with Idx %d", idx) );
        if ( idx == -1 ) {
            printSysOut("OnLVMouseClicked - No selected item");
            ClearGuiItems();
            return;
        }
        ObservePairClass pair = listPairs.get(idx);

        /*
            now populate the GUI items
         */
        FillGuiFromPair(pair);

    }
}