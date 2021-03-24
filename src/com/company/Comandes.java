package com.company;


public class Comandes {
    
    boolean noVal;



    public boolean correcte(String paginaActual, Pagina pagina, String user) {
        pagina.carregaPagina(paginaActual);
        if(pagina.comandesPossibles.contains(user)){
            noVal=false;
            return true;
        }else if(pagina.folder.paginesGuardades.contains(user)){
            noVal=false;
            return true;
        }
        noVal=true;
        return false;

    }
}
