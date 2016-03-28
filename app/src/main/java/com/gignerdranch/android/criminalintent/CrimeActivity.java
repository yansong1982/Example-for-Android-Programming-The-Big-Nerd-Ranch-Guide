package com.gignerdranch.android.criminalintent;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import android.util.Log;


public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        Log.e("zys", "fragment 1 = "+fragment);

        if (fragment == null) {
            fragment = new CrimeFragment();
            Log.e("zys", "fragment 2 = "+fragment);
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

    }


}
