package com.uragil.spring051007;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		
		AdminConnection connection = ctx.getBean("adminconfig", AdminConnection.class);
		
		System.out.println(connection.getAdminId());
		System.out.println(connection.getAdminPw());
		
		System.out.println(connection.getSub_adminId());
		System.out.println(connection.getSub_adminPw());
		
		
		
	}

}
