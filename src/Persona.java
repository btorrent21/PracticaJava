public class Persona {
    private String dni;

    private String nom;

    public Persona(){
        System.out.println("Hola");
    }

    public void canviarNom(String nom){
        this.nom = nom;
    }

    public void assignarDni(String dni){
        if(dni.length() == 9) {   
            this.dni = dni;
        } else {
            System.out.println("Error, longitut no vàlida");
        }
    }

    public String obtenirDades(){
        return "Persona que es diu: " + nom + " amb el DNI: " + dni;
    }

}
