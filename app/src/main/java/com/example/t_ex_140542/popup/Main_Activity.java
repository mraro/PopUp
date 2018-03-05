package com.example.t_ex_140542.popup;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main_Activity extends AppCompatActivity {

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        dialog = new Dialog(this);
    }

    public void showPopup(View view) {
        TextView txtClose;
        Button btnSeguidores;
        dialog.setContentView(R.layout.custompopup);
        txtClose = (TextView) dialog.findViewById(R.id.txtClose);
        btnSeguidores = (Button) dialog.findViewById(R.id.btnSeguidores);
        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
}
