package com.infotech.riset.vodea.Home.PopUp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.infotech.riset.vodea.R;

import java.util.ArrayList;

public class PopUpAdapter extends RecyclerView.Adapter<PopUpAdapter.listViewHolder> {
    private ArrayList<PopModel> listOption;
    private popData data;

    public PopUpAdapter(ArrayList<PopModel> listOption,popData data) {
        this.listOption = listOption;
        this.data=data;
    }

    @NonNull
    @Override
    public listViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_popup,parent,false);
        return new listViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listViewHolder holder, int position) {
        PopModel model = listOption.get(holder.getAdapterPosition());
        holder.tvEditOption.setHint(model.getHint());


    }

    @Override
    public int getItemCount() {
        return listOption.size();
    }

    class listViewHolder extends RecyclerView.ViewHolder{
        EditText tvEditOption;


        public listViewHolder(@NonNull View itemView) {
            super(itemView);
            tvEditOption = itemView.findViewById(R.id.item_edit_popup);
        }
    }
}
