package leetcode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.next();
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (c == ')') {
                    if (checkParantheses(stack, '(')) return false;
                } else if (c == '}') {
                    if (checkParantheses(stack, '{')) return false;
                } else {
                    if (checkParantheses(stack, '[')) return false;

                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean checkParantheses(Stack<Character> stack, char c2) {
        if (!stack.isEmpty()) {
            char c1 = stack.pop();
            if (c1 != c2) {
                return true;
            }
        } else {
            return true;
        }
        return false;
    }
}
