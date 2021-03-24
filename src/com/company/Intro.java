package com.company;

public class Intro {
String salutacio;
String propietatDe=" Property of:   Shinigami Uri ";
String despedida;
int alturaText= 6;
    public Intro(String salutacio, String despedida) {
        this.salutacio=salutacio;
        this.despedida=despedida;
    }

    void reproduir(String dibuixPortada) throws InterruptedException {
        int alt= 30;
        int ample= 70;
        // altura text fora
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        switch (dibuixPortada){
            case "simplementNegre":

                for (int i = 0; i < alt; i++) {
                    for (int j = 0; j < ample; j++) {
                        if (i==alturaText && j >= (ample/2)-(salutacio.length())/2 && j <= (ample/2)+(salutacio.length())/2) {
                            if (j==(ample/2)-(salutacio.length())/2){
                                System.out.print(salutacio);
                                if (salutacio.length()%2==0)
                                    System.out.print(" ");
                            }
                        }else if (i==alturaText+18 && j >= (ample/2)-(propietatDe.length())/2 && j <= (ample/2)+(propietatDe.length())/2) {
                            if (j==(ample/2)-(propietatDe.length())/2){
                                System.out.print(propietatDe);
                                if (propietatDe.length()%2==0)
                                    System.out.print(" ");
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
                                if ((i+6)*2%3<1&& j*2%10<2){
                                    System.out.print("%");  // trama un cada molts quadriculat
                                }else if(i*j<100){
                                    if(i*j%2==0)
                                        System.out.print("#");  // part superior de la flama prima relleno
                                    else
                                        System.out.print("%");  // part superior de la flama prima   reflexes
                                }else if (i*j<200){
                                    System.out.print("#");  // flama prima sobre la flama original
                                }else if (i*j>500){
                                    System.out.print("#");  // semicercle sota la flama

                                }else if (i*j%2==0){
                                    System.out.print("#"); // la flama omplir
                                }else{
                                    System.out.print("%"); // el reflexe de la flama
                                }
                            }

                        }

                    }
                    System.out.println();
                }
                break;

            case "pla":
                for (int i = 0; i < alt; i++) {
                    for (int j = 0; j < ample; j++) {
                        if (i==alturaText && j >= (ample/2)-(salutacio.length())/2 && j <= (ample/2)+(salutacio.length())/2) {
                            if (j==(ample/2)-(salutacio.length())/2){
                                System.out.print(salutacio);
                                if (salutacio.length()%2==0)
                                    System.out.print(" ");
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
                                if ((i+6)*2%3<1&& j*2%10<2){
                                    System.out.print("#");  // trama un cada molts quadriculat
                                }else if(i*j<100){
                                    if(i*j%2==0)
                                        System.out.print("#");  // part superior de la flama prima relleno
                                    else
                                        System.out.print("#");  // part superior de la flama prima   reflexes
                                }else if (i*j<200){
                                    System.out.print("#");  // flama prima sobre la flama original
                                }else if (i*j>500){
                                    System.out.print("#");  // semicercle sota la flama

                                }else if (i*j%2==0){
                                    System.out.print("#"); // la flama omplir
                                }else{
                                    System.out.print("#"); // el reflexe de la flama
                                }
                            }

                        }

                    }
                    System.out.println();
                }
                break;

            case "flama":
                for (int i = 0; i < alt; i++) {
                    for (int j = 0; j < ample; j++) {
                        if (i==alturaText && j >= (ample/2)-(salutacio.length())/2 && j <= (ample/2)+(salutacio.length())/2) {
                            if (j==(ample/2)-(salutacio.length())/2){
                                System.out.print(salutacio);
                                if (salutacio.length()%2==0)
                                    System.out.print(" ");
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
                                if ((i+6)*2%3<1&& j*2%10<2){
                                    System.out.print("*");  // trama un cada molts quadriculat
                                }else if(i*j<100){
                                    if(i*j%2==0)
                                        System.out.print("#");  // part superior de la flama prima relleno
                                    else
                                        System.out.print("#");  // part superior de la flama prima   reflexes
                                }else if (i*j<200){
                                    System.out.print("*");  // flama prima sobre la flama original
                                }else if (i*j>500){
                                    System.out.print("#");  // semicercle sota la flama

                                }else if (i*j%2==0){
                                    System.out.print("·"); // la flama omplir
                                }else{
                                    System.out.print("*"); // el reflexe de la flama
                                }
                            }

                        }

                    }
                    System.out.println();

                }
                break;

            case "flama2":
                for (int i = 0; i < alt; i++) {
                    for (int j = 0; j < ample; j++) {
                        if (i==alturaText && j >= (ample/2)-(salutacio.length())/2 && j <= (ample/2)+(salutacio.length())/2) {
                            if (j==(ample/2)-(salutacio.length())/2){
                                System.out.print(salutacio);
                                if (salutacio.length()%2==0)
                                    System.out.print(" ");
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
                                if ((i+6)*2%3<1&& j*2%10<2){
                                    System.out.print("·");  // trama un cada molts quadriculat
                                }else if(i*j<100){
                                    if(i*j%2==0)
                                        System.out.print(" ");  // part superior de la flama prima relleno
                                    else
                                        System.out.print(" ");  // part superior de la flama prima   reflexes
                                }else if (i*j<200){
                                    System.out.print("*");  // flama prima sobre la flama original
                                }else if (i*j>500){
                                    System.out.print("*");  // semicercle sota la flama

                                }else if (i*j%2==0){
                                    System.out.print(" "); // la flama omplir
                                }else{
                                    System.out.print(" "); // el reflexe de la flama
                                }
                            }

                        }

                    }
                    System.out.println();
                }
                break;
        }
        System.out.println();
        System.out.println();
        salutacio=despedida;
        alturaText=23;
        Thread.sleep(3000);
    }
}
