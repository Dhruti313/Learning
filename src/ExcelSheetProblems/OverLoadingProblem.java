package ExcelSheetProblems;

class Vehicle{
    void run(){System.out.println("Vehicle is running");}
}
//Creating a child class
class Bike extends Vehicle{
    void run(){System.out.println("Vehicle is rjjjjjunning");}
    public static void main(String args[]){

        //creating an instance of child class
        Vehicle obj = new Bike();  // type of object is bike and assigned to varibale of type vehicle
        //calling the method with child class instance
        obj.run();
    }
}

