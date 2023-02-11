package org.example.proby;

// klasa z tym no
public class PageObject {

    public PageObject() {}

    private String desc;
    private Integer dl;
    private Integer wys;

    public PageObject(String desc, Integer dl, Integer wys){
        super();
        this.desc = desc;
        this.dl = dl;
        this.wys = wys;
    }

    public String getDesc(){return desc;}
    public Integer getDl(){return dl;}
    public Integer getWys(){return wys;}

    public void setDesc(String desc){
        this.desc = desc;
    }

    public void setDl(Integer dl){
        this.dl = dl;
    }

    public void setWys(Integer wys){
        this.wys = wys;
    }

}
