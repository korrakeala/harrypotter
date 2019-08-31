package app;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.*;
import app.hechizos.*;
import app.personajes.*;

/**
 * JuegoHarryPotter
 */
public class JuegoHarryPotter {

    public static List<Personaje> Personajes = new ArrayList<Personaje>();
    public static List<Hechizo> Hechizos = new ArrayList<Hechizo>();
    public static List<Artefacto> Artefactos = new ArrayList<Artefacto>();

    public static void InicializarJuego() {
        agregarPersonajes();
        agregarHechizos();
        agregarArtefactos();
    }

    public static void agregarPersonajes() {
        Wizard harry = new Wizard();
        harry.nombre = "Harry Potter";
        harry.salud = 100;
        harry.estaVivo = true;
        harry.edad = 30;
        harry.energiaMagica = 1000;
        Poder parsel = new Parseltongue();
        harry.setPoderInicial(parsel);
        harry.escoba = new Escoba("Saeta de Fuego");
        Artefacto capa = new CapaInvisibilidad();
        harry.artefactos.add(capa);
        CaveInimicum ci = new CaveInimicum();
        harry.aprender(ci);
        RictusSempra rs = new RictusSempra();
        harry.aprender(rs);

        JuegoHarryPotter.Personajes.add(harry);

        Elfo dobby = new Elfo();
        dobby.nombre = "Dobby";
        dobby.salud = 100;
        dobby.estaVivo = true;
        dobby.edad = 45;
        Protego pro = new Protego();
        dobby.aprender(pro);
        rs = new RictusSempra();
        dobby.aprender(rs);

        JuegoHarryPotter.Personajes.add(dobby);

        Elfo kreacher = new Elfo();
        kreacher.nombre = "Kreacher";
        kreacher.salud = 100;
        kreacher.estaVivo = true;
        kreacher.edad = 55;
        pro = new Protego();
        kreacher.aprender(pro);
        PetrificusTotalus pe = new PetrificusTotalus();
        kreacher.aprender(pe);

        JuegoHarryPotter.Personajes.add(kreacher);

        Wizard snape = new Wizard();
        snape.nombre = "Severus Snape";
        snape.salud = 100;
        snape.estaVivo = true;
        snape.edad = 65;
        snape.energiaMagica = 1000;
        Sectumsempra sc = new Sectumsempra();
        snape.aprender(sc);
        ci = new CaveInimicum();
        snape.aprender(ci);
        AvadaKedavra ak = new AvadaKedavra();
        snape.aprender(ak);

        JuegoHarryPotter.Personajes.add(snape);

        Wizard albus = new Wizard();
        albus.nombre = "Albus Dumbledore";
        albus.salud = 100;
        albus.estaVivo = true;
        albus.edad = 180;
        albus.energiaMagica = 5000;
        ci = new CaveInimicum();
        albus.aprender(ci);
        rs = new RictusSempra();
        albus.aprender(rs);
        pe = new PetrificusTotalus();
        albus.aprender(pe);
        pro = new Protego();
        albus.aprender(pro);
        Artefacto sauco = new VaritaSauco();
        albus.artefactos.add(sauco);

        JuegoHarryPotter.Personajes.add(albus);

        Muggle petunia = new Muggle();
        petunia.nombre = "Petunia Dursley";
        petunia.salud = 100;
        petunia.estaVivo = true;
        petunia.edad = 65;

        JuegoHarryPotter.Personajes.add(petunia);

    }

    public static void agregarHechizos() {

    }

    public static void agregarArtefactos() {

    }

    public static Personaje buscarPersonaje(String nombre) {
        for (Personaje p : JuegoHarryPotter.Personajes) {
            if (nombre.equals(p.nombre)) {
                return p;
            } else {
                if (!nombre.equals(p.nombre)) {
                    System.out.println("El personaje no existe.");
                }
            } 
        }
        return null;

    }

}