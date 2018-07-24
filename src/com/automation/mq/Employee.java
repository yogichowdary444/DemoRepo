package com.automation.mq;

public class Employee {
	
		public int id;
		
		public String name;
		
		public  double salary;
		
		public void setEmpData(int id,String name,double salary) {
			if(id<=0) {
				System.out.println("invalida emp id");
				System.exit(0);
			}
			this.id =id;
			this.name = name;
			this.salary = salary;
			
		}
		
		public void dispEmpInfo() {
			
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
			
		}

}
