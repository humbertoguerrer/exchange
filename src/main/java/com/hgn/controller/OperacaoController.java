package com.hgn.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hgn.dto.OperacaoDTO;
import com.hgn.services.OperacaoService;

@RestController
public class OperacaoController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	private OperacaoService operacaoService;
	
	@GetMapping(path = "/exchange/{amount}/{from}/{to}/{rate}")
	public OperacaoDTO novaOPeracao(@PathVariable Integer amount, @PathVariable String from, @PathVariable String to,
			@PathVariable Double rate) {
		return operacaoService.novaOperacao(amount, from, to, rate);
		
		
//		operacao = new Operacao(amount, from, to, rate);
//		operacao.setConvertedAmount(amount, rate);
//		operacao.setSymbol(to);
//		OperacaoDTO opDto = new OperacaoDTO(operacao);
//		return opDto;
	}

}
