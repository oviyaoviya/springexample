package com.mbf.utils;

public class SwapExample {
     /*int no;
     
     SwapExample(int no){
    	 this.no=no;
     }
     public static void swap(SwapExample c1,SwapExample c2){
    	 int temp = c1.no;
    	 c1.no=c2.no;
    	 c2.no=temp;
     }
	public static void main(String[] args) {
		SwapExample c1=new SwapExample(1);
		SwapExample c2=new SwapExample(2);
		swap(c1,c2);
		System.out.println(+c1.no);

		System.out.println(+c2.no);
	}*///using construtor
/*	
	int model,number;

	public int getModel() {
		return model;
	}

	public int getNumber() {
		return number;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	private static void swap(SwapExample c1, SwapExample c2) {
		int temp = c1.number;
   	 c1.number=c2.number;
   	 c2.number=temp;
		
	}	
	int model,number;

	public int getModel() {
		return model;
	}

	public int getNumber() {
		return number;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	private static void swap(SwapExample c1, SwapExample c2) {
		int temp = c1.number;
   	 c1.number=c2.number;
   	 c2.number=temp;
		
	}
	
	public SwapExample(int model, int number) {
		super();
		this.model = model;
		this.number = number;
	}

	public static void main(String args[]){
		SwapExample abc=new SwapExample(1,2);
		SwapExample bcd=new SwapExample(2,3);
		swap(abc,bcd);
		System.out.println(+abc.number);

		System.out.println(+bcd.number);
	}

	
	public SwapExample(int model, int number) {
		super();
		this.model = model;
		this.number = number;
	}

	public static void main(String args[]){
		SwapExample abc=new SwapExample(1,2);
		SwapExample bcd=new SwapExample(2,3);
		swap(abc,bcd);
		System.out.println(+abc.number);

		System.out.println(+bcd.number);
	}
*/
	private String name;
	private int rol_no;
	
	public String getName() {
		return name;
	}

	public int getRol_no() {
		return rol_no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRol_no(int rol_no) {
		this.rol_no = rol_no;
	}

	public static void main(String args[]){
		SwapExample student=new SwapExample();
		student.setName("john");
		student.setRol_no(2);
		System.out.println("name is "+student.getName());
		System.out.println("number is "+student.getRol_no());
	}
}
