public class App {
    public static void main(String[] args) throws Exception {
    
        p1.canviarNom("Marc");
        dades = p1.obtenirDades();
        System.out.println(dades);
        
        p1.canviarNom("Albert");
        dades = p1.obtenirDades();
        System.out.println(dades);

        Estudiant e = new Estudiant();
        e.posarNota(7.5);
        e.canviarNom("Manel");
        dades = e.obtenirDades();
        System.out.println(dades);
    }
}
