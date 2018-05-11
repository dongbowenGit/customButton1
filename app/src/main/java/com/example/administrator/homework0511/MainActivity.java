 package com.example.administrator.homework0511;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

 public class MainActivity extends Activity {

     private SlipSwitch slipswitch;

     @Override
     public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         slipswitch = (SlipSwitch) findViewById(R.id.main_myslipswitch);
         slipswitch.setImageResource(R.drawable.bkg_switch,
                 R.drawable.bkg_switch, R.drawable.btn_slip);
         slipswitch.setOnSwitchListener(new SlipSwitch.OnSwitchListener() {

             @Override
             public void onSwitched(boolean isSwitchOn) {
                 if (isSwitchOn) {
                     Toast.makeText(MainActivity.this, "开关已经开启",
                             Toast.LENGTH_SHORT).show();
                 } else {
                     Toast.makeText(MainActivity.this, "开关已经关闭",
                             Toast.LENGTH_SHORT).show();
                 }
             }
         });

     }
 }
