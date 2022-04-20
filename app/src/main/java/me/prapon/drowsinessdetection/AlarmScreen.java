package me.prapon.drowsinessdetection;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import me.prapon.drowsinessdetection.R;

public class AlarmScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_screen);
        final MediaPlayer alarm = MediaPlayer.create(this, R.raw.alarm);
        alarm.start();

    }
}
