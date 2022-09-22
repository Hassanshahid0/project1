package com.example.dailog_box;

import android.content.Context;
import android.widget.Toast;

public class Dailog1{
    public static void Simple_Dailog_Box(Context con,String message)
    {
        Toast.makeText(con, message, Toast.LENGTH_SHORT).show();
    }



}
