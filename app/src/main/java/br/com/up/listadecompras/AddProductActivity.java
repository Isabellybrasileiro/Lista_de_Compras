package br.com.up.listadecompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class AddProductActivity extends AppCompatActivity {

    private TextInputEditText inputEditTextName;
    private TextInputEditText inputEditTextQuantity;
    private TextInputEditText inputEditTextDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        inputEditTextName = findViewById(R.id.input_text_name);

        String textProductName = inputEditTextName.getText().toString();
    }
}