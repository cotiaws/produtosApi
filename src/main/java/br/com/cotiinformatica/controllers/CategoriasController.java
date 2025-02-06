package br.com.cotiinformatica.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.entities.Categoria;
import br.com.cotiinformatica.repositories.CategoriaRepository;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/categorias")
public class CategoriasController {

	@Operation(summary = "Serviço para consultar todas as categorias cadastradas no sistema.")
	@GetMapping("consultar")
	public List<Categoria> consultar() {
		try {
			var categoriaRepository = new CategoriaRepository(); //instanciando a classe
			return categoriaRepository.findAll(); //retornando a consulta
		}
		catch(Exception e) {
			e.printStackTrace(); //imprimindo o log do erro no console do eclipse
			return null; //retornar vazio
		}
	}
}
