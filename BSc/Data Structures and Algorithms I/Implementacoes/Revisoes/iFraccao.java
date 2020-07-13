package Revisoes;

public interface iFraccao <F>
{
    void setNumerador(int num);
    void setDenominador(int num);
    int getNumerador();
    int getDenominador();
    String tooString();
    int maior (int n1, int n2);
    int mdc(int n1, int n2 );
    void reduce (F f1);
    F sum(F f1, F f2);
    F product (F f1, F f2);
    F div(F f1, F f2);
}
