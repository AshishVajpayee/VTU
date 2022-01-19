package com.example.vtu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardScheduler, cardNotes, cardCalculator, cardCgpa;
    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        cardScheduler = findViewById(R.id.cardScheduler);
        cardNotes = findViewById(R.id.cardNotes);
        cardCalculator = findViewById(R.id.cardCalculator);
        cardCgpa = findViewById(R.id.cardCgpa);

        cardScheduler.setOnClickListener(this);
        cardNotes.setOnClickListener(this);
        cardCalculator.setOnClickListener(this);
        cardCgpa.setOnClickListener(this);

        MainActivity.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return MainActivity.context;
    }

    public static int getPx(Context context, int dimensionDp) {
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (dimensionDp * density + 0.5f);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cardScheduler:
                startActivity(new Intent(this, SchedulerActivity.class));
                break;
            case R.id.cardNotes:
                startActivity(new Intent(this, NotesActivity.class));
                break;
            case R.id.cardCalculator:
                startActivity(new Intent(this, CalculatorActivity.class));
                break;
            case R.id.cardCgpa:
                startActivity(new Intent(this, CgpaActivity.class));
                break;
        }
    }
}
