package com.mfxj.pojo;

import java.util.Date;

/**
 * 
 * @author alading ѧԱ��Ϣ��
 *
 */
public class Student {
	private Integer id;
	private String name;
	private Date bornDate;
	
	public Date getBornDate() {
		return bornDate;
	}
	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
	public Student() {
		super();
	}
	
	public Student(String name, Date bornDate) {
		super();
		this.name = name;
		this.bornDate = bornDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//重写object类的终结方法
	@Override
	protected void finalize() throws Throwable {
		System.out.println("终结方法！");
		super.finalize();
	}



	public static void main(String[] args) throws Throwable {
		Student student=new Student();
		try {
			System.out.println("哈哈！");
		}finally{
			student.finalize();
		}

	}

}
