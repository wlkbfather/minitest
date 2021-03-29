package tw.bill.ms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleCtrl {

	@Value("${account}")
	private String account;
	
	@Value("${password}")
	private String password;
	
	@GetMapping("/test01")
	public String test01() {
		System.out.println("account = "+account);
		System.out.println("password = "+password);
		return "Hello World!!";
	}
	
	@GetMapping("/test02")
	public String test02() {
		System.out.println("test02");
		return "GOGOGO!!";
	}
}
