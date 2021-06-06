package com.example.muyabbaj.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class KomlaRanirDighi_Activity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_komla_ranir_dighi_);
            setTitle(" কমলা রানীর দিঘি(সাগর দিঘি)");
        }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.optionmenu_home_exit,menu);
            return super.onCreateOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            if(item.getItemId()==R.id.homeId){
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
            else if(item.getItemId()==R.id.exitId){
                finishAffinity();
            }
            return super.onOptionsItemSelected(item);
        }
    }