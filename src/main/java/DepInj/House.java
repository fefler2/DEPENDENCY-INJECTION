package DepInj;

import java.util.ArrayList;
import java.util.List;

public class House {
    List<Window> windows = new ArrayList<>();

    public House(){
        windows.add(new Window());
        windows.add(new Window());
        windows.add(new Window());
        windows.add(new Window());
    }

    public void lookOutTheWndows(){
        for (Window window: windows){
            window.lookOut();
        }
    }


    public static void main(String[] args) {

        Weather weather = new Weather();



        House house = new House();
        house.lookOutTheWndows();




    }
}
