import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        UrnaElectoral urna = new UrnaElectoral();

        Candidato c1 = new Candidato(1, "c1", "p1", null);
        urna.agregarCandidato(c1);
        Candidato c2 = new Candidato(2, "c2", "p2", null);
        urna.agregarCandidato(c2);

        Votante v1 = new Votante(1, "v1", false);
        Votante v2 = new Votante(2, "v2", false);
        Votante v3 = new Votante(3, "v3", false);
        Votante v4 = new Votante(4, "v4", true);
        Votante v5 = new Votante(3, "v5", false);
        Votante v6 = new Votante(5, "v6", false);

        urna.registrarVoto(v1, 1);
        urna.registrarVoto(v2, 1);
        urna.registrarVoto(v3, 2);
        urna.registrarVoto(v4, 2);
        urna.registrarVoto(v5, 1);
        urna.registrarVoto(v6, 3);

        System.out.println(urna.obtenerResultados());

    }
} 
