package com.example.israil.cinmatica;


import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.GeneralClickAction;
import android.support.test.espresso.action.GeneralLocation;
import android.support.test.espresso.action.Press;
import android.support.test.espresso.action.Tap;

public final class MyViewActions {
    public static ViewAction click() {
        return new GeneralClickAction(Tap.SINGLE, GeneralLocation.CENTER, Press.FINGER);
    }
}