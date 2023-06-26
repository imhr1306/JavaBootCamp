import java.util.Scanner;
public class GradeCalculator 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your test score : ");
        int n = in.nextInt();
       // String grade = null;
        if(n>100 || n<0)
        {
            System.out.println("Invalid Test Score");
        }
        else
        {
            switch(n/10)
        {
            case 10 :
            case 9 : 
               System.out.println("Grade : A");
            //   grade = "A";
               break;
            case 8 :
            System.out.println("Grade : B");
               //grade = "B";
               break;
            case 7 :
            System.out.println("Grade : C");
              // grade = "C";
               break;
            case 6 :
            System.out.println("Grade : D");
              // grade = "D";
               break;
            default :
            System.out.println("Grade : F");
              // grade = "F";
               break;
        }
      //  System.out.println("Grade : "+grade);
    }
}
}