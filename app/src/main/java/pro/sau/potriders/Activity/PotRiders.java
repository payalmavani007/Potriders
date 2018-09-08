package pro.sau.potriders.Activity;

import android.app.Application;

public class PotRiders extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/bauhaus.ttf");

    }
}
