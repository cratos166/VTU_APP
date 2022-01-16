package com.nbird.vtusgpacalculator.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nbird.vtusgpacalculator.Activity.PDF_Activity;
import com.nbird.vtusgpacalculator.Models.SchemeHolder;
import com.nbird.vtusgpacalculator.Modes;
import com.nbird.vtusgpacalculator.R;
import com.nbird.vtusgpacalculator.SubjectsList;


import java.util.List;

public class SchemeAdapter extends RecyclerView.Adapter<SchemeAdapter.MyViewHolder> {
    private Context mContext;
    private List<SchemeHolder> mData;


    public SchemeAdapter(Context mContext, List<SchemeHolder> mData) {
        this.mContext = mContext;
        this.mData = mData;
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
                Intent intent=new Intent(mContext, PDF_Activity.class);
                intent.putExtra("branchName",mData.get(position).getText());
                mContext.startActivity(intent);
            }
        });


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
