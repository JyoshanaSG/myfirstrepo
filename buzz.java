public class buzz{
  public static void main(String []args){
    System.out.println("multiples of 3 with buzz....."); 
      for(int i = 1; i <= 30; i++) {  
        if(i % (3*5) == 0)   
          System.out.println("FizzBuzz"); 
        else if(i % 5 == 0)
         System.out.println("Buzz");  
        else if(i % 3 == 0) 
          System.out.println("Fizz"); 
       else System.out.println(i);
    }  
  }
}
