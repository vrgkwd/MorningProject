package com.vtz.pg;

import com.vtz.pg.function.F1;

public class Test {
public static void main(String[] args) {
	
	       Utility u = new Utility();
	       System.out.println(u.getSysDate());
	       u.m1();
	       u.m2();
	       u.m3();
	       u.m4();
	       u.m5();
	       F1 f= new F1();
	       f.getFunction1();
}
}
