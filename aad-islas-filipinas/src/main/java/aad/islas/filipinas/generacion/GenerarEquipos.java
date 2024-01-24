package aad.islas.filipinas.generacion;

import java.util.HashMap;
import java.util.Map;

import aad.islas.filipinas.entities.Equipo;
import aad.islas.filipinas.entities.Estadio;
import jakarta.persistence.EntityManager;

public class GenerarEquipos {
    
    public static Map<String, Equipo> generarEquipos(EntityManager entityManager) {
        Map<String, Equipo> equiposMap = new HashMap<>();
        // Athletic Bilbao
        Equipo athleticBilao = new Equipo("Athletic Bilbao", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio(entityManager), null);
        athleticBilao.setEstadio(new Estadio("San Mamés", athleticBilao));
        equiposMap.put("Athletic Bilbao", athleticBilao);
        
        // Atletico Madrid
        Equipo atleticoMadrid = new Equipo("Atlético Madrid", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio(entityManager), null);
        atleticoMadrid.setEstadio(new Estadio("Estadio Cívitas Metropolitano", atleticoMadrid));
        equiposMap.put("Atlético Madrid", atleticoMadrid);
        
        // Deportivo Alavés
        Equipo deportivoAlaves = new Equipo("Deportivo Alavés", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio(entityManager), null);
        deportivoAlaves.setEstadio(new Estadio("Estadio de Mendizorroza", deportivoAlaves));
        equiposMap.put("Deportivo Alavés", deportivoAlaves);
        
        // FC Barcelona
        Equipo fcBarcelona = new Equipo("Barcelona", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio(entityManager), null);
        fcBarcelona.setEstadio(new Estadio("Spotify Camp Nou", fcBarcelona));
        equiposMap.put("FC Barcelona", fcBarcelona);
        
        // Getafe CF
        Equipo getafeCF = new Equipo("Getafe CF", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio(entityManager), null);
        getafeCF.setEstadio(new Estadio("Estadio Coliseum", getafeCF));
        equiposMap.put("Getafe CF", getafeCF);

        // Real Madrid
        Equipo realMadrid = new Equipo("Real Madrid", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio(entityManager), null);
        realMadrid.setEstadio(new Estadio("Estadio Santiago Bernabéu", realMadrid));
        equiposMap.put("Real Madrid", realMadrid);
        
        // Real Sociedad
        Equipo realSociedad = new Equipo("Real Sociedad", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio(entityManager), null);
        realSociedad.setEstadio(new Estadio("Reale Arena", realSociedad));
        equiposMap.put("Real Sociedad", realSociedad);
        
        // Sevilla FC
        Equipo sevillaFC = new Equipo("Sevilla FC", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio(entityManager), null);
        sevillaFC.setEstadio(new Estadio("Estadio Ramón Sánchez-Pizjuán", sevillaFC));
        equiposMap.put("Sevilla FC", sevillaFC);
        
        // Valencia CF
        Equipo valenciaCF = new Equipo("Valencia CF", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio(entityManager), null);
        valenciaCF.setEstadio(new Estadio("Estadio de Mestalla", valenciaCF));
        equiposMap.put("Valencia CF", valenciaCF);
        
        // Villarreal CF
        Equipo villarrealCF = new Equipo("Villarreal CF", null, GenerarPatrocinadores.generarPatrocinadoresAleatorio(entityManager), null);
        villarrealCF.setEstadio(new Estadio("Estadi de la Ceràmica", villarrealCF));
        equiposMap.put("Villarreal CF", villarrealCF);
        return equiposMap;
    }
}
