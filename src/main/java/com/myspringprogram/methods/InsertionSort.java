package com.myspringprogram.methods;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier("Insertion")
public class InsertionSort implements MasterSort{
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("Running Insertion Sort");
		int n = a.length;
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
	}

}
