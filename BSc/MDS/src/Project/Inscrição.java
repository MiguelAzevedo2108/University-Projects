package Project;
public class Inscrição {
	int numero_exame;
    String clube;
    int nif;
    boolean inscrito = false;

    
    public Inscrição(int numero_exame, String clube, int nif) {
        this.numero_exame = numero_exame;
        this.clube = clube;
        this.nif = nif;
        boolean inscrito;
    }

    public boolean getInscrito(){
        return this.inscrito;
    }


    public boolean fezInscricao(Desportista atleta,Exame exame) {
        if (atleta.getExameFeito() == true) {
            this.inscrito = true;
            return inscrito;
        }
        System.out.print("Nao pode ser inscrito\n");
        return inscrito;
    }
}
