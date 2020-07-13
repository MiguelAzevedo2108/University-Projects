package ABPP;

public class Agenda <T extends Comparable <?super T>>
{
    ABP<Contacto> agenda;

    public Agenda()
    {
        agenda = new ABP<Contacto>();
    }

    public void insere_Contacto(Contacto contacto)
    {
        if (!agenda.contains(contacto)) {
            agenda.insere(contacto);
            System.out.println("Contacto Inserido");
        } else {
            System.out.println("Contacto Existente");
        }
    }

    public void remove_Contacto(String nome)
    {
        Contacto temp = new Contacto(nome);
        if (agenda.contains(temp)) {
            agenda.remove(temp);
            System.out.println("Contacto removido com sucesso");
        } else {
            System.out.println("Nao existe esse contacto");
        }
    }


    public void print_Contactos()
    {
        agenda.printEmOrdem();
        /*if (root != null)
        {
            print_Contactos(root.left);
            System.out.print(root.element.getNome() + " " + root.element.getNumero() + " ");
            print_Contactos(root.right);
        }*/
    }

    public Contacto search(Contacto x, ABPNode<Contacto> n) {
        if (n == null) {
            return null;
        } else if (n.element.compareTo(x) < 0) {
            return search(x, n.right);
        } else if (n.element.compareTo(x) > 0) {
            return search(x, n.left);
        }
        return n.element;
    }

    public int get_numero(String nome)
    {
        Contacto temp = new Contacto(nome);

        int numero = search(temp, agenda.root).getNumero();

        return numero;
    }

    public void chamada(int numero)
    {
        get_Nome(agenda.root, numero);
    }

    public void get_Nome(ABPNode<Contacto> root, int numero)
    {
        if (root != null)
        {
            if (root.element.getNumero() == numero)
            {
                System.out.print(root.element.getNome());
                return;
            }
            get_Nome(root.left, numero);
            get_Nome(root.right, numero);
        }
    }
}