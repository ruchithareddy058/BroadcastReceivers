package com.ruchitha.broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
ImageView img1;
    public MyReceiver(ImageView imageView) {
        this.img1=imageView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        switch (intent.getAction()){
            case Intent.ACTION_POWER_CONNECTED:
                img1.setImageResource(R.drawable.battery_full);
                Toast.makeText(context, "Battery is full", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                img1.setImageResource(R.drawable.battery_empty);
                Toast.makeText(context, "Battery is empty", Toast.LENGTH_SHORT).show();
                break;
        }
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
