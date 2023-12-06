package Azmi06;

public class Lab02 {
    public static void main(String[] args) {
        Parentclass1 p = new Parentclass1();
        Childclass1 c = new Childclass1();
        p.parentmethod();
        c.childmethod();
        c.parentmethod();
    }
}

class Parentclass1 {
    private void parentmethod() {
        System.out.println("This is parent class");
    }
}

class Childclass1 extends Parentclass1 {
    public void childmethod() {
        System.out.println("This is child class");
    }
}