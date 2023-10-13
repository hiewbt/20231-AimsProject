import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfDays {
    private static int month;
    private static int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int leapYearFeb = 29;
    private static String[][] monthsDB = {
        {"January", "Jan.", "Jan", "1"},
        {"February", "Feb.", "Feb", "2"},
        {"March", "Mar.", "Mar", "3"},
        {"April", "Apr.", "Apr", "4"},
        {"May", "May.", "May", "5"},
        {"June", "Jun.", "Jun", "6"},
        {"July", "Jul.", "Jul", "7"},
        {"August", "Aug.", "Aug", "8"},
        {"September", "Sep.", "Sep", "9"},
        {"October", "Oct.", "Oct", "10"},
        {"November", "Nov.", "Nov", "11"},
        {"December", "Dec.", "Dec", "12"}
    };

    static boolean checkMonthInput(String monthInput) {
        monthInput = monthInput.trim();
        for (month = 0; month < monthsDB.length; month++) {
            for(int i = 0; i < monthsDB[month].length; i++) {
                if (monthInput.equals(monthsDB[month][i])) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean checkYearInput(String year) {
        year = year.trim();
        Pattern pattern = Pattern.compile("^[0-9]+$");
        Matcher matcher = pattern.matcher(year);
        boolean matchFound = matcher.find();
        if (!matchFound) {
            return false;
        }
        return true;
    }

    static boolean checkLeapYear(String year) {
        int convertedYear = Integer.parseInt(year);
        if (convertedYear % 4 == 0) {
            if ((convertedYear % 100 == 0) && (convertedYear % 400 != 0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String monthInput;
        String yearInput;
        while(true) {
            monthInput = JOptionPane.showInputDialog(null, "Input month", "Month", JOptionPane.INFORMATION_MESSAGE);
            if (!checkMonthInput(monthInput)) {
                JOptionPane.showMessageDialog(null, "Invalid input month! Please enter again", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                break;
            }
        }
        while(true) {
            yearInput = JOptionPane.showInputDialog(null, "Input year", "Year", JOptionPane.INFORMATION_MESSAGE);
            if (!checkYearInput(yearInput)) {
                JOptionPane.showMessageDialog(null, "Invalid input year! Please enter again", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                break;
            }
        }

        String message = monthsDB[month][0] + ", " + yearInput + " has: ";
        if (checkLeapYear(yearInput)) {
            if (month + 1 == 2) {
                message += leapYearFeb + " days";
            } else {
                message += daysOfMonth[month] + " days";
            }
        } else {
            message += daysOfMonth[month] + " days";
        }

        JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
