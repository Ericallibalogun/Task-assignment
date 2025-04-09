package GateOne;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
public class MenstrualApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        LocalDate startedDate = null;
        LocalDate endedDate = null;
        int cycleLength = 0;

        String start = null;
        while (startedDate == null) {
            System.out.println("Enter the starting date in the format YYYY-MM-DD");
            start = userInput.nextLine();
            try {
                startedDate = LocalDate.parse(start);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter the date in the format YYYY-MM-DD.");
            }
        }

        String end = null;
        while (endedDate == null) {
            System.out.println("Enter the ending date in the format YYYY-MM-DD");
            end = userInput.nextLine();
            try {
                endedDate = LocalDate.parse(end);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter the date in the format YYYY-MM-DD.");
            }
        }

        int menstrualCycles = 0;
        while (cycleLength < 21 || cycleLength > 35) {
            System.out.println("How long does Your menstrual cycle take");
            menstrualCycles = userInput.nextInt();
            try {
                cycleLength = Integer.parseInt(userInput.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid cycle length. Please enter a valid cycle length... If problem persist please go a see a doctor ASAP");
            }
        }
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate startDate = LocalDate.parse(start, dateFormat);
        LocalDate endDate = LocalDate.parse(end, dateFormat);

        MenstrualCycle myCycle = new MenstrualCycle(startDate, endDate, menstrualCycles);

        System.out.println("The starting date: " + myCycle.getStartDate());
        System.out.println("The ending date: " + myCycle.getEndDate());
        System.out.println("The safe period is: " + myCycle.getSafePeriodEndDate());
        System.out.println("The ovulation period is: " + myCycle.getOvulationDate());
        System.out.println("The next period will be: " + myCycle.getNextPeriodStart());


    }
}



