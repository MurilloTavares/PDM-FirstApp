package br.edu.ifpb.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameInput;
    private Button btnHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = (EditText) findViewById(R.id.main_input_name);

        btnHello = (Button) findViewById(R.id.main_btn_hello);
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayHello();
            }
        });
    }

    private void sayHello() {
        String name = nameInput.getText().toString();
        String msg = "Hello " + name + " !!!";

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}
