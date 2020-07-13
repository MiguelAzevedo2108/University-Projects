package Project;
public class Médico {
	String nomeMedico;
    int nifMedico;

    public Médico(String nomeMedico, int nifMedico){
        setNomeMedico(nomeMedico);
        setNifMedico(nifMedico);
    }

    public void setNifMedico(int nifMedico) {
        this.nifMedico = nifMedico;
    }

    public int getNif() {
    	return nifMedico;
    }
    
    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public void fazExame(Exame exame){
        exame.setNomeMedico(getNome());
    }

    public String getNome() { 
    	return nomeMedico;
    }

}
