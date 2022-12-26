import java.util.Scanner;
import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
            do {
                try {
                    System.out.println("EAD Areas Calculator");
                    System.out.println("1. Square");
                    System.out.println("2. Circle");
                    System.out.println("3. Trapezoid");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter side value: ");
                        double side = scanner.nextDouble();
                        calc.setSquare(side);
                        System.out.println("Square area: " + calc.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter radius value: ");
                        double radius = scanner.nextDouble();
                        calc.setCircle(radius);
                        System.out.println("Circle area: " + calc.getCircle());
                        break;
                    case 3:
                        System.out.print("Enter upper side value: ");
                        double area= scanner.nextDouble();
                        System.out.println("Circle area: " + calc.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("Program telah selesai");
                    default:
                        System.out.println("opsi tidak ada");

                        continue= false;
                }
                repeat=false;
            }   catch(InputMismatchException a){
                    System.out.println("input invalid");
            }   catch(IllegalArgumentException a){
                    System.out.println("inputan salah");
            }   catch (InterruptedException a){
                    System.out.println("inputan salah");
            }
        }while(repeat);
        scanner.close();
    }
}
