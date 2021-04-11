package com.hgn.dto;

import java.io.Serializable;

import com.hgn.entities.Operation;

public class OperationDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Double convertedAmount;
	private Character symbol;

	public OperationDTO() {
	}

	public OperationDTO(Operation operacao) {
		convertedAmount = operacao.getConvertedAmount();
		symbol = operacao.getSymbol();
	}

	public Double getConvertedAmount() {
		return convertedAmount;
	}

	public void setConvertedAmount(Double convertedAmount) {
		this.convertedAmount = convertedAmount;
	}

	public Character getSymbol() {
		return symbol;
	}

	public void setSymbol(Character symbol) {
		this.symbol = symbol;
	}
}
