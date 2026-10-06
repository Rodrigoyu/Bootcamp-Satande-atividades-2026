import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        ArrayList<String> alimentacoes = new ArrayList<>();
        alimentacoes.add(ler.nextLine());
        alimentacoes.add(ler.nextLine());
        alimentacoes.add("Feijão");
        for(String i : alimentacoes ){
            System.out.println(i);
        }
        System.out.println(alimentacoes);

    }
}