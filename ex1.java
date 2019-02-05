import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int mark = scan.nextInt();
        String result = (mark >=80 ? "Grade A" : mark >=70 ? "Grade B" : mark >= 60 ? "Grade C" : "Failed");

        System.out.println(result);
        

    }
}