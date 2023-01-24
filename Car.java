// import java.util.Scanner;

public class Car{

    // fields
    String type;
    String model;
    String color;
    int speed;


    // constructor
    public Car(String type, String model, String color, int speed){
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = speed;
        
    }

    // get color method
    public String getColor(){
        return this.color;
    }

    public void setSpeed(int speed){
        if (this.speed < speed){
            this.speed = speed;
        }
        
    }

    public int getSpeed(){
        return this.speed;
    }


    public int increaseSpeed(int increment){
        // System.out.print("Enter an increment: ");
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter an increment: ");
        // int increment = scanner.nextInt();
// 
        // System.out.print("You entered " + increment);

        this.speed += increment;
        return this.speed;
    }

    
    public static void main(String[] args){
        // initialise Car object 
        Car focus = new Car("Focus", "Ford", "blue", 10);
        // String color = focus.getColor();
        // get the original speed 
        System.out.println("The original speed is ---------------------------------");

        int original_speed = focus.getSpeed();
        System.out.println(original_speed);

        // set new speed 
        System.out.println("The newly set speed is ---------------------------------");
        focus.setSpeed(30);

        // get the speed after it 
        System.out.println("The speed when it is set to a new one is ---------------------------------");

        int newspeed = focus.getSpeed();
        System.out.println("The new speed after the user set is " + newspeed);

        
        // // get the speed when it is increased
        int increased_speed = focus.increaseSpeed(10);
        System.out.println(increased_speed);

        int total_speed = focus.getSpeed();
        System.out.println(total_speed);

      /*
        System.out.println("The color of the car is " + focus.color + " and its new speed is " + total_speed);
        // dataType type = new dataType();
        System.out.print(type.square(, total_speed));
        
      */
    }
}


