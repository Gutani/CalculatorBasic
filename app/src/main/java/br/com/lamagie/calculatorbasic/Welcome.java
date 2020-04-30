package br.com.lamagie.calculatorbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);

        //Set another page as main
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainAct = new Intent(Welcome.this, MainActivity.class);
                startActivity(mainAct);
                finish();
            }
        },1500);
    }
}
