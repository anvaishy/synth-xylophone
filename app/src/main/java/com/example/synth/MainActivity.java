package com.example.synth;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool m;
    private int b0;
    private int b2;
    private int b4;
    private int e0;
    private int e2;
    private int e4;
    private int e5;
    private int e7;
    private int e9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m=new SoundPool(9, AudioManager.STREAM_MUSIC,0);
        b0=m.load(getApplicationContext(),R.raw.b0,1);
        b2=m.load(getApplicationContext(),R.raw.b2,1);
        b4=m.load(getApplicationContext(),R.raw.b4,1);
        e0=m.load(getApplicationContext(),R.raw.e0,1);
        e2=m.load(getApplicationContext(),R.raw.e2,1);
        e4=m.load(getApplicationContext(),R.raw.e4,1);
        e5=m.load(getApplicationContext(),R.raw.e5,1);
        e7=m.load(getApplicationContext(),R.raw.e7,1);
        e9=m.load(getApplicationContext(),R.raw.e9,1);
    }

    public void b0(View view) {
        m.play(b0,1.0f,1.0f,0,0,1.0f);
    }

    public void b2(View view) {m.play(b2,1.0f,1.0f,0,0,1.0f);
    }
    public void b4(View view) {m.play(b4,1.0f,1.0f,0,0,1.0f);
    }
    public void e0(View view) {m.play(e0,1.0f,1.0f,0,0,1.0f);
    }
    public void e2(View view) {m.play(e2,1.0f,1.0f,0,0,1.0f);
    }
    public void e4(View view) {m.play(e4,1.0f,1.0f,0,0,1.0f);
    }
    public void e5(View view) {m.play(e5,1.0f,1.0f,0,0,1.0f);
    }
    public void e7(View view) {m.play(e7,1.0f,1.0f,0,0,1.0f);
    }
    public void e9(View view) {m.play(e9,1.0f,1.0f,0,0,1.0f);
    }
}