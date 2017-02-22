package com.astha;

public class HelloWorld {
	
//	public static void main(String[] args){
//		
//		int staticReturn = teststatic(4);
//		System.out.println(staticReturn);
//	int add =new HelloWorld().add2numbers(1, 2);
//		int sub= new HelloWorld().subtract2numbers(70, 100);
//System.out.println("sub=" + sub);
//		System.out.println("Total="+ add);
//		System.out.println("Completed");
//	}
	
	public int subtract2numbers(int a,int b){
		int c=b-a;
		System.out.println(c);
		System.out.println("output :" + b +" Minus " +a +" is =" +c);
		return c;
	}
	public int add2numbers(int a,int b){
		int c=a+b;
		System.out.println("a");
		System.out.println("output :" + a +" and "+b +" is:"+c );
		return c;
	}
	public static int teststatic(int a){
		System.out.println(a);
		return a;
	}
	

}

// create a new project
//create new package
//create new class 
//main Method
// Other Functional Methods
//Modified main methods to call other methods.
