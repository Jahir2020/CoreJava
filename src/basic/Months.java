package basic;

//public enum Months {
    //January, February, March, April, May, June, July, August, September, October, November, December;
//}
   public class Months {
       Months month;
       public year (Months months){
           this.month = months;
       }
   public void whatToDo() {


       switch (month) {
           case January:
               System.out.println("This is the first month of a year");
           case February:
               System.out.println("This is the second  month of a year");
           case March:
               System.out.println("This is the third month of a year");
           case April:
               System.out.println("This is the fourth month of a year");
           case May:
               System.out.println("This is the fifth month of a year");
           case June:
               System.out.println("This is the sixth month of a year");
           case July:
               System.out.println("This is the seventh month of a year");
           case August:
               System.out.println("This is the first eighth of a year");
           case September:
               System.out.println("This is the first nineth of a year");
           case October:
               System.out.println("This is the first month of a year");
           case November:
               System.out.println("This is the first month of a year");
           case December:
               System.out.println("This is the first twelve of a year");
       }
   }

}
