package GateOne;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class MenstrualApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the starting date in the format YYYY-MM-DD");
        String start = userInput.nextLine();

        System.out.println("Enter the ending date in the format YYYY-MM-DD");
        String end = userInput.nextLine();

        System.out.println("How long does Your menstrual cycle take");
        int menstrualCycles = userInput.nextInt();

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate startDate = LocalDate.parse(start,dateFormat);
        LocalDate endDate = LocalDate.parse(end,dateFormat);

        MenstrualCycle myCycle = new MenstrualCycle(startDate,endDate,menstrualCycles);

        System.out.println("The starting date: " +  myCycle.getStartDate());
        System.out.println("The ending date: " + myCycle.getEndDate());
        System.out.println("The safe period is: " + myCycle.getSafePeriodEndDate());
        System.out.println("The ovulation period is: " + myCycle.getOvulationDate());
        System.out.println("The next period will be: " + myCycle.getNextPeriodStart());


    }
}



