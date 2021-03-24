package com.company;

import java.util.ArrayList;

public class Pagina {

    String id = "portada";
    String user= "index";
    ArrayList<String> comandesPossibles = new ArrayList<>();
    String titol = "portada";
    ArrayList<String> contingut = new ArrayList<>();

    Guardades folder=new Guardades();
    String paginaGuardadaBuscada=folder.existeix(this.user);


    void carregaPagina(String paginaActual) {
        Demana demana= new Demana();
        comandesPossibles.clear();
        contingut.clear();
        id = paginaActual;
        this.user= id;
        switch (id) {
            case "portada":
                comandesPossibles.add("index");
                titol = "portada";
                contingut.add("");
                break;
            case "index":
                comandesPossibles.add("how");
                comandesPossibles.add("crear");
                comandesPossibles.add("llista");
                comandesPossibles.add("apaga");
                titol = "Index                                ";
                contingut.add("- How to use it. (manual del DEATH NOTE)                    ");     // Crear metode per centrar el contingut, justificarlo a esquerre o dreta
                contingut.add(" ");

                contingut.add("- Crear nota nova. (ja saps a qui mataràs?)                 ");
                contingut.add(" ");

                contingut.add("- Llista notes guardades.  (a qui has matat?)               ");
                contingut.add(" ");

                contingut.add("- Apaga el programa.   (no t'oblidis d'amagar-me bé)        ");
                break;
            case "how":
                comandesPossibles.add("how2");
                comandesPossibles.add("index");
                titol = " 1 -  How to use it                          ";
                contingut.add("- The human whose name is written in this note shall die.");
                contingut.add("  This note will not take effect unless the writer has the");
                contingut.add("  subject's face in mind when writing his/her name. This is");
                contingut.add("  to prevent people who share the same name from being");
                contingut.add("  affected.");
                contingut.add("");
                contingut.add("- If the cause of death is written within 40 seconds of the");
                contingut.add("  subject's name, it will happen.");
                contingut.add("");
                contingut.add("- If the cause of death is not specified, the subject will");
                contingut.add("  die of a heart attack. ");
                contingut.add("- After writing the cause of death, details of death should ");
                contingut.add(" be entered within the next six minutes and 40 seconds. ");
                break;
            case "crear":
                comandesPossibles.add(demana.text());
                comandesPossibles.add("index");
                titol = "Crear:                                 ";
                contingut.add("");
                contingut.add("Nom persona: ");
                break;
            case "crear2":
                comandesPossibles.add(demana.text());
                comandesPossibles.add("index");
                titol = "Crear:                                 ";
                contingut.add("");
                contingut.add("Nom persona: ");
                contingut.add("");
                contingut.add("Cognom persona: ");
                break;
            case "crear3":
                comandesPossibles.add(demana.text());
                comandesPossibles.add("index");
                titol = "Crear:                                 ";
                contingut.add("");
                contingut.add("Nom persona: ");
                contingut.add("");
                contingut.add("Cognom persona: ");
                contingut.add("");
                contingut.add("Causa de mort: ");
                break;
            case "crear4":
                comandesPossibles.add("-especificacions-");
                comandesPossibles.add("index");
                titol = "Matar:                                 ";
                contingut.add("");
                contingut.add("Nom persona: ");
                contingut.add("");
                contingut.add("Cognom persona: ");
                contingut.add("");
                contingut.add("Causa de mort: ");
                contingut.add("");
                contingut.add("Especificacions: ");
                contingut.add("");
                break;
            case "llista":

                titol = "Morts:                                 ";
                for (String i : folder.paginesGuardades) {
                    contingut.add(" ");
                    contingut.add("- " + i);
                }
                break;
          /*  case "guardada":
                titol= id;
                contingut.add("hola");
                //                                                  s'ha de fer un metode abans que comprobi si la comanda és una nota dintre de la llista paginesGuardades
                    break;    */
            default:
                comandesPossibles.add("index");
                break;

        }
    }

    /*public void print(Pagina pagina) {
        int alturaTitol=2;
        int alturaContingut=5;
        int maxContingut=25;
        int alturaComandes=28;
        int alturaSeparador=26;
        int alt= 30;
        int ample= 70;
        int comnd=0;
        System.out.println();
        System.out.println();
        for (int i = 0; i < alt; i++) {
            for (int j = 0; j < ample; j++) {
                if (i == alturaTitol && j >= 5 && j<ample-2) {
                    if (j == (ample / 2) - (pagina.titol.length()) / 2) {
                        System.out.print(pagina.titol);
                        if (pagina.titol.length() % 2 == 0)
                            System.out.print(" ");
                    }
                } else if (i >= alturaContingut && i <= maxContingut && j >= 5 && j<ample-2) {
                    if (j == 5) {
                        System.out.print(pagina.contingut.get(i - alturaContingut));
                    }
                }else if(i==alturaSeparador&&j>=5 && j<ample-2){
                    if(j>= (ample / 2) - (" Comandes: ").length() / 2&& j<=(ample/2) + (" Comandes: ").length()/2){
                        if (j==(ample / 2) - (" Comandes: ").length() / 2){
                            System.out.print(" Comandes: ");
                        }
                    }else if (j>=5 && j<ample-6){
                        System.out.print("─");
                    }
                } else if (i == alturaComandes && j >= 5 && j < ample-2) {
                    String comandesEnText=" ";
                    for (String x: comandesPossibles){
                        comandesEnText+="<";
                        comandesEnText+=x;
                        comandesEnText+="> ";
                    }
                    if (j == (ample / 2) - (comandesEnText.length()) / 2) {
                        System.out.print(comandesEnText);
                    }
                }else{
                    if (j<3) {
                        if (j < 2 ) {
                            System.out.print("=");
                        }else{
                            if(j==2)
                                System.out.print("|");
                        }
                    }else if (j==ample-1){
                        System.out.print("|");
                    }else{
                        System.out.print(" ");
                    }

                }

            }
            System.out.println();
        }
    } */
    public void print(Pagina pagina) {
        int alturaTitol = 3;
        int alturaContingut = 8;
        int maxContingut = 25;
        int alturaComandes = 28;
        int alturaSeparador = 27;
        int alt = 30;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < alt; i++) {

            if (i == alturaTitol) {
                System.out.print("==|   ");
                System.out.printf("%61s", pagina.titol);
                System.out.print("  |");
                System.out.println();
            } else if (i >= alturaContingut && i < maxContingut) {
                if (i == alturaContingut) {
                    int contador=0;
                    for (int j = 0; j < pagina.contingut.size(); j++,contador++) {
                        System.out.print("==|   ");
                        System.out.printf("%61s", pagina.contingut.get(j));
                        System.out.print("  |");
                        System.out.println();
                    }
                    i+=contador-1;
                }else{
                    System.out.println("==|                                                                  |");
                }
            }else if (i== alturaSeparador){
                System.out.print("==|   ");
                System.out.printf("%61s", "    ─────────────────────"+ " Comandes: "+"─────────────────────    ");
                System.out.print("  |");
                System.out.println();
            }else if (i==alturaComandes){
                String lesComandesJuntes=" ";
                for (int j = 0; j < pagina.comandesPossibles.size(); j++) {
                    lesComandesJuntes+=pagina.comandesPossibles.get(j)+"   ";
                }
                System.out.print("==|   ");
                System.out.printf("%61s", lesComandesJuntes);
                System.out.print("  |");
                System.out.println();
            }else if(i==0 || i== alt-1){
                System.out.println("==|%###%#%#%#%#%#%###################################################|");
            }else{
                System.out.println("==|                                                                  |");
            }

        }
        System.out.println();
        System.out.println();
    }
}