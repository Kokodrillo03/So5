import java.util.Scanner;

public class Main {

    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj N"); //60
        int N = Integer.parseInt(scan.nextLine());
        System.out.println(" Podaj p");//80
        int p = Integer.parseInt(scan.nextLine());
        System.out.println("Podaj r");//30
        int r = Integer.parseInt(scan.nextLine());
        System.out.println("Podaj z");//10
        int z = Integer.parseInt(scan.nextLine());
        System.out.println("Podaj ilosc zadan");
        int l = Integer.parseInt(scan.nextLine());
        Algorytmy alg = new Algorytmy(N, p, z, r, l, 20);
        alg.run();
    }
}