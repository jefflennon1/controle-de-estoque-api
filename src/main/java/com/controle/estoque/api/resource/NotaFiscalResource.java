package com.controle.estoque.api.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.controle.estoque.api.model.NotaFiscal;
import com.controle.estoque.api.service.NotaFiscalService;

@RestController
@RequestMapping("/nota-fiscal")
public class NotaFiscalResource {
	
	@Autowired
	private NotaFiscalService service;

	@GetMapping(value = "/listar-notas-fiscais",
			produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<?> listar(){
	 try {
		 List<NotaFiscal> lista = service.listar(); 
		 return lista.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(lista);
			
		} catch (Exception e) {
			 return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping(value = "/buscar-nota-fiscal", 
				produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> buscarPorId(@RequestParam("id") Long id){
	 try {
		 NotaFiscal notaFiscal = service.buscarPorId(id); 
		 return notaFiscal == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(notaFiscal);
			
		} catch (Exception e) {
			 return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@PostMapping(value = "/salvar-nota-fiscal", 
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> salvar(@RequestBody NotaFiscal notaFiscal){
	 try {
		 service.salvar(notaFiscal); 
		 URI location = URI.create(String.format("/nota-fiscal/buscar-nota-fiscal?id=%s", notaFiscal.getId()));
		 return ResponseEntity.created(location).build();
			
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@PutMapping(value = "/atualizar-nota-fiscal", 
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> atualizar(@RequestBody NotaFiscal notaFiscal){
	 try {
		 service.atualizar(notaFiscal); 
		 URI location = URI.create(String.format("/nota-fiscal/buscar-nota-fiscal?id=%s", notaFiscal.getId()));
		 return ResponseEntity.ok().location(location).build();
			
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

}
