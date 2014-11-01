package com.teamtreehouse.ribbit.com.teamtreehouse.ribbit.utils;

import android.content.Context;
import android.content.Intent;

import com.parse.ParsePushBroadcastReceiver;
import com.teamtreehouse.ribbit.com.teamtreehouse.ribbit.ui.MainActivity;

/**
 * Created by rnguyen on 11/1/14.
 */
public class Receiver extends ParsePushBroadcastReceiver {

    @Override
    public void onPushOpen(Context context, Intent intent) {
        Intent i = new Intent(context, MainActivity.class);
        i.putExtras(intent.getExtras());
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
