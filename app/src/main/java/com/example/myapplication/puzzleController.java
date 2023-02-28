package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.jar.Attributes;

public class puzzleController {
    private puzzleModel model;
    private puzzleView view;
    String[] puzzle;

    boolean win;
    public puzzleController(puzzleView view) {
        this.view = view;
        model = new puzzleModel();
        puzzle  = model.puzzle;
    }
}
