package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.Random;
/*
BY:LUCIAN KENNELLY
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    puzzleModel model;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b13;
    Button b12;
    Button b14;
    Button b15;
    Button b16;
    Button b17;
    String[] win;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Setting up environment
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        model = new puzzleModel();
        setContentView(R.layout.activity_main);
        //Creating Win Condition
        win = new String[15];
        for (int i=0; i<15; i++) {
            win[i] = Integer.toString(i+1);
        }
        //Registering buttons
            b1  = findViewById(R.id.button);
        b1.setOnClickListener(this);
            b2 = findViewById(R.id.button2);
        b2.setOnClickListener(this);
            b3 = findViewById(R.id.button3);
        b3.setOnClickListener(this);
            b4 = findViewById(R.id.button4);
        b4.setOnClickListener(this);
            b5 = findViewById(R.id.button5);
        b5.setOnClickListener(this);
            b6 = findViewById(R.id.button6);
        b6.setOnClickListener(this);
            b7 = findViewById(R.id.button7);
        b7.setOnClickListener(this);
            b8 = findViewById(R.id.button8);
        b8.setOnClickListener(this);
            b9 = findViewById(R.id.button9);
        b9.setOnClickListener(this);
            b10 = findViewById(R.id.button10);
        b10.setOnClickListener(this);
            b11 = findViewById(R.id.button11);
        b11.setOnClickListener(this);
            b12 = findViewById(R.id.button12);
        b12.setOnClickListener(this);
            b13 = findViewById(R.id.button13);
        b13.setOnClickListener(this);
            b14 = findViewById(R.id.button14);
        b14.setOnClickListener(this);
            b15 = findViewById(R.id.button15);
        b15.setOnClickListener(this);
            b16 = findViewById(R.id.button16);
        b16.setOnClickListener(this);
            b17 = findViewById(R.id.button17);
        b17.setOnClickListener(this);
        // initializes buttons to numbers
        b1.setText(model.puzzle[0]);
        b2.setText(model.puzzle[1]);
        b3.setText(model.puzzle[2]);
        b4.setText(model.puzzle[3]);
        b5.setText(model.puzzle[4]);
        b6.setText(model.puzzle[5]);
        b7.setText(model.puzzle[6]);
        b8.setText(model.puzzle[7]);
        b9.setText(model.puzzle[8]);
        b10.setText(model.puzzle[9]);
        b11.setText(model.puzzle[10]);
        b12.setText(model.puzzle[11]);
        b13.setText(model.puzzle[12]);
        b14.setText(model.puzzle[13]);
        b15.setText(model.puzzle[14]);
        b16.setText(model.puzzle[15]);
        b17.setText("RESET");
        if (checkWinner()) {
            Log.d("here", "WINWINWINWIWNWIN");
            changeBackground();
        }
    }
        @Override
        public void onClick(View view) {
        // checks the button being pressed, updates if there is a valid move or reset button is pressed.
            if (b1.equals(view)) {
                update(model.puzzle, 0);
            } else if (b2.equals(view)) {
                update(model.puzzle, 1);
            } else if (b3.equals(view)) {
                update(model.puzzle, 2);
            } else if (b4.equals(view)) {
                update(model.puzzle, 3);
            } else if (b5.equals(view)) {
                update(model.puzzle, 4);
            } else if (b6.equals(view)) {
                update(model.puzzle, 5);
            } else if (b7.equals(view)) {
                update(model.puzzle, 6);
            } else if (b8.equals(view)) {
                update(model.puzzle, 7);
            } else if (b9.equals(view)) {
                update(model.puzzle, 8);
            } else if (b10.equals(view)) {
                update(model.puzzle, 9);
            } else if (b11.equals(view)) {
                update(model.puzzle, 10);
            } else if (b12.equals(view)) {
                update(model.puzzle, 11);
            } else if (b13.equals(view)) {
                Log.d("here", Integer.toString(13));
                update(model.puzzle, 12);
            } else if (b14.equals(view)) {
                Log.d("here", Integer.toString(14));
                update(model.puzzle, 13);
            } else if (b15.equals(view)) {
                Log.d("here", Integer.toString(15));
                update(model.puzzle, 14);
            } else if (b16.equals(view)) {
                Log.d("here", Integer.toString(16));
                update(model.puzzle, 15);
            } else if (b17.equals(view)) {
                // resets board with rand numbers see puzzle model for more info
                ArrayList<Integer> list = new ArrayList<Integer>(16);
                for(int i = 0; i <= 15; i++) {
                    list.add(i);
                }
                Random rand = new Random();
                int i = 0;
                while(list.size() > 0) {
                    int index = rand.nextInt(list.size());
                    model.puzzle[i] = Integer.toString(list.remove(index));
                    i++;
                }
                i = 0;
                for (int j =0; j<16;j++) {
                    if (model.puzzle[j].equals(Integer.toString(0))) {
                        model.puzzle[j] = " ";
                    }
                }
                update(model.puzzle,0);
            }
            if (checkWinner()) {
                Log.d("here", "WINWINWINWIWNWIN");
                changeBackground();
            }
        }
        public void update(String[] puzzle,int puzzlePiece) {
            if (checkWinner()) {
                Log.d("here", "WINWINWINWIWNWIN");
                changeBackground();
            }
            // first condition if piece is blank to the right then swap
            if (puzzlePiece < 15 && model.puzzle[puzzlePiece+1].equals(" ")) {
                model.puzzle[puzzlePiece + 1] = model.puzzle[puzzlePiece];
                model.puzzle[puzzlePiece] = " ";
            }
            // second condition if piece is blank to left swap
            else if (puzzlePiece > 0 && model.puzzle[puzzlePiece-1].equals(" ")) {
                model.puzzle[puzzlePiece-1] = model.puzzle[puzzlePiece];
                model.puzzle[puzzlePiece] = " ";
            }
            // third condition if piece is blank below swap
            else if (puzzlePiece <= 11 && puzzle[puzzlePiece+4].equals(" ")) {
                puzzle[puzzlePiece+4] = puzzle[puzzlePiece];
                puzzle[puzzlePiece] = " ";
            }
            // fourth condition if piece is blank above swap
            else if (puzzlePiece>=4 && puzzle[puzzlePiece-4].equals(" ")) {
                puzzle[puzzlePiece-4] = puzzle[puzzlePiece];
                puzzle[puzzlePiece] = " ";
            }
            // update all buttons
            b1.setText(model.puzzle[0]);
            b1.invalidate();

            b2.setText(model.puzzle[1]);
            b2.invalidate();

            b3.setText(model.puzzle[2]);
            b3.invalidate();

            b4.setText(model.puzzle[3]);
            b4.invalidate();

            b5.setText(model.puzzle[4]);
            b5.invalidate();

            b6.setText(model.puzzle[5]);
            b6.invalidate();

            b7.setText(model.puzzle[6]);
            b7.invalidate();

            b8.setText(model.puzzle[7]);
            b8.invalidate();

            b9.setText(model.puzzle[8]);
            b9.invalidate();

            b10.setText(model.puzzle[9]);
            b10.invalidate();

            b11.setText(model.puzzle[10]);
            b11.invalidate();

            b12.setText(model.puzzle[11]);
            b12.invalidate();

            b13.setText(model.puzzle[12]);
            b13.invalidate();

            b14.setText(model.puzzle[13]);
            b14.invalidate();

            b15.setText(model.puzzle[14]);
            b15.invalidate();

            b16.setText(model.puzzle[15]);
            b16.invalidate();
        }
        public void changeBackground() {
        // changes background on win condition
            final TableLayout tableLayout;
            tableLayout = findViewById(R.id.background);
            tableLayout.setBackgroundColor(Color.BLUE);
        }
        public boolean checkWinner() {
        // checks if winning condition is on the board
            for (int i =0;i<15;i++) {
                if (!win[i].equals(model.puzzle[i])) {
                    return false;
                }
            }
            return true;
        }
}