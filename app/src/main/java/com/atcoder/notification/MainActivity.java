package com.atcoder.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    Button btnNotify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNotify = findViewById(R.id.btnNotify);

        btnNotify.setOnClickListener(v -> {
            Notification notification = new NotificationCompat.Builder(this, MyNotification.CHANNEL_ID)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setContentTitle("title")
                    .setContentText("text....")
                    .build();

            NotificationManagerCompat.from(this).notify(new Random().nextInt(), notification);
        });

    }
}