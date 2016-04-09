package com.dataeye.gonghao.apptracking;

import android.app.Activity;
import android.os.Bundle;

import com.dataeye.sdk.api.tracking.DCAgent;
import android.content.Context;

public class MainActivity extends Activity {

    public Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext();
        DCAgent.initWithAppIdAndChannelId(mContext,"","");
    }

    @Override
    protected void onResume() {
        super.onResume();
        DCAgent.resume(mContext);
    }

    @Override
    protected void onPause() {
        super.onPause();
        DCAgent.pause(mContext);
    }


}
