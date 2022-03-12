package algos.tutorial.java;

import java.util.Arrays;

public class SelectionSort {
    public void sort(Comparable[] a){
        int n = a.length;
        for(int i=0; i<n; i++){
            int min= i;
            for (int j=i+1; j<n; j++){
                if(less(a[j], a[min])){
                    min = j;
                }
            }
            swap(a, i, min);
        }

    }

    public boolean less(Comparable a, Comparable b){
        return a.compareTo(b)<0;
    }

    public void swap(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String args[]){
        SelectionSort s = new SelectionSort();
        Comparable[] a = {5, 4, 1, 7, 8};
        s.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
