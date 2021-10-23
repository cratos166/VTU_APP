package com.nbird.vtusgpacalculator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
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

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context mContext;
    private List<Modes> mData;
    private static final String[] branchArr = {"CSE", "ISE", "ECE", "ME", "EEE", "TE", "CIVIL","BTE"};
    private static final String[] semArr = {"I","II","III","IV","V","VI","VII","VIII"};
    String selectedBranch="CSE";
    String selectedSem="I";

    public RecyclerViewAdapter(Context mContext, List<Modes> mData){
        this.mContext=mContext;
        this.mData=mData;

    }



    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater=LayoutInflater.from(mContext);
        view=mInflater.inflate(R.layout.asset_cardview,parent,false);

        return new MyViewHolder(view);

    }



    @Override
    public void onBindViewHolder( final MyViewHolder holder, final int position) {

        holder.head.setText(mData.get(position).getTitle());
        try{
            holder.anim.setAnimation(mData.get(position).getThumbnail());
        }catch (Exception e){

        }

        holder.dis.setText(mData.get(position).getDis());




        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   branchAndSemeterAlertDialog(v);
            }
        });



    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView head;
        LottieAnimationView anim;
        TextView dis;
        CardView cardView;


        public MyViewHolder(View itemView){
            super(itemView);

            head=(TextView) itemView.findViewById(R.id.head);
            anim=(LottieAnimationView) itemView.findViewById(R.id.anim);
            dis=(TextView) itemView.findViewById(R.id.dis);
            cardView=(CardView) itemView.findViewById(R.id.cardview_id);

        }


    }

   private void branchAndSemeterAlertDialog(View v){

       AlertDialog.Builder builder=new AlertDialog.Builder(mContext,R.style.AlertDialogTheme);

       final View view1= LayoutInflater.from(mContext).inflate(R.layout.layout_sem_branch_select,(ConstraintLayout) v.findViewById(R.id.layoutDialogContainer));
       builder.setView(view1);
       builder.setCancelable(true);


       Spinner spinnerBranch=(Spinner) view1.findViewById(R.id.spinnerBranch);
       Spinner spinnerSem=(Spinner) view1.findViewById(R.id.spinnerSem);
       Button nextButton=(Button) view1.findViewById(R.id.nextButton);


       ArrayAdapter<String> branchAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_spinner_item,branchArr);
       ArrayAdapter<String> semAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_spinner_item,semArr);

       branchAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       spinnerBranch.setAdapter(branchAdapter);

       spinnerBranch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               selectedBranch=branchArr[position];
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });

       spinnerSem.setAdapter(semAdapter);
       spinnerSem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               selectedSem=semArr[position];
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });

       final AlertDialog alertDialog=builder.create();
       if(alertDialog.getWindow()!=null){
           alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
       }
       try{
           alertDialog.show();
       }catch (Exception e){

       }

       nextButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               alertDialog.cancel();
               marksEntryAlertDialog(v);
           }
       });

   }


   private void marksEntryAlertDialog(View v){

       AlertDialog.Builder builder=new AlertDialog.Builder(mContext,R.style.AlertDialogTheme);

       final View view1= LayoutInflater.from(mContext).inflate(R.layout.dialog_marks_entry,(ConstraintLayout) v.findViewById(R.id.layoutDialogContainer));
       builder.setView(view1);
       builder.setCancelable(true);




       final AlertDialog alertDialog=builder.create();
       if(alertDialog.getWindow()!=null){
           alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
       }
       try{
           alertDialog.show();
       }catch (Exception e){

       }



   }




}
