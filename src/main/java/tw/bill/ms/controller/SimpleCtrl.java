package tw.bill.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleCtrl {

	@GetMapping("/test01")
	public String test01() {
		System.out.println("test01");
		return "Hello World!!";
	}
	
	@GetMapping("/test02")
	public String test02() {
		System.out.println("test02");
		return "GOGOGO!!";
	}
}
