
import java.util.Scanner;

// Q1. Student Record
class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Q2. Medicine
class Medicine {
    String name;
    double price;
    int quantity;

    Medicine(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Medicine: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

// Q3. Pharmacy
class Pharmacy {
    static String pharmacyName = "HealthCare Pharmacy";
    static String location = "Roorkee";

    void display() {
        System.out.println("Pharmacy: " + pharmacyName);
        System.out.println("Location: " + location);
    }
}

// Q4. Pharmacy Inventory
class MedicineStock {
    String name;
    int quantity;

    MedicineStock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Medicine: " + name + ", Stock: " + quantity);
    }
}

class Inventory {
    MedicineStock[] stock;

    Inventory() {
        stock = new MedicineStock[] {
            new MedicineStock("Paracetamol", 100),
            new MedicineStock("Amoxicillin", 50),
            new MedicineStock("Cetirizine", 75)
        };
    }

    void displayInventory() {
        for (MedicineStock medicine : stock) {
            medicine.display();
        }
    }
}

// Q5. Patient Eligibility
class Patient {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void classify() {
        if (age >= 18)
            System.out.println(name + " is an adult patient.");
        else
            System.out.println(name + " is a minor patient.");
    }
}

// Q6. Encapsulated Medicine Product
class MedicineProduct {
    private String name;
    private double price;

    MedicineProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

// Q7. Bank Account
class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = Math.max(0, balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

// Q8. Patient Bill
class PatientBill {
    private double consultationFee;
    private double medicineFee;
    private double testFee;

    void setConsultationFee(double fee) {
        if (fee >= 0)
            consultationFee = fee;
    }

    void setMedicineFee(double fee) {
        if (fee >= 0)
            medicineFee = fee;
    }

    void setTestFee(double fee) {
        if (fee >= 0)
            testFee = fee;
    }

    double calculateTotal() {
        return consultationFee + medicineFee + testFee;
    }

    void displayBill() {
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Medicine Fee: " + medicineFee);
        System.out.println("Test Fee: " + testFee);
        System.out.println("Total Bill: " + calculateTotal());
    }
}

// Q9. Single Inheritance
class Employee {
    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Pharmacist extends Employee {
    String qualification;

    Pharmacist(String name, int employeeId, String qualification) {
        super(name, employeeId);
        this.qualification = qualification;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Qualification: " + qualification);
    }
}

// Q10. Hierarchical Inheritance
class Doctor extends Employee {
    String specialization;

    Doctor(String name, int employeeId, String specialization) {
        super(name, employeeId);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayEmployee();
        System.out.println("Specialization: " + specialization);
    }
}

// Q11. Multilevel Inheritance
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class HospitalEmployee extends Person {
    int employeeId;

    HospitalEmployee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    void displayHospitalEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends HospitalEmployee {
    String department;

    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    void displayManager() {
        displayHospitalEmployee();
        System.out.println("Department: " + department);
    }
}

// Q12. Multiple Inheritance Concept
class MultipleInheritanceConcept {
    void display() {
        System.out.println("Java does not support extending multiple classes.");
        System.out.println("A class cannot extend two classes simultaneously.");
    }
}

// Q13. Hybrid Inheritance Concept
class HybridInheritanceConcept {
    void display() {
        System.out.println("Hybrid inheritance combines multiple inheritance structures.");
        System.out.println("Java classes cannot extend multiple classes directly.");
    }
}

// Q14. Shape Hierarchy
class Shape {
    void area() {
        System.out.println("Calculating shape area.");
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

// Q15. Final Hospital Staff System
class HospitalSystem {
    void run() {
        System.out.println("===== Hospital Staff System =====");

        Doctor doctor = new Doctor("Amit Sharma", 101, "Cardiology");
        doctor.displayDoctor();

        System.out.println();

        Pharmacist pharmacist =
                new Pharmacist("Ravi Kumar", 102, "B.Pharm");
        pharmacist.displayPharmacist();

        System.out.println();

        Manager manager =
                new Manager("Neha Verma", 103, "Administration");
        manager.displayManager();
    }
}

public class Labsheet4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== JAVA LAB SHEET 04 =====");
            System.out.println("1. Student Record");
            System.out.println("2. Medicine Constructor");
            System.out.println("3. Pharmacy Static Variables");
            System.out.println("4. Pharmacy Inventory");
            System.out.println("5. Patient Eligibility");
            System.out.println("6. Encapsulated Medicine Product");
            System.out.println("7. Bank Account");
            System.out.println("8. Patient Bill");
            System.out.println("9. Employee to Pharmacist");
            System.out.println("10. Hierarchical Hospital Staff");
            System.out.println("11. Multilevel Hospital Staff");
            System.out.println("12. Multiple Inheritance Concept");
            System.out.println("13. Hybrid Inheritance Concept");
            System.out.println("14. Shape Hierarchy");
            System.out.println("15. Final Hospital Staff System");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

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
                case 12:
                    q12();
                    break;
                case 13:
                    q13();
                    break;
                case 14:
                    q14();
                    break;
                case 15:
                    q15();
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
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        Student student = new Student(name, roll);
        student.display();
    }

    static void q2() {
        System.out.print("Enter medicine name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        Medicine medicine = new Medicine(name, price, quantity);
        medicine.display();
    }

    static void q3() {
        Pharmacy first = new Pharmacy();
        Pharmacy second = new Pharmacy();

        first.display();

        Pharmacy.pharmacyName = "City Medical Store";
        Pharmacy.location = "Haridwar";

        System.out.println("\nAfter changing static values:");
        second.display();
    }

    static void q4() {
        Inventory inventory = new Inventory();
        inventory.displayInventory();
    }

    static void q5() {
        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        System.out.print("Enter patient age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
            return;
        }

        Patient patient = new Patient(name, age);
        patient.classify();
    }

    static void q6() {
        System.out.print("Enter medicine product name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        if (price < 0) {
            System.out.println("Invalid price.");
            return;
        }

        MedicineProduct product = new MedicineProduct(name, price);
        product.display();
    }

    static void q7() {
        System.out.print("Enter initial bank balance: ");
        double balance = sc.nextDouble();

        if (balance < 0) {
            System.out.println("Invalid balance.");
            return;
        }

        BankAccount account = new BankAccount(balance);
        account.displayBalance();

        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        account.deposit(amount);
        account.displayBalance();
    }

    static void q8() {
        PatientBill bill = new PatientBill();

        System.out.print("Enter consultation fee: ");
        double consultation = sc.nextDouble();

        System.out.print("Enter medicine fee: ");
        double medicine = sc.nextDouble();

        System.out.print("Enter test fee: ");
        double test = sc.nextDouble();

        if (consultation < 0 || medicine < 0 || test < 0) {
            System.out.println("Fees cannot be negative.");
            return;
        }

        bill.setConsultationFee(consultation);
        bill.setMedicineFee(medicine);
        bill.setTestFee(test);

        bill.displayBill();
    }

    static void q9() {
        System.out.print("Enter pharmacist name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter qualification: ");
        String qualification = sc.nextLine();

        Pharmacist pharmacist = new Pharmacist(name, id, qualification);
        pharmacist.displayPharmacist();
    }

    static void q10() {
        System.out.println("Doctor details:");
        Doctor doctor = new Doctor("Amit Sharma", 101, "Cardiology");
        doctor.displayDoctor();

        System.out.println("\nPharmacist details:");
        Pharmacist pharmacist =
                new Pharmacist("Ravi Kumar", 102, "B.Pharm");
        pharmacist.displayPharmacist();
    }

    static void q11() {
        Manager manager =
                new Manager("Neha Verma", 103, "Administration");
        manager.displayManager();
    }

    static void q12() {
        MultipleInheritanceConcept concept =
                new MultipleInheritanceConcept();
        concept.display();
    }

    static void q13() {
        HybridInheritanceConcept concept =
                new HybridInheritanceConcept();
        concept.display();
    }

    static void q14() {
        System.out.print("Enter rectangle length and width: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        System.out.print("Enter circle radius: ");
        double radius = sc.nextDouble();

        if (length < 0 || width < 0 || radius < 0) {
            System.out.println("Dimensions cannot be negative.");
            return;
        }

        Shape rectangle = new Rectangle(length, width);
        Shape circle = new Circle(radius);

        rectangle.area();
        circle.area();
    }

    static void q15() {
        HospitalSystem system = new HospitalSystem();
        system.run();
    }
}
