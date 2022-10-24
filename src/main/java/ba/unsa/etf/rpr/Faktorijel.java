package ba.unsa.etf.rpr;

public class Faktorijel
{
    public static int Izracunaj(int b){
        int fact=1;
        for(int i=1;i<=b;i++)
        {
            fact*=i;
        }
    return fact;
}
}
