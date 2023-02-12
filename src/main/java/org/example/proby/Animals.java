package org.example.proby;

public class Animals extends BaseAnimal {

    public static class Dog extends BaseAnimal {
        private final String desc = "aaa";
        private final Integer dl = 23;
        private final Integer wys = 23;

        public Dog(){
            super.setDesc(desc);
            super.setDl(dl);
            super.setWys(wys);
        }

    }

    public static class Cat extends BaseAnimal {
       private final String desc = "aaa";
       private final Integer dl = 11;
       private final Integer wys = 11;

        public Cat(){
            super.setDesc(desc);
            super.setDl(dl);
            super.setWys(wys);
        }
    }


}
