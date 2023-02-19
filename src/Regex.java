import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        patternCheck(input);

    }


    public static void patternCheck(String str) {
        String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        String datePattern1 = "\\d{2}-\\d{2}-\\d{4}";
        String datePattern2 = "\\d{2},\\d{2},\\d{4}";
        String ipPattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                           "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                           "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                           "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

        if (str.matches(emailPattern)){
            System.out.println(str + " Ini email");
        } else if (str.matches(datePattern1)){
            System.out.println(str + " Ini date pattern1");
        } else if (str.matches(datePattern2)){
            System.out.println(str + " Ini date pattern2");
        } else if (str.matches(ipPattern)) {
            System.out.println(str + " Ini pattern ip");
        }
    }
}
