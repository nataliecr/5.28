import java.util.Scanner;

public class DisplayDay {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter year: ");
      int year = input.nextInt();
      System.out.print("Enter first day of year: (0 for Sunday, 1 for Monday, ...) ");
      int day = input.nextInt();
      int month = 1;
      
      while (month <= 12){
        
        int length = 30 + ((month + (int)(month / 8.0)) % 2);
        if (month == 2){
          if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            length = 29;
          else
            length = 28;  
         } // if february      
         
        switch(month){
          case 1: System.out.print("January "); break;
          case 2: System.out.print("February "); break;
          case 3: System.out.print("March "); break;
          case 4: System.out.print("April "); break;
          case 5: System.out.print("May "); break;
          case 6: System.out.print("June "); break;
          case 7: System.out.print("July "); break;
          case 8: System.out.print("August "); break;
          case 9: System.out.print("September "); break;
          case 10: System.out.print("October "); break;
          case 11: System.out.print("November "); break;
          case 12: System.out.print("December "); break;
        } // switch month
        
        System.out.print("1, " + year + " is ");
        
        day = day % 7;
        switch(day){
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;  
            case 2: System.out.println("Tuesday"); break; 
            case 3: System.out.println("Wednesday"); break; 
            case 4: System.out.println("Thursday"); break; 
            case 5: System.out.println("Friday"); break; 
            case 6: System.out.println("Saturday"); break;  
        } // switch day
        
        day += length;
        month++;
      } // while 
      
  }   // main 
} // DisplayDay
