package com.codeWithMojgan;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            Scanner scanner = new Scanner(System.in);
            int[] myArray = {scanner.nextInt(), scanner.nextInt()};
            int R = (myArray[0]);
            int C = (myArray[3]);
            System.out.println(R);
            System.out.println(C);

        }
    }
}
