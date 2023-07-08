package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.lang.String;


@Controller
@RequestMapping(path="/")

public class sinBDController {

    @GetMapping(path="/")
	public @ResponseBody String casa() {
		return " SM70888108 - Juan Angel Monzon Velasquez";
	}

    @GetMapping(path="/idat/codigo")
	public @ResponseBody String codigo() {
		return " SM70888108";
	}

    @GetMapping(path="/idat/nombre-completo")
	public @ResponseBody String nombre() {
		return " Juan Angel Monzon Velasquez";
	}
    
}
