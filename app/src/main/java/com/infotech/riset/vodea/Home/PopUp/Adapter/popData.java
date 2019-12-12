package com.infotech.riset.vodea.Home.PopUp.Adapter;

import java.util.ArrayList;

public class popData {

    public static String[] data = new String[]{
            "input 1",
            "input 2",
            "input 3"
    };

    private static ArrayList<String> list = new ArrayList<String>();

    public static ArrayList<PopModel> getData(){
        ArrayList<PopModel> list = new ArrayList<>();
        for (String aData: data
             ) {
            PopModel model = new PopModel();
            model.setHint(aData);
            list.add(model);

        }
        return list;
    }
}
