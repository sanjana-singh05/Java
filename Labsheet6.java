import java.util.Scanner;

// Q1. Animal and Cat
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat barks");
    }
}

// Q2. Vehicle and Car
class Vehicle {
    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

// Q3. Shape and Rectangle
class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

// Q4. Employee and HRManager
class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 30000;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing employees");
    }

    void addEmployee(String name) {
        System.out.println("Employee added: " + name);
    }
}

// Q5. BankAccount and SavingsAccount
class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Withdrawal failed");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Withdrawal denied. Minimum balance of 100 required.");
        }
    }
}

// Q6. Abstract Animal
abstract class AbstractAnimal {
    abstract void sound();
}

class Lion extends AbstractAnimal {
    @Override
    void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends AbstractAnimal {
    @Override
    void sound() {
        System.out.println("Tiger growls");
    }
}

// Q7. Abstract Shape
abstract class AbstractShape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends AbstractShape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends AbstractShape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}

// Q8. Abstract Bank Account
abstract class AbstractBankAccount {
    protected double balance;

    AbstractBankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class AbstractSavingsAccount extends AbstractBankAccount {
    AbstractSavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid deposit");
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100)
            balance -= amount;
        else
            System.out.println("Withdrawal denied");
    }
}

class CurrentAccount extends AbstractBankAccount {
    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid deposit");
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }
}

// Q9. Abstract Animal with eat and sleep
abstract class AnimalBehavior {
    abstract void eat();
    abstract void sleep();
}

class BehaviorLion extends AnimalBehavior {
    @Override
    void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Lion sleeps in its den");
    }
}

class BehaviorTiger extends AnimalBehavior {
    @Override
    void eat() {
        System.out.println("Tiger hunts and eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Tiger rests in the forest");
    }
}

class Deer extends AnimalBehavior {
    @Override
    void eat() {
        System.out.println("Deer eats grass and plants");
    }

    @Override
    void sleep() {
        System.out.println("Deer rests in a safe place");
    }
}

// Q10. Abstract Employee
abstract class AbstractEmployee {
    String name;
    int id;

    AbstractEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends AbstractEmployee {
    double basicSalary;
    double bonus;

    Manager(String name, int id, double basicSalary, double bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Programmer extends AbstractEmployee {
    double basicSalary;
    double overtimePay;

    Programmer(String name, int id, double basicSalary,
               double overtimePay) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.overtimePay = overtimePay;
    }

    @Override
    double calculateSalary() {
        return basicSalary + overtimePay;
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Q11. Average of ten numbers and count above average
class NumberAverage {
    double average;

    NumberAverage(double[] numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        this.average = sum / numbers.length;
    }

    int countAboveAverage(double[] numbers) {
        int count = 0;

        for (double number : numbers) {
            if (number > this.average) {
                count++;
            }
        }

        return count;
    }
}

// Main menu
public class Labsheet6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== JAVA LAB SHEET 06 =====");
            System.out.println("1. Animal and Cat");
            System.out.println("2. Vehicle and Car");
            System.out.println("3. Shape and Rectangle");
            System.out.println("4. Employee and HRManager");
            System.out.println("5. BankAccount and SavingsAccount");
            System.out.println("6. Abstract Animal Sounds");
            System.out.println("7. Abstract Shape Area and Perimeter");
            System.out.println("8. Abstract Bank Accounts");
            System.out.println("9. Animal Eating and Sleeping");
            System.out.println("10. Employee Salary System");
            System.out.println("11. Average of Ten Numbers");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    q1();
                    break;
                case 2:
                    q2();
                    break;
                case 3:
                    q3();
                    break;
                case 4:
                    q4();
                    break;
                case 5:
                    q5();
                    break;
                case 6:
                    q6();
                    break;
                case 7:
                    q7();
                    break;
                case 8:
                    q8();
                    break;
                case 9:
                    q9();
                    break;
                case 10:
                    q10();
                    break;
                case 11:
                    q11();
                    break;
                case 0:
                    System.out.println("Program terminated.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void q1() {
        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.makeSound();
        cat.makeSound();
    }

    static void q2() {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        vehicle.drive();
        car.drive();
    }

    static void q3() {
        System.out.print("Enter rectangle length: ");
        double length = sc.nextDouble();

        System.out.print("Enter rectangle width: ");
        double width = sc.nextDouble();

        if (length < 0 || width < 0) {
            System.out.println("Dimensions cannot be negative.");
            return;
        }

        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area: " + rectangle.getArea());
    }

    static void q4() {
        HRManager hr = new HRManager();

        hr.work();
        System.out.println("Salary: " + hr.getSalary());

        System.out.print("Enter employee name to add: ");
        String name = sc.next();

        hr.addEmployee(name);
    }

    static void q5() {
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        if (balance < 0) {
            System.out.println("Invalid balance.");
            return;
        }

        SavingsAccount account = new SavingsAccount(balance);

        System.out.print("Enter deposit amount: ");
        account.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        account.withdraw(sc.nextDouble());

        account.displayBalance();
    }

    static void q6() {
        AbstractAnimal lion = new Lion();
        AbstractAnimal tiger = new Tiger();

        lion.sound();
        tiger.sound();
    }

    static void q7() {
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.print("Choose shape: ");
        int choice = sc.nextInt();

        AbstractShape shape;

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            if (radius < 0) {
                System.out.println("Invalid radius.");
                return;
            }

            shape = new Circle(radius);
        } else if (choice == 2) {
            System.out.print("Enter three sides: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            if (a <= 0 || b <= 0 || c <= 0
                    || a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("Invalid triangle.");
                return;
            }

            shape = new Triangle(a, b, c);
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
    }

    static void q8() {
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Choose account type: ");
        int choice = sc.nextInt();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        if (balance < 0) {
            System.out.println("Invalid balance.");
            return;
        }

        AbstractBankAccount account;

        if (choice == 1) {
            account = new AbstractSavingsAccount(balance);
        } else if (choice == 2) {
            account = new CurrentAccount(balance);
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        System.out.print("Enter deposit amount: ");
        account.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        account.withdraw(sc.nextDouble());

        account.displayBalance();
    }

    static void q9() {
        AnimalBehavior[] animals = {
            new BehaviorLion(),
            new BehaviorTiger(),
            new Deer()
        };

        for (AnimalBehavior animal : animals) {
            animal.eat();
            animal.sleep();
            System.out.println();
        }
    }

    static void q10() {
        AbstractEmployee manager =
                new Manager("Amit", 101, 60000, 15000);

        AbstractEmployee programmer =
                new Programmer("Riya", 102, 50000, 10000);

        manager.displayInfo();
        System.out.println();

        programmer.displayInfo();
    }

    static void q11() {
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }

        NumberAverage result = new NumberAverage(numbers);

        System.out.println("Average: " + result.average);
        System.out.println("Numbers above average: "
                + result.countAboveAverage(numbers));
    }
}