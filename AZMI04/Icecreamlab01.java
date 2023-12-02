package AZMI04;

import java.util.Scanner;

class IcereamLab {
    public static void main(String[] args) {
        Icecream[] ice = new Icecream[5];
        Scanner input = new Scanner(System.in);
        int count;
        
        // Your code here
        
        
        for (int i = 0; i < ice.length; i++) {
            count = i + 1;
            System.out.println("For Company: " + count);
            System.out.print("Enter IceCream Type:");
            String icecreamType = input.nextLine();
            System.out.print("Enter the company Name:");
            String icecreamCompany = input.nextLine();
            System.out.print("Enter the Price:");
            double icecreamPrice = input.nextDouble();
            input.nextLine();
            System.out.println("");
            ice[i] = new Icecream(icecreamType, icecreamCompany,
                    icecreamPrice);
        }
        System.out.println("The following companys information: ");
        for (int i = 0; i < ice.length; i++) {
            count = i + 1;
            System.out.println("Company " + count + "~ Type:" +
                    ice[i].toString());
        }
        System.out.println("");
        input.close();
    }
}

class Icecream {
    String icecreamType;
    String icecreamCompany;
    double icecreamPrice;

    public Icecream() {
    }

    Icecream(String icecreamType, String icecreamCompany, double icecreamPrice) {
        this.icecreamType = icecreamType;
        this.icecreamCompany = icecreamCompany;
        this.icecreamPrice = icecreamPrice;
    }

    void setIcecreamType(String icecreamType) {
        this.icecreamType = icecreamType;
    }

    void setIcecreamCompany(String icecreamCompany) {
        this.icecreamCompany = icecreamCompany;
    }

    void setIcecreamPrice(double icecreamPrice) {
        this.icecreamPrice = icecreamPrice;
    }

    String getIcecreamType() {
        return icecreamType;
    }

    String getIcecreamCompany() {
        return icecreamCompany;
    }

    double getIcecreamPrice() {
        return icecreamPrice;
    }

    public String toString() {
        String searchByCompany;
        searchByCompany = icecreamType + (", Name:" + " ");
        searchByCompany += icecreamCompany + (", Price:" + " ");
        searchByCompany += icecreamPrice;
        return searchByCompany;
    }
}
