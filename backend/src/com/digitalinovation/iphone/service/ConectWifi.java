package com.digitalinovation.iphone.service;

public class ConectWifi {

	private static ConectWifi wifi;

	private ConectWifi() {
	}

	public static ConectWifi getInstance() {
		if (wifi == null)
			wifi = new ConectWifi();

		return wifi;
	}
}