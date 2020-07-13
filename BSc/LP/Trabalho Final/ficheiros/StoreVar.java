import java.util.*;

public class StoreVar extends Instrucao {
    int n1, n2;

    public StoreVar(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public String toString() {
        return "store_var " + n1 + " " + n2;
    }

    public void executar(TISC maquina) {
        RegistosAtivacao temp = maquina.registosAtivacao.peek();
      
        for (int i = 0; i < n1; i++) 
        {
            temp = maquina.registosAtivacao.get(temp.acessLink);
        }
        int topo = maquina.getPilha().pop();
        temp.variaveis[n2 - 1] = topo;
        maquina.pc++;
    }

}