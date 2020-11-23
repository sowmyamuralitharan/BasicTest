package com.basic.details;

public class Sample extends Cons2 {
	
	
	int id=100;              //this--class level reference
	
		private void num() {
		int id=10;
		System.out.println(this.id);   //100
		System.out.println(id);     //10
		System.out.println(super.sd);
		
		System.out.println(j);
	}

	public static void main(String[] args) {
		
			Sample s=new Sample();
			s.num();
			}

	}


