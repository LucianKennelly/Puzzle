package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

public class puzzleView extends SurfaceView {
    private puzzleModel model;
    String[] puzzle;
    boolean[] b;
    public puzzleView(Context context) {
        super(context);
        model = new puzzleModel();
        puzzle = model.puzzle;

        /*Button b2 = findViewById(R.id.button2);
        b2.setText(puzzle[1]);
        Button b3 = findViewById(R.id.button3);
        b3.setText(puzzle[2]);
        Button b4 = findViewById(R.id.button4);
        b4.setText(puzzle[3]);
        Button b5 = findViewById(R.id.button5);
        b5.setText(puzzle[4]);
        Button b6 = findViewById(R.id.button6);
        b6.setText(puzzle[5]);
        Button b7 = findViewById(R.id.button7);
        b7.setText(puzzle[6]);
        Button b8 = findViewById(R.id.button8);
        b8.setText(puzzle[7]);
        Button b9 = findViewById(R.id.button9);
        b9.setText(puzzle[8]);
        Button b10 = findViewById(R.id.button10);
        b10.setText(puzzle[9]);
        Button b11 = findViewById(R.id.button11);
        b11.setText(puzzle[10]);
        Button b12 = findViewById(R.id.button12);
        b12.setText(puzzle[11]);
        Button b13 = findViewById(R.id.button13);
        b13.setText(puzzle[12]);
        Button b14 = findViewById(R.id.button14);
        b14.setText(puzzle[13]);
        Button b15 = findViewById(R.id.button15);
        b15.setText(puzzle[14]);
        Button b16 = findViewById(R.id.button16);
        b16.setText(puzzle[15]);*/
    }
    @Override
    public void onDraw(Canvas canvas) {
    }
}
