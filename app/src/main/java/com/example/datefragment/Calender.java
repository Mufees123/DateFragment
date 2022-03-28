package com.example.datefragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class Calender extends DialogFragment {
    @RequiresApi(api = Build.VERSION_CODES.N)
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar c=Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        int m=c.get(Calendar.MONTH);
        int d=c.get(Calendar.DATE);
        return  new DatePickerDialog(getActivity(),(DatePickerDialog.OnDateSetListener) getActivity(),y,m,d);
    }
}
