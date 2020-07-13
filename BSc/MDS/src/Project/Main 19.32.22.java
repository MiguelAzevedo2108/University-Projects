package Project;
import java.util.*;

public class Main {
		public static void main (String [] args) {

			Desportista atleta = new Desportista("pois","terceira",92345678,"Portuguesa","Sporting",2321,"Miguel");
			Desportista joao = new Desportista("pois","terceira",92345678,"Portuguesa","Sporting",23222221,"Miguel");
			Médico doctor = new Médico ("Joaquim",1234);
			Exame exame = new Exame(1, atleta.getNome(),doctor.getNome());
			Exame exame1 = new Exame(0,joao.getNome(),doctor.getNome());
			Administrador admin = new Administrador("Professor");
			Inscrição inscrito = new Inscrição(exame.getNumeroExame(),atleta.getClube(),atleta.getNif());
			Inscrição inscrito2 = new Inscrição(exame1.getNumeroExame(),joao.getClube(),joao.getNif());
			Registo register = new Registo(atleta.getNif(),atleta.getNome(),admin.getNome());

			doctor.fazExame(exame);
			exame.realizarExame(atleta);
			inscrito.fezInscricao(atleta,exame);
			register.registarDados(atleta,inscrito,exame);

			exame.realizarExame(joao);
			inscrito2.fezInscricao(joao,exame1);
			register.registarDados(joao,inscrito2,exame1);
			
			Recibo recibo = new Recibo(register);
			
			recibo.emiteRecibo(register);
			
		}
}
