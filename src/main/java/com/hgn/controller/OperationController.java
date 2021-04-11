package com.hgn.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hgn.dto.OperationDTO;
import com.hgn.services.OperationService;

@RestController
public class OperationController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	private OperationService operacaoService;

	@GetMapping(path = "/exchange/{amount}/{from}/{to}/{rate}")
	public OperationDTO novaOPeracao(@PathVariable Integer amount, @PathVariable String from, @PathVariable String to,
			@PathVariable Double rate) {
		return operacaoService.novaOperacao(amount, from, to, rate);

	}

}
