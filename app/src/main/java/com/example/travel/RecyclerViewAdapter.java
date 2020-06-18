package com.example.travel;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    Context mContext;
    List<Explore> mData;
    Dialog myDialog;

    public RecyclerViewAdapter(Context mContext, List<Explore> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_explore,parent,false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        //Dialog Initiation
        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_explore);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));




        vHolder.item_explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_placename_tv = (TextView) myDialog.findViewById(R.id.dialog_place_name);
                TextView dialog_description_tv = (TextView) myDialog.findViewById(R.id.dialog_description);
                ImageView dialog_img = (ImageView) myDialog.findViewById(R.id.dialog_img);
                dialog_placename_tv.setText(mData.get(vHolder.getAdapterPosition()).getPlacename());
                dialog_description_tv.setText(mData.get(vHolder.getAdapterPosition()).getDescription());
                dialog_img.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhoto());
                myDialog.show();
            }
        });
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_placename.setText(mData.get(position).getPlacename());
        holder.tv_location.setText(mData.get(position).getLocation());
        holder.tv_state.setText(mData.get(position).getState());
        holder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{


        private LinearLayout item_explore;
        private TextView tv_placename;
        private TextView tv_location;
        private TextView tv_state;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_explore = (LinearLayout) itemView.findViewById(R.id.explore_item_id);
            tv_placename = (TextView) itemView.findViewById(R.id.placename_explore);
            tv_location = (TextView) itemView.findViewById(R.id.location_explore);
            tv_state = (TextView) itemView.findViewById(R.id.state_explore);
            img = (ImageView) itemView.findViewById(R.id.img_explore);
        }
    }


}
