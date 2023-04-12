import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class middates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date1 = sc.nextLine();
        String date2 = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate d1 = LocalDate.parse(date1, formatter);
        LocalDate d2 = LocalDate.parse(date2, formatter);
        Period period = Period.between(d1, d2);
        System.out.print(period.getDays());
    }
}     
   