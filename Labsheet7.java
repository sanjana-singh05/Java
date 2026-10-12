import java.util.Scanner;
import java.util.ArrayList;

// Q1-Q6: Exception Handling

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccountExceptionDemo {
    double balance;

    BankAccountExceptionDemo(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }
}

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

class ExceptionPrograms {
    static Scanner sc = new Scanner(System.in);

    static void q1() {
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Division operation completed.");
        }
    }

    static void q2() {
        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index (0-4): ");
            int index = sc.nextInt();
            System.out.println("Value: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }
    }

    static void q3() {
        try {
            System.out.print("Enter first integer as a string: ");
            String a = sc.next();
            System.out.print("Enter second integer as a string: ");
            String b = sc.next();

            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);

            System.out.println("Result: " + (x / y));
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    static void q4() {
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            try {
                int[] arr = {10, 20, 30, 40, 50};
                System.out.print("Enter array index (0-4): ");
                int index = sc.nextInt();
                System.out.println("Array value: " + arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index.");
            }

            System.out.println("Division result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    static void q5() {
        try {
            System.out.println("File opened.");
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("Square: " + (n * n));
        } catch (Exception e) {
            System.out.println("An error occurred.");
        } finally {
            System.out.println("Resource closed.");
        }
    }

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be at least 18.");
        }
        System.out.println("Eligible.");
    }

    static void q6() {
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            checkAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void q7() {
        try {
            System.out.print("Enter password: ");
            String password = sc.next();

            if (password.length() < 6) {
                throw new InvalidPasswordException(
                    "Password must contain at least 6 characters.");
            }

            System.out.println("Password accepted.");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    static int readNumber() throws NumberFormatException {
        System.out.print("Enter a number: ");
        String input = sc.next();
        return Integer.parseInt(input);
    }

    static void q8() {
        try {
            System.out.println("Converted number: " + readNumber());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }

    static int returnWithFinally() {
        try {
            return 100;
        } finally {
            System.out.println("Finally block executed before method returns.");
        }
    }

    static void q9() {
        int result = returnWithFinally();
        System.out.println("Returned value: " + result);
    }

    static void q10() {
        try {
            System.out.print("Enter initial balance: ");
            double balance = sc.nextDouble();

            if (balance < 0) {
                System.out.println("Invalid initial balance.");
                return;
            }

            BankAccountExceptionDemo account =
                new BankAccountExceptionDemo(balance);

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Q11: Simple user-defined package concept
class Hello {
    void display() {
        System.out.println("Hello from the mypack package example.");
        System.out.println("In a real package, use package mypack; at the top of Hello.java.");
    }
}

// Q12: Shapes package concept
class CirclePackageDemo {
    double radius;

    CirclePackageDemo(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class RectanglePackageDemo {
    double length, width;

    RectanglePackageDemo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

// Q13: Public and default class concept
class PackageAccessDemo {
    public void publicMethod() {
        System.out.println("Public method is accessible outside the package.");
    }

    void defaultMethod() {
        System.out.println("Default method is accessible within the same package.");
    }
}

// Q14: Subpackage example
class CompanyEmployee {
    String name;
    int id;

    CompanyEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Employee: " + name + ", ID: " + id);
    }
}

// Q15: Access modifiers
class AccessModifierDemo {
    public int publicValue = 10;
    protected int protectedValue = 20;
    int defaultValue = 30;
    private int privateValue = 40;

    public int getPrivateValue() {
        return privateValue;
    }
}

// Q16: Import vs fully qualified name
class Dog {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Q17: Wildcard import example
class A {
    void show() {
        System.out.println("Class A");
    }
}

class B {
    void show() {
        System.out.println("Class B");
    }
}

class C {
    void show() {
        System.out.println("Class C");
    }
}

// Q18: java.util ArrayList and Scanner
// Q19: Utility methods
class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

// Q20: Packaging and compiling example
class CollegeStudent {
    String name;
    int rollNo;

    CollegeStudent(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

// Q21-Q30: Multithreading (Advanced section)

class MessageThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread message " + i);
        }
    }
}

class NumberRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class NamedThread extends Thread {
    NamedThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Running: " + getName());
    }
}

class PriorityThread extends Thread {
    PriorityThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println(getName() + " priority: " + getPriority());
    }
}

class SleepThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Sleeping thread started.");
            Thread.sleep(2000);
            System.out.println("Sleeping thread finished.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class JoinThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Worker: " + i);
        }
    }
}

class SharedCounter {
    int count = 0;

    void increment() {
        count++;
    }

    synchronized void synchronizedIncrement() {
        count++;
    }
}

class CounterThread extends Thread {
    SharedCounter counter;
    boolean useSynchronization;

    CounterThread(SharedCounter counter, boolean useSynchronization) {
        this.counter = counter;
        this.useSynchronization = useSynchronization;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            if (useSynchronization)
                counter.synchronizedIncrement();
            else
                counter.increment();
        }
    }
}

public class Labsheet7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== JAVA LAB SHEET 07 =====");
            System.out.println("1. Divide by Zero Exception");
            System.out.println("2. Array Index Out of Bounds");
            System.out.println("3. Multiple Catch Blocks");
            System.out.println("4. Nested Try Blocks");
            System.out.println("5. Finally Block");
            System.out.println("6. Throw Keyword");
            System.out.println("7. Custom Password Exception");
            System.out.println("8. Throws Keyword");
            System.out.println("9. Finally vs Return");
            System.out.println("10. Banking Exceptions");
            System.out.println("11. Simple Package Example");
            System.out.println("12. Shapes Package Example");
            System.out.println("13. Public and Default Access");
            System.out.println("14. Subpackage Example");
            System.out.println("15. Access Modifiers");
            System.out.println("16. Import vs Fully Qualified Name");
            System.out.println("17. Wildcard Import");
            System.out.println("18. ArrayList and Scanner");
            System.out.println("19. Math Utility Methods");
            System.out.println("20. College Student Example");
            System.out.println("21. Thread Class");
            System.out.println("22. Runnable Interface");
            System.out.println("23. Thread Life Cycle");
            System.out.println("24. Two Threads");
            System.out.println("25. Thread Priorities");
            System.out.println("26. Thread Sleep");
            System.out.println("27. Join Method");
            System.out.println("28. Unsynchronized Counter");
            System.out.println("29. Synchronized Counter");
            System.out.println("30. Multithreading Example");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: ExceptionPrograms.q1(); break;
                case 2: ExceptionPrograms.q2(); break;
                case 3: ExceptionPrograms.q3(); break;
                case 4: ExceptionPrograms.q4(); break;
                case 5: ExceptionPrograms.q5(); break;
                case 6: ExceptionPrograms.q6(); break;
                case 7: ExceptionPrograms.q7(); break;
                case 8: ExceptionPrograms.q8(); break;
                case 9: ExceptionPrograms.q9(); break;
                case 10: ExceptionPrograms.q10(); break;
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
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void q11() {
        Hello hello = new Hello();
        hello.display();
    }

    static void q12() {
        CirclePackageDemo circle = new CirclePackageDemo(5);
        RectanglePackageDemo rectangle = new RectanglePackageDemo(4, 6);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }

    static void q13() {
        PackageAccessDemo demo = new PackageAccessDemo();
        demo.publicMethod();
        demo.defaultMethod();
    }

    static void q14() {
        CompanyEmployee employee = new CompanyEmployee("Rudra", 101);
        employee.display();
    }

    static void q15() {
        AccessModifierDemo demo = new AccessModifierDemo();

        System.out.println("Public: " + demo.publicValue);
        System.out.println("Protected: " + demo.protectedValue);
        System.out.println("Default: " + demo.defaultValue);
        System.out.println("Private through getter: " + demo.getPrivateValue());
    }

    static void q16() {
        Dog dog1 = new Dog();
        dog1.bark();

        // Fully qualified names use the package name, e.g. animals.Dog.
        System.out.println("Import and fully qualified name examples require a separate package.");
    }

    static void q17() {
        A a = new A();
        B b = new B();
        C c = new C();

        a.show();
        b.show();
        c.show();

        System.out.println("Wildcard imports apply to classes in a named package.");
    }

    static void q18() {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("ArrayList: " + list);
    }

    static void q19() {
        System.out.println("Add: " + MathUtils.add(10, 5));
        System.out.println("Subtract: " + MathUtils.subtract(10, 5));
        System.out.println("Multiply: " + MathUtils.multiply(10, 5));
    }

    static void q20() {
        CollegeStudent student = new CollegeStudent("Rudra", 101);
        student.display();
    }

    static void q21() {
        MessageThread thread = new MessageThread();
        thread.start();
    }

    static void q22() {
        Thread thread = new Thread(new NumberRunnable());
        thread.start();
    }

    static void q23() {
        Thread thread = new Thread(() -> {
            System.out.println("Thread running.");
        });

        System.out.println("State before start: " + thread.getState());
        thread.start();
        System.out.println("State after start: " + thread.getState());

        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("State after completion: " + thread.getState());
    }

    static void q24() {
        NamedThread t1 = new NamedThread("Thread-A");
        NamedThread t2 = new NamedThread("Thread-B");

        t1.start();
        t2.start();
    }

    static void q25() {
        PriorityThread low =
                new PriorityThread("Low", Thread.MIN_PRIORITY);
        PriorityThread normal =
                new PriorityThread("Normal", Thread.NORM_PRIORITY);
        PriorityThread high =
                new PriorityThread("High", Thread.MAX_PRIORITY);

        low.start();
        normal.start();
        high.start();
    }

    static void q26() {
        SleepThread sleeper = new SleepThread();

        sleeper.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }
    }

    static void q27() {
        JoinThread worker = new JoinThread();
        worker.start();

        try {
            worker.join();
            System.out.println("Worker finished. Main continues.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static void q28() {
        SharedCounter counter = new SharedCounter();

        CounterThread t1 = new CounterThread(counter, false);
        CounterThread t2 = new CounterThread(counter, false);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Expected count: 200000");
        System.out.println("Actual unsynchronized count: " + counter.count);
    }

    static void q29() {
        SharedCounter counter = new SharedCounter();

        CounterThread t1 = new CounterThread(counter, true);
        CounterThread t2 = new CounterThread(counter, true);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Synchronized count: " + counter.count);
    }

    static void q30() {
        Thread printing = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Printing task: " + i);
            }
        });

        Thread processing = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Processing task: " + i);
            }
        });

        printing.start();
        processing.start();

        try {
            printing.join();
            processing.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("All tasks completed.");
    }
}