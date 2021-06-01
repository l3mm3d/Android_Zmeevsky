package com.example.ru.mirea.zmeevskiy.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MyDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Здравствуй МИРЭА!")
                .setMessage("Успех близок?")
                .setIcon(R.mipmap.ic_launcher_round)
                .setPositiveButton("Иду дальше", (dialog, id) -> {
                    ((MainActivity)getActivity()).onOkClicked();
                    dialog.cancel();
                })
                .setNeutralButton("На паузе",
                        (dialog, id) -> {
                            ((MainActivity)getActivity()).onNeutralClicked();
                            dialog.cancel();
                        })
                .setNegativeButton("Нет",
                        (dialog, id) -> {
                            ((MainActivity)getActivity()).onCancelClicked();
                            dialog.cancel();
                        });
        return builder.create();
    }
}