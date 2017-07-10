package org.dev4u.hv.my_diagnostic;

import android.content.Intent;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import db.Database;
import db.LocalDatabase;

public class DownloadActivity extends AppCompatActivity {

    private LocalDatabase localDatabase;
    private ImageView hearth;
    private AnimatedVectorDrawable hearthAnim;
    private Button btnDownload;
    private Database db;
    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        findViewById(R.id.activity_test);

        btnDownload = (Button) findViewById(R.id.btnDownload);

        //animation
        hearth = (ImageView)findViewById(R.id.pulse);
        hearthAnim = ((AnimatedVectorDrawable) ((ImageView)findViewById(R.id.pulse)).getDrawable());
        AnimatedVectorDrawable d = (AnimatedVectorDrawable) getDrawable(R.drawable.hearth_pulse_animation);
        hearth.setImageDrawable(d);
        d.start();


        localDatabase = new LocalDatabase(this);

        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test();
            }
        });

    }

    public void test(){

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        //localDatabase.deleteData();
        //localDatabase.getSymptoms();
        //localDatabase.getDisease();
        //localDatabase.getSymptomsDisease();
        //localDatabase.setTextView( (TextView)findViewById(R.id.lblPrueba) );
        //localDatabase.initDatabase();
        //como se ejecuta en un hilo hay que esperar a que haya terminado
    }
}