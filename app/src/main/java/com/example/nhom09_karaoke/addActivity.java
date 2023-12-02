package com.example.nhom09_karaoke;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class addActivity extends AppCompatActivity {
    EditText txtId,txtName,txtLyric, txtSinger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        InitView();
    }
    public void InitView ()
    {
        txtId = findViewById(R.id.txtInputId);
        txtId.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if (charSequence.length()!= 6)
                    {
                        txtId.setError("Resquest 6 number");
                    }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        txtName = findViewById(R.id.txtInputNameSong);
        txtName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0)
                {
                    txtName.setError("Name not null");
                }
                else
                {
                    txtName.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        txtLyric = findViewById(R.id.txtInputLyric);
        txtLyric.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().trim().isEmpty())
                {
                    txtLyric.setText("Unknown");
                }
            }
        });
        txtSinger = findViewById(R.id.txtInputAuthor);
        txtSinger.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().trim().isEmpty())
                {
                    txtSinger.setText("Unknown");
                }
            }
        });
    }
    public void showInput (View view){
        if (txtId.length() == 6)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Notification");
            String a = txtId.getText().toString();
            String b = txtName.getText().toString();
            String c = txtLyric.getText().toString();
            String d = txtSinger.getText().toString();
            builder.setMessage(a + " " + b + " " + c + " " + d);
            AlertDialog dialog = builder.create();
            dialog.show();
            Intent intent1 = new Intent(this, MainActivity.class);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    dialog.dismiss(); // Đóng AlertDialog nếu nó vẫn đang hiển thị
                    intent1.putExtra("textId", a);
                    intent1.putExtra("textName", b);
                    intent1.putExtra("textLyric", c);
                    intent1.putExtra("textSinger", d);
                    startActivity(intent1);
                }
            }, 100);
        }
        else
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("notification");
            builder.setMessage("Id require 6 number");
            AlertDialog dialog = builder.create();
            dialog.show();
        }
    }
}