package com.demo.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rosemary
 * @title: SentineConttrller
 * @projectName cloud2020
 * @date 2020/12/2415:51
 */
@RestController
public class SentineConttrller {
	@GetMapping("/testA")
	public String testA(){
		return "======================A===========";
	}
	@GetMapping("/testB")
	public String testB(){
		return "=====================B===========";
	}
}
