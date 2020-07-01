package com.uog.triangle;

public class TRIANGLE {
       private int BASE_OF_TRIANGLE;
       private int LENGTH_OF_TRIANGLE;
    TRIANGLE(int base,int length){
    	this.BASE_OF_TRIANGLE=base;
    	this.LENGTH_OF_TRIANGLE=length;
    }
    void AREA() {
 	 int area;
 	 area=BASE_OF_TRIANGLE+LENGTH_OF_TRIANGLE;
 	 area=area/2;
 	 System.out.println("Area of right Triangle:"+area);
    }
    void HYPOTENOUS() {
        double hypotenous;
    	hypotenous=Math.sqrt(Math.pow(BASE_OF_TRIANGLE, 2)+Math.pow(LENGTH_OF_TRIANGLE, 2));
    	System.out.println("Hypotenous of triangle:"+hypotenous);
    }
}
