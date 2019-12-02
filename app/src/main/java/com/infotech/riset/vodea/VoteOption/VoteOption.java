package com.infotech.riset.vodea.VoteOption;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.infotech.riset.vodea.R;
import com.infotech.riset.vodea.VoteOption.Adapter.Vote;
import com.infotech.riset.vodea.VoteOption.Adapter.VoteAdapter;
import com.infotech.riset.vodea.VoteOption.Adapter.VoteData;

import java.util.ArrayList;

public class VoteOption extends AppCompatActivity {
    private RecyclerView rvVotes;
    private ArrayList<Vote> name = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voteoption);

        rvVotes = findViewById(R.id.rv_voteoption);
        rvVotes.setHasFixedSize(true);

        name.addAll(VoteData.getListData());
        showRecycleList();
    }

    private void showRecycleList(){
        rvVotes.setLayoutManager(new LinearLayoutManager(this));
        VoteAdapter voteAdapter = new VoteAdapter(name);
        rvVotes.setAdapter(voteAdapter);
    }
}
