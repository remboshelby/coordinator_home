package com.inc.evil.coordinator_home.tasks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.inc.evil.coordinator_home.R;

public class Task1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task1_layout);
    }

    public static void start(Context c){
        c.startActivity(new Intent(c, Task1Activity.class));
    }
}
