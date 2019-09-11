package com.kotlin.anjanalibrary;

import android.content.Context;
import android.widget.Toast;

public class ShowToast {
    public static void show(Context context,String message)
    {
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
