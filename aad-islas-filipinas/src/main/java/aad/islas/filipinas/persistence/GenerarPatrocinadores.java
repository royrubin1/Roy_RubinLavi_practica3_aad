package aad.islas.filipinas.persistence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import aad.islas.filipinas.entities.Equipo;
import aad.islas.filipinas.entities.Patrocinador;

public class GenerarPatrocinadores {
	static ArrayList<Patrocinador> generarPatrocinadores() {
		ArrayList<Patrocinador> patrocinadores = new ArrayList<Patrocinador>();
		PatrocinadorDAOPersistence pdp = new PatrocinadorDAOPersistence();
		patrocinadores.add(new Patrocinador("Banco Santander"));
		patrocinadores.add(new Patrocinador("Nike"));
		patrocinadores.add(new Patrocinador("EA Sports"));
		patrocinadores.add(new Patrocinador("TAG Heuer"));
		// TODO: change this insert
		pdp.insertAll(patrocinadores);
		
		return patrocinadores;
	}
	
	static ArrayList<Patrocinador> generarPatrocinadoresAleatorio() {
		ArrayList<Patrocinador> patrocinadores = generarPatrocinadores();
        int patrocinadoresLength = new Random().nextInt(patrocinadores.size() + 1);
        Collections.shuffle(patrocinadores);

        ArrayList<Patrocinador> patrocinadoresAleatorios = new ArrayList<Patrocinador>();
        for (int i = 0; i < patrocinadoresLength; i++) {
        	patrocinadoresAleatorios.add(patrocinadores.get(i));
        }

        return patrocinadoresAleatorios;
	}
}
