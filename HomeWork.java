import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HomeWork {
    public static void main(String[] args) {
        Test test = new Test();
        test.arrayStatic();
        test.linkedListStatic();
        test.queueStatic();
        test.stackStatic();
        test.RecursiveSum();
        test.RecursiveDifference();
        test.RecursiveMax();
        test.RecursiveMin();
        test.RecursivePower();
        test.RecursiveFactorial();
        test.RecursiveProduct();
        test.SumOfStringNumbers();
        test.FibonacciSumRecursive();
    }

}
class Test {
    Test() {
    }

    public void arrayStatic() {
        int[] numbers = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Các phần tử của mảng là:");

        for(int i = 0; i < numbers.length; ++i) {
            System.out.println("Phần tử tại vị trí " + i + ": " + numbers[i]);
        }

    }

    public void linkedListStatic() {
        LinkedList<Integer> numbers = new LinkedList();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Các phần tử của LinkedList là:");
        Iterator var2 = numbers.iterator();

        while(var2.hasNext()) {
            int number = (Integer)var2.next();
            System.out.println(number);
        }

    }

    public void queueStatic() {
        Queue<Integer> numbers = new LinkedList();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Các phần tử của Queue là:");
        Iterator var2 = numbers.iterator();

        while(var2.hasNext()) {
            int number = (Integer)var2.next();
            System.out.println(number);
        }

    }

    public void stackStatic() {
        Stack<Integer> numbers = new Stack();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.push(40);
        numbers.push(50);
        System.out.println("Các phần tử của Stack là:");
        Iterator var2 = numbers.iterator();

        while(var2.hasNext()) {
            int number = (Integer)var2.next();
            System.out.println(number);
        }

    }

    public void RecursiveSum() {
        int n = 5;
        int result = sum(n);
        System.out.println("Tổng từ 1 đến " + n + " là: " + result);
    }

    public static int sum(int n) {
        return n <= 1 ? n : n + sum(n - 1);
    }

    public void RecursiveDifference() {
        int n = 5;
        int result = difference(n);
        System.out.println("Hiệu từ " + n + "  đến 1 là: " + result);
    }

    public static int difference(int n) {
        return n == 1 ? 1 : n - difference(n - 1);
    }

    public void RecursiveProduct() {
        int n = 5;
        int result = product(n);
        System.out.println("Tích từ 1 đến " + n + " là: " + result);
    }

    public static int product(int n) {
        return n <= 1 ? 1 : n * product(n - 1);
    }

    public void RecursivePower() {
        int a = 2;
        int b = 5;
        int result = power(a, b);
        System.out.println("" + a + " lũy thừa " + b + " là: " + result);
    }

    public static int power(int a, int b) {
        return b == 0 ? 1 : a * power(a, b - 1);
    }

    public void RecursiveFactorial() {
        int n = 5;
        int result = factorial(n);
        System.out.println("Giai thừa của " + n + " là: " + result);
    }

    public static int factorial(int n) {
        return n <= 1 ? 1 : n * factorial(n - 1);
    }

    public void RecursiveMax() {
        int[] array = new int[]{1, 5, 3, 9, 2};
        int max = findMax(array, array.length - 1);
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }

    public static int findMax(int[] array, int n) {
        return n == 0 ? array[0] : Math.max(array[n], findMax(array, n - 1));
    }

    public void RecursiveMin() {
        int[] array = new int[]{1, 5, 3, 9, 2};
        int max = findMax(array, array.length - 1);
        System.out.println("Số bé nhất trong mảng là: " + max);
    }

    public static int findMin(int[] array, int n) {
        return n == 0 ? array[0] : Math.min(array[n], findMax(array, n - 1));
    }

    public void SumOfStringNumbers() {
        String numberString = "12345";
        int sum = sumOfStringNumbers(numberString);
        System.out.println("Tổng các số trong chuỗi '" + numberString + "' là: " + sum);
    }

    public static int sumOfStringNumbers(String numberString) {
        int sum = 0;

        for(int i = 0; i < numberString.length(); ++i) {
            char ch = numberString.charAt(i);
            int digit = Character.getNumericValue(ch);
            sum += digit;
        }

        return sum;
    }
    public void FibonacciSumRecursive(){
            int n = 7;
            int sum = fibonacciSum(n);
            System.out.println("Tổng các số trong dãy Fibonacci đến vị trí " + n + " là: " + sum);

    }
    public static int fibonacciSum(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n) + fibonacciSum(n - 1);
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
