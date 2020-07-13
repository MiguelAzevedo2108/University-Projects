package Project;
public class Desportista {

	String codigo_postal;
    String morada;
    int telefone;
    String nacionalidade;
    String clube;
    int nif;
    String nome;
    boolean exameFeito = false;
    
    
    public Desportista(String codigo_postal, String morada, int telefone, String nacionalidade, String clube, int nif, String nome) {
    	
		this.codigo_postal = codigo_postal;
		this.morada = morada;
		this.telefone = telefone;
		this.nacionalidade = nacionalidade;
		this.clube = clube;
		this.nif = nif;
		this.nome = nome;
		this.exameFeito = exameFeito;
	}
    
    
    public void setExameFeito(boolean exameFeito) {
        this.exameFeito = exameFeito;
    }
    public boolean getExameFeito(){
        return exameFeito;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
