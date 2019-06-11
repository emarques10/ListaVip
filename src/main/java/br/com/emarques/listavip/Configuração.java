package br.com.emarques.listavip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Configura��o {
	
	@RequestMapping("/")
	@ResponseBody
	String ola() {
		return "Ol�, bem vindo!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Configura��o.class, args);
	}

}
