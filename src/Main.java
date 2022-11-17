import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // задание 1 и 2.
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(" ФИО сотрудника —  "+fullName);
        fullName=fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета —  " +fullName);

        // задание 3
        String fullName1 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " +fullName1.replace("ё","е"));


    }
}