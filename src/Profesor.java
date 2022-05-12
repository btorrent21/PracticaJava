public class Profesor extends Persona {
    private double sou;

    public void canviarSou (double sou) throws Exception{
        if(sou < 0 || sou > 3000) {   
            throw new Exception("Error, el sou no es possible");
        } else {
            //System.out.println("Error, el sou no es possible");
            this.sou = sou; 
        }
    }

    public String obtenirDades() throws Exception {

        return super.obtenirDades() + " amb nou sou " + sou;
    }

}
