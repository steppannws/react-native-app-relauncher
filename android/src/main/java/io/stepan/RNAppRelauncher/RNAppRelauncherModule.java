
package io.stepan.RNAppRelauncher;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.AlarmManager;
import android.content.Intent;
import android.content.Context;

import java.lang.System;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNAppRelauncherModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  private Activity activity;

  public RNAppRelauncherModule(ReactApplicationContext reactContext, Activity activity) {
    super(reactContext);
    this.reactContext = reactContext;
    this.activity = activity;
  }

  @Override
  public String getName() {
    return "RNAppRelauncher";
  }

  @ReactMethod
  public void relaunch() {
  	Intent mStartActivity = new Intent(activity, activity.getClass());
    int mPendingIntentId = 123456;
    PendingIntent mPendingIntent = PendingIntent.getActivity(activity, mPendingIntentId, mStartActivity,
    PendingIntent.FLAG_CANCEL_CURRENT);
    AlarmManager mgr = (AlarmManager) activity.getSystemService(Context.ALARM_SERVICE);
    mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 100, mPendingIntent);
    System.exit(0);
  }
}