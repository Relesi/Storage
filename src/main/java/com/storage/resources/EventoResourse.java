package com.storage.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.storage.models.Evento;
import com.storage.repository.EventoRepository;

@RestController
@RequestMapping("/evento")
public class EventoResourse {

	@Autowired
	private EventoRepository er;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Evento> listaEventos(){
		Iterable<Evento> listaEventos = er.findAll();
		return listaEventos;
 	}
	@PostMapping()
	public Evento cadastraEvento(@RequestBody @Valid Evento evento) {
		return er.save(evento);
	}
	@DeleteMapping()
	public Evento detarEvento(@RequestBody Evento evento) {
		er.delete(evento);
		return evento;
	}
}
