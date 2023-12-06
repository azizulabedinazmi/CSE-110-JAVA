package Azmi06;

public class Lab01 {
    public static void main(String[] args) {
        Parentclass p = new Parentclass();
        Childclass c = new Childclass();
        p.parentmethod();
        c.childmethod();
        c.parentmethod();
    }
}

class Parentclass {
    public void parentmethod() {
        System.out.println("This is parent class");
    }
}

class Childclass extends Parentclass {
    public void childmethod() {
        System.out.println("This is child class");
    }
}
