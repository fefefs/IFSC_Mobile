package com.ifsc.contaclick;

import java.util.ArrayList;

public class PlanetaDAO {

    ArrayList<Planeta> planetas;
    public PlanetaDAO() {
        this.planetas= new ArrayList<>();
        String [] nomes = new String[]{"Mercúrio","Vênus","Terra","Marte","Júpiter","Saturno","Urano","Netuno"};
        Integer[] images = new Integer[]{ R.drawable.mercury,  R.drawable.venus, R.drawable.earth, R.drawable.mars, R.drawable.jupter, R.drawable.saturn, R.drawable.uranus, R.drawable.neptune, };

        for(int i=0; i<nomes.length;i++){
            planetas.add(new Planeta(nomes[i],images[i] ));
        }
    }

    public ArrayList<Planeta> getPlanetas(){
       return this.planetas;
    }
}
