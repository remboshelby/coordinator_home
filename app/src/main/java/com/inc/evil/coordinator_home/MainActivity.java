package com.inc.evil.coordinator_home;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.inc.evil.coordinator_home.tasks.Task1Activity;
import com.inc.evil.coordinator_home.tasks.Task2Activity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.buttonTask1)
    Button buttonTask1;
    @BindView(R.id.buttonTask2)
    Button buttonTask2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonTask1)
    public void buttonTask1() {
        Task1Activity.start(this);
    }

    @OnClick(R.id.buttonTask2)
    public void buttonTask2() {
        Task2Activity.start(this);
    }



}
