
package io.stepan.RNAppRelauncher;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import android.app.Activity;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;

public class RNAppRelauncherPackage implements ReactPackage {
    private Activity activity;

    public RNAppRelauncherPackage(Activity activity) {
      super();
      this.activity = activity;
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
      return Arrays.<NativeModule>asList(new RNAppRelauncherModule(reactContext, activity));
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
      return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
      return Collections.emptyList();
    }
}