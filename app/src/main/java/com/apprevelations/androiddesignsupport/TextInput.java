package com.apprevelations.androiddesignsupport;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;

public class TextInput extends AppCompatActivity{

    TextInputLayout textinput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.text_input_layout);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar_text);
        setSupportActionBar(toolbar);

        textinput = (TextInputLayout) findViewById(R.id.city_text);

        textinput.getEditText().addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence text, int start, int count, int after) {
                if (text.length() <2 ) {
                    textinput.setError(getString(R.string.text));
                    textinput.setErrorEnabled(true);
                } else {

                    textinput.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
        });
    }
}
