package GateOne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
class MenstrualCycleTest {

    @Test
    public void test_getOvulationDateIsCorrect() {
        LocalDate startDate = LocalDate.of(2024,5,4);
        LocalDate endDate = LocalDate.of(2024,5,9);
        int cycleLength = 28;

        MenstrualCycle myCycle = new MenstrualCycle(startDate,endDate,cycleLength);

        LocalDate ovulationDate = myCycle.getOvulationDate();
        LocalDate expectedOvulationDate = endDate.plusDays(cycleLength/2);
        assertEquals(expectedOvulationDate, ovulationDate);
    }

    @Test
    public void test_getSafePeriodStartDateIsCorrect() {
        LocalDate startDate = LocalDate.of(2024,5,4);
        LocalDate endDate = LocalDate.of(2024,5,9);
        int cycleLength = 28;

        MenstrualCycle myCycle = new MenstrualCycle(startDate,endDate,cycleLength);

        LocalDate safePeriodStartDate = myCycle.getSafePeriodStartDate();
        LocalDate expectedSafePeriodStartDate = endDate.plusDays(1);
        assertEquals(expectedSafePeriodStartDate, safePeriodStartDate);
    }

    @Test
    public void test_getSafePeriodEndDateReturnsCorrectDate() {
        LocalDate startDate = LocalDate.of(2024,5,4);
        LocalDate endDate = LocalDate.of(2024,5,9);
        int cycleLength = 28;

        MenstrualCycle myCycle = new MenstrualCycle(startDate,endDate,cycleLength);

        LocalDate safePeriodEndDate = myCycle.getSafePeriodEndDate();
        LocalDate expectedSafePeriodEndDate = endDate.plusDays(6);
        assertEquals(expectedSafePeriodEndDate, safePeriodEndDate);
    }

    @Test
    public void test_getNextPeriodStartIsValid() {
        LocalDate startDate = LocalDate.of(2024,5,4);
        LocalDate endDate = LocalDate.of(2024,5,9);
        int cycleLength = 28;

        MenstrualCycle myCycle = new MenstrualCycle(startDate,endDate,cycleLength);
        LocalDate nextPeriodStartDate = myCycle.getNextPeriodStart();
        LocalDate expectedNextPeriodStartDate =endDate.plusDays(cycleLength);
        assertEquals(expectedNextPeriodStartDate, nextPeriodStartDate);
    }

    @Test
    public void test_getStartDate() {
        LocalDate startDate = LocalDate.of(2024,5,4);
        LocalDate endDate = LocalDate.of(2024,5,9);
        int cycleLength = 28;

        MenstrualCycle myCycle = new MenstrualCycle(startDate,endDate,cycleLength);
        LocalDate result = myCycle.getStartDate();
        assertEquals(startDate,result);
    }

    @Test
    public void test_getEndDateIsCorrect() {
        LocalDate startDate = LocalDate.of(2024,5,4);
        LocalDate endDate = LocalDate.of(2024,5,9);
        int cycleLength = 28;

        MenstrualCycle myCycle = new MenstrualCycle(startDate,endDate,cycleLength);
        LocalDate result = myCycle.getEndDate();
        assertEquals(endDate,result);

    }
}