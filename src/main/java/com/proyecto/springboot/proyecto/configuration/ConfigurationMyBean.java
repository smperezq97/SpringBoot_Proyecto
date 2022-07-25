package com.proyecto.springboot.proyecto.configuration;

import com.proyecto.springboot.proyecto.bean.MyBean;
import com.proyecto.springboot.proyecto.bean.MyBeanImplement;
import com.proyecto.springboot.proyecto.bean.MyBeanTwoImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationMyBean {
    //independencia Bean
    //metodo Bean e incio
    @Bean
    //interfaz
    public MyBean mybeanconf(){
        //retorno la clase configuración
        return new MyBeanTwoImplement();
    }

}
