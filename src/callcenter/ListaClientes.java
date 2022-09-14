package callcenter;

import java.util.ArrayList;
import java.util.Random;

public class ListaClientes {
	private ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();

	public Contacto buscarCandidato() {
		ArrayList<Contacto> listaCandidatos = new ArrayList<Contacto>();
		for (int i = 0; i < listaContactos.size(); i++) {
			if (listaContactos.get(i).getEsCliente() == false && listaContactos.get(i).getReLlamado() == true) {
				listaCandidatos.add(listaContactos.get(i));
			}
		}
		Random aleatorio = new Random();
		Integer indice = aleatorio.nextInt(listaCandidatos.size());
		Contacto candidato = listaCandidatos.get(indice);
		
		return candidato;
	}

	public void agregarContacto(Contacto contacto) {
		listaContactos.add(contacto);
	}
	


}
