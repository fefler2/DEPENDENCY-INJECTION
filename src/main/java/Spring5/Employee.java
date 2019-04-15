package Spring5;

import com.sun.javafx.collections.ImmutableObservableList;

import java.util.*;

abstract class B {
}

class BinarySearch {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }


    // Driver method to test above
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
/* This code is contributed by Rajat Mishra */

public class Employee {
    Address address;
    B b = new B() {
        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }
    };

    Employee(Address address) {
        this.address = address;
    }

    static int fibonacciIterative(int n) {
        int a, b, score;
        a = 0;
        b = 1;
        score = 0; // !!
        for (int i = 1; i < n + 1; i++) {

            a = b;
            b = score;

            score = a + b;
        }
        return score;
    }


    int[] bubbleSort(int[] n) {
        int aLen = n.length;
        int temp = 0;
        for (int i = 0; i < aLen; i++) {
            for (int j = i; j < aLen; j++) {
                if (n[j] < n[i]) {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;

                }
            }
        }
        return n;
    }

    static int binarySearch(int[] a, int szukanaLiczba) {
        int lewo = 0, prawo = a.length, srodek = 0;

        while (lewo <= prawo) {
            srodek = (lewo + prawo) / 2;
            System.out.print(srodek + " ");
            if (a[srodek] == szukanaLiczba) {
                System.out.println();
                return srodek;
            } else if (a[srodek] < szukanaLiczba) {
                lewo = srodek + 1; // np liczby od 1 do 12, szukana 9,
                // lewy element jest teraz granica do szukania
            } else {
                prawo = srodek - 1;
            }
        }

        return -1; // jezeli nie zostanie znaleziona
    }


    static void printSumPairs(int[] a, int szukana) {
        Map map = new HashMap();
        for (int i = 0; i < a.length; i++) {
            System.out.println(map);
            System.out.println(map.containsKey(a[i]));
            if (map.containsKey(a[i])) {
                System.out.println(a[i] + " " + map.get(a[i]));
            } else {
                map.put(szukana - a[i], a[i]);
            }
            System.out.println(a[i]);
        }

    }


    public static void main(String[] args) {
//        System.out.println(fibonacciIterative(10));

//
//        Address address = new Address();
//        Employee employee = new Employee(address);
//        System.out.println(ImmutableObservableList.class);
//        int[] a = {2, 3, 1, 22, 12, -123, 4};
//        System.out.println(Arrays.toString(employee.bubbleSort(a)));
//        int[] a2 = {-22, 2, 3, 4, 5, 6, 7, 8, 23, 24, 33, 87};
////        System.out.println(Arrays.binarySearch(a2));

        int[] a3 =
                {1,2,3,4,5, 6, 7,8,
                        9,
                        10,11,12};  // 6 jest srodkiem
//        System.out.println(binarySearch(a3,9));

        List list = new LinkedList();
        list.add(2);
        list.add(-3);
        list.add(22);
        System.out.println(list.get(1));

        Map map = new HashMap();
        Map map2 = new HashMap();



        int[] arr = {33,2,34,11,23};
        int temp = 0;
        int temp2 = 0;
        int sum = 0;

        int []a = {2,45,7,3,5,1,8,9};

        printSumPairs(a,9); // array + szukana liczba







    }
}
