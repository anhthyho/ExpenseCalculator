package com.example.pincher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Show Gandalf's message
     * @param view -- the view that is clicked
     */
    public void gandalfMe(View view){
        // Toast myToast = Toast.makeText(this, message, duration);
        Toast myG = Toast.makeText(this, "Fly! You fools!",
                Toast.LENGTH_SHORT);
        myG.show();
    }


    public void teetersMe(View view){
        EditText showEditText = (EditText)findViewById(R.id.spent);

        int id = view.getId();

        String edit = showEditText.getText().toString();
        Button bView = (Button)findViewById(id);


        String bs = bView.getText().toString();
        String bsub = bs.substring(bs.indexOf("$")+1, bs.length());

        String orig = bs.substring(0,bs.indexOf("$"));

        double d = Double.parseDouble(edit) + Double.parseDouble(bsub);
        String disString = d + "";

        bView.setText(orig + " $" + disString);

        EditText showSpent = (EditText)findViewById(R.id.spent);
        showSpent.setText("");
    }


}
