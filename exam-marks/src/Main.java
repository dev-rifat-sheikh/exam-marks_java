import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        do {
            System.out.println("What is your number? eg(0-100)");
            System.out.print("Ans: ");

            int marks = sc.nextInt();
            if(marks<=100 && marks>=90){
                System.out.println("This is Good");
            } else if(89 >= marks && marks >= 60){
                System.out.println("This is also Good");
            }else if(59 >= marks && marks >= 0){
                System.out.println("This is Good as well");
            }else{
                System.out.println("Error!!");
            }

            System.out.println("Marks don’t matter but our effort does.");
            System.out.println("Have other numbers?(y=1/n=0)");
            System.out.print("Option: ");
            a = sc.nextInt();

        }while (a == 1);
    }
}