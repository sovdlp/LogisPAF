package com.pafsas.logispaf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class SearchActivity extends AppCompatActivity {

    ImageView appLogo;
    TextInputLayout tilDelivery;
    TextInputEditText etDelivery;

    AppCompatButton btnSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        initUI();
    }

    private void initUI() {
        appLogo = findViewById(R.id.app_logo);

        tilDelivery = findViewById(R.id.til_delivery);
        etDelivery = findViewById(R.id.et_delivery);
    }
}