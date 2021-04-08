package com.m2i.devops;

public class Calculator {
	
	//public Object toto =null;

	public int add(int a, int b) {
		//return -1;
		return a+b;
		
	}
	
	public int sub(int a, int b) {
		//return -1;
		return a-b;
		
	}
	
	public int multiplication(int a, int b) {
		return a*b;
	}
	
	public boolean nombrePaire(int a) {
		 
		return (a%2)==0;
		
	}
	
	public boolean isPremier(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	 

}
