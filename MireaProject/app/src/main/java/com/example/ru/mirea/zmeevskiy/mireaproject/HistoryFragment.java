package com.example.ru.mirea.zmeevskiy.mireaproject;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HistoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HistoryFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HistoryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HistoryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HistoryFragment newInstance(String param1, String param2) {
        HistoryFragment fragment = new HistoryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    private EditText editText;
    private SharedPreferences preferences;
    final String SAVED_TEXT = "saved_text";
    Button bt1;
    CheckBox checkBox;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_history, container, false);
        editText = root.findViewById(R.id.editTextTextPersonName);
        checkBox = root.findViewById(R.id.checkBox);
        preferences = getActivity().getPreferences(MODE_PRIVATE);

        if (preferences.contains("checked") && preferences.getBoolean("checked", false) == true) {
            checkBox.setChecked(true);
        }
        else
            {
            checkBox.setChecked(false);
            }

        String zametka = preferences.getString(SAVED_TEXT, "Empty");
        editText.setText(zametka);
        bt1 = root.findViewById(R.id.save);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = preferences.edit();
                // Сохранение значения по ключу SAVED_TEXT
                if (checkBox.isChecked()) {
                    editor.putBoolean("checked", true);
                    editor.apply();
                } else {
                    editor.putBoolean("checked", false);
                    editor.apply();
                }
                editor.putString(SAVED_TEXT, editText.getText().toString());
                editor.apply();


                Toast.makeText(getActivity(), "All saved", Toast.LENGTH_SHORT).show();
            }
        });
    return root;
    }
}