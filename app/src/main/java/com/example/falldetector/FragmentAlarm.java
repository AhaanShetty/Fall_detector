package com.example.falldetector;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */



public class FragmentAlarm extends Fragment {
    public int counter = 30;
    private TextView textView;
    private Button button, stop;

    public FragmentAlarm() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        textView = view.findViewById(R.id.display_timer);
        button = view.findViewById(R.id.button_start);
        final CountDownTimer[] timer = new CountDownTimer[1];
        //textView.setText(getArguments().getString("message"));

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                timer[0] = new CountDownTimer(30000, 1000){
                    public void onTick(long millisUntilFinished){
                        textView.setText(String.valueOf(counter));
                        counter--;
                    }
                    public  void onFinish(){

                        textView.setText("FINISH!!");
                    }

                }.start();
            }
        });
        stop=view.findViewById(R.id.button_stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(timer[0] !=null) {
                    timer[0].cancel();
                    textView.setText("");
                }
                timer[0]=null;
            }
        });

        return view;
    }


    }

