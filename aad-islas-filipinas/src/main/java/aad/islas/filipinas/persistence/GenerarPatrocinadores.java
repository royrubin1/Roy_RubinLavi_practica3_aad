package aad.islas.filipinas.persistence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import aad.islas.filipinas.entities.Equipo;
import aad.islas.filipinas.entities.Patrocinador;
import jakarta.persistence.EntityManager;

public class GenerarPatrocinadores {
	public static List<Patrocinador> generarPatrocinadores() {
		List<Patrocinador> patrocinadores = new ArrayList<Patrocinador>();
		
		patrocinadores.add(new Patrocinador("Banco Santander"));
		patrocinadores.add(new Patrocinador("Nike"));
		patrocinadores.add(new Patrocinador("EA Sports"));
		patrocinadores.add(new Patrocinador("TAG Heuer"));
		
		return patrocinadores;
	}
	
	static List<Patrocinador> generarPatrocinadoresAleatorio(EntityManager entityManager) {
		PatrocinadorDAOPersistence pdp = new PatrocinadorDAOPersistence(entityManager);
		List<Patrocinador> patrocinadores = pdp.getAll();
        int patrocinadoresLength = new Random().nextInt(patrocinadores.size() + 1);
        Collections.shuffle(patrocinadores);

        ArrayList<Patrocinador> patrocinadoresAleatorios = new ArrayList<Patrocinador>();
        for (int i = 0; i < patrocinadoresLength; i++) {
        	patrocinadoresAleatorios.add(patrocinadores.get(i));
        }

        return patrocinadoresAleatorios;
	}
}
