package fes.aragon.modelo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Hoteles {
	private static Hoteles instancia=new Hoteles();
	private ObservableList<Hotel> grupoHoteles=FXCollections.observableArrayList();
	private boolean modificarHotel=false;
	private int indice=-1;
	private int indiceHabitacion=-1;
	
	
	private Hoteles() {
		/*Hotel h= new Hotel();
		h.setNombre("Dato1");
		h.setDireccion("Dato2");
		h.setCorreo("asas@s.com");
		h.setTelefono("556767");
		Gerente g=new Gerente();
		g.setNombre("Raul");
		g.setApellidoPaterno("Mendez");
		g.setApellidoMaterno("Linares");
		g.setCorreo("asd@a.com");
		g.setRfc("54635323");
		g.setTelefono("55353");
		h.setGerente(g);
		Habitacion hab= new Habitacion();
		hab.setNumero("A1");
		hab.setCosto(23.21f);
		hab.setRefrigerador(true);
		hab.setTipo("Mixto");
		h.getHabitaciones().add(hab);
		this.grupoHoteles.add(h);*/
	}

	public static Hoteles getInstancia() {
		return instancia;
	}

	public boolean isModificarHotel() {
		return modificarHotel;
	}

	public void setModificarHotel(boolean modificarHotel) {
		this.modificarHotel = modificarHotel;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public int getIndiceHabitacion() {
		return indiceHabitacion;
	}

	public void setIndiceHabitacion(int indiceHabitacion) {
		this.indiceHabitacion = indiceHabitacion;
	}

	public ObservableList<Hotel> getGrupoHoteles() {
		return grupoHoteles;
	}

	public void setGrupoHoteles(ObservableList<Hotel> grupoHoteles) {
		this.grupoHoteles = grupoHoteles;
	}
	

}
