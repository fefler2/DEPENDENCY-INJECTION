package DepInjection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien {
    public int getAid() {
        return aid;
    }

    public Alien(int aid, String aname, String tech) {
//        super();
        System.out.println("Object created");

    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    private int aid;
    private String aname;

    private String tech;

    public void show(){
        System.out.println("in show");
    }

}

