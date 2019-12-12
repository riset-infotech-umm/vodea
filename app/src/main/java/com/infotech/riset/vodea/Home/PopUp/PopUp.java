package com.infotech.riset.vodea.Home.PopUp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.infotech.riset.vodea.Home.PopUp.Adapter.PopModel;
import com.infotech.riset.vodea.Home.PopUp.Adapter.popData;
import com.infotech.riset.vodea.Home.PopUp.Adapter.PopUpAdapter;
import com.infotech.riset.vodea.R;

import java.util.ArrayList;

public class PopUp extends AppCompatActivity {

    private RecyclerView rvPopUp;
    private ArrayList<PopModel> popModels = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);

        rvPopUp = findViewById(R.id.rv_popup);
        popModels.addAll(popData.getData());

        PopUpAdapter listPopUpAdapter = new PopUpAdapter(popModels);

        rvPopUp.setAdapter(listPopUpAdapter);
        listPopUpAdapter.notifyDataSetChanged();

        LinearLayoutManager manager = new LinearLayoutManager(getParent());
        manager.setOrientation(RecyclerView.VERTICAL);
        rvPopUp.setLayoutManager(manager);

    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
