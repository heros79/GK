package homeworks.partone;

public class HomeWorkPartOne {

    byte byteSizeByBit = 8;
    short appleCount = 10;
    int lessonNumber = 1;
    long tooLongNumber = 6546546546546L;

    float totalDif = 265.458f;
    double totalSum = 156.987;

    char englishAlphabetFirstChar = 'A';

    boolean canChange = true;

    String myName = "David";

    public int getCalculationResult (int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public boolean isSumInRange (int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <+ 20;
    }

    public void checkNumberNegativeOrPositive (int a) {
        if (a > -1) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public boolean isNumberNegative (int a) {
        return a < 0;
    }

    public void printHelloParamValue (String name) {
        System.out.println("Привет, " + name + "!");
    }

    public void checkLeapYear (int year) {

        if (year < 0) {
            System.out.println("Такого года не существует");
        }

        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}
