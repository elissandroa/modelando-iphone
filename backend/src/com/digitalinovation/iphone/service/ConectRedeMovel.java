package com.digitalinovation.iphone.service;

public class ConectRedeMovel {

	private static ConectRedeMovel redeMovel;

	private ConectRedeMovel() {
	}

	public static ConectRedeMovel getInstance() {
		if (redeMovel == null)
			redeMovel = new ConectRedeMovel();

		return redeMovel;
	}
}