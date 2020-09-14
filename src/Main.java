import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("Vvedite kol-vo chisel: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = number; i > 0 ; i--){
            int random = (int) (Math.random()*1000);
            if (i > 3){
                System.out.println(random);
            }else {
                System.out.print(random + " ");
            }
        }
    }
}
