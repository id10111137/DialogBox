package com.example.dialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.idViews);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogShow();
            }
        });
    }

    private void DialogShow(){
        //1 inisialisasi dari dialog
        final Dialog dialog = new Dialog(MainActivity.this);
        // kemudian menambahkan tampilan costum dialog;
        dialog.setContentView(R.layout.dialog_main);
        dialog.setTitle("Costum Dialog");

        // lalu kita memanggil fungsi jika Anda menginnginkannya seperti ini
        TextView textView = (TextView) dialog.findViewById(R.id.text);
        textView.setText("Ini dibikin Otomatis LOhhhhh");

        // terakhir kita bisa menambahkan sebuah button
        Button btnEnd = (Button) dialog.findViewById(R.id.dialogButtonOK);
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // kita bisa menutp dari dialog ini dengan perintah
                dialog.dismiss();
            }
        });

        // jangan lupa menambahkan fungsi show
        dialog.show();
    }
}
