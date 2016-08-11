package iot.bugtags.demo;

import android.app.Application;

import io.bugtags.library.Bugtags;
import io.bugtags.library.BugtagsCallback;
import io.bugtags.library.BugtagsOptions;

import io.bugtags.insta.BugtagsInsta;

/**
 * Created by kevin on 15/7/24.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //customizable init option
        BugtagsOptions options = new BugtagsOptions.Builder().
                trackingLocation(true).//Set whether to track the location in the app, default is true
                trackingCrashLog(true).// Set whether to track the crashes in the app, default is true
                trackingConsoleLog(true).//Set whether to track the console logs while using the app, default is true
                trackingUserSteps(true).//Set whether to track the user's steps while using the app, default is true
                startAsync(false).
                startCallback(new BugtagsCallback() {
                    @Override
                    public void run() {

                    }
                }).
                enableUserSignIn(true).
                build();

        Bugtags.start(BuildConfig.DEBUG ? "6ed89ad65faedd96f29a30279818d19f" : "5fcf1cd294eb8384e63c0e471063d6ff", this, Bugtags.BTGInvocationEventBubble, options);

        Bugtags.setBeforeSendingCallback(new BugtagsCallback() {
            @Override
            public void run() {
                Bugtags.log("before");
            }
        });

        Bugtags.setAfterSendingCallback(new BugtagsCallback() {
            @Override
            public void run() {
                Bugtags.log("after");
            }
        });

        Bugtags.registerPlugin(new BugtagsInsta());

        Bugtags.log("hello,bugtags log");
        Bugtags.setUserData("key", "value");
    }
}
