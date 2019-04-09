package DepInj;

import java.util.Random;

public class Weather {

    private static Random random = new Random(System.currentTimeMillis());


    public String description;

    public Weather(){
        switch (random.nextInt(4)){
            case 0:
                this.description  = "Pada deszcz";
                break;
            case 1:
                this.description="Swieci slonce";
                break;
            case 2:
                this.description = "Pada snieg";
                break;
            case 3:
                this.description = "Wieje wiart";
                break;


        }


    }

}
