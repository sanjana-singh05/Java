
import java.util.Scanner;

public class Labsheet1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== LAB SHEET 01 =====");
            System.out.println("1. Display Name, Age and College");
            System.out.println("2. Arithmetic Operations");
            System.out.println("3. Even or Odd");
            System.out.println("4. Relational Operators");
            System.out.println("5. Type Casting");
            System.out.println("6. ASCII Value");
            System.out.println("7. Divisible by 3 and 5");
            System.out.println("8. Vowel or Consonant");
            System.out.println("9. Total, Percentage and Pass/Fail");
            System.out.println("10. Greatest of Two Numbers");
            System.out.println("11. Largest of Three Numbers");
            System.out.println("12. Leap Year");
            System.out.println("13. Positive, Negative or Zero");
            System.out.println("14. Character Classification");
            System.out.println("15. Armstrong Number");
            System.out.println("16. Income Tax");
            System.out.println("17. Palindrome Number");
            System.out.println("18. Prime Number");
            System.out.println("19. Arithmetic Calculator");
            System.out.println("20. Marriage Eligibility");
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
                case 0:
                    System.out.println("Program terminated.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Q1. Display name, age and college
    static void q1() {
        String name = "Rudra Verma";
        int age = 22;
        String college = "COER University";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }

    // Q2. Arithmetic operations
    static void q2() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + ((double) a / b));
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Division and modulus by zero are undefined.");
        }
    }

    // Q3. Even or odd
    static void q3() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }

    // Q4. Relational operators
    static void q4() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }

    // Q5. Explicit type casting
    static void q5() {
        System.out.print("Enter a floating-point number: ");
        float number = sc.nextFloat();
        int converted = (int) number;

        System.out.println("Original value: " + number);
        System.out.println("Converted integer: " + converted);
    }

    // Q6. ASCII value
    static void q6() {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println("Character: " + ch);
        System.out.println("ASCII value: " + (int) ch);
    }

    // Q7. Divisible by both 3 and 5
    static void q7() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0)
            System.out.println("Divisible by both 3 and 5");
        else
            System.out.println("Not divisible by both 3 and 5");
    }

    // Q8. Vowel or consonant
    static void q8() {
        System.out.print("Enter a character: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else {
            System.out.println("Invalid alphabet");
        }
    }

    // Q9. Total, percentage and pass/fail
    static void q9() {
        System.out.print("Enter marks of three subjects out of 100: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < 0 || a > 100 || b < 0 || b > 100
                || c < 0 || c > 100) {
            System.out.println("Invalid marks");
            return;
        }

        int total = a + b + c;
        double percentage = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (a >= 40 && b >= 40 && c >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }

    // Q10. Greatest of two numbers
    static void q10() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b)
            System.out.println("Greatest: " + a);
        else if (b > a)
            System.out.println("Greatest: " + b);
        else
            System.out.println("Both numbers are equal");
    }

    // Q11. Largest of three numbers using nested if-else
    static void q11() {
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b) {
            if (a >= c)
                System.out.println("Largest: " + a);
            else
                System.out.println("Largest: " + c);
        } else {
            if (b >= c)
                System.out.println("Largest: " + b);
            else
                System.out.println("Largest: " + c);
        }
    }

    // Q12. Leap year
    static void q12() {
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0
                || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }

    // Q13. Positive, negative or zero
    static void q13() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("Positive number");
        else if (n < 0)
            System.out.println("Negative number");
        else
            System.out.println("Zero");
    }

    // Q14. Character classification
    static void q14() {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch))
            System.out.println("Digit");
        else if (Character.isUpperCase(ch))
            System.out.println("Uppercase letter");
        else if (Character.isLowerCase(ch))
            System.out.println("Lowercase letter");
        else
            System.out.println("Special character");
    }

    // Q15. Armstrong number
    static void q15() {
        System.out.print("Enter a three-digit number: ");
        int n = sc.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("Enter a positive three-digit number.");
            return;
        }

        int original = n;
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if (sum == original)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }

    // Q16. Income tax
    static void q16() {
        System.out.print("Enter annual income: ");
        double salary = sc.nextDouble();
        double tax;

        if (salary < 0) {
            System.out.println("Invalid income");
        } else if (salary <= 250000) {
            tax = 0;
            System.out.println("Tax: " + tax);
        } else if (salary <= 500000) {
            tax = salary * 0.05;
            System.out.println("Tax: " + tax);
        } else if (salary <= 1000000) {
            tax = salary * 0.20;
            System.out.println("Tax: " + tax);
        } else {
            tax = salary * 0.30;
            System.out.println("Tax: " + tax);
        }
    }

    // Q17. Palindrome number
    static void q17() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not a palindrome");
            return;
        }

        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        if (original == reverse)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome number");
    }

    // Q18. Prime number
    static void q18() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean prime = n > 1;

        for (int i = 2; i <= n / i && prime; i++) {
            if (n % i == 0)
                prime = false;
        }

        if (prime)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }

    // Q19. Calculator using if-else
    static void q19() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+')
            System.out.println("Result: " + (a + b));
        else if (op == '-')
            System.out.println("Result: " + (a - b));
        else if (op == '*')
            System.out.println("Result: " + (a * b));
        else if (op == '/') {
            if (b != 0)
                System.out.println("Result: " + (a / b));
            else
                System.out.println("Division by zero is not allowed.");
        } else {
            System.out.println("Invalid operator");
        }
    }

    // Q20. Marriage eligibility using nested if-else
    static void q20() {
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter gender (M/F): ");
        char gender = Character.toUpperCase(sc.next().charAt(0));

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (gender == 'M') {
            if (age >= 21)
                System.out.println("Eligible for marriage");
            else
                System.out.println("Not eligible for marriage");
        } else if (gender == 'F') {
            if (age >= 18)
                System.out.println("Eligible for marriage");
            else
                System.out.println("Not eligible for marriage");
        } else {
            System.out.println("Invalid gender");
        }
    }
}
