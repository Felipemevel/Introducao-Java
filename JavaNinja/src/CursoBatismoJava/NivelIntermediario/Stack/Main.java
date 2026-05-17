package CursoBatismoJava.NivelIntermediario.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> ninjaStack = new Stack<>();

        ninjaStack.push("Naruto Uzumaki");
        System.out.println("Lista da primeira vez: " + ninjaStack);
        ninjaStack.push("Sasuke Uchiha");
        System.out.println("Lista da segunda vez: " + ninjaStack);
        ninjaStack.push("Sakura Haruno");
        System.out.println("Lista da quarta vez: " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Lista da quinta vez: " + ninjaStack);

    }
}
