package com.infotech.riset.vodea.Home.ui.RecyclerViewHome;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;


import com.infotech.riset.vodea.GoVote.GoVote;
import com.infotech.riset.vodea.R;

import java.util.ArrayList;

public class ListHomeAdapter extends RecyclerView.Adapter<ListHomeAdapter.listViewHolder>{
    private ArrayList<VoteModel> listVote;
    private Context mContext;

    public ListHomeAdapter(ArrayList<VoteModel> list,Context mContext){
        this.listVote=list;
        this.mContext=mContext;
    }

    @NonNull
    @Override
    public listViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_home,parent,false);
        return new listViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listViewHolder holder, int position) {
        VoteModel voteModel = listVote.get(position);
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContext.startActivity(new Intent(mContext, GoVote.class));
            }
        });
        holder.tvTitle.setText(voteModel.getVoteTitle());
        holder.tvDate.setText(voteModel.getVoteDate());
        holder.tvDesc.setText(voteModel.getVoteDesc());
    }

    @Override
    public int getItemCount() {
        return listVote.size();
    }


    class listViewHolder extends RecyclerView.ViewHolder{
        ConstraintLayout constraintLayout;
        ImageView imgPhoto;
        TextView tvTitle;
        TextView tvDesc;
        TextView tvDate;
        public listViewHolder(@NonNull View itemView) {
            super(itemView);
            constraintLayout=itemView.findViewById(R.id.vote_list);
            imgPhoto = itemView.findViewById(R.id.FotoVoter);
            tvTitle=itemView.findViewById(R.id.VoteTitle);
            tvDesc = itemView.findViewById(R.id.VoteDesc);
            tvDate=itemView.findViewById(R.id.VoteDate);
        }
    }
}
