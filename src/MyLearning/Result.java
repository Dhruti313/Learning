package MyLearning;
import java.time.LocalDate;
import java.util.*;


public class Result {
static String weekDate(int day, int month, int year){

    LocalDate dt = LocalDate.of(year,month,day);
    return (dt.getDayOfWeek().toString());

}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String[] a = scanner.nextLine().split(" ");
     String s = weekDate(Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
        System.out.println(s);





        }
    }
