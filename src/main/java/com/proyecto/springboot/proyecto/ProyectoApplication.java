package com.proyecto.springboot.proyecto;

import com.proyecto.springboot.proyecto.bean.MyBean;
import com.proyecto.springboot.proyecto.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//para correr el proyecto necesito el metodo CommandLineRunner
@SpringBootApplication
public class ProyectoApplication implements CommandLineRunner {

	//inyectar la dependencia
	private ComponentDependency componentDependency;
	//inyectar dependencia: interfaz del Beans
	private MyBean mybean;
	//constructor
	public ProyectoApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean mybean) {
		this.componentDependency = componentDependency;
		this.mybean = mybean;
	}
	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//llamo la dependecia creada con el metodo saludar
		componentDependency.Saludar();
		mybean.Mensaje();
	}
}
