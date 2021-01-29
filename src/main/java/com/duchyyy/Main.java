package com.duchyyy;

import com.duchyyy.command.AddCustomerCommand;
import com.duchyyy.command.CompositeCommand;
import com.duchyyy.command.CustomerService;
import com.duchyyy.command.editor.*;
import com.duchyyy.command.fx.BlackAndWhiteCommand;
import com.duchyyy.command.fx.Button;
import com.duchyyy.command.fx.Command;
import com.duchyyy.command.fx.ResizeCommand;
import com.duchyyy.iterator.BrowseHistory;
import com.duchyyy.iterator.Iterator;
import com.duchyyy.memento.Editor;
import com.duchyyy.observer.Chart;
import com.duchyyy.observer.DataSource;
import com.duchyyy.observer.SpreadSheet;
import com.duchyyy.state.Brush;
import com.duchyyy.state.Canvas;
import com.duchyyy.state.Pen;
import com.duchyyy.state.SelectionTool;
import com.duchyyy.strategy.BlackAndWhiteFilter;
import com.duchyyy.strategy.ImageStorage;
import com.duchyyy.strategy.JpegCompressor;
import com.duchyyy.strategy.PngCompressor;
import com.duchyyy.templatemethod.GenerateReportTask;
import com.duchyyy.templatemethod.TransferMoneyTask;

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

//  iterator pattern
//        BrowseHistory history = new BrowseHistory();
//        history.push("a");
//        history.push("b");
//        history.push("c");
//
//        Iterator iterator = history.createIterator();
//        while (iterator.hasNext()) {
//            String url = (String)iterator.current();
//            System.out.println(url);
//            iterator.next();
//        }

//  strategy pattern
//        ImageStorage imageStorage = new ImageStorage(/*
//                new PngCompressor(),new BlackAndWhiteFilter()*/);
//        imageStorage.store("first",new PngCompressor(),new BlackAndWhiteFilter());

//  template method pattern
//        TransferMoneyTask transferMoneyTask = new TransferMoneyTask();
//        transferMoneyTask.execute();
//
//        GenerateReportTask generateReportTask = new GenerateReportTask();
//        generateReportTask.execute();

//  command pattern
//        CustomerService service = new CustomerService();
//        AddCustomerCommand command = new AddCustomerCommand(service);
//        Button button = new Button(command);
//        button.setLabel("btn1");
//        button.click();
//
//        CompositeCommand compositeCommand = new CompositeCommand();
//        compositeCommand.add(new ResizeCommand());
//        compositeCommand.add(new BlackAndWhiteCommand());
//        compositeCommand.execute();
//
//        History history = new History();
//        HtmlDocument document = new HtmlDocument();
//        document.setContent("hello world");
//
//        BoldCommand boldCommand = new BoldCommand(document,history);
//        boldCommand.execute();
//        System.out.println(document.getContent());
//
//        UndoCommand undoCommand = new UndoCommand(history);
//        undoCommand.execute();
//        System.out.println(document.getContent());

//  observer pattern
//        DataSource dataSource = new DataSource();
//        SpreadSheet sheet1 = new SpreadSheet(dataSource);
//        SpreadSheet sheet2 = new SpreadSheet(dataSource);
//        Chart chart = new Chart(dataSource);
//
//        dataSource.addObserver(sheet1);
//        dataSource.addObserver(sheet2);
//        dataSource.addObserver(chart);
//
//        dataSource.setValue(1);




    }

}
