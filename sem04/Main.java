interface Shape{
    void draw();
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("draw square");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}

class ShapeFactory{
    public static Shape createShape(String Shape){
        if("Square".equalsIgnoreCase(Shape)){
            return new Square();
        } else if ("Circle".equalsIgnoreCase(Shape)) {
            return new Circle();
        }else{
            throw new IllegalArgumentException("Shape invalid");
        }
    }
}

class MainEx4{
    public static void main(String[] args){
        Shape square = ShapeFactory.createShape("square");
        square.draw();

        Shape circle = ShapeFactory.createShape("circle");
        circle.draw();

        Shape forma = ShapeFactory.createShape("circle");
        forma.draw();

        forma = ShapeFactory.createShape("square");
        forma.draw();
    }
}




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*

class Singleton {
    //private static instance variable
    private static Singleton instance;

    //private constructor to prevent instantiation from oustide the class
    private Singleton() {
        //initialization code if needed
    }

    //public method to get the instance of the singleton class
    public static Singleton getInstance()
    {
        //check if the instance is null
        if(instance == null) {
            instance = new Singleton();
        }
        return  instance;
    }

    public void doSomething() {
        System.out.println("singleton is doing something");
    }
}

class MainEx1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Singleton singletonInstance = Singleton.getInstance();
        singletonInstance.doSomething();

    }
}
/////////////////////////

class DatabaseConnection
{
    private static volatile DatabaseConnection instance;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        if (instance == null){
            synchronized (DatabaseConnection.class){
                if(instance == null){
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    //simulate database connection operations
public void connect() {
        System.out.println("connectr");
}
public void disconnect(){
        System.out.println("disconnectr");
}
}

class MainEx2 {
    public static void main(String[] args){
        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.connect();
        connection.disconnect();

    }
}

//////////////////////////////////////////
//simple factory

interface Animal {
    void sound();
}

class Dog implements Animal
{

    @Override
    public void sound() {
        System.out.println("HAW");
    }
}
class Cat implements Animal
{

    @Override
    public void sound() {
        System.out.println("MIU");
    }

    class Platypus implements Animal{

        @Override
        public void sound() {
            System.out.println("perry");
        }
    }
}
class AnimalFactory{
    public static Animal createAnimal(String type){
        if("Dog".equalsIgnoreCase(type)){
            return new Dog();
        } else if ("Cat".equalsIgnoreCase(type)) {
            return new Cat();

        }else
        {
            throw new IllegalArgumentException("ïnvalid animal type");

        }
    }
}
class MainEx3 {
    public static void main(String[] args){
        Animal dog = AnimalFactory.createAnimal("Dog");
        dog.sound();
        Animal cat = AnimalFactory.createAnimal("Cat");
        dog.sound();
    }
}
*/

/////////////////////////////






