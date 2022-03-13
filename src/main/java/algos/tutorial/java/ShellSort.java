package algos.tutorial.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShellSort {

    public void sort(Comparable[] a){
        int n = a.length;
        int h=1;
        while(h<n/3){
            h = 3*h +1;
        }
        while (h>=1){
            for(int i=h; i<n; i++){
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h)
                    swap(a, j, j-h);
            }
            h = h/3;
        }
    }

    public boolean less(Comparable a, Comparable b){
        return a.compareTo(b)<0;
    }

    public void swap(Comparable[] a, int i, int j){
        Comparable tmp = a[i];
        a[i]=a[j];
        a[j]=tmp;
    }

    public static void main(String args[]){
        ShellSort s = new ShellSort();
        Comparable[] a = {3,4, 1, 2, 8, 5, 9, 6, 7};
        s.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
