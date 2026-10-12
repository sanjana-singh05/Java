
    import java.util.Scanner;

// Q1. Student Record
class Student {
    String name;
    int rollNo;
    double marks;

    Student() {
        this.name = "Rudra Verma";
        this.rollNo = 101;
        this.marks = 85.5;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

// Q2. Medicine Information
class Medicine {
    String medicineName;
    String batchNo;
    double price;
    int ageLimit;

    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
        this.batchNo = "N/A";
        this.price = 0;
    }

    void displayMedicine() {
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Batch Number: " + batchNo);
        System.out.println("Price: " + price);
    }

    String checkEligibility(int patientAge) {
        String result;
        if (patientAge >= ageLimit)
            result = "Eligible";
        else
            result = "Not Eligible";
        return result;
    }
}

// Q3. Pharmacy Registration
class Pharmacy {
    String pharmacyName;
    String location;
    static int pharmacyCount = 0;

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }

    void displayPharmacy() {
        System.out.println("Pharmacy: " + pharmacyName);
        System.out.println("Location: " + location);
    }

    static void displayPharmacyCount() {
        System.out.println("Total Pharmacies: " + pharmacyCount);
    }
}

// Q4. Patient Records
class Patient {
    private String patientName;
    private int age;
    private double weight;

    int patientId;
    String name;
    int patientAge;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        this.age = age;
        this.weight = weight;
    }

    void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
        else
            System.out.println("Invalid age");
    }

    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
        else
            System.out.println("Invalid weight");
    }

    void displayPatientInfo() {
        System.out.println("Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}

class PatientManager {
    void displayAllPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            patients[i].displayPatient();
            System.out.println();
        }
    }
}

// Q5. Medicine Eligibility is implemented in Medicine.checkEligibility()

// Q6. Encapsulated Medicine Product
class MedicineProduct {
    private String medicineName;
    private String batchNo;
    private double price;

    MedicineProduct(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public double getPrice() {
        return price;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
        else
            System.out.println("Invalid price");
    }

    void displayProduct() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Batch: " + batchNo);
        System.out.println("Price: " + price);
    }
}

// Q8. Bank Account
class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNo, String accountHolderName,
                double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = Math.max(0, balance);
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
        boolean success;

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            success = true;
        } else {
            success = false;
        }

        if (success)
            System.out.println("Withdrawal successful");
        else
            System.out.println("Withdrawal failed");
    }

    double getBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

// Q9. Public Access Specifier
class Hospital {
    // Public members can be accessed from other classes.
    public String hospitalName;
    public String hospitalCode;

    public Hospital() {
        hospitalName = "City Hospital";
        hospitalCode = "H101";
    }

    public void displayHospital() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Code: " + hospitalCode);
    }
}

// Q10. Private Access Specifier
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    static int employeeCount = 0;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = Math.max(0, salary);
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
        else
            System.out.println("Invalid salary");
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    // employee.salary is not allowed outside this class.
}

// Q11. Default Access Specifier
class PharmacyDefault {
    // Default/package-private members have no access keyword.
    String medicineName;
    double price;

    PharmacyDefault() {
        medicineName = "Paracetamol";
        price = 25.0;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Price: " + price);
    }
}

// Q12. Protected Access Specifier
class HospitalStaff {
    protected int staffId;
    protected String staffName;

    protected HospitalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }

    protected void displayStaff() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Name: " + staffName);
    }
}

class Pharmacist extends HospitalStaff {
    private String licenseNo;

    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    void displayProtectedPharmacist() {
        displayStaff();
        System.out.println("License Number: " + licenseNo);
    }
}

// Q13. Single Inheritance
class EmployeeBase {
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    EmployeeBase(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    void displayEmployeeBase() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

class PharmacistEmployee extends EmployeeBase {
    private String licenseNo;

    PharmacistEmployee(int employeeId, String employeeName,
                       double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployeeBase();
        System.out.println("License Number: " + licenseNo);
    }
}

// Q14. Hierarchical Inheritance
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Doctor extends Person {
    private String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayPerson();
        System.out.println("Specialization: " + specialization);
    }
}

class Nurse extends Person {
    private String ward;

    Nurse(String name, int age, String ward) {
        super(name, age);
        this.ward = ward;
    }

    void displayNurse() {
        displayPerson();
        System.out.println("Ward: " + ward);
    }
}

// Q15. Multilevel Inheritance
class EmployeeLevel extends Person {
    private int employeeId;

    EmployeeLevel(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    void displayEmployeeLevel() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends EmployeeLevel {
    private int teamSize;

    Manager(String name, int age, int employeeId, int teamSize) {
        super(name, age, employeeId);
        this.teamSize = teamSize;
    }

    void displayManager() {
        displayEmployeeLevel();
        System.out.println("Team Size: " + teamSize);
    }
}

// Q16. Protected Parent and Private Child Data
class MedicalStaff {
    protected int staffId;
    protected String staffName;

    MedicalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
}

class MedicalDoctor extends MedicalStaff {
    private String specialization;

    MedicalDoctor(int staffId, String staffName, String specialization) {
        super(staffId, staffName);
        this.specialization = specialization;
    }

    void displayDoctor() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Specialization: " + specialization);
    }
}

class MedicalPharmacist extends MedicalStaff {
    private String licenseNo;

    MedicalPharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Name: " + staffName);
        System.out.println("License Number: " + licenseNo);
    }
}

// Q17. Multiple and Hybrid Inheritance Concept
class InheritanceConcept {
    void displayConcept() {
        /*
         * Multiple inheritance means inheriting from multiple classes.
         * Java does not allow a class to extend two classes because
         * it can create ambiguity when both parents define the same method.
         *
         * Invalid Java syntax:
         * class C extends A, B { }
         *
         * Hybrid inheritance combines two or more inheritance forms.
         * Interfaces are commonly used for multiple/hybrid inheritance
         * of type and behavior in Java, but no interface is implemented here.
         */
        System.out.println("Java supports single, multilevel and hierarchical inheritance.");
        System.out.println("A class cannot extend two classes simultaneously.");
        System.out.println("Interfaces can support multiple inheritance of type and behavior.");
        System.out.println("Hybrid inheritance combines multiple inheritance structures.");
    }
}

// Q18. Shape Hierarchy
class Shape {
    protected String name;

    Shape(String name) {
        this.name = name;
    }

    void displayShapeName() {
        System.out.println("Shape: " + name);
    }
}

class Circle extends Shape {
    private double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class ShapeManager {
    void displayAreas(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].displayShapeName();

            if (shapes[i] instanceof Circle) {
                Circle circle = (Circle) shapes[i];
                System.out.println("Area: " + circle.calculateArea());
            } else if (shapes[i] instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shapes[i];
                System.out.println("Area: " + rectangle.calculateArea());
            }

            System.out.println();
        }
    }
}

// Q19. Integrated Hospital Staff Management
class HospitalPerson {
    protected String name;
    protected int age;

    HospitalPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class HospitalEmployee extends HospitalPerson {
    private int employeeId;
    private double salary;
    static int employeeCount = 0;

    HospitalEmployee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = Math.max(0, salary);
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    String getRole() {
        return "Employee";
    }
}

class HospitalDoctor extends HospitalEmployee {
    private String specialization;

    HospitalDoctor(String name, int age, int employeeId,
                   double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    @Override
    String getRole() {
        return "Doctor";
    }

    @Override
    void displayEmployee() {
        super.displayEmployee();
        System.out.println("Specialization: " + specialization);
    }
}

class HospitalPharmacist extends HospitalEmployee {
    private String licenseNo;

    HospitalPharmacist(String name, int age, int employeeId,
                       double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    @Override
    String getRole() {
        return "Pharmacist";
    }

    @Override
    void displayEmployee() {
        super.displayEmployee();
        System.out.println("License Number: " + licenseNo);
    }
}

class HospitalStaffManager {
    void displayStaff(HospitalEmployee[] employees) {
        int count = 0;

        for (HospitalEmployee employee : employees) {
            if (employee != null) {
                System.out.println("Role: " + employee.getRole());
                employee.displayEmployee();
                count++;
                System.out.println();
            }
        }

        System.out.println("Processed staff: " + count);
        System.out.println("Total employee objects created: "
                + HospitalEmployee.employeeCount);
    }
}

// Q20. Pharmacy Employee Management System
class PharmacyEmployee {
    private int employeeId;
    private String employeeName;
    private double salary;
    static int employeeCount = 0;

    // Protected member for inherited classes.
    protected String department = "Pharmacy";

    PharmacyEmployee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        setSalary(salary);
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
        else
            System.out.println("Negative salary rejected");
    }

    // Default/package-private method.
    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    String getRole() {
        return "Employee";
    }
}

class PharmacyWorker extends PharmacyEmployee {
    private String licenseNo;

    PharmacyWorker(int employeeId, String employeeName,
                   double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    @Override
    String getRole() {
        return "Pharmacist";
    }

    @Override
    void displayEmployee() {
        super.displayEmployee();
        System.out.println("License Number: " + licenseNo);
    }
}

class StoreManager extends PharmacyEmployee {
    private int storeSection;

    StoreManager(int employeeId, String employeeName,
                 double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }

    @Override
    String getRole() {
        return "Store Manager";
    }

    @Override
    void displayEmployee() {
        super.displayEmployee();
        System.out.println("Store Section: " + storeSection);
    }
}

class PharmacyEmployeeManager {
    void processEmployees(PharmacyEmployee[] employees) {
        int totalEmployees = 0;
        double totalSalary = 0;

        for (int i = 0; i < employees.length; i++) {
            PharmacyEmployee employee = employees[i];

            if (employee != null && employee.getSalary() >= 0) {
                System.out.println("Role: " + employee.getRole());
                employee.displayEmployee();

                totalSalary += employee.getSalary();
                totalEmployees++;

                System.out.println();
            }
        }

        System.out.println("Employees processed: " + totalEmployees);
        System.out.println("Total salary: " + totalSalary);
        System.out.println("Total employee objects created: "
                + PharmacyEmployee.employeeCount);
    }
}

// Main menu
public class Labsheet5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== JAVA LAB SHEET 05 =====");
            System.out.println("1. Student Record");
            System.out.println("2. Medicine Information");
            System.out.println("3. Pharmacy Registration");
            System.out.println("4. Patient Records");
            System.out.println("5. Medicine Eligibility");
            System.out.println("6. Encapsulated Medicine Product");
            System.out.println("7. Encapsulated Patient Validation");
            System.out.println("8. Bank Account");
            System.out.println("9. Public Access Specifier");
            System.out.println("10. Private Access Specifier");
            System.out.println("11. Default Access Specifier");
            System.out.println("12. Protected Access Specifier");
            System.out.println("13. Single Inheritance");
            System.out.println("14. Hierarchical Inheritance");
            System.out.println("15. Multilevel Inheritance");
            System.out.println("16. Protected Parent and Private Child");
            System.out.println("17. Multiple and Hybrid Inheritance Concept");
            System.out.println("18. Shape Hierarchy");
            System.out.println("19. Hospital Staff Management");
            System.out.println("20. Pharmacy Employee Management");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

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
                case 16:
                    q16();
                    break;
                case 17:
                    q17();
                    break;
                case 18:
                    q18();
                    break;
                case 19:
                    q19();
                    break;
                case 20:
                    q20();
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
        Student student = new Student();
        student.displayDetails();
    }

    static void q2() {
        Medicine m1 = new Medicine("Paracetamol", "B101", 25.5);
        Medicine m2 = new Medicine("Cetirizine", "B102", 40.0);
        m1.displayMedicine();
        System.out.println();
        m2.displayMedicine();
    }

    static void q3() {
        Pharmacy p1 = new Pharmacy("City Pharmacy", "Roorkee");
        Pharmacy p2 = new Pharmacy("Health Pharmacy", "Haridwar");
        Pharmacy p3 = new Pharmacy("Care Pharmacy", "Dehradun");

        p1.displayPharmacy();
        p2.displayPharmacy();
        p3.displayPharmacy();
        Pharmacy.displayPharmacyCount();
    }

    static void q4() {
        Patient[] patients = {
            new Patient(101, "Aman", 25),
            new Patient(102, "Riya", 30),
            new Patient(103, "Karan", 21),
            new Patient(104, "Neha", 28),
            new Patient(105, "Rahul", 35)
        };

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }

    static void q5() {
        Medicine medicine = new Medicine("Adult Medicine", 18);
        System.out.println("Age 16: " + medicine.checkEligibility(16));
        System.out.println("Age 25: " + medicine.checkEligibility(25));
    }

    static void q6() {
        MedicineProduct product =
                new MedicineProduct("Paracetamol", "B1001", 30.0);

        product.setPrice(35.0);
        product.setBatchNo("B1002");

        System.out.println("Medicine name: " + product.getMedicineName());
        System.out.println("Updated batch: " + product.getBatchNo());
        product.displayProduct();
    }

    static void q7() {
        Patient patient = new Patient("Aman", 25, 65.5);

        patient.setAge(30);
        patient.setWeight(70.0);

        System.out.println("After valid updates:");
        patient.displayPatientInfo();

        patient.setAge(-5);
        patient.setWeight(-10);

        System.out.println("After invalid updates:");
        patient.displayPatientInfo();
    }

    static void q8() {
        BankAccount account =
                new BankAccount("ACC101", "Rudra Verma", 5000);

        account.deposit(1500);
        account.withdraw(1000);
        account.withdraw(10000);
        account.displayAccount();

        System.out.println("Current balance: " + account.getBalance());
    }

    static void q9() {
        Hospital hospital = new Hospital();

        hospital.hospitalName = "COER Hospital";
        hospital.hospitalCode = "COER101";

        System.out.println(hospital.hospitalName);
        System.out.println(hospital.hospitalCode);
        hospital.displayHospital();
    }

    static void q10() {
        Employee employee = new Employee(101, "Rudra", 35000);

        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());
        employee.displayEmployee();

        // employee.salary = 50000; // Not allowed: salary is private.
    }

    static void q11() {
        PharmacyDefault pharmacy = new PharmacyDefault();

        pharmacy.medicineName = "Paracetamol";
        pharmacy.price = 30.0;

        pharmacy.displayMedicine();
        System.out.println("Direct access: " + pharmacy.medicineName);
        System.out.println("Direct access: " + pharmacy.price);
    }

    static void q12() {
        Pharmacist pharmacist =
                new Pharmacist(101, "Aman", "LIC2026");

        pharmacist.displayProtectedPharmacist();
    }

    static void q13() {
        PharmacistEmployee pharmacist =
                new PharmacistEmployee(201, "Riya", 40000, "PH12345");

        pharmacist.displayPharmacist();
    }

    static void q14() {
        Doctor doctor = new Doctor("Amit", 40, "Cardiology");
        Nurse nurse = new Nurse("Neha", 28, "Emergency");

        System.out.println("Doctor:");
        doctor.displayDoctor();

        System.out.println("\nNurse:");
        nurse.displayNurse();
    }

    static void q15() {
        Manager manager = new Manager("Rahul", 40, 501, 12);
        manager.displayManager();
    }

    static void q16() {
        MedicalDoctor doctor =
                new MedicalDoctor(101, "Amit", "Cardiology");

        MedicalPharmacist pharmacist =
                new MedicalPharmacist(102, "Riya", "LIC789");

        doctor.displayDoctor();

        System.out.println();

        pharmacist.displayPharmacist();
    }

    static void q17() {
        InheritanceConcept concept = new InheritanceConcept();
        concept.displayConcept();
    }

    static void q18() {
        Shape[] shapes = {
            new Circle("Circle", 5),
            new Rectangle("Rectangle", 10, 4)
        };

        ShapeManager manager = new ShapeManager();
        manager.displayAreas(shapes);
    }

    static void q19() {
        HospitalEmployee[] staff = {
            new HospitalDoctor("Amit", 40, 101, 80000, "Cardiology"),
            new HospitalPharmacist("Riya", 28, 102, 45000, "LIC456")
        };

        HospitalStaffManager manager = new HospitalStaffManager();
        manager.displayStaff(staff);
    }

    static void q20() {
        PharmacyEmployee[] employees = {
            new PharmacyWorker(201, "Aman", 35000, "PH123"),
            new StoreManager(202, "Neha", 50000, 3)
        };

        PharmacyEmployeeManager manager =
                new PharmacyEmployeeManager();

        manager.processEmployees(employees);
    }
}

