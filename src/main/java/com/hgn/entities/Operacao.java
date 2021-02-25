package com.hgn.entities;

import java.io.Serializable;

import org.springframework.stereotype.Component;


@Component
public class Operacao implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer amount;
	private Double convertedAmount;
	private String from;
	private String to;
	private Double rate;
	private Character symbol;

	public Operacao() {
	}

	public Operacao(Integer amount, String from, String to, Double rate) {
		super();
		this.amount = amount;
		this.from = from;
		this.to = to;
		this.rate = rate;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getConvertedAmount() {
		return convertedAmount;
	}

	public void setConvertedAmount(Integer amount, Double rate) {
		this.convertedAmount = amount / rate;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Character getSymbol() {
		return symbol;
	}

	public void setSymbol(String to) {
	    this.symbol = to.equals("USD") ? '$' : '€';
	}

}
