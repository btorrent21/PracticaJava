import java.lang.reflect.Array;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        Institut ins = new Institut("Institut La Guineueta");
        String dades = ins.imprimirInformacio();
        System.out.println(dades);

        Persona P1 = new Persona();
    
        P1.canviarNom("Bernat Torrent");
        P1.canviarDni("78347294P");
        String Dades = P1.obtenirDades();
        System.out.println("Persona" + Dades);

        Estudiant E = new Estudiant();
        E.posarNota(7);
        E.posarNota(3);
        E.posarNota(7);
        E.posarNota(6);
        E.posarNota(10);
        E.posarNota(4);
        E.posarNota(8);
        E.canviarNom("Guillem");
        E.canviarDni("72931934M");
        Dades = E.obtenirDades();
        System.out.println(Dades);

        Profesor P = new Profesor();
        P.canviarSou(2600);
        P.canviarNom("Oriol");
        P.canviarDni("56126245L");
        Dades = P.obtenirDades();
        System.out.println("Profesor" + Dades);

        ProfessorSubstitut PS = new ProfessorSubstitut();
        Date dataInici = new Date(2022, 3, 8);
        Date dataFi = new Date(2022, 5, 22);
        PS.assignarSubstitucio(dataInici ,dataFi);
        PS.canviarSou(1200);
        PS.canviarDni("53264181Y");
        PS.canviarNom("Marc");
        PS.obtenirDades();
        Dades = PS.obtenirDades();
        System.out.println(Dades);
    }
}
