package com.calculo.neto;

public class Greeting {
	private float sueldo;
	private float jubi;
	private float obras;
	private float pami;
	private float neto;

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public float getJubi() {
		return jubi;
	}

	public void setJubi(float jubi) {
		this.jubi = jubi;
	}

	public float getObras() {
		return obras;
	}

	public void setObras(float obras) {
		this.obras = obras;
	}

	public float getPami() {
		return pami;
	}

	public void setPami(float pami) {
		this.pami = pami;
	}

	public float getNeto() {
		return neto;
	}

	public void setNeto(float neto) {
		this.neto = neto;
	}

	public void juilacion(float sueldo) {
		this.jubi = ((sueldo * 11) / 100);
	}

	public void obraSocial(float sueldo) {
		this.obras = ((sueldo * 3) / 100);
	}

	public void pamiley(float sueldo) {
		this.pami = ((sueldo * 3) / 100);
	}

	public void sueldoneto(float sueldo) {
		this.neto = (sueldo - ((sueldo * 17) / 100));
	}

}
