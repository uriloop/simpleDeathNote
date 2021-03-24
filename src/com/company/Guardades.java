package com.company;

import java.util.ArrayList;

public class Guardades {

    ArrayList<String> paginesGuardades = new ArrayList<>();




    public String existeix(String user) {
        if (paginesGuardades.contains(user))
            return "guardada";
        return "noguardada";
    }
}
