public class Profesor {

    private double sou;

    public void canviarSou (double sou) throws Exception{
        if(sou < 0 || sou > 3000) {   
            throw new Exception("Error, el sou no es possible");
        } else {
            //System.out.println("Error, el sou no es possible");
            this.sou = sou; 
        }
    }
}
