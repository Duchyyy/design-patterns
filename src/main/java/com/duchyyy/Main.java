package com.duchyyy;


import com.duchyyy.creational.abstractFactory.MotorFactory;
import com.duchyyy.creational.abstractFactory.MotorlessFactory;
import com.duchyyy.creational.abstractFactory.Vehicle;
import com.duchyyy.creational.builder.User;
import com.duchyyy.creational.factory.Car;
import com.duchyyy.creational.factory.Factory;
import com.duchyyy.creational.prototype.Book;
import com.duchyyy.creational.singleton.SingletonExample;
import com.duchyyy.structural.proxy.EbookProxy;
import com.duchyyy.structural.proxy.Library;
import com.duchyyy.structural.proxy.LoggingEbookProxy;
import com.duchyyy.structural.proxy.RealEbook;

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

////  mediator pattern
//        ArticlesDialogBox dialogBox = new ArticlesDialogBox();
//        dialogBox.simulateUserInteraction();
//// possible using observer

// chain of responsibility pattern
//        Encryptor encryptor = new Encryptor(null);
//        Compressor compressor = new Compressor(encryptor);
//        Logger logger = new Logger(compressor);
//        Authenticator authenticator = new Authenticator(logger);
//
//        WebServer server = new WebServer(authenticator);
//        server.handle(new HttpRequest("admin", "1234"));

//  visitor pattern
//        HtmlDocument document = new HtmlDocument();
//        document.add(new HeadingNode());
//        document.add(new AnchorNode());
//        document.execute(new PlainTextOperation());

//////////////////////////////////////////////////////////////////////////////

//  composite pattern
//        Group group1 = new Group();
//        group1.add(new Shape());
//        group1.add(new Shape());
//
//        Group group2 = new Group();
//        group2.add(new Shape());
//
//        Group group = new Group();
//        group.add(group1);
//        group.add(group2);
//        group.render();
//        group.move();

//  adapter pattern
//        ImageView imageView = new ImageView(new Image());
//        imageView.apply(new CaramelFilter(new Caramel()));

//  decorator pattern
//        storeCreditCard(new EncryptedCloudStream(new CloudStream()));

//  facade pattern
//        NotificationService service = new NotificationService();
//        service.send("helllo world", "target");

//  flyweight pattern
//        PointService service = new PointService(new PointIconFactory());
//        for(Point point : service.getPoints())
//            point.draw();

// bridge pattern
//        RemoteControl remoteControl = new AdvancedRemoteControl(new SamsungTV());
//        remoteControl.turnOn();

//  proxy
//        Library library = new Library();
//        String[] fileNames = {"a","b","c"};
//
//        for (String fileName : fileNames)
//            library.add(new LoggingEbookProxy(fileName));
//
//        library.openEbook("a");
//        library.openEbook("b");

///////////////////////////////////////////////////////////////////////////////////////////////////

//  singleton
//        SingletonExample singletonInstance = SingletonExample.getInstance();
//        singletonInstance.printData();

//  builder
//        User user = User.newUser()
//                .firstName("Andrej")
//                .lastName("Duchoslav")
//                .age(25)
//                .build();
//
//        user.sayHello();

//  factory
//    Car car = Factory.carFactory("Porsche", "NR152GR");
//    car.rev();

//  abstract factory
//        MotorFactory motorFactory = new MotorFactory();
//        MotorlessFactory motorlessFactory = new MotorlessFactory();
//
//        Vehicle car = motorFactory.createFourWheeled();
//        Vehicle twoWheeled = motorlessFactory.createTwoWheeled(); //bicycle


//  prototype
//        Book book1 = new Book("First",new String[]{"Nick","Andrew"},20);
//        Book book2 = book1.clone();
//        book2.setName("Second");
//
//        System.out.println(book1.getName());
//        System.out.println(book2.getName());


    }
    //decorator
//    public static void storeCreditCard(Stream stream) {
//        stream.write("1234-1234-1324-1546");
//    }

}
