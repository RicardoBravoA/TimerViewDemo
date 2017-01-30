package com.rba.timerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import pe.com.orbis.timerview.TimerInterface;
import pe.com.orbis.timerview.TimerView;

public class MainActivity extends AppCompatActivity implements TimerInterface {

    @BindView(R.id.tv3)
    TimerView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        tv3.setTime(10000);
        tv3.setShowDisplay(true);

        tv3.setOnTimerListener(this);
    }

    @Override
    public void onTimerDown(long milliseconds) {

    }

    @Override
    public void onTimerFinish() {
        tv3.showLabelFinished();
    }
}
