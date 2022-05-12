public class Institut {
    private String nom;
    private String profesor;

    public Institut(String nom){
        this.nom = nom;
        System.out.println(nom);
    }

    public void afegirProfe(String profesor) {
        this.profesor = profesor;

    }
    public void afegirEstudiant(){

    }


    public String imprimirInformacio(){
        return "El Professor es diu " + this.profesor ;
    }
}