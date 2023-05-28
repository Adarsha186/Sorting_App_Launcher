package com.myspringprogram.methods;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
@Qualifier("Bubble")
public class BubbleSort implements MasterSort{
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("Running Bubble Sort");
		int i, j, temp;
		int n = a.length;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
	}

}
