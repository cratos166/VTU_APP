package com.nbird.vtusgpacalculator.Adapter;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.Log;
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

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.MyViewHolder> {
    Context mContext;
    String[] mData;
    int selectedBranch;
    int selectedSem;

    int selectedScheme;
    AlertDialog alertDialog;
    InterstitialAd mInterstitialAd;

    public SubjectAdapter(Context mContext, String[] mData, int selectedScheme, int selectedBranch, int selectedSem, AlertDialog alertDialog, InterstitialAd mInterstitialAd) {
        this.mContext = mContext;
        this.mData = mData;
        this.selectedScheme = selectedScheme;
        this.selectedBranch = selectedBranch;
        this.selectedSem = selectedSem;
        this.alertDialog = alertDialog;
        this.mInterstitialAd = mInterstitialAd;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.asset_rec_text, parent, false);

        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {


        holder.head.setText(mData[position]);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInterstitialAd.setAdListener(new AdListener() {
                    public void onAdClosed() {
                        super.onAdClosed();
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                        intentFunction(position);
                    }

                });


                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                    return;
                }
                intentFunction(position);
            }
        });


    }

    private void intentFunction(int position) {

        Intent intent = new Intent(mContext, PDF_Activity.class);
        intent.putExtra("selectedScheme", selectedScheme);
        intent.putExtra("subjectName", mData[position]);
        intent.putExtra("isPortion", true);
        intent.putExtra("selectedBranch", selectedBranch);
        intent.putExtra("selectedSem", selectedSem);
        if (alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
        mContext.startActivity(intent);

    }

    @Override
    public int getItemCount() {
        return mData.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView head;
        CardView cardView;


        public MyViewHolder(View itemView) {
            super(itemView);

            head = (TextView) itemView.findViewById(R.id.head);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);

        }


    }

}
