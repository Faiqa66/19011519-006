package com.uog.constructor;

public class Paramiterized {
     private int a;
     
     private int b;
     
     private int c;
     
     private int d;
     
     private int add;
     
     private int subtract;
     
     private int multiply;
     
     private int d1;
     private int d2;
     private int d3;
     private int d4;
     
	public int getD1() {
		return d1;
	}
	public void setD1(int d1) {
		this.d1 = d1;
	}
	public int getD2() {
		return d2;
	}
	public void setD2(int d2) {
		this.d2 = d2;
	}
	public int getD3() {
		return d3;
	}
	public void setD3(int d3) {
		this.d3 = d3;
	}
	public int getD4() {
		return d4;
	}
	public void setD4(int d4) {
		this.d4 = d4;
	}
	public int getAdd() {
		return add;
	}
	public void setAdd(int add) {
		this.add = add;
	}
	public int getSubtract() {
		return subtract;
	}
	public void setSubtract(int subtract) {
		this.subtract = subtract;
	}
	public int getMultiply() {
		return multiply;
	}
	public void setMultiply(int multiply) {
		this.multiply = multiply;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
    Paramiterized(int a,int b,int c,int d){
    	this.a=a;
    	this.b=b;
    	this.c=c;
    	this.d=d;
    }
     boolean add() {
    	add=a+b+c+d;
    	System.out.println("Addition="+add);
		return true;
    }
    boolean subtract() {
       	subtract=a-b-c-d;
    	System.out.println("Subraction="+subtract);
		return true;
    }
    boolean multiply() {
    	multiply=a*b*c*d;
    	System.out.println("Multiplication="+multiply);
		return true;
    }
    boolean division() {
    	d1=a/b;
    	d2=b/c;
    	d3=c/d;
    	d4=d/a;
    	System.out.println("Division="+d1);
    	System.out.println("Division="+d2);
    	System.out.println("Division="+d3);
    	System.out.println("Division="+d4);
		return true;
}
}
