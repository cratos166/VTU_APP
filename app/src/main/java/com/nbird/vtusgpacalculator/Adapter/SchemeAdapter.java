package com.nbird.vtusgpacalculator.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.nbird.vtusgpacalculator.Activity.PDF_Activity;
import com.nbird.vtusgpacalculator.Models.SchemeHolder;
import com.nbird.vtusgpacalculator.R;


import java.util.List;

public class SchemeAdapter extends RecyclerView.Adapter<SchemeAdapter.MyViewHolder> {
    private Context mContext;
    private List<SchemeHolder> mData;
    private AlertDialog alertDialog;
    private InterstitialAd mInterstitialAd;
    private int scheme;

    public SchemeAdapter(Context mContext, List<SchemeHolder> mData, AlertDialog alertDialog,InterstitialAd mInterstitialAd,int scheme) {
        this.mContext = mContext;
        this.mData = mData;
        this.alertDialog=alertDialog;
        this.mInterstitialAd=mInterstitialAd;
        this.scheme=scheme;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.asset_cardview_pdf, parent, false);

        return new MyViewHolder(view);

    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {


        holder.head.setText(mData.get(position).getText());
        holder.image.setBackgroundResource(mData.get(position).getPic());


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInterstitialAd.setAdListener(new AdListener(){
                    public void onAdClosed(){
                        super.onAdClosed();
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                        intentFunction(position);
                    }

                });


                if(mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                    return;
                }
                intentFunction(position);
            }
        });


    }

    private void intentFunction(int position){


        Intent intent=new Intent(mContext, PDF_Activity.class);
        intent.putExtra("branchName",mData.get(position).getText());
        intent.putExtra("scheme",scheme);
        if(alertDialog.isShowing()){
            alertDialog.dismiss();
        }
        mContext.startActivity(intent);


    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView head;
        ImageView image;
        CardView cardView;


        public MyViewHolder(View itemView) {
            super(itemView);

            head = (TextView) itemView.findViewById(R.id.head);
            image = (ImageView) itemView.findViewById(R.id.image);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);

        }


    }

}
