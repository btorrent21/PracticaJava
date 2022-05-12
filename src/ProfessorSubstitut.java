import java.util.Date;

public class ProfessorSubstitut extends Profesor{
    private Date dataInici;
    private Date dataFi;

    public void ProfessorSubstitut(){

    }

    public void assignarSubstitucio(Date dataInici, Date dataFi){
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }


    public String obtenirDades() throws Exception {
        return "Profesor substitut" +  super.obtenirDades() + " Data Inici: " + dataInici + " Data final: " + dataFi;
    }

}
