package com.hgn.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hgn.dto.OperacaoDTO;
import com.hgn.entities.Operacao;

@Service
public class OperacaoService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	private Operacao operacao;

	public OperacaoDTO novaOperacao(Integer amount, String from, String to, Double rate) {
		operacao.setConvertedAmount(amount, rate);
		operacao.setSymbol(to);
		OperacaoDTO opDto = new OperacaoDTO(operacao);
		return opDto;

	}
}
