package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan= new Scanner(System.in);
        Intro intro= new Intro("  DEATH  NOTE  "," fins aviat! ");

        intro.reproduir("simplementNegre");



        String user="index";  // el que introdueix l'user per defecte index perque volem començar sempre per l'index

        Pagina pagina= new Pagina();  // es crea la pagina amb els valors per defecte de la portada.

        while (!user.equals("apaga")){

            Comandes comanda=new Comandes();
            pagina.carregaPagina(pagina.id);
            if (!comanda.correcte(pagina.id,pagina,user)){
                System.out.println("( Comanda erronea )");

            }else{

                pagina.carregaPagina(user);
                pagina.print(pagina);           // li envio l'objecte pagina perque accedeixi als seus valors
                //Si la comanda és verdadera, executar-la.
                // Aquí comença
            }

            if (comanda.noVal){
                user="index";
            }else{
                user=scan.next();
            }
        }

        intro.reproduir("simplementNegre");
    }
}
