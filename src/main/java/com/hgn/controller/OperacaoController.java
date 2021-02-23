package com.hgn.controller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hgn.dto.OperacaoDTO;
import com.hgn.entities.Operacao;

@RestController
public class OperacaoController implements Serializable {
	private static final long serialVersionUID = 1L;

	@GetMapping(path = "/exchange/{amount}/{from}/{to}/{rate}")
	public OperacaoDTO getOperacao(@PathVariable Integer amount, @PathVariable String from, @PathVariable String to,
			@PathVariable Double rate) {
		Operacao op1 = new Operacao(amount, from, to, rate);
		op1.setConvertedAmount(amount, rate);
		op1.setSymbol(to);
		OperacaoDTO opDto = new OperacaoDTO(op1);

		return opDto;
	}

}
