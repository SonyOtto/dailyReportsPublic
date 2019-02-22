import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "Добрый вечер! Всего за сегодня было отработано 8.5 ч. Задачи, выполненные за сегодня: 1. 888 Holdings - Poker - 6,5 ч. Task 1190615:[QA Mobile] Exploratory Testing 7.14 - Sit&Go - 3.5 ч. Gameplay HH Ad- Task 1190586:[Mobile QA] Android wrapper (push fix) PP - Testlab Execution - 2,5 ч.";
        Pattern pattern1 = Pattern.compile("Всего за сегодня было отработано\\s[0-9]+([,.][0-9]{1,2})?");
        Matcher matcher = pattern1.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));

        }
        Pattern pattern2 = Pattern.compile("888 Holdings - Poker -\\s[0-9]+([,.][0-9]{1,2})?");
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher2.find()) {
            System.out.println(text.substring(matcher2.start(), matcher2.end()));
        }
        Pattern pattern3 = Pattern.compile("Task\\s([0-9]+([,.][0-9]{1,2})?):[a-zA-Z_0-9|\\s|\\p{Punct}]*");
        Matcher matcher3 = pattern3.matcher(text);
        while (matcher3.find()) {
            System.out.println(text.substring(matcher3.start(), matcher3.end()));
        }
    }
}
