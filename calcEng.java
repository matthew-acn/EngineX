package CalcEng;

import java.io.*;

public class calcEng {

    public static void main(String[] args) throws IOException {
        System.out.println("A stone... a leaf... an unfound door.");

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter an integer: ");
        int int1 = Integer.parseInt(bfn.readLine());

        System.out.println("Enter an integer: ");
        final int int2 = Integer.parseInt(bfn.readLine());

        System.out.println("Enter an operator: ");
        char operator = (char) bfn.read();
        int result;

        switch (operator) {
            case '*':
                result = int1 * int2;
                System.out.println(int1 + " * " + int2 + " = " + result);
                break;
            case '-':
                result = int1 - int2;
                System.out.println(int1 + " - " + int2 + " = " + result);
                break;
            case '+':
                result = int1 + int2;
                System.out.println(int1 + " + " + int2 + " = " + result);
                break;
            case '/':
                result = int1 / int2;
                System.out.println(int1 + " / " + int2 + " = " + result);
                break;

            default:
                System.out.println("Invalid Input");
                break;

        }
    }
}
