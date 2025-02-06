package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {

	@Operation(summary = "Serviço para cadastro de produto.")
	@PostMapping("cadastrar")
	public void cadastrar() {
		// TODO Implementar o cadastro
	}

	@Operation(summary = "Serviço para atualização de dados de produto.")
	@PutMapping("atualizar")
	public void atualizar() {
		// TODO Implementar a atualização
	}

	@Operation(summary = "Serviço para exclusão de um produto.")
	@DeleteMapping("excluir")
	public void excluir() {
		// TODO Implementar a exclusão
	}

	@Operation(summary = "Serviço para consulta de todos os produtos.")
	@GetMapping("consultar")
	public void consultar() {
		// TODO Implementar a exclusão
	}
}
