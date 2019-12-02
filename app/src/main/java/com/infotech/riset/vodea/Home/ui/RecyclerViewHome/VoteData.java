package com.infotech.riset.vodea.Home.ui.RecyclerViewHome;

import android.widget.ImageView;

import com.infotech.riset.vodea.R;

import java.util.ArrayList;

public class VoteData {
    public static String[][] data = new String[][]{
            {"ini tempat foto","ini tempat title","ini tempat description","ini/tempat/tanggal"},
            {"ini tempat foto","ini tempat title","ini tempat description","ini/tempat/tanggal"},
            {"ini tempat foto","ini tempat title","ini tempat description","ini/tempat/tanggal"},
            {"ini tempat foto","ini tempat title","ini tempat description","ini/tempat/tanggal"},
            {"ini tempat foto","ini tempat title","ini tempat description","ini/tempat/tanggal"},
            {"ini tempat foto","ini tempat title","ini tempat description","ini/tempat/tanggal"},
            {"ini tempat foto","ini tempat title","ini tempat description","ini/tempat/tanggal"},
            {"ini tempat foto","ini tempat title","ini tempat description","ini/tempat/tanggal"},
            {"ini tempat foto","ini tempat title","ini tempat description","ini/tempat/tanggal"},
            {"ini tempat foto","ini tempat title","ini tempat description","ini/tempat/tanggal"},

    };

    public static ArrayList<VoteModel> getData(){
        ArrayList<VoteModel> list = new ArrayList<>();

        for (String[] aData :
                data) {
            VoteModel model = new VoteModel();
           //model.setFotoVoter();
            model.setVoteTitle(aData[1]);
            model.setVoteDesc(aData[2]);
            model.setVoteDate(aData[3]);
            list.add(model);
        }
        return list;

    }
}
