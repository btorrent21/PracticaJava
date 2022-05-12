public class Institut {
    private String nom;
    private String profesor;
    private String estudiant;

    public Institut(String nom) {
        this.nom = nom;
    }

    public void afegirProfe(String profesor) {
        this.profesor = profesor;

    }

    public void afegirEstudiant(){

    }


    public String imprimirInformacio(){
        return "El Institut es diu " + this.nom ;
    }
}