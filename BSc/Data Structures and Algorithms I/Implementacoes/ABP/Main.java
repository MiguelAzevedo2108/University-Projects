package ABPP;

public class Main
{
    public static void main (String [] args)
    {
        Agenda agenda = new Agenda();

        Contacto luis = new Contacto("luis",13);
        Contacto ricardo = new Contacto("ricardo",1300);

        agenda.insere_Contacto(luis);
        agenda.insere_Contacto(ricardo);

        agenda.print_Contactos();
        System.out.println();
        agenda.chamada(1300);
    }
}
