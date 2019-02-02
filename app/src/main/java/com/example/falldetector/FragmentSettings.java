package com.example.falldetector;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class FragmentSettings extends Fragment {
    //private TextView textView;

    final int SEND_SMS_PERMISSION_REQUEST_CODE = 1;
//    EditText number;
//    EditText message;
//
//    Button send;

    public FragmentSettings() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fragment_settings, container, false);
//        textView = view.findViewById(R.id.disp_message);
//        textView.setText(getArguments().getString("message"));
        return view;
    }

//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        number = findViewById(R.id.inputNumber);
//        message = findViewById(R.id.inputMessage);
//        send = findViewById(R.id.button);
//
//        send.setEnabled(false);
//
//        if(checkPermission(Manifest.permission.SEND_SMS)){
//            send.setEnabled(true);
//        }
//
//        else ActivityCompat.requestPermissions(this, new String[]{
//                Manifest.permission.SEND_SMS}, SEND_SMS_PERMISSION_REQUEST_CODE);
//    }
//
//    public void onSend(View v) {
//        String phoneNumber = number.getText().toString();
//        String smsMessage = message.getText().toString();
//
//        if (phoneNumber == null || phoneNumber.length() == 0 || smsMessage.length() == 0 || smsMessage == null) {
//            return;
//        }
//
//        if(checkPermission(Manifest.permission.SEND_SMS)){
//            SmsManager smsManager = SmsManager.getDefault();
//            smsManager.sendTextMessage(phoneNumber,null,smsMessage,null,null);
//            Toast.makeText(this,Toast.LENGTH_SHORT,"message sent!").show();
//        }
//        else {
//            Toast.makeText(this,"Permission Denied!", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//
//
//    public boolean checkPermission(String permission){
//        int check = ContextCompat.checkSelfPermission(this,permission);
//        return (check == PackageManager.PERMISSION_GRANTED);
//    }
}


