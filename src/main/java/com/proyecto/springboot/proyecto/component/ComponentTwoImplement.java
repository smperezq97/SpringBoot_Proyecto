package com.proyecto.springboot.proyecto.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency{
    @Override
    public void Saludar() {
        System.out.println("Hola desde componente #2");
    }
}
