package com.example.novatheme;

import android.app.Activity;
import android.os.Bundle;

public class NovaActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
    }

    private static final String ACTION_APPLY_ICON_THEME = "com.teslacoilsw.launcher.APPLY_ICON_THEME";
    private static final String NOVA_PACKAGE = "com.teslacoilsw.launcher";
    private static final String EXTRA_ICON_THEME_PACKAGE = "com.teslacoilsw.launcher.extra.ICON_THEME_PACKAGE";
}