package Project;
public class Exame {
	 int numeroExame;
	 String atleta;
	 String medico;
	 

	    public Exame(int numeroExame, String atleta, String medico) {
	        this.numeroExame = numeroExame;
	        this.atleta = atleta;
	        this.medico = medico;
	       
	    }
	    public void setNomeMedico(String medico) {
	    	this.medico = medico;
	    }
	    
	    public String getNomeMedico() {
	    	return medico;
	    }
	    
	    public int getNumeroExame() {
	        return numeroExame;
	    }

	    public void setNumeroExame(int numeroExame) {
	    	this.numeroExame = numeroExame;
	    }

	    public void realizarExame(Desportista desportista) {
	        desportista.setExameFeito(true);
	    }
}
