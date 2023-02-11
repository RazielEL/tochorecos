package org.example.proby;

public class Obiekty{

    // klasa z obiektami

    public class Obj  {
        private static String desc = "Janusz Maj";
        private static Integer dl = 5;
        private static Integer wys = 9;

    private static PageObject obj = new PageObject(desc,dl,wys);
    public static PageObject get(){ return obj;}
    }

    public class Obj1 {
        private static String desc = "Janek Wisniewski";
        private static Integer dl = 10;
        private static Integer wys = 20;

        private static PageObject obj1 = new PageObject(desc,dl,wys);
        public static PageObject get(){ return obj1;}
    }


}
