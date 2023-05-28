package com.myspringprogram.methods;

import com.myspringprogram.sorting.SpringLauncher;

public class Sort {
    private MasterSort s;
    public Sort(MasterSort s) {
		this.s=s;
	}
	public void run() {
        int arr[] = SpringLauncher.arr;
        s.sort(arr);
        for(int i : arr) {
        	System.out.print(i+" ");
        }
    }
}
