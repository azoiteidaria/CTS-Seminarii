/*
principii
kiss - keep it simple and stupid
dry - dont repeat yrslf
yagni - you ain't gonna need it
solid



*/
interface Vehicle{

}
 class PrintDetails{
    public void printDetails(){
    }

}

class ValueCalculator{
     public double calculateValues(){
         return  calculateValues();
     }
}


class AddVehicle{
     public  void addVehicleToDB(){

     }
}



//////////////////

interface Vehicle1{
     double calculateValue();
}

class Car implements Vehicle1 {

    @Override
    public double calculateValue() {
        return calculateValue() * 0.8;
    }
}

class Bike implements Vehicle1{

    @Override
    public double calculateValue() {
        return calculateValue() * 0.5;
    }
}

///////////////////////////

interface Shape{
    public void setHeight(double h);
    public void setWidth(double w);

}

class Rectangle implements Shape {

    @Override
    public void setHeight(double h) {

    }

    @Override
    public void setWidth(double w) {

    }
}

class Square implements Shape {

    @Override
    public void setHeight(double h) {

    }

    @Override
    public void setWidth(double w) {

    }
}




