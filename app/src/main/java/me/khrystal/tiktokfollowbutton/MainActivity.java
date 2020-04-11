package me.khrystal.tiktokfollowbutton;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import me.khrystal.widget.FollowButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FollowButton followBtn;
    Button resetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        followBtn = findViewById(R.id.followBtn);
        followBtn.setOnClickListener(this);
        resetBtn = findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(this);
    }

    @SuppressLint("NewApi")
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.followBtn:
                followBtn.start();
                break;
            case R.id.resetBtn:
                followBtn.reset();
                break;
        }
    }
}
