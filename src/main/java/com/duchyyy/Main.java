package com.duchyyy;

import com.duchyyy.memento.Editor;
import com.duchyyy.memento.History;
import com.duchyyy.state.Brush;
import com.duchyyy.state.Canvas;
import com.duchyyy.state.Pen;
import com.duchyyy.state.SelectionTool;

public class Main {

    public static void main(String[] args) {

//  memento pattern
//        Editor editor = new Editor();
//        History history = new History();
//        editor.setContent("text");
//        history.push(editor.createState());
//        editor.setContent("check");
//        history.push(editor.createState());
//        editor.setContent("box");
//        editor.restore(history.pop());
//        System.out.println(editor.getContent());

//  state pattern
//        Canvas canvas = new Canvas();
//        canvas.setCurrentTool(new Pen());
//        canvas.mouseDown();
//        canvas.mouseUp();

    }

}
