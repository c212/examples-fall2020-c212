public class Car {
    private int efficiency; // miles/gallon
    private double fuel; // gallons
    // both are initialized to 0 (zero) as instance variables
    public Car(int efficiency) {
      this.efficiency = efficiency; // use this please for instance variables
      // of course if the two names were different I would not have to use this
      // but I recommend even in that case you do that to emphasize the type of variable
    }
    public void drive(double miles) { // how far you want to go in miles
      this.fuel = this.fuel - miles / this.efficiency; // think about this formula
    }
    public static void main(String[] args) {
      Car a = new Car(50); // create a new Car
      System.out.println( a ); // expect Car@abf0356e or something to that effect 
      System.out.println( a.fuel ); // expect: 0.0
      System.out.println( a.efficiency ); // expect: 50
      a.drive(100); // drive 100 miles
      System.out.println( a.fuel ); // expect: -2.0
      System.out.println( a.efficiency ); // expect: 50
    } // this is for this stage essentially Testing R3.18 (but for this stage!) 
}