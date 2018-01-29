package com.example.francisco.meliapi;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;

/**
 * Created by francisco on 28/1/18.
 */

public class MiDialogo extends AppCompatDialogFragment {



    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle("Elija un color");
        String[] items = new String[]{"amarillo","rojo","rosa"};
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int item) {
                if(item == 0){

                }
                if(item == 1){
                    Log.d("rojo","rojo");
                }

            }
        });
        AlertDialog ad = builder.create();
        return ad;


    }
}
