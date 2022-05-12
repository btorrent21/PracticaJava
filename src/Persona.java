public class Persona {
    //atributos privados
    private String dni;
    private String nom;

    public Persona () {
    }

    public void canviarNom (String nom) {
        this.nom = nom;
    }

    public void canviarDni (String dni) throws Exception {
        if (this.dni == null) {
            this.dni = dni;
        } else {
            throw new Exception("Error, el DNI no es pot canviar lo sentimos");
        }
    }

    public String obtenirDades () throws Exception {
        if (dni == null || nom == null ) {
            throw new Exception("Hi ha hagut un error al obtenir les Dades");
        }
        return "Persona que es diu " + nom + " Amb dni: " + dni;
    }
}
