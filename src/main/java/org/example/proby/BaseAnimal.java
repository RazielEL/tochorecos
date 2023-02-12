package org.example.proby;

 abstract class BaseAnimal {

    public BaseAnimal(){}
    private String desc;
    private Integer dl;
    private Integer wys;

    // getters
    public String getDesc(){return desc;}
    public Integer getDl(){return dl;}
    public Integer getWys(){return wys;}

    // setters
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
