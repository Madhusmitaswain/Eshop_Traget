package com.app;

public class Test {
public static void main(String[] args) throws CloneNotSupportedException {
	Employee e=new Employee();
	e.setEid(45);
	e.setEname("lina");
	System.out.println(e);
	Employee e2=(Employee) e.clone();
	e2.setEid(46);
	e2.setEname("madhu");
	
	System.out.println(e.getEid()+"--"+e.getEname());
	System.out.println(e2.getEid()+"--"+e2.getEname());
	
	
	
}
}
