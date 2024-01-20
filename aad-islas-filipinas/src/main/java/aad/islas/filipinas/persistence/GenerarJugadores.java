package aad.islas.filipinas.persistence;

import java.util.ArrayList;
import java.util.Map;
import java.time.LocalDate;
import aad.islas.filipinas.entities.Equipo;
import aad.islas.filipinas.entities.Jugador;

public class GenerarJugadores {

	public static ArrayList<Jugador> generarJugadores() {

		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		Map<String, Equipo> equipos = GenerarEquipos.generarEquipos();
		
        // Jugadores Athletic Club de Bilbao
		Equipo athleticBilbao = equipos.get("Athletic Bilbao");
		
        jugadores.add(new Jugador("Unai Simón", "Español", LocalDate.of(1997, 6, 11), athleticBilbao));
        jugadores.add(new Jugador("Yeray Álvarez", "Español", LocalDate.of(1995, 1, 24), athleticBilbao));
        jugadores.add(new Jugador("Iñigo Martínez", "Español", LocalDate.of(1991, 5, 17), athleticBilbao));
        jugadores.add(new Jugador("Ander Capa", "Español", LocalDate.of(1992, 2, 8), athleticBilbao));
        jugadores.add(new Jugador("Yuri Berchiche", "Español", LocalDate.of(1990, 2, 10), athleticBilbao));
        jugadores.add(new Jugador("Unai Vencedor", "Español", LocalDate.of(2000, 11, 15), athleticBilbao));
        jugadores.add(new Jugador("Dani García", "Español", LocalDate.of(1990, 5, 24), athleticBilbao));
        jugadores.add(new Jugador("Iker Muniain", "Español", LocalDate.of(1992, 12, 19), athleticBilbao));
        jugadores.add(new Jugador("Óscar de Marcos", "Español", LocalDate.of(1989, 4, 14), athleticBilbao));
        jugadores.add(new Jugador("Iñaki Williams", "Español", LocalDate.of(1994, 6, 15), athleticBilbao));
        jugadores.add(new Jugador("Asier Villalibre", "Español", LocalDate.of(1998, 9, 30), athleticBilbao));

		
		// Jugadores Atlético Madrid
		Equipo atleticoMadrid = equipos.get("Atlético Madrid");
		
		jugadores.add(new Jugador("Jan Oblak", "Esloveno", LocalDate.of(1993, 1, 7), atleticoMadrid));
		jugadores.add(new Jugador("José Giménez", "Uruguayo", LocalDate.of(1995, 1, 20), atleticoMadrid));
		jugadores.add(new Jugador("Stefan Savic", "Montenegrino", LocalDate.of(1991, 1, 8), atleticoMadrid));
		jugadores.add(new Jugador("Renan Lodi", "Brasileño", LocalDate.of(1998, 4, 8), atleticoMadrid));
		jugadores.add(new Jugador("Koke", "Español", LocalDate.of(1992, 1, 8), atleticoMadrid));
		jugadores.add(new Jugador("Saúl Ñíguez", "Español", LocalDate.of(1994, 11, 21), atleticoMadrid));
		jugadores.add(new Jugador("Marcos Llorente", "Español", LocalDate.of(1995, 1, 30), atleticoMadrid));
		jugadores.add(new Jugador("Yannick Carrasco", "Belga", LocalDate.of(1993, 9, 4), atleticoMadrid));
		jugadores.add(new Jugador("João Félix", "Portugués", LocalDate.of(1999, 11, 10), atleticoMadrid));
		jugadores.add(new Jugador("Ángel Correa", "Argentino", LocalDate.of(1995, 3, 9), atleticoMadrid));
		jugadores.add(new Jugador("Luis Suárez", "Uruguayo", LocalDate.of(1987, 1, 24), atleticoMadrid));

		// Jugadores Deportivo Alavés
		Equipo alaves = equipos.get("Deportivo Alavés");
		
		jugadores.add(new Jugador("Nikola Maraš", "Serbio", LocalDate.of(1996, 12, 19), alaves));
		jugadores.add(new Jugador("Ander Guevara", "Español", LocalDate.of(1997, 7, 7), alaves));
		jugadores.add(new Jugador("Antonio Blanco", "Español", LocalDate.of(2000, 7, 23), alaves));
		jugadores.add(new Jugador("Andoni Gorosabel", "Español", LocalDate.of(1996, 8, 4), alaves));
		jugadores.add(new Jugador("Kike", "Español", LocalDate.of(1989, 11, 25), alaves));
		jugadores.add(new Jugador("Nahuel Tenaglia", "Argentino", LocalDate.of(1996, 2, 22), alaves));
		jugadores.add(new Jugador("Samu Omorodion", "Español", LocalDate.of(2001, 5, 14), alaves));
		jugadores.add(new Jugador("Ianis Hagi", "Rumano", LocalDate.of(1998, 10, 22), alaves));
		jugadores.add(new Jugador("Jon Karrikaburu", "Español", LocalDate.of(2001, 4, 12), alaves));
		jugadores.add(new Jugador("Álex Sola", "Español", LocalDate.of(1998, 3, 4), alaves));
		jugadores.add(new Jugador("Carlos Vicente", "Español", LocalDate.of(1997, 12, 6), alaves));

		// Jugadores FC Barcelona
		Equipo fcBarcelona = equipos.get("FC Barcelona");
		
		jugadores.add(new Jugador("Marc-André ter Stegen", "Alemán", LocalDate.of(1992, 4, 30), fcBarcelona));
		jugadores.add(new Jugador("Ronald Araújo", "Uruguayo", LocalDate.of(1999, 3, 7), fcBarcelona));
		jugadores.add(new Jugador("Jordi Alba", "Español", LocalDate.of(1989, 3, 21), fcBarcelona));
		jugadores.add(new Jugador("Sergio Busquets", "Español", LocalDate.of(1988, 7, 16), fcBarcelona));
		jugadores.add(new Jugador("Frenkie de Jong", "Holandés", LocalDate.of(1997, 5, 12), fcBarcelona));
		jugadores.add(new Jugador("Pedri", "Español", LocalDate.of(2002, 11, 25), fcBarcelona));
		jugadores.add(new Jugador("Ansu Fati", "Español", LocalDate.of(2002, 10, 31), fcBarcelona));
		jugadores.add(new Jugador("Ousmane Dembélé", "Francés", LocalDate.of(1997, 5, 15), fcBarcelona));
		jugadores.add(new Jugador("Gavi", "Español", LocalDate.of(2004, 8, 5), fcBarcelona));
		jugadores.add(new Jugador("Eric García", "Español", LocalDate.of(2001, 1, 9), fcBarcelona));
		jugadores.add(new Jugador("Robert Lewandowski", "Polaco", LocalDate.of(1988, 8, 21), fcBarcelona));

		Equipo getafeCF = equipos.get("Getafe CF");
        // Jugadores Getafe CF
        jugadores.add(new Jugador("David Soria", "Español", LocalDate.of(1993, 4, 4), getafeCF));
        jugadores.add(new Jugador("Djené Dakonam", "Togolés", LocalDate.of(1991, 12, 31), getafeCF));
        jugadores.add(new Jugador("Erick Cabaco", "Uruguayo", LocalDate.of(1995, 4, 19), getafeCF));
        jugadores.add(new Jugador("Mathías Olivera", "Uruguayo", LocalDate.of(1997, 10, 31), getafeCF));
        jugadores.add(new Jugador("Marc Cucurella", "Español", LocalDate.of(1998, 7, 22), getafeCF));
        jugadores.add(new Jugador("Mauro Arambarri", "Uruguayo", LocalDate.of(1995, 9, 30), getafeCF));
        jugadores.add(new Jugador("Nemanja Maksimović", "Serbio", LocalDate.of(1995, 1, 26), getafeCF));
        jugadores.add(new Jugador("Carles Aleñá", "Español", LocalDate.of(1998, 1, 5), getafeCF));
        jugadores.add(new Jugador("Enes Ünal", "Turco", LocalDate.of(1997, 5, 10), getafeCF));
        jugadores.add(new Jugador("Jaime Mata", "Español", LocalDate.of(1988, 10, 24), getafeCF));
        jugadores.add(new Jugador("Cucho Hernández", "Colombiano", LocalDate.of(1999, 4, 20), getafeCF));

		
		// Jugadores Real Madrid
		Equipo realMadrid = equipos.get("Real Madrid");
		
		jugadores.add(new Jugador("Thibaut Courtois", "Belga", LocalDate.of(1992, 5, 11), realMadrid));
		jugadores.add(new Jugador("Dani Carvajal", "Español", LocalDate.of(1992, 1, 11), realMadrid));
		jugadores.add(new Jugador("Sergio Ramos", "Español", LocalDate.of(1986, 3, 30), realMadrid));
		jugadores.add(new Jugador("Raphael Varane", "Francés", LocalDate.of(1993, 4, 25), realMadrid));
		jugadores.add(new Jugador("Ferland Mendy", "Francés", LocalDate.of(1995, 6, 8), realMadrid));
		jugadores.add(new Jugador("Casemiro", "Brasileño", LocalDate.of(1992, 2, 23), realMadrid));
		jugadores.add(new Jugador("Toni Kroos", "Alemán", LocalDate.of(1990, 1, 4), realMadrid));
		jugadores.add(new Jugador("Luka Modric", "Croata", LocalDate.of(1985, 9, 9), realMadrid));
		jugadores.add(new Jugador("Eden Hazard", "Belga", LocalDate.of(1991, 1, 7), realMadrid));
		jugadores.add(new Jugador("Karim Benzema", "Francés", LocalDate.of(1987, 12, 19), realMadrid));
		jugadores.add(new Jugador("Marco Asensio", "Español", LocalDate.of(1996, 1, 21), realMadrid));

        // Jugadores Real Sociedad
		Equipo realSociedad = equipos.get("Real Sociedad");
		
        jugadores.add(new Jugador("Álex Remiro", "Español", LocalDate.of(1995, 3, 24), realSociedad));
        jugadores.add(new Jugador("Aritz Elustondo", "Español", LocalDate.of(1994, 3, 28), realSociedad));
        jugadores.add(new Jugador("Robin Le Normand", "Francés", LocalDate.of(1996, 11, 11), realSociedad));
        jugadores.add(new Jugador("Nacho Monreal", "Español", LocalDate.of(1986, 2, 26), realSociedad));
        jugadores.add(new Jugador("Joseba Zaldua", "Español", LocalDate.of(1992, 6, 24), realSociedad));
        jugadores.add(new Jugador("Mikel Merino", "Español", LocalDate.of(1996, 6, 22), realSociedad));
        jugadores.add(new Jugador("Martín Zubimendi", "Español", LocalDate.of(1999, 2, 2), realSociedad));
        jugadores.add(new Jugador("Portu", "Español", LocalDate.of(1992, 5, 21), realSociedad));
        jugadores.add(new Jugador("Mikel Oyarzabal", "Español", LocalDate.of(1997, 4, 21), realSociedad));
        jugadores.add(new Jugador("Alexander Isak", "Sueco", LocalDate.of(1999, 9, 21), realSociedad));
        jugadores.add(new Jugador("David Silva", "Español", LocalDate.of(1986, 1, 8), realSociedad));

		// Jugadores Sevilla FC
		Equipo sevillaFC = equipos.get("Sevilla FC");

		jugadores.add(new Jugador("Yassine Bounou", "Marroquí", LocalDate.of(1991, 4, 5), sevillaFC));
		jugadores.add(new Jugador("Jules Koundé", "Francés", LocalDate.of(1998, 11, 12), sevillaFC));
		jugadores.add(new Jugador("Diego Carlos", "Brasileño", LocalDate.of(1993, 3, 15), sevillaFC));
		jugadores.add(new Jugador("Marcos Acuña", "Argentino", LocalDate.of(1991, 10, 28), sevillaFC));
		jugadores.add(new Jugador("Fernando", "Brasileño", LocalDate.of(1987, 7, 25), sevillaFC));
		jugadores.add(new Jugador("Joan Jordán", "Español", LocalDate.of(1994, 7, 6), sevillaFC));
		jugadores.add(new Jugador("Ivan Rakitic", "Croata", LocalDate.of(1988, 3, 10), sevillaFC));
		jugadores.add(new Jugador("Lucas Ocampos", "Argentino", LocalDate.of(1994, 7, 11), sevillaFC));
		jugadores.add(new Jugador("Suso", "Español", LocalDate.of(1993, 11, 19), sevillaFC));
		jugadores.add(new Jugador("Youssef En-Nesyri", "Marroquí", LocalDate.of(1997, 6, 1), sevillaFC));
		jugadores.add(new Jugador("Rafa Mir", "Español", LocalDate.of(1997, 6, 18), sevillaFC));
		
		Equipo villarrealCF = equipos.get("Villarreal CF");
        // Jugadores Villarreal CF
        jugadores.add(new Jugador("Gerónimo Rulli", "Argentino", LocalDate.of(1992, 5, 20), villarrealCF));
        jugadores.add(new Jugador("Pau Torres", "Español", LocalDate.of(1997, 1, 16), villarrealCF));
        jugadores.add(new Jugador("Raúl Albiol", "Español", LocalDate.of(1985, 9, 4), villarrealCF));
        jugadores.add(new Jugador("Alfonso Pedraza", "Español", LocalDate.of(1996, 4, 9), villarrealCF));
        jugadores.add(new Jugador("Juan Foyth", "Argentino", LocalDate.of(1998, 1, 12), villarrealCF));
        jugadores.add(new Jugador("Étienne Capoue", "Francés", LocalDate.of(1988, 7, 11), villarrealCF));
        jugadores.add(new Jugador("Dani Parejo", "Español", LocalDate.of(1989, 4, 16), villarrealCF));
        jugadores.add(new Jugador("Samuel Chukwueze", "Nigeriano", LocalDate.of(1999, 5, 22), villarrealCF));
        jugadores.add(new Jugador("Gerard Moreno", "Español", LocalDate.of(1992, 4, 7), villarrealCF));
        jugadores.add(new Jugador("Paco Alcácer", "Español", LocalDate.of(1993, 8, 30), villarrealCF));
        jugadores.add(new Jugador("Arnaut Danjuma", "Holandés", LocalDate.of(1997, 1, 31), villarrealCF));

        return jugadores;
	}
}
