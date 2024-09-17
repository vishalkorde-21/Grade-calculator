import java.util.*;
public class gradecalculation {
    public static void main(String[] args) {
      Scanner Sc =new Scanner (System.in);
       System.out.print("subject1 :");
      
       int subject1= Sc.nextInt();
       System.out.print("subject 2:");
       int subject2=Sc.nextInt();
       System.out.print("subject 3:");
       int subject3=Sc.nextInt();
  
       int Total_marks=subject1+subject2+subject3;
  System.out.println("Total Marks :"+Total_marks);
  int avg=Total_marks/3;
  System.out.println("Average:"+avg);
  if (avg>=80){
    System.out.println("Grade : A");

  }
  else if(avg>=50){
    System.out.println("Grade : B");
  }
  else if(avg < 50){
    System.out.println("Grade : C");
  }
  else
  {
    System.out.println("fail");
  }
  Sc.close();
    }
  
}
