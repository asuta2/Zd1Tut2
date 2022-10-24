package ba.unsa.etf.rpr;
import static java.lang.Math.abs;
import static java.lang.Math.sin;

public class Sinus {
    public static double Izracunaj(double a)
    {
        double acc = 0.0001, denominator, sinx, sinval;
        a = a * (3.142 / 180.0);  //convert in radian
        double temp = a;
        sinx = a;
        sinval = sin(a);
        int i = 1;
        do {
            denominator = 2 * i * (2 * i + 1);
            temp = -temp * a * a / denominator;
            sinx = sinx + temp;
            i = i + 1;
        } while (acc <= abs(sinval - sinx));
        return sinx;
    }
}
