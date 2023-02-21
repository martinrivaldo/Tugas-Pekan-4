import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Tugas Regex
        patternCheck(input);
    }


    public static void patternCheck(String str) {
        String emailPattern = "^[\\w-]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        String datePattern1 = "\\d{2}-\\d{2}-\\d{4}";
        String datePattern2 = "^([A-Za-z]+),([A-Za-z]+),\\d{2}$";
        String datePattern3 = "^([A-Za-z]+),\\s([A-Za-z]+),\\s\\d{2}$";
        String ipPattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                           "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                           "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                           "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

        if (str.matches(emailPattern)){
            System.out.println(str + " Ini email");
        } else if (str.matches(datePattern1)){
            System.out.println(str + " Ini date pattern1");
        } else if (str.matches(datePattern2) || str.matches(datePattern3)){
            System.out.println(str + " Ini date pattern2");
        } else if (str.matches(ipPattern)) {
            System.out.println(str + " Ini pattern ip");
        } else {
            System.out.println(str + " pattern tidak ada yang cocok");
        }
    }
}
