
import java.util.Scanner;

public class Labsheet3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== JAVA LAB SHEET 03 =====");
            System.out.println("1. Input and Display 5 Integers");
            System.out.println("2. Display 10 Integers in Reverse");
            System.out.println("3. Sum of Array Elements");
            System.out.println("4. Maximum Element in Array");
            System.out.println("5. Count Even and Odd Numbers");
            System.out.println("6. Copy One Array to Another");
            System.out.println("7. Input and Display 3x3 Matrix");
            System.out.println("8. Sum of Matrix Elements");
            System.out.println("9. Sum of Each Row");
            System.out.println("10. Sum of Each Column");
            System.out.println("11. Transpose Matrix");
            System.out.println("12. Add Two Matrices");
            System.out.println("13. Multiply Two 3x3 Matrices");
            System.out.println("14. Input and Display 2x2x2 Array");
            System.out.println("15. Sum of 3D Array Elements");
            System.out.println("16. Count Positive and Negative Numbers");
            System.out.println("17. Maximum Element in 3D Array");
            System.out.println("18. Search Element in 3D Array");
            System.out.println("19. Create and Display Jagged Array");
            System.out.println("20. Student Marks Using Jagged Array");
            System.out.println("21. Rotate Array Left by One");
            System.out.println("22. Count Frequency of Each Element");
            System.out.println("23. Second Largest Element");
            System.out.println("24. Remove Duplicate Elements");
            System.out.println("25. Sum of Matrix Diagonals");
            System.out.println("26. Upper and Lower Triangular Matrices");
            System.out.println("27. Boundary Elements of Matrix");
            System.out.println("28. Search in 2D Array");
            System.out.println("29. Sort Each Row of Jagged Array");
            System.out.println("30. Check Sparse Matrix");
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

    static int[] inputArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void displayArray(int[] arr) {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }

    static int[][] inputMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row)
                System.out.print(value + "\t");
            System.out.println();
        }
    }

    // Q1
    static void q1() {
        int[] arr = inputArray(5);
        System.out.println("Array elements:");
        displayArray(arr);
    }

    // Q2
    static void q2() {
        int[] arr = inputArray(10);
        System.out.println("Reverse order:");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Q3
    static void q3() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int[] arr = inputArray(n);
        long sum = 0;
        for (int value : arr)
            sum += value;

        System.out.println("Sum: " + sum);
    }

    // Q4
    static void q4() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int[] arr = inputArray(n);
        int max = arr[0];

        for (int value : arr)
            if (value > max)
                max = value;

        System.out.println("Maximum: " + max);
    }

    // Q5
    static void q5() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int[] arr = inputArray(n);
        int even = 0, odd = 0;

        for (int value : arr) {
            if (value % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

    // Q6
    static void q6() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int[] original = inputArray(n);
        int[] copy = new int[n];

        for (int i = 0; i < n; i++)
            copy[i] = original[i];

        System.out.println("Original array:");
        displayArray(original);
        System.out.println("Copied array:");
        displayArray(copy);
    }

    // Q7
    static void q7() {
        int[][] matrix = inputMatrix(3, 3);
        displayMatrix(matrix);
    }

    // Q8
    static void q8() {
        int[][] matrix = inputMatrix(3, 3);
        long sum = 0;

        for (int[] row : matrix)
            for (int value : row)
                sum += value;

        System.out.println("Matrix sum: " + sum);
    }

    // Q9
    static void q9() {
        int[][] matrix = inputMatrix(3, 3);

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++)
                sum += matrix[i][j];

            System.out.println("Row " + (i + 1) + " sum: " + sum);
        }
    }

    // Q10
    static void q10() {
        int[][] matrix = inputMatrix(3, 3);

        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++)
                sum += matrix[i][j];

            System.out.println("Column " + (j + 1) + " sum: " + sum);
        }
    }

    // Q11
    static void q11() {
        int[][] matrix = inputMatrix(3, 3);
        int[][] transpose = new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                transpose[j][i] = matrix[i][j];

        System.out.println("Transpose:");
        displayMatrix(transpose);
    }

    // Q12
    static void q12() {
        System.out.println("Enter first matrix:");
        int[][] a = inputMatrix(3, 3);

        System.out.println("Enter second matrix:");
        int[][] b = inputMatrix(3, 3);

        int[][] sum = new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                sum[i][j] = a[i][j] + b[i][j];

        System.out.println("Sum matrix:");
        displayMatrix(sum);
    }

    // Q13
    static void q13() {
        System.out.println("Enter first matrix:");
        int[][] a = inputMatrix(3, 3);

        System.out.println("Enter second matrix:");
        int[][] b = inputMatrix(3, 3);

        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++)
                    result[i][j] += a[i][k] * b[k][j];
            }
        }

        System.out.println("Product matrix:");
        displayMatrix(result);
    }

    static int[][][] input3D() {
        int[][][] arr = new int[2][2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++) {
                    System.out.print("Enter [" + i + "][" + j + "][" + k + "]: ");
                    arr[i][j][k] = sc.nextInt();
                }

        return arr;
    }

    static void display3D(int[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < arr[i].length; j++) {
                for (int value : arr[i][j])
                    System.out.print(value + " ");
                System.out.println();
            }
        }
    }

    // Q14
    static void q14() {
        int[][][] arr = input3D();
        display3D(arr);
    }

    // Q15
    static void q15() {
        int[][][] arr = input3D();
        long sum = 0;

        for (int[][] layer : arr)
            for (int[] row : layer)
                for (int value : row)
                    sum += value;

        System.out.println("Sum: " + sum);
    }

    // Q16
    static void q16() {
        int[][][] arr = input3D();
        int positive = 0, negative = 0, zero = 0;

        for (int[][] layer : arr)
            for (int[] row : layer)
                for (int value : row) {
                    if (value > 0)
                        positive++;
                    else if (value < 0)
                        negative++;
                    else
                        zero++;
                }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }

    // Q17
    static void q17() {
        int[][][] arr = input3D();
        int max = arr[0][0][0];

        for (int[][] layer : arr)
            for (int[] row : layer)
                for (int value : row)
                    if (value > max)
                        max = value;

        System.out.println("Maximum: " + max);
    }

    // Q18
    static void q18() {
        int[][][] arr = input3D();

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    if (arr[i][j][k] == target) {
                        System.out.println("Found at [" + i + "][" + j + "][" + k + "]");
                        found = true;
                    }

        if (!found)
            System.out.println("Element not found");
    }

    // Q19
    static void q19() {
        int[][] jagged = new int[3][];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter length of row " + (i + 1) + ": ");
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Invalid length");
                return;
            }

            jagged[i] = new int[n];
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element: ");
                jagged[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged array:");
        for (int[] row : jagged)
            displayArray(row);
    }

    // Q20
    static void q20() {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of students");
            return;
        }

        int[][] marks = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("Number of subjects for student " + (i + 1) + ": ");
            int subjects = sc.nextInt();

            if (subjects < 0) {
                System.out.println("Invalid number of subjects");
                return;
            }

            marks[i] = new int[subjects];

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter marks: ");
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " marks:");
            displayArray(marks[i]);
        }
    }

    // Q21
    static void q21() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int[] arr = inputArray(n);
        int first = arr[0];

        for (int i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];

        arr[n - 1] = first;

        System.out.println("Left rotated array:");
        displayArray(arr);
    }

    // Q22
    static void q22() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int[] arr = inputArray(n);
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " time(s)");
        }
    }

    // Q23
    static void q23() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("At least two elements are required");
            return;
        }

        int[] arr = inputArray(n);
        int largest = arr[0];
        int second = 0;
        boolean hasSecond = false;

        for (int value : arr) {
            if (value > largest) {
                second = largest;
                largest = value;
                hasSecond = true;
            } else if (value < largest && (!hasSecond || value > second)) {
                second = value;
                hasSecond = true;
            }
        }

        if (hasSecond)
            System.out.println("Second largest distinct element: " + second);
        else
            System.out.println("No distinct second largest element");
    }

    // Q24
    static void q24() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int[] arr = inputArray(n);
        int[] unique = new int[n];
        int count = 0;

        for (int value : arr) {
            boolean found = false;

            for (int i = 0; i < count; i++)
                if (unique[i] == value) {
                    found = true;
                    break;
                }

            if (!found)
                unique[count++] = value;
        }

        System.out.println("Array without duplicates:");
        for (int i = 0; i < count; i++)
            System.out.print(unique[i] + " ");

        System.out.println();
    }

    // Q25
    static void q25() {
        System.out.print("Enter square matrix size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int[][] matrix = inputMatrix(n, n);
        long mainDiagonal = 0;
        long secondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonal += matrix[i][i];
            secondaryDiagonal += matrix[i][n - 1 - i];
        }

        System.out.println("Main diagonal sum: " + mainDiagonal);
        System.out.println("Secondary diagonal sum: " + secondaryDiagonal);
    }

    // Q26
    static void q26() {
        System.out.print("Enter square matrix size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int[][] matrix = inputMatrix(n, n);

        System.out.println("Upper triangular matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((i <= j ? matrix[i][j] : 0) + "\t");
            System.out.println();
        }

        System.out.println("Lower triangular matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((i >= j ? matrix[i][j] : 0) + "\t");
            System.out.println();
        }
    }

    // Q27
    static void q27() {
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Invalid dimensions");
            return;
        }

        int[][] matrix = inputMatrix(rows, cols);

        System.out.println("Boundary elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1)
                    System.out.print(matrix[i][j] + "\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    // Q28
    static void q28() {
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Invalid dimensions");
            return;
        }

        int[][] matrix = inputMatrix(rows, cols);

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (matrix[i][j] == target) {
                    System.out.println("Found at row " + (i + 1)
                            + ", column " + (j + 1));
                    found = true;
                }

        if (!found)
            System.out.println("Element not found");
    }

    // Q29
    static void q29() {
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of rows");
            return;
        }

        int[][] jagged = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter length of row " + (i + 1) + ": ");
            int size = sc.nextInt();

            if (size < 0) {
                System.out.println("Invalid row length");
                return;
            }

            jagged[i] = inputArray(size);
        }

        for (int[] row : jagged)
            java.util.Arrays.sort(row);

        System.out.println("Sorted jagged array:");
        for (int[] row : jagged)
            displayArray(row);
    }

    // Q30
    static void q30() {
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Invalid dimensions");
            return;
        }

        int[][] matrix = inputMatrix(rows, cols);
        int zeros = 0;
        int nonZeros = 0;

        for (int[] row : matrix)
            for (int value : row) {
                if (value == 0)
                    zeros++;
                else
                    nonZeros++;
            }

        System.out.println("Zeros: " + zeros);
        System.out.println("Non-zero elements: " + nonZeros);

        if (zeros > nonZeros)
            System.out.println("Sparse matrix");
        else
            System.out.println("Not a sparse matrix");
    }
}
