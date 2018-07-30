package com.jacob.trymeapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private View windowView;
    private Button tryMeButton;
    private int[] colors;
    private Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        windowView = findViewById(R.id.windowViewId);
        tryMeButton = findViewById(R.id.tryMeButton);
        colors = new int[]{Color.CYAN, Color.GREEN, Color.RED, Color.BLACK, Color.BLUE, Color.GRAY, Color.MAGENTA, Color.DKGRAY, Color.YELLOW}; // Instantiating a new array of integers and automatically inserting new items.

        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                windowView.setBackgroundColor(colors[rand.nextInt(colors.length)]);
            }
        });
    }
}
