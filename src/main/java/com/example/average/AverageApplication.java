package com.example.average;

import java.util.ArrayList;
import java.util.List;

//import com.example.average.service.ComponentCl;
import com.example.average.service.GetAverage;
import com.example.average.service.GetAverageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AverageApplication {

	public static void main(String[] args) {
		SpringApplication.run(AverageApplication.class, args);
		
		GetAverageService getAverageService = new GetAverageService();
		GetAverageService getAverageService2 = new GetAverageService();
		List<String> f = new ArrayList<>();
		f.add("0.4f");
		f.add("2.0f");
		System.out.println(getAverageService.getGetAverage().getAverage(f));
		/*System.out.println(getAverageService==getAverageService2);
		ComponentCl componentCl = new ComponentCl();
		ComponentCl componentCl2 = new ComponentCl();
		System.out.println(componentCl+" "+componentCl2);
		System.out.println(getAverageService.getGetAverage);
		System.out.println(getAverage.getGetAverageService().getCl2());*/
	}

}
