package net.windyweather.observelistview;

public class ObservePairClass {

    public String sPairName;
    public String sSource;
    public String sDestination;

    public ObservePairClass(){

    }

    /*
        ToString is called to render the item for the ListView
     */
    @Override
    public String toString() {
        return String.format("PairName: " + sPairName + " Source " + sSource
                + " Destination " + sDestination);

    }
}

