package com.example.examenmapaspr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Lugares extends AppCompatActivity {

    Button btnLugar;
    String lugar;
    TextView txt;
    ImageView img1,img2;
    double latitud=0;
    double longitud=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);
        btnLugar=(Button)findViewById(R.id.button4);
        lugar=getIntent().getExtras().getString("lugar");
        txt=(TextView)findViewById(R.id.textView2);
        txt.setText(lugar);
        img1=(ImageView) findViewById(R.id.imageView);
        img2=(ImageView) findViewById(R.id.imageView2);
        if(lugar.equals("torres del paine")){
            img1.setImageResource(R.drawable.lago1);;
            latitud=-50.941362095666626;
            longitud= -73.41058309605094;
        }else if(lugar.equals("lago colbun")){

            latitud=-35.668128535917056;
            longitud= -71.2652372880115;
        }else if(lugar.equals("viña del mar")){

            latitud=-33.016284667270796;
            longitud= -71.55866178015779;
        }else if(lugar.equals("isla de pascua")){

            latitud=-27.11643770964549;
            longitud=  -109.35255748075917;
        }else if(lugar.equals("punta arenas")){

            latitud= -53.14411335695264;
            longitud= -70.91538092498003;
        }else if(lugar.equals("desierto de atacama")){

            latitud=-23.681580526771015;
            longitud=-69.10611335838809;
        }else if(lugar.equals("chiloe")){

            latitud=-42.60746339883781;
            longitud=-73.87395460472678;
        }

    }
    public void image1(View view){
        if(lugar.equals("torres del paine")){
            img1.setImageResource(R.drawable.paine1);

        }else if(lugar.equals("lago colbun")){
            img1.setImageResource(R.drawable.lago1);
        }else if(lugar.equals("viña del mar")){
            img1.setImageResource(R.drawable.vina1);
        }else if(lugar.equals("isla de pascua")){
            img1.setImageResource(R.drawable.pascua1);
        }else if(lugar.equals("punta arenas")){
            img1.setImageResource(R.drawable.arenas1);
        }else if(lugar.equals("desierto de atacama")){
            img1.setImageResource(R.drawable.desierto1);
        }else if(lugar.equals("chiloe")){
            img1.setImageResource(R.drawable.chiloe2);
        }

    }

    public void image2(View view){
        if(lugar.equals("torres del paine")){
            img2.setImageResource(R.drawable.paine2);

        }else if(lugar.equals("lago colbun")){
            img2.setImageResource(R.drawable.lago2);

        }else if(lugar.equals("viña del mar")){
            img1.setImageResource(R.drawable.vina2);
        }else if(lugar.equals("isla de pascua")){
            img1.setImageResource(R.drawable.pascua2);
        }else if(lugar.equals("punta arenas")){
            img1.setImageResource(R.drawable.arenas2);
        }else if(lugar.equals("desierto de atacama")){
            img1.setImageResource(R.drawable.desierto2);
        }else if(lugar.equals("chiloe")){
            img1.setImageResource(R.drawable.chiloe1);
        }
    }

    public void IrMapa(View view){
        Intent control = new Intent(this, MapsActivity.class);




        control.putExtra("latitud",latitud);
        control.putExtra("loingitud",longitud);
        startActivity(control);
    }
}