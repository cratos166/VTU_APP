package com.nbird.vtusgpacalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Modes> modesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);
        modesList=new ArrayList<>();
        setModesList();
        RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(this,modesList);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        recyclerView.setAdapter(myAdapter);

    }

    private void setModesList(){

        modesList.add(new Modes("SGPA Calculator",R.raw.animleadership,"Test your knowledge and compete against time. Score points for accuracy and achieve ranks."));
        modesList.add(new Modes("CGPA Calculator",R.raw.animleadership,"Time for the One-On-One. Compete with a rival online. Time your knowledge and be the champion."));
        modesList.add(new Modes("VTU Results",R.raw.animleadership,"Quizzers from all over the world come together in the arena to show who's the ultimate leaderboard breaker."));
        modesList.add(new Modes("Percentage",R.raw.animleadership,"Test your visual skills and ace your pictorial predicts. Compete in single mode or join the online multiplayer."));

    }

}