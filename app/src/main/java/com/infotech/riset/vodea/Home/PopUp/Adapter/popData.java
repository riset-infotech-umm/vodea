package com.infotech.riset.vodea.Home.PopUp.Adapter;

import java.util.ArrayList;

public class popData {


    private int position;
    private ArrayList<String> list;

    public popData(int position, ArrayList<String> list) {
        this.position = position;
        this.list = list;

    }

    public int getPosition() {
        return list.size();
    }





    public void add(String s){
        list.add(s);
    }




    public ArrayList<PopModel> getData() {
        ArrayList<PopModel> listModel = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            PopModel model = new PopModel();
            model.setHint(list.get(i));
            listModel.add(model);
        }


        return listModel;
    }
}
