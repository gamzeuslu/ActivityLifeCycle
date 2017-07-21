package com.androidedu.kodluyoruzakademi.activitylifecycle;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;

public class NewActivity extends AppCompatActivity {

    private static final String TAG = "NewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Log.e(TAG, "onCreate error message here");
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();

        Log.e(TAG, "onContentChanged error message here");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e(TAG, "onStart error message here");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Log.e(TAG, "onRestoreInstanceState error message here");
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);

        Log.e(TAG, "onPostCreate error message here");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e(TAG, "onResume error message here");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        Log.e(TAG, "onPostResume error message here");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();

        Log.e(TAG, "onAttachedToWindow error message here");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        Log.e(TAG, "onCreateOptionsMenu error message here");

        return super.onCreateOptionsMenu(menu);

    }


    @Override
    protected void onPause() {
        super.onPause();

        Log.e(TAG, "onPause error message here");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.e(TAG, "onSaveInstanceState error message here");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e(TAG, "onStop error message here");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e(TAG, "onDestroy error message here");
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();

        Log.e(TAG, "onUserInteraction error message here");
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();

        Log.e(TAG, "onUserLeaveHint error message here");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.e(TAG, "onActivityResult error message here");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.e(TAG, "onRestart error message here");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);

        Log.e(TAG, "onAttachFragment error message here");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        Log.e(TAG, "onConfigurationChanged error message here");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Log.e(TAG, "onBackPressed error message here");
    }


}
