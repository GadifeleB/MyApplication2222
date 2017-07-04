package com.example.brenda.myapplication2222;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView ;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Declaring the Variables

    private TextView txtTeamHome;
    private TextView txtTeamGuest;
    private Button btnAddTeamG;
    private Button btnAddTeamH;
    private Button btnAddTeamC;
    private Button btnMinusGl;
    private Button btnMinusHl;



    // Declaring the Methods

    private int scoreTeamHome=0;
    private int ScoreTeamGuest=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //assigning values to appropriate views
        txtTeamHome =(TextView)findViewById(R.id.txtHome);
        txtTeamGuest =(TextView)findViewById(R.id.txtGuest);
        btnAddTeamH =(Button)findViewById(R.id.btnAddHome);
        btnAddTeamG =(Button)findViewById(R.id.btnAddGuest);
        btnAddTeamC =(Button)findViewById(R.id.btnClear);
        btnMinusGl = (Button)findViewById(R.id.btnminusG ) ;
        btnMinusHl = (Button) findViewById(R.id.btnminusH  );

        //adding the goals

        btnAddTeamH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamHome++;
                txtTeamHome .setText(String.valueOf(scoreTeamHome));

            }
        });

        btnAddTeamG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreTeamGuest++;
                txtTeamGuest .setText(String.valueOf(ScoreTeamGuest));

            }
        });


     //subtracting the goals and validating messages

        btnMinusGl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ScoreTeamGuest > 0)
                {
                    ScoreTeamGuest--;
                txtTeamGuest.setText(String.valueOf(ScoreTeamGuest));
            }else

            {
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();

                }
            }
        });
        btnMinusHl.setOnClickListener(new View.OnClickListener() {
            @Override

                public void onClick(View v) {
                    if (scoreTeamHome > 0)
                    {

                scoreTeamHome--;
                txtTeamHome .setText(String.valueOf(scoreTeamHome));
                    }else

                    {
                        Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();

                    }
                }


        });

        //clearing goals

        btnAddTeamC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamHome=0;
                txtTeamHome .setText(String.valueOf(scoreTeamHome));

                ScoreTeamGuest =0;
                txtTeamGuest .setText(String.valueOf(ScoreTeamGuest));
            }
        });

    }




}
