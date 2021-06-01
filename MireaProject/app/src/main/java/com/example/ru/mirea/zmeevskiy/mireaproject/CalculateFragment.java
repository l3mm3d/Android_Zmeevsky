package com.example.ru.mirea.zmeevskiy.mireaproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CalculateFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CalculateFragment extends Fragment implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CalculateFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CalculateFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CalculateFragment newInstance(String param1, String param2) {
        CalculateFragment fragment = new CalculateFragment();
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
    Button buttonSumma;
    Button buttonRaz;
    Button buttonUm;
    Button buttonDelenie;
    TextView ans;
    EditText fir;
    EditText sec;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_calculate, container, false);
        fir = (EditText) root.findViewById(R.id.first);
        sec = (EditText) root.findViewById(R.id.second);
        ans = (TextView) root.findViewById(R.id.answer);
        buttonSumma = (Button) root.findViewById(R.id.plus);
        buttonRaz = (Button) root.findViewById(R.id.min);
        buttonUm = (Button) root.findViewById(R.id.um);
        buttonDelenie = (Button) root.findViewById(R.id.del);

        buttonSumma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = fir.getText().toString();
                String second = sec.getText().toString();
                int a1 = Integer.parseInt(first.trim());
                int b1 = Integer.parseInt(second.trim());
                int k = a1 + b1;
                String answer = Integer.toString(k);
                ans.setText(answer);
            }
        });
        buttonRaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = fir.getText().toString();
                String second = sec.getText().toString();
                int a1 = Integer.parseInt(first.trim());
                int b1 = Integer.parseInt(second.trim());

                int k = a1 - b1;
                String answer = Integer.toString(k);
                ans.setText(answer);
            }
        });
        buttonUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = fir.getText().toString();
                String second = sec.getText().toString();
                int a1 = Integer.parseInt(first.trim());
                int b1 = Integer.parseInt(second.trim());

                int k = a1 * b1;
                String answer = Integer.toString(k);
                ans.setText(answer);
            }
        });
        buttonDelenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String first = fir.getText().toString();
                    String second = sec.getText().toString();
                    int a1 = Integer.parseInt(first.trim());
                    int b1 = Integer.parseInt(second.trim());
                    double k = a1 / b1;
                    String answer = Double.toString(k);
                    ans.setText(answer);


            }
        });
        return root;
    }
    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

    }
}