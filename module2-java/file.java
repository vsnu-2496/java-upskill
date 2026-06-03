// 1. Hello World Program
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// 2. Simple Calculator
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        char op = sc.next().charAt(0);

        switch(op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}

// 3. Even or Odd Checker
import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

// 4. Leap Year Checker
import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}

// 5. Multiplication Table
import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

// 6. Data Type Demonstration
class DataTypes {
    public static void main(String[] args) {
        int a = 10;
        float b = 10.5f;
        double c = 20.55;
        char d = 'A';
        boolean e = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}

// 7. Type Casting Example
class TypeCasting {
    public static void main(String[] args) {
        double d = 12.75;
        int i = (int)d;

        int x = 10;
        double y = (double)x;

        System.out.println("Double to Int: " + i);
        System.out.println("Int to Double: " + y);
    }
}

// 8. Operator Precedence
class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("Result = " + result);
    }
}

// 9. Grade Calculator
import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks >= 90)
            System.out.println("Grade A");
        else if(marks >= 80)
            System.out.println("Grade B");
        else if(marks >= 70)
            System.out.println("Grade C");
        else if(marks >= 60)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");
    }
}

// 10. Number Guessing Game
import java.util.Scanner;

class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int)(Math.random() * 100) + 1;
        int guess;

        do {
            guess = sc.nextInt();

            if(guess > random)
                System.out.println("Too High");
            else if(guess < random)
                System.out.println("Too Low");
            else
                System.out.println("Correct Guess");

        } while(guess != random);
    }
}

// 11. Factorial Calculator
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}

// 12. Method Overloading
class Overloading {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10.5, 20.5));
        System.out.println(add(10, 20, 30));
    }
}

// 13. Recursive Fibonacci
import java.util.Scanner;

class Fibonacci {

    static int fibonacci(int n) {
        if(n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }
}

// 14. Array Sum and Average
import java.util.Scanner;

class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int sum = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}

// 15. String Reversal
import java.util.Scanner;

class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println(rev);
    }
}

// 16. Palindrome Checker
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String rev = new StringBuilder(str).reverse().toString();

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

// 17. Class and Object Creation
class Car {
    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println(make + " " + model + " " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.make = "Toyota";
        c1.model = "Camry";
        c1.year = 2024;

        c1.displayDetails();
    }
}

// 18. Inheritance Example
class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        a.makeSound();
        d.makeSound();
    }
}

// 19. Interface Implementation
interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing Piano");
    }

    public static void main(String[] args) {
        Guitar g = new Guitar();
        Piano p = new Piano();

        g.play();
        p.play();
    }
}

// 20. Try-Catch Example
import java.util.Scanner;

class TryCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

// 11. Factorial Calculator
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}

// 12. Method Overloading
class Overloading {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10.5, 20.5));
        System.out.println(add(10, 20, 30));
    }
}

// 13. Recursive Fibonacci
import java.util.Scanner;

class Fibonacci {

    static int fibonacci(int n) {
        if(n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }
}

// 14. Array Sum and Average
import java.util.Scanner;

class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int sum = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}

// 15. String Reversal
import java.util.Scanner;

class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println(rev);
    }
}

// 16. Palindrome Checker
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String rev = new StringBuilder(str).reverse().toString();

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

// 17. Class and Object Creation
class Car {
    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println(make + " " + model + " " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.make = "Toyota";
        c1.model = "Camry";
        c1.year = 2024;

        c1.displayDetails();
    }
}

// 18. Inheritance Example
class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        a.makeSound();
        d.makeSound();
    }
}

// 19. Interface Implementation
interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing Piano");
    }

    public static void main(String[] args) {
        Guitar g = new Guitar();
        Piano p = new Piano();

        g.play();
        p.play();
    }
}

// 20. Try-Catch Example
import java.util.Scanner;

class TryCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

// 31. Basic JDBC Connection
import java.sql.*;

class JDBCConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT * FROM students");

            while(rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name"));
            }

            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

// 32. Insert and Update Operations in JDBC
import java.sql.*;

class StudentDAO {

    Connection con;

    StudentDAO() throws Exception {
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "password");
    }

    void insertStudent(int id, String name)
            throws Exception {

        PreparedStatement ps =
                con.prepareStatement(
                        "INSERT INTO students VALUES(?,?)");

        ps.setInt(1,id);
        ps.setString(2,name);

        ps.executeUpdate();
    }

    void updateStudent(int id, String name)
            throws Exception {

        PreparedStatement ps =
                con.prepareStatement(
                        "UPDATE students SET name=? WHERE id=?");

        ps.setString(1,name);
        ps.setInt(2,id);

        ps.executeUpdate();
    }
}

// 33. Transaction Handling in JDBC
import java.sql.*;

class TransactionDemo {

    static void transfer(Connection con,
                         int from,
                         int to,
                         double amount)
            throws Exception {

        try {
            con.setAutoCommit(false);

            PreparedStatement debit =
                    con.prepareStatement(
                            "UPDATE accounts SET balance=balance-? WHERE id=?");

            debit.setDouble(1,amount);
            debit.setInt(2,from);
            debit.executeUpdate();

            PreparedStatement credit =
                    con.prepareStatement(
                            "UPDATE accounts SET balance=balance+? WHERE id=?");

            credit.setDouble(1,amount);
            credit.setInt(2,to);
            credit.executeUpdate();

            con.commit();

        } catch(Exception e) {
            con.rollback();
        }
    }
}

// 34. Create and Use Java Modules

// module-info.java (com.utils)
module com.utils {
    exports com.utils;
}

// Utility.java
package com.utils;

public class Utility {
    public static void greet() {
        System.out.println("Hello");
    }
}

// module-info.java (com.greetings)
module com.greetings {
    requires com.utils;
}

// Main.java
package com.greetings;

import com.utils.Utility;

public class Main {
    public static void main(String[] args) {
        Utility.greet();
    }
}

// 35. TCP Client-Server Chat

// Server
import java.net.*;
import java.io.*;

class Server {
    public static void main(String[] args)
            throws Exception {

        ServerSocket ss =
                new ServerSocket(5000);

        Socket s = ss.accept();

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(
                                s.getInputStream()));

        System.out.println(br.readLine());

        ss.close();
    }
}

// Client
import java.net.*;
import java.io.*;

class Client {
    public static void main(String[] args)
            throws Exception {

        Socket s =
                new Socket("localhost",5000);

        PrintWriter pw =
                new PrintWriter(
                        s.getOutputStream(),true);

        pw.println("Hello Server");

        s.close();
    }
}

// 36. HTTP Client API (Java 11+)
import java.net.http.*;
import java.net.*;
import java.io.*;

class HttpClientDemo {
    public static void main(String[] args)
            throws Exception {

        HttpClient client =
                HttpClient.newHttpClient();

        HttpRequest request =
                HttpRequest.newBuilder()
                        .uri(URI.create(
                                "https://api.github.com"))
                        .build();

        HttpResponse<String> response =
                client.send(request,
                        HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}

// 37. Using javap to Inspect Bytecode
class BytecodeDemo {

    void show() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new BytecodeDemo().show();
    }
}

// Compile:
// javac BytecodeDemo.java
// javap -c BytecodeDemo

// 38. Decompile a Class File
class DecompileDemo {
    public static void main(String[] args) {
        System.out.println("Decompile Example");
    }
}

// Compile:
// javac DecompileDemo.java
// Open .class file in JD-GUI or CFR

// 39. Reflection in Java
import java.lang.reflect.*;

class Sample {
    public void display() {
        System.out.println("Reflection Demo");
    }
}

class ReflectionDemo {
    public static void main(String[] args)
            throws Exception {

        Class<?> cls =
                Class.forName("Sample");

        Object obj =
                cls.getDeclaredConstructor()
                        .newInstance();

        Method[] methods =
                cls.getDeclaredMethods();

        for(Method m : methods) {
            System.out.println(m.getName());
            m.invoke(obj);
        }
    }
}

// 40. Virtual Threads (Java 21)
class VirtualThreadDemo {
    public static void main(String[] args) {

        for(int i = 1; i <= 100000; i++) {

            Thread.startVirtualThread(() ->
                    System.out.println(
                            Thread.currentThread()));
        }
    }
}

// 41. Executor Service and Callable
import java.util.concurrent.*;

class CallableDemo {
    public static void main(String[] args)
            throws Exception {

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        Callable<Integer> task =
                () -> 100;

        Future<Integer> future =
                executor.submit(task);

        System.out.println(
                future.get());

        executor.shutdown();
    }
}
