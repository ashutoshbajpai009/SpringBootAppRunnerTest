package com.app.runner;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Set<String>optionkeys= args.getOptionNames();
		System.out.println(optionkeys);
		List<String> list=args.getOptionValues("profile");
		System.out.println(list);
		
		
		List<String> nonop=args.getNonOptionArgs();
		System.out.println(nonop);

	}

}
