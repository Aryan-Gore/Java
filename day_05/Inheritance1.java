class Car{
    String color;
    String model;
    String brand;
    int mileage;
    int no_of_gears;

    Car(String color,String model,String brand,int mileage,int no_of_gears){
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.no_of_gears=no_of_gears;
    }

    void applyBrake(){
        System.out.println("Breaking");
    }
    void applySpeed(){
        System.out.println("Speed....");
    }
    void shiftGear(){
        System.out.println("GEAR....");
    }
}

class Verna extends Car{

    Verna(String color,String model,String brand,int mileage,int no_of_gears,int capacity){

            super(color, model, brand, mileage, no_of_gears);   
            this.capacity = capacity;
    }
    int capacity;

    void airbag(){
        System.out.println("Air bag............");
    }
    
}
public class Inheritance1 {
    
    public static void main(String[] args) {
        Verna v = new Verna("black", "top", "Verna", 40, 5, 6);

        v.airbag();
        v.applyBrake();
        v.applySpeed();
        v.shiftGear();
        
    }
    

}
