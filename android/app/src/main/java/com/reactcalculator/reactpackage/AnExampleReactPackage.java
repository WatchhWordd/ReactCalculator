package com.reactcalculator.reactpackage;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.reactcalculator.module.ToastModule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhangyb
 * @description
 * @date 2017/12/13
 */

public class AnExampleReactPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new ToastModule(reactContext));
        return modules;
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return  Collections.emptyList();
    }
}
