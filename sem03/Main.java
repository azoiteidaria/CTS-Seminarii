//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*public class Main {
    public static void main(String[] args) {

    }
interface VehicleWithDoors{
    public void drive();
    public void stop();
    public void refuel();
    public void openDoors();
}

interface VehicleWithoutDoors{
  public void drive();
  public void stop();
}
 class Car implements VehicleWithDoors


{

    @Override
    public void drive() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void refuel() {

    }

    @Override
    public void openDoors() {

    }
}

class Bike implements VehicleWithoutDoors{


    @Override
    public void drive() {

    }

    @Override
    public void stop() {

    }
}

/////////////////////////////////////////


 interface Engine{
    public void start();
}

class Car1{
    private Engine engine;
    public Car1 (Engine e){
        engine = e;
    }
    public void start(){
        engine.start();
    }

}
class PetrolEngine implements Engine{
    public void start() {

    }
}

class DieselEngine implements Engine{
    public void start() {

    }
}

}
*/
/////////////////////////////////////////////

///package ro.ase.cts.lab02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OnlineShop o = new OnlineShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product p1 = new Product("Laptop", 3200.5, 1,1, 1123, "");
        Product p2 = new Product("Frigider", 207.95, 1,2, 1245, "");

        Product p3 = new Product(p1);

        p3.setQuantity(5);
        p3.setName("Paine");

        o.addProduct(p1);
        o.addProduct(p2);

        o.removeProduct(p1);
        System.out.println(p1.equals(p2));
    }
}

class OnlineShop {
    private String name;
    private String image;
    private ArrayList<Product> products;

    OnlineShop(String name, String img, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        this.image = image;
        this. name = name;
    }

    public void addProduct(Product p)
    {
        this.products.add(p);
    }
    public void removeProduct(Product p)
    {
        this.products.remove(p);
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

class Product
{
    private int Id;
    private String name;
    private double Price;
    private int Type;
    private int Category;
    private int Quantity;
    private String expiryDate; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, int type, int category, int id, String exp)
    {
         name = name;
        Price = price;
        Type = type;
        Category = category;
        this.Id = id;
        this.expiryDate = exp;
    }

    public Product(Product p)
    {
        this. name = p. name;
        this.Price = p.Price;
        this.Type = p.Type;
        this.Category = p.Category;
        this.Id = p.Id;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this. name = name;
    }

    public int getType() {
        return Type;
    }

    public void setType(int Type) {
        this.Type = Type;
    }

    public boolean equals(Product p)
    {
        if(p.Id != this.Id)
            return false;
        if(!p. name.equals(this. name))
            return false;
        if(p.Price != this.Price)
            return false;
        if(p.Type != p.Type)
            return false;
        if(p.Category != this.Category)
            return false;

        return true;
    }

    public void modify(boolean flag, double val)
    {
        if(flag)
            this.Price+=this.Price*val;
        if(!flag)
            this.Price-=this.Price*val/100;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    private String username;
    private String id;
    private ArrayList<Order> o;
    private ArrayList<Order> c;

    public User(String username, String id)
    {
        this.username = username;
        this.id = id;
        o=new ArrayList<Order>();
        c=new ArrayList<Order>();
    }

    public void addO1(Order o)
    {
        this.o.add(o);
    }

    public void addO2(Order o)
    {
        this.c.add(o);
    }
}

class Order
{
    private ArrayList<Product> l;
    private String address;

    public Order()
    {
        l = new ArrayList<Product>();
    }
    public void add(Product p)
    {
        if(l.size() > 99)
            return;

        l.add(p);
    }

    public void remove(Product p)
    {
        l.remove(p);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class InventoryProduct
{
    private Product product;
    private int quantity;

    public InventoryProduct(Product product, int quantity)
    {
        this.product = new Product(product);
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }

    public void setP(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}












