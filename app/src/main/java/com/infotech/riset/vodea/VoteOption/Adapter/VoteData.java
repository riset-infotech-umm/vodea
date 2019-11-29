package com.infotech.riset.vodea.VoteOption.Adapter;

import java.util.ArrayList;

public class VoteData {
    private static String[] nama = {
            "Augie Winanda F", "Ricky Hendrawan", "Yusril",
            "Fachry", "Mufidzzz"
    };

    public static ArrayList<Vote> getListData() {
        ArrayList<Vote> list = new ArrayList<>();
        for (int position = 0; position < nama.length; position++) {
            Vote hero = new Vote();
            hero.setName(nama[position]);
            list.add(hero);
        }
        return list;
    }
}
