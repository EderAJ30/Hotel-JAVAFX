package fes.aragon.modelo;

import java.io.Serializable;

public class Habitacion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numero;
	private float costo;
	private boolean refrigerador;
	private String tipo;
	
	public Habitacion() {
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public boolean isRefrigerador() {
		return refrigerador;
	}

	public void setRefrigerador(boolean refrigerador) {
		this.refrigerador = refrigerador;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Habitacion [numero=" + numero + ", costo=" + costo + ", refrigerador=" + refrigerador + ", tipo=" + tipo
				+ "]";
	}
	
}
