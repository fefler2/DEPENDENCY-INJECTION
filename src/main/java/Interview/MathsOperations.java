package Interview;

import java.util.*;

public class MathsOperations {
    int[] wartosciBezwzgledne(int[] a) {
        // 0 1 2
        int[] a2 = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                a2[i] = a[i];
            }
        }
        return a2;
    }

    void showWartosciBezwzgledne(int[] a) {
        // LinkedList has O(1) when inserting at last
        List list = new LinkedList();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                list.add(a[i]);
                if (!(list.contains(a[i]))) {
                    System.out.println(list.contains(a[i]));
                    count++;
                }
            }


            System.out.println(count);
        }
        System.out.println(count);
    }


    public int average(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length + 1; i++) {
            sum += a[i];
        }
        int average = sum / a.length;
        return average;
    }

    public void perform(int[] a) {


    }


    boolean doesParethesisMatches(String s) {
        int len = s.length();
        // 0 1 2
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {
                count++;
            }
            if (count == 0 && s.charAt(i) == '(') {
                return false;
            }
            if (s.charAt(i) == ')') {
                count--;
            }
        }


        return count == 0;
    }

    public static void main(String[] args) {
        MathsOperations mathsOperations = new MathsOperations();
        int[] a = {3, 2, -4, 3, -3, 45, -5, 32, 1};
//        mathsOperations.showWartosciBezwzgledne(a);

        String s = "(dfdswjw)sjs(((sfd)df)df(dfd))";

        System.out.println(mathsOperations.doesParethesisMatches(s));

    }
}
