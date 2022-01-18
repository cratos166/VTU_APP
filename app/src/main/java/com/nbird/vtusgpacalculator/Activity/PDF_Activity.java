package com.nbird.vtusgpacalculator.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.nbird.vtusgpacalculator.R;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PDF_Activity extends AppCompatActivity {
    public final static String SCHEME_PATH="gs://vtu-sgpa-calculator.appspot.com/Scheme/";
    public final static String PORTION_PATH="gs://vtu-sgpa-calculator.appspot.com/Portion";
    PDFView pdfView;
    Dialog loadingDialog;
    String[] portionSubjectList={"Aeronautical Engineering","Aerospace Engineering","Architecture",
    "Biomedical Engineering","Biotechnology","Chemical Engineering","Civil Engineering","Computer Science & Engineering",
            "Electrical & Electronics Engineering","Electronics & Communication Engineering","Electronics & Instrumentation Engineering",
    "Electronics & Telecommunication Engineering","Industrial & Production Engineering","Information Science & Engineering",
    "Manufacturing Science & Engineering","Marine Engineering","Mechanical Engineering","Mechatronics","Medical Electronics",
    "Mining Engineering","Nano Technology","Petrochem Engineering"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);


        pdfView=(PDFView) findViewById(R.id.pdfview);

        loadingDialog=new Dialog(this);
        loadingDialog.setContentView(R.layout.loading_screen);
        loadingDialog.getWindow().setLayout(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        loadingDialog.setCancelable(false);
        loadingDialog.show();


        Boolean isPortion=getIntent().getBooleanExtra("isPortion",false);


        String finalUrl="";
        if(isPortion){
            String subjectName=getIntent().getStringExtra("subjectName");
            int selectedBranch=getIntent().getIntExtra("selectedBranch",0);
            int selectedSem=getIntent().getIntExtra("selectedSem",0);
            finalUrl=PORTION_PATH+portionSubjectList[selectedBranch]+"/"+selectedSem+"/"+subjectName+"("+selectedSem+")"+".pdf";
        }else {
            String branchName=getIntent().getStringExtra("branchName");
            finalUrl=SCHEME_PATH+branchName+".pdf";
        }



        StorageReference storageRef = FirebaseStorage.getInstance().getReferenceFromUrl(finalUrl);
        storageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                new RetrivePdfStream().execute(uri.toString());
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
               exception.printStackTrace();
            }
        });

    }

    class RetrivePdfStream extends AsyncTask<String,Void, InputStream> {

        @Override
        protected InputStream doInBackground(String... strings) {



            InputStream inputStream=null;
            try {
                URL url=new URL(strings[0]);
                HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
                if(urlConnection.getResponseCode()==200){
                    inputStream=new BufferedInputStream(urlConnection.getInputStream());
                }
            }catch (IOException e){
                return null;
            }
            return inputStream;
        }
        protected void onPostExecute(InputStream inputStream){
            loadingDialog.dismiss();
            pdfView.fromStream(inputStream).load();
        }
    }


}