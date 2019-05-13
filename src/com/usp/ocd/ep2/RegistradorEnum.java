package com.usp.ocd.ep2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum RegistradorEnum {

	AX("AX", new int[] { 1, 0, 0, 0 }, new int[] { 1, 1, 0, 0 }, 8, 12),
	BX("BX", new int[] { 1, 0, 0, 1 }, new int[] { 1, 1, 0, 1 }, 9, 13),
	CX("CX", new int[] { 1, 0, 1, 0 }, new int[] { 1, 1, 1, 0 }, 10, 14),
	DX("DX", new int[] { 1, 0, 1, 1 }, new int[] { 1, 1, 1, 1 }, 11, 15);
	
	private static final Map<String, RegistradorEnum> map = Collections.unmodifiableMap(initMap());

	private final String nome;
	private final int[] entradaBin;
	private final int[] saidaBin;
	private final Integer entradaInt;
	private final Integer saidaInt;

	private RegistradorEnum(String nome, int[] entradaBin, int[] saidaBin, Integer entradaInt, Integer saidaInt) {
		this.nome = nome;
		this.entradaBin = entradaBin;
		this.saidaBin = saidaBin;
		this.entradaInt = entradaInt;
		this.saidaInt = saidaInt;
	}
	
	public RegistradorEnum getEnum(String nome) {
		return map.get(nome);
	}

	public String getNome() {
		return nome;
	}

	public int[] getEntradaBin() {
		return entradaBin;
	}

	public int[] getSaidaBin() {
		return saidaBin;
	}

	public Integer getEntradaInt() {
		return entradaInt;
	}

	public Integer getSaidaInt() {
		return saidaInt;
	}
	
	private static Map<String, RegistradorEnum> initMap() {
		Map<String, RegistradorEnum> map = new HashMap<String, RegistradorEnum>();
		for (RegistradorEnum registrador : RegistradorEnum.values()) {
			map.put(registrador.nome, registrador);
		}
		return map;
	}
	
}
