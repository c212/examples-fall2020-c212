public class Something {
  public static void main(String[] args) {
    String time1, time2; 
    time1 = args[0];
    time2 = args[1]; 
    System.out.println("The first time is: " + time1);   
    System.out.println("The second time: " + time2);   
    int h1, h2, m1, m2; // "12:03" 
                        //  01234
    h1 = Integer.parseInt(time1.substring(0, 2)); 
    m1 = Integer.parseInt(time1.substring(3)); 
    h2 = Integer.parseInt(time2.substring(0, 2)); 
    m2 = Integer.parseInt(time2.substring(3)); 
    int t1 = h1 * 60 + m1; 
    // 12:03 boils down to 12 * 60 + 3 == 723 minutes 
    int t2 = h2 * 60 + m2; 
    System.out.println("First time in minutes: " + t1); 
    System.out.println("Second time in minutes: " + t2); 

    int d = (t2 - t1); // in minutes 
    System.out.println("Between " + time1 + " and " + time2 + " we have " + 
                       ( d / 60 ) + " hours and " + ( d % 60 ) + " minutes."); 

  }
}







