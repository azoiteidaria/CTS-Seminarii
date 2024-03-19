// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

interface Animal {
    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("woof");
    }
}
class Cat implements Animal{

    @Override
    public void sound() {
        System.out.println("meow");
    }
}

interface AnimalFactory{
    Animal createAnimal();
}

class dogFactory implements AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
class catFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}


 class MainEx2 {
    public static void main(String[] args) {
       AnimalFactory dogFactory = new dogFactory();
       Animal Dog = dogFactory.createAnimal();
       Dog.sound();

        AnimalFactory catFactory = new catFactory();
        Animal Cat = catFactory.createAnimal();
        Cat.sound();
        }
    }
///////////////////////////////////////////////////////////////////

/*interface Document
{
    void open();
    void save();
}

class TextDocument implements Document{

    @Override
    public void open() {
        System.out.println("file opened");
    }

    @Override
    public void save() {
        System.out.println("file saved");
    }
}

class ImageDocument implements Document{

    @Override
    public void open() {
        System.out.println("image opened");
    }

    @Override
    public void save() {
        System.out.println("image saved");
    }
}

interface DocumentFactory{
    Document createDocument();
}

class TextDocumentFactory{
    public Document createDocument(){
        return new TextDocument();
    }

}

class ImageDocumentFactory {
    public Document createDocument() {
        return new ImageDocument();
    }
}

class MainEx2{
    public static void main(String[] args) {
        TextDocumentFactory textDocumentFactory = new TextDocumentFactory();
        Document txt = textDocumentFactory.createDocument();
        txt.open();
        txt.save();


        ImageDocumentFactory imageDocumentFactory = new ImageDocumentFactory();
        Document img = imageDocumentFactory.createDocument();
        img.open();
        img.save();
    }

}

////////////////////////////////////////////////////////////////////

interface Chair{
    public String sitOn();
}
class ModernChair implements Chair{

    @Override
    public String sitOn() {
        return "Sitting on modern chair";
    }
}
class VictorianChair implements Chair{

    @Override
    public String sitOn() {
        return "Sitting on victorian chair";
    }
}

interface Sofa{
    public String lieOn();
}
class ModernSofa implements Sofa{

    @Override
    public String lieOn() {
        return "Lying on a modern sofa";
    }
}
class VictorianSofa implements Sofa{

    @Override
    public String lieOn() {
        return "Lying on a victorian sofa";
    }
}
interface FurnitureFactory{
    Chair createChair();
    Sofa createSofa();
}

class ModrenFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

class Client{
    private final FurnitureFactory furnitureFactory;

    public Client(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }
    public void useFurniture(){
        Chair chair = furnitureFactory.createChair();
        Sofa sofa = furnitureFactory.createSofa();

        System.out.println(chair.sitOn());
        System.out.println(sofa.lieOn());
    }
}

class MainEx3{
    public static void main(String[] args){
        FurnitureFactory modernFactory = new ModrenFurnitureFactory();
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();

        System.out.println("Client uses modern furniture");
        Client client1
    }
}

//aici nu am apucat sa scriu tot mainul :(













