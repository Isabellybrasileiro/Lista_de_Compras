package br.com.up.listadecompras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton buttonAddProduct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAddProduct =
                findViewById(R.id.fab_add_product);
        //lincar o botão na aplicação

        //sera executado quando clicar
        buttonAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //interagir com outra tela
                Intent intent = new Intent(
                        getApplicationContext(),
                        AddProductActivity.class
                        //quem é a aplicação e a classe

                );

                startActivity(intent);


            }
        });

    }
}