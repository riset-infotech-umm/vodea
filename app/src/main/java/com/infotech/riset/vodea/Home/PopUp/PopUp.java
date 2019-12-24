package com.infotech.riset.vodea.Home.PopUp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.infotech.riset.vodea.Home.PopUp.Adapter.PopModel;
import com.infotech.riset.vodea.Home.PopUp.Adapter.popData;
import com.infotech.riset.vodea.Home.PopUp.Adapter.PopUpAdapter;
import com.infotech.riset.vodea.R;

import java.util.ArrayList;

public class PopUp extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rvPopUp;
    private ArrayList<PopModel> popModels = new ArrayList<>();
    private Button add,delete;
    private PopUpAdapter listPopUpAdapter;
    private  popData optionData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);

        optionData = new popData(0,new ArrayList<String>());
        optionData.add("input 1");


        rvPopUp = findViewById(R.id.rv_popup);
        popModels.addAll(optionData.getData());

        listPopUpAdapter = new PopUpAdapter(popModels);

        rvPopUp.setAdapter(listPopUpAdapter);


        LinearLayoutManager manager = new LinearLayoutManager(getParent());
        manager.setOrientation(RecyclerView.VERTICAL);
        rvPopUp.setLayoutManager(manager);

        add=findViewById(R.id.add_option);
        add.setOnClickListener(this);

        delete=findViewById(R.id.btn_delete);
        delete.setOnClickListener(this);


    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.add_option:

                if (popModels.size()<7){
                    popModels.add(popModels.size(),new PopModel("input "+(popModels.size()+1)));
                    listPopUpAdapter.notifyItemChanged(popModels.size());
                    rvPopUp.scrollToPosition(popModels.size()-1);
                }

                break;

            case R.id.btn_delete:
                if(popModels.size()>1){

                    popModels.remove(popModels.size()-1);
                    rvPopUp.scrollToPosition(popModels.size());
                    listPopUpAdapter.notifyItemRemoved(popModels.size());
                }

                break;
        }
    }
}
