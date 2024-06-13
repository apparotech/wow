package com.example.wow;
import android.app.Activity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SignupchoiceActivity extends  Activity implements View.OnClickListener{
    Button btnChoicePhone, btnChoiceEmail;
    LinearLayout llSignupChoice;
    TextView txvTitle, txvAlt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupchoice);
        llSignupChoice = (LinearLayout)  findViewById(R.id.llSignupChoice);
        btnChoicePhone = (Button) llSignupChoice.findViewById(R.id.btnChoicePhone);
        btnChoiceEmail = (Button) llSignupChoice.findViewById(R.id.btnChoiceEmail);
        txvTitle = (TextView) llSignupChoice.findViewById(R.id.txvTitle);
        txvAlt = (TextView) llSignupChoice.findViewById(R.id.txv_alternative);

        txvTitle.setText(getString(R.string.sign_up));
        txvAlt.setText(getString(R.string.sign_up_alt));


        btnChoicePhone.setOnClickListener(this);
        btnChoiceEmail.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == btnChoicePhone.getId()) {
            Intent intent = new Intent(SignupchoiceActivity.this, PhoneSignupActivity.class);
            startActivity(intent);
        }
        if (view.getId() == btnChoiceEmail.getId()) {
            Intent intent = new Intent(SignupchoiceActivity.this, HomeScreenActivity.class);
            startActivity(intent);
        }
        if (view.getId() == txvAlt.getId()) {
            Intent intent = new Intent(SignupchoiceActivity.this,SigninChoiceActivity.class);
            startActivity(intent);
        }
    }
}