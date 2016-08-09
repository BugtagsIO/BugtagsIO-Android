package iot.bugtags.networkapp;

import android.app.Application;

import io.bugtags.library.Bugtags;

import io.bugtags.insta.BugtagsInsta;

/**
 * Created by kevin on 16/3/11.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Bugtags.start("6ed89ad65faedd96f29a30279818d19f", this, Bugtags.BTGInvocationEventBubble);

        Bugtags.registerPlugin(new BugtagsInsta());
    }
}
