package com.calculo.neto;

public class AppNeto {
	private double sueldo;
	private double jubilacion;
	private double obraSocial;
	private double pami;
	private double neto;

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getJubilacion() {
		return jubilacion;
	}

	public void setJubilacion(double jubilacion) {
		this.jubilacion = jubilacion;
	}

	public double getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(double obraSocial) {
		this.obraSocial = obraSocial;
	}

	public double getPami() {
		return pami;
	}

	public void setPami(double pami) {
		this.pami = pami;
	}

	public double getNeto() {
		return neto;
	}

	public void setNeto(double neto) {
		this.neto = neto;
	}

	public void pamiCal(double sueldo) {
		this.pami = sueldo * 0.03;
	}

	public void jubCal(double sueldo) {
		this.jubilacion = sueldo * 0.11;
	}

	public void obraCal(double sueldo) {
		this.obraSocial = sueldo * 0.03;
	}

	public void netoCal(double sueldo, double jubilacion, double pami, double obraSocial) {
		this.neto = sueldo - (jubilacion + pami + obraSocial);
	}

}
