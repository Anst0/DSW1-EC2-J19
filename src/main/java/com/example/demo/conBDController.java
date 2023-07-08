package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.String;


@Controller	// This means that this class is a Controller
@RequestMapping(path="/api/curso")
public class conBDController {
    
    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping(path="/listar")
	public @ResponseBody Iterable<Curso> getAllUsers() {
		return cursoRepository.findAll();
	}

    @PostMapping(path="/nuevo") // Map ONLY POST Requests
	public @ResponseBody String nuevo (@RequestParam String nombre, @RequestParam Integer creditos) {
		Curso n = new Curso();
		n.setNombre(nombre);
		n.setCreditos(creditos);
		cursoRepository.save(n);
		return "Curso Salvado";
	}

    @DeleteMapping(path="/eliminar")
	public @ResponseBody String eliminar (@RequestParam Integer id) {
		Curso n = new Curso();
		//Un problema con la escritura, no lo reconoce parece ser el "setID"
		//Lo he intentado algunas veces pero no lo reconoce
		n.setId(id);
		cursoRepository.save(n);
		return "Curso Eliminado";
	}


}
