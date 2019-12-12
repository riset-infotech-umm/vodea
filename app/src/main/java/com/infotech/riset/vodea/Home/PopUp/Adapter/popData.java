package com.infotech.riset.vodea.Home.PopUp.Adapter;

import java.util.ArrayList;

public class popData {


    private int position;
    private ArrayList<String> list;

    public popData(int position, ArrayList<String> list) {
        this.position = position;
        this.list = list;
        list.add("input 1");


    }

    public int getPosition() {
        return position;
    }


    public void addItem() {
        position++;
    }

    public void deleteItem() {
        position--;

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
