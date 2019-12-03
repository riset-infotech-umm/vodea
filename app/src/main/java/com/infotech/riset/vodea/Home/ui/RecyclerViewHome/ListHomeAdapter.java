package com.infotech.riset.vodea.Home.ui.RecyclerViewHome;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.infotech.riset.vodea.R;

import java.util.ArrayList;

public class ListHomeAdapter extends RecyclerView.Adapter<ListHomeAdapter.listViewHolder>{
    private ArrayList<VoteModel> listVote;

    public ListHomeAdapter(ArrayList<VoteModel> list){
        this.listVote=list;
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

        holder.tvTitle.setText(voteModel.getVoteTitle());
        holder.tvDate.setText(voteModel.getVoteDate());
        holder.tvDesc.setText(voteModel.getVoteDesc());
    }

    @Override
    public int getItemCount() {
        return listVote.size();
    }


    class listViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvTitle;
        TextView tvDesc;
        TextView tvDate;
        public listViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.FotoVoter);
            tvTitle=itemView.findViewById(R.id.VoteTitle);
            tvDesc = itemView.findViewById(R.id.VoteDesc);
            tvDate=itemView.findViewById(R.id.VoteDate);
        }
    }
}
