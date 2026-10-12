
import java.util.Scanner;
import java.util.Random;

public class Labsheet2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== JAVA LAB SHEET 02 =====");
            System.out.println("1. Area of Triangle (Heron's Formula)");
            System.out.println("2. Compound Interest");
            System.out.println("3. Distance Between Two Points");
            System.out.println("4. Prefix and Postfix Increment");
            System.out.println("5. Negative Value Using Unary Operator");
            System.out.println("6. Reduce Number by Half");
            System.out.println("7. Total Rainfall for 7 Days");
            System.out.println("8. Valid Triangle Using Angles");
            System.out.println("9. Compare Strings Lexicographically");
            System.out.println("10. Leap Year Within Range");
            System.out.println("11. Student Pass/Fail");
            System.out.println("12. Smallest of Four Numbers");
            System.out.println("13. Character Classification");
            System.out.println("14. Swap Numbers Using XOR");
            System.out.println("15. Count Set Bits");
            System.out.println("16. Multiplication and Division Using Shifts");
            System.out.println("17. Rotate Bits Left by 2");
            System.out.println("18. First 20 Fibonacci Terms");
            System.out.println("19. Armstrong Numbers from 1 to 1000");
            System.out.println("20. Password Using do-while");
            System.out.println("21. Factors Using do-while");
            System.out.println("22. Reverse Digits Using while");
            System.out.println("23. Palindrome Using while");
            System.out.println("24. Maximum and Minimum in Array");
            System.out.println("25. Average Marks Using 2D Array");
            System.out.println("26. Weekday or Weekend");
            System.out.println("27. Grade Meaning");
            System.out.println("28. Skip Perfect Squares");
            System.out.println("29. Random Numbers Until Divisible by 7 and 13");
            System.out.println("30. Mixed Advanced Program");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: q1(); break;
                case 2: q2(); break;
                case 3: q3(); break;
                case 4: q4(); break;
                case 5: q5(); break;
                case 6: q6(); break;
                case 7: q7(); break;
                case 8: q8(); break;
                case 9: q9(); break;
                case 10: q10(); break;
                case 11: q11(); break;
                case 12: q12(); break;
                case 13: q13(); break;
                case 14: q14(); break;
                case 15: q15(); break;
                case 16: q16(); break;
                case 17: q17(); break;
                case 18: q18(); break;
                case 19: q19(); break;
                case 20: q20(); break;
                case 21: q21(); break;
                case 22: q22(); break;
                case 23: q23(); break;
                case 24: q24(); break;
                case 25: q25(); break;
                case 26: q26(); break;
                case 27: q27(); break;
                case 28: q28(); break;
                case 29: q29(); break;
                case 30: q30(); break;
                case 0:
                    System.out.println("Program terminated.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Q1. Heron's formula
    static void q1() {
        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0
                || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid triangle");
            return;
        }

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area: " + area);
    }

    // Q2. Compound interest
    static void q2() {
        System.out.print("Enter principal, annual rate (%) and time (years): ");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double amount = p * Math.pow(1 + r / 100, t);
        double ci = amount - p;

        System.out.println("Amount: " + amount);
        System.out.println("Compound Interest: " + ci);
    }

    // Q3. Distance between two points
    static void q3() {
        System.out.print("Enter x1, y1, x2, y2: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distance: " + distance);
    }

    // Q4. Prefix and postfix increment
    static void q4() {
        int visitors = 0;

        System.out.println("Initial visitors: " + visitors);
        System.out.println("Visitor entering (prefix): " + (++visitors));
        System.out.println("Visitor entering (postfix): " + (visitors++));
        System.out.println("After postfix increment: " + visitors);
        System.out.println("Visitor leaving (postfix): " + (visitors--));
        System.out.println("Final visitors: " + visitors);
    }

    // Q5. Negative value using unary operator
    static void q5() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println("Negative value: " + (-n));
    }

    // Q6. Repeatedly halve using /=
    static void q6() {
        System.out.print("Enter a positive number: ");
        double n = sc.nextDouble();

        if (n <= 0) {
            System.out.println("Enter a positive number.");
            return;
        }

        int steps = 0;

        while (n >= 1) {
            n /= 2;
            steps++;
        }

        System.out.println("Steps: " + steps);
        System.out.println("Final value: " + n);
    }

    // Q7. Rainfall for 7 days using +=
    static void q7() {
        double total = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter rainfall for day " + i + ": ");
            double rainfall = sc.nextDouble();
            total += rainfall;
        }

        System.out.println("Total rainfall: " + total);
    }

    // Q8. Valid triangle using angles
    static void q8() {
        System.out.print("Enter three angles: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b + c == 180)
            System.out.println("Valid triangle");
        else
            System.out.println("Invalid triangle");
    }

    // Q9. Lexicographic comparison without compareTo
    static void q9() {
        System.out.print("Enter first string: ");
        String a = sc.next();

        System.out.print("Enter second string: ");
        String b = sc.next();

        int i = 0;
        int limit = Math.min(a.length(), b.length());

        while (i < limit && a.charAt(i) == b.charAt(i)) {
            i++;
        }

        if (i == limit) {
            if (a.length() == b.length())
                System.out.println("Both strings are equal");
            else if (a.length() < b.length())
                System.out.println(a + " comes before " + b);
            else
                System.out.println(b + " comes before " + a);
        } else if (a.charAt(i) < b.charAt(i)) {
            System.out.println(a + " comes before " + b);
        } else {
            System.out.println(b + " comes before " + a);
        }
    }

    // Q10. Leap year within a given range
    static void q10() {
        System.out.print("Enter year, range start and range end: ");
        int year = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();

        boolean leap = year % 400 == 0
                || (year % 4 == 0 && year % 100 != 0);

        if (leap && year >= start && year <= end)
            System.out.println("Leap year within range");
        else
            System.out.println("Condition not satisfied");
    }

    // Q11. Student pass/fail
    // Assumption: pass if (theory >= 40 AND practical >= 50) OR overall >= 50.
    static void q11() {
        System.out.print("Enter theory percentage, practical percentage, overall percentage: ");
        double theory = sc.nextDouble();
        double practical = sc.nextDouble();
        double overall = sc.nextDouble();

        if ((theory >= 40 && practical >= 50) || overall >= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }

    // Q12. Smallest of four using nested ternary
    static void q12() {
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int minAB = (a < b) ? a : b;
        int minCD = (c < d) ? c : d;
        int smallest = (minAB < minCD) ? minAB : minCD;

        System.out.println("Smallest: " + smallest);
    }

    // Q13. Character classification using ternary
    static void q13() {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = (ch >= '0' && ch <= '9') ? "Digit"
                : ("aeiouAEIOU".indexOf(ch) >= 0) ? "Vowel"
                : (Character.isLetter(ch)) ? "Consonant"
                : "Special symbol";

        System.out.println(result);
    }

    // Q14. Swap using XOR
    static void q14() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // Q15. Count set bits
    static void q15() {
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a non-negative integer.");
            return;
        }

        int count = 0;
        int temp = n;

        while (temp != 0) {
            count += temp & 1;
            temp >>>= 1;
        }

        System.out.println("Number of set bits: " + count);
    }

    // Q16. Multiplication and division by powers of 2
    static void q16() {
        System.out.print("Enter integer and shift count: ");
        int n = sc.nextInt();
        int shift = sc.nextInt();

        if (shift < 0 || shift > 30) {
            System.out.println("Shift count must be between 0 and 30.");
            return;
        }

        System.out.println("Multiplication by 2^" + shift + ": " + (n << shift));
        System.out.println("Division by 2^" + shift + ": " + (n >> shift));
    }

    // Q17. Cyclically rotate bits left by 2
    static void q17() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int rotated = Integer.rotateLeft(n, 2);

        System.out.println("Original binary: " + String.format("%32s",
                Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.println("Rotated binary:  " + String.format("%32s",
                Integer.toBinaryString(rotated)).replace(' ', '0'));
        System.out.println("Rotated integer: " + rotated);
    }

    // Q18. First 20 Fibonacci terms
    static void q18() {
        long a = 0;
        long b = 1;

        for (int i = 1; i <= 20; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

    // Q19. Armstrong numbers from 1 to 1000
    static void q19() {
        for (int n = 1; n <= 1000; n++) {
            int digits = String.valueOf(n).length();
            int temp = n;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == n)
                System.out.print(n + " ");
        }

        System.out.println();
    }

    // Q20. Password using do-while
    static void q20() {
        String correctPassword = "java123";
        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.next();
        } while (!password.equals(correctPassword));

        System.out.println("Correct password!");
    }

    // Q21. Factors using do-while
    static void q21() {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }

        int i = 1;

        do {
            if (n % i == 0)
                System.out.print(i + " ");
            i++;
        } while (i <= n);

        System.out.println();
    }

    // Q22. Reverse digits using while
    static void q22() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        long temp = Math.abs((long) n);
        long reverse = 0;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        if (n < 0)
            reverse = -reverse;

        System.out.println("Reversed number: " + reverse);
    }

    // Q23. Palindrome using while
    static void q23() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not a palindrome");
            return;
        }

        int original = n;
        int temp = n;
        long reverse = 0;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }

    // Q24. Maximum and minimum using for-each
    static void q24() {
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int max = arr[0];
        int min = arr[0];

        for (int value : arr) {
            if (value > max)
                max = value;
            if (value < min)
                min = value;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    // Q25. Average marks using a 2D array and for-each
    static void q25() {
        System.out.print("Enter number of students and subjects: ");
        int students = sc.nextInt();
        int subjects = sc.nextInt();

        if (students <= 0 || subjects <= 0) {
            System.out.println("Both values must be positive.");
            return;
        }

        int[][] marks = new int[students][subjects];

        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++)
                marks[i][j] = sc.nextInt();
        }

        long total = 0;
        int count = 0;

        for (int[] studentMarks : marks) {
            for (int mark : studentMarks) {
                total += mark;
                count++;
            }
        }

        System.out.println("Average marks: " + (total / (double) count));
    }

    // Q26. Weekday or weekend
    static void q26() {
        System.out.print("Enter day number (1=Monday, 7=Sunday): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }

    // Q27. Grade meaning
    static void q27() {
        System.out.print("Enter grade (A-F): ");
        char grade = Character.toUpperCase(sc.next().charAt(0));

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'E':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }

    // Q28. Print 1 to 50, skipping perfect squares
    static void q28() {
        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);

            if (root * root == i)
                continue;

            System.out.print(i + " ");
        }

        System.out.println();
    }

    // Q29. Random numbers until divisible by both 7 and 13
    static void q29() {
        Random random = new Random();
        int n;
        int count = 0;

        do {
            n = random.nextInt(100) + 1;
            System.out.println("Generated: " + n);
            count++;

            if (n % 7 == 0 && n % 13 == 0)
                break;
        } while (true);

        System.out.println("Matching number: " + n);
        System.out.println("Attempts: " + count);
    }

    // Q30. Mixed advanced program
    static void q30() {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }

        // Check power of 4 using bitwise and shift operators.
        boolean powerOfFour = (n & (n - 1)) == 0
                && (n & 0x55555555) != 0;

        System.out.println("Is power of 4: " + powerOfFour);

        // Toggle the 3rd bit (bit position 2, counting from 0).
        int toggled = n ^ (1 << 2);
        System.out.println("After toggling the 3rd bit: " + toggled);

        // Multiplication table; skip multiples of 6 and stop at multiples of 48.
        System.out.println("Multiplication table:");

        for (int i = 1; i <= 100; i++) {
            int product = n * i;

            if (product % 48 == 0)
                break;

            if (product % 6 == 0)
                continue;

            System.out.println(n + " x " + i + " = " + product);
        }
    }
}
