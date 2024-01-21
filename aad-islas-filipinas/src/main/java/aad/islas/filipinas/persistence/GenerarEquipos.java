package aad.islas.filipinas.persistence;

import java.util.HashMap;
import java.util.Map;

import aad.islas.filipinas.entities.Equipo;

public class GenerarEquipos {
    
    public static Map<String, Equipo> generarEquipos() {
        Map<String, Equipo> equiposMap = new HashMap<>();
        
        equiposMap.put("Athletic Bilbao", new Equipo("Athletic Bilbao", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio()));
        equiposMap.put("Atlético Madrid", new Equipo("Atlético Madrid", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio()));
        //equiposMap.put("Cádiz CF", new Equipo("Cádiz CF", null, null));
        //equiposMap.put("CA Osasuna", new Equipo("CA Osasuna", null, null));
        //equiposMap.put("Celta Vigo", new Equipo("Celta Vigo", null, null));
        equiposMap.put("Deportivo Alavés", new Equipo("Deportivo Alavés", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio()));
        equiposMap.put("FC Barcelona", new Equipo("Barcelona", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio()));
        equiposMap.put("Getafe CF", new Equipo("Getafe CF", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio()));
        //equiposMap.put("Girona FC", new Equipo("Girona FC", null, null));
        //equiposMap.put("Granada CF", new Equipo("Granada CF", null, null));
        //equiposMap.put("Rayo Vallecano", new Equipo("Rayo Vallecano", null, null));
        //equiposMap.put("RCD Mallorca", new Equipo("RCD Mallorca", null, null));
        //equiposMap.put("Real Betis", new Equipo("Real Betis", null, null));
        equiposMap.put("Real Madrid", new Equipo("Real Madrid", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio()));
        equiposMap.put("Real Sociedad", new Equipo("Real Sociedad", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio()));
        equiposMap.put("Sevilla FC", new Equipo("Sevilla FC", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio()));
        //equiposMap.put("UD Almería", new Equipo("UD Almería", null, null));
        //equiposMap.put("UD Las Palmas", new Equipo("UD Las Palmas", null, null));
        equiposMap.put("Valencia CF", new Equipo("Valencia CF", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio()));
        equiposMap.put("Villarreal CF", new Equipo("Villarreal CF", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio()));

        return equiposMap;
    }
}
