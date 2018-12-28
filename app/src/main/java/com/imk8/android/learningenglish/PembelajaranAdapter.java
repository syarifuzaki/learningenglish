package com.imk8.android.learningenglish;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.imk8.android.learningenglish.realm.PembelajaranModel;

import java.util.ArrayList;

/**
 * Created by dev_deny on 1/25/17.
 */

public class PembelajaranAdapter extends RecyclerView.Adapter {

    private ArrayList<PembelajaranModel> pembelajaranModels;
    ItemListener itemListener;
    private Context context;

    public PembelajaranAdapter(Context context) {
        this.context = context;
        pembelajaranModels = new ArrayList<>();
    }

    public void update(ArrayList<PembelajaranModel> pembelajaranModels) {
        this.pembelajaranModels = pembelajaranModels;
        notifyDataSetChanged();
    }

    public void setOnclickListener(ItemListener itemlistener){
        this.itemListener = itemlistener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_word, parent, false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((Holder) holder).setValue(pembelajaranModels.get(position));
    }

    @Override
    public int getItemCount() {
        return pembelajaranModels.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView imgWord;

        Holder(View itemView) {
            super(itemView);
            imgWord = (ImageView) itemView.findViewById(R.id.imgWord);
        }

        private void setValue(final PembelajaranModel pembelajaranModel) {
            Glide.with(context).load(pembelajaranModel.getImage()).into(imgWord);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemListener.onClick(pembelajaranModel);
                }
            });
        }
    }

    public interface ItemListener{
        void onClick(PembelajaranModel pembelajaranModel);

    }

}

