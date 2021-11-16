package com.nbird.vtusgpacalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    RecyclerView recyclerView;
    List<Modes> modesList;
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle mToggle;
    String link="https://play.google.com/store/apps/details?id=com.nbird.vtusgpacalculator";


    InterstitialAd mInterstitialAd;


    private void loadAds(){
        mInterstitialAd = new InterstitialAd(MainActivity.this);
        mInterstitialAd.setAdUnitId(getResources().getString(R.string.interstitialAd_id));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadAds();

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);
        modesList=new ArrayList<>();
        setModesList();
        RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(this,modesList,mInterstitialAd);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        recyclerView.setAdapter(myAdapter);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable((Color.parseColor("#98A8D0"))));

        mToggle = new ActionBarDrawerToggle(MainActivity.this,drawerLayout,R.string.open,R.string.close);

        navigationView.bringToFront();


        drawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_rate:
                        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                        startActivity(browserIntent);
                        break;
                    case R.id.share_us:
                        Toast.makeText(MainActivity.this, "Share Me!", Toast.LENGTH_SHORT).show();
                        Intent shareIntent=new Intent(Intent.ACTION_SEND);
                        shareIntent.setType("text/plane");
                        String shareBody="MindScape: The ultimate VTU SGPA And CGPA Calculator!\n\n" +
                                "Download Now! \n" + link;
                        String sharesub="VTU SGPA Calculator";

                        shareIntent.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                        shareIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                        startActivity(Intent.createChooser(shareIntent,"Share Using"));
                        break;
                    case R.id.nav_contact:
                        Intent intent2=new Intent(Intent.ACTION_SEND);
                        String[] recipients={"niftynile@gmail.com"};
                        intent2.putExtra(Intent.EXTRA_EMAIL, recipients);
                        // intent2.putExtra(Intent.EXTRA_SUBJECT,"Subject text here...");
                        // intent2.putExtra(Intent.EXTRA_TEXT,"Body of the content here...");
                        // intent2.putExtra(Intent.EXTRA_CC,"mailcc@gmail.com");
                        intent2.setType("text/html");
                        intent2.setPackage("com.google.android.gm");
                        startActivity(Intent.createChooser(intent2, "Send mail"));
                        break;
                    case R.id.nav_about:
                        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this,R.style.AlertDialogTheme);
                        final View view1= LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog_about_us,(ConstraintLayout) findViewById(R.id.layoutDialogContainer));
                        builder.setView(view1);
                        builder.setCancelable(true);


                        Button doneButton=(Button) view1.findViewById(R.id.doneButton);

                        final AlertDialog alertDialog=builder.create();
                        if(alertDialog.getWindow()!=null){
                            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                        }
                        try{
                            alertDialog.show();
                        }catch (Exception e){

                        }


                        doneButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                alertDialog.dismiss();
                            }
                        });


                        break;
                }
                return true;
            }
        });


        navigationView.setCheckedItem(R.id.nav_view);

    }

    private void setModesList(){

        modesList.add(new Modes("SGPA Calculator",R.raw.sgpa_cal,"Select your branch and sem and then enter all the marks for the respective subjects ."));
        modesList.add(new Modes("CGPA Calculator",R.raw.cgpa_cal,"Enter all the semester SGPA in the Edit TextView till given to get the CGPA."));
        modesList.add(new Modes("VTU Results",R.raw.result,"Click on this tab to get the VTU results which automatically redirects you to the VTU Website."));
        modesList.add(new Modes("Percentage",R.raw.a5,"Enter your CGPA in the Edit TextView till given to get the Percentage."));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Pass the event to ActionBarDrawerToggle, if it returns
        // true, then it has handled the app icon touch event
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        // Handle your other action bar items...

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}