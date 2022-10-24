package ba.unsa.etf.rpr;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        if(args[0]=="fact")
            System.out.println(Faktorijel.Izracunaj(Integer.parseInt(args[1])));
        else{
            System.out.println(Sinus.Izracunaj(Double.parseDouble(args[1])));
        }

        System.out.println("Hello world!");
    }
}