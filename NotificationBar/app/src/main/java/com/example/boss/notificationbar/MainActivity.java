package com.example.boss.notificationbar;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.notifygen);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this,0,intent,0);
                Notification notification = new Notification.Builder(MainActivity.this)
                                            .setTicker("Ticker Title")
                        .setContentTitle("Content Title")
                        .setContentText("Content Text Rajat is awsome")
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setContentIntent(pendingIntent).getNotification();

                notification.flags = Notification.FLAG_AUTO_CANCEL;
                NotificationManager nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                nm.notify(0,notification);
            }
        });
    }
}
