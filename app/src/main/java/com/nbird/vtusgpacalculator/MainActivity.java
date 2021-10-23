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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);
        modesList=new ArrayList<>();
        setModesList();
        RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(this,modesList);
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
                        String shareBody="MindScape: The ultimate SGPA And CGPA Calculator!\n\n" +
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

        modesList.add(new Modes("SGPA Calculator",R.raw.animleadership,"Test your knowledge and compete against time. Score points for accuracy and achieve ranks."));
        modesList.add(new Modes("CGPA Calculator",R.raw.animleadership,"Time for the One-On-One. Compete with a rival online. Time your knowledge and be the champion."));
        modesList.add(new Modes("VTU Results",R.raw.animleadership,"Quizzers from all over the world come together in the arena to show who's the ultimate leaderboard breaker."));
        modesList.add(new Modes("Percentage",R.raw.animleadership,"Test your visual skills and ace your pictorial predicts. Compete in single mode or join the online multiplayer."));

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