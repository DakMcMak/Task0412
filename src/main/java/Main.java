import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatNumber = scanner.nextInt();
        if( greatNumber == 0){
            System.out.println(greatNumber);
        }
        if ( greatNumber < 0){
            greatNumber++;
            System.out.println(greatNumber);
        }
        if ( greatNumber > 0){
            greatNumber = greatNumber * 2;
            System.out.println(greatNumber);
        }

    }
}
