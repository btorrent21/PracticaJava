public class App {
    public static void main(String[] args) throws Exception {
    
        Profesor p1 = new Profesor();
        p1.canviarSou(2000);
       //p1.canviarNom("Marc");
        //String dades = p1.obtenirDades();
        //System.out.println(dades);

        
        //Profesor p2 = new ProfessorSubstitut();
        //p2.canviarNom("Albert");
        //dades = p2.obtenirDades();
        //System.out.println(dades);

        Estudiant e = new Estudiant();
        e.posarNota(7.5);
        e.canviarNom("Manel");
        e.assignarDni("46419187N");
        //dades = e.obtenirDades();
        //System.out.println(dades);
        System.out.println();
    }
}
