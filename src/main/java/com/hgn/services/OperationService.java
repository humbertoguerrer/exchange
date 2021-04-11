package com.hgn.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hgn.dto.OperationDTO;
import com.hgn.entities.Operation;

@Service
public class OperationService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	private Operation operation;

	public OperationDTO novaOperacao(Integer amount, String from, String to, Double rate) {
		operation.setConvertedAmount(amount, rate);
		operation.setSymbol(to);
		OperationDTO opDto = new OperationDTO(operation);
		return opDto;

	}
}
