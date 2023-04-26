package com.mukeshkumar.secblock.activities;

import static android.content.Intent.ACTION_MAIN;
import static android.content.Intent.CATEGORY_LAUNCHER;
import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;
import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;
import com.mukeshkumar.secblock.managers.SharedPreferencesManager;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import static com.mukeshkumar.secblock.managers.SharedPreferencesManager.DEFAULT_PROOF_OF_WORK;

public class RestorePowShortcutActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferencesManager prefs = new SharedPreferencesManager(this);

        Intent intent = new Intent(this, MainActivity.class);
        intent.setAction(ACTION_MAIN);
        intent.setFlags(FLAG_ACTIVITY_NEW_TASK|FLAG_ACTIVITY_CLEAR_TOP);
        intent.addCategory(CATEGORY_LAUNCHER);
        prefs.setPowValue(DEFAULT_PROOF_OF_WORK);
        startActivity(intent);
    }
}
