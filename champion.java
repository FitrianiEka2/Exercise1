public class champion {
    int point;
    String name, motorcycle;

    champion() {
        this.name = "Joan Mir";
        this.motorcycle = "Suzuki Ecstar";
        this.point = 171;
    }

    champion (String n,String m, int p){
        this.name = n;
        this.motorcycle = m;
        this.point = p;
    }

    public void printchampion() {
        champion obj1 = new champion();
        champion obj2 = new champion("Franco Morbidelli", "Petronas Yamaha SRT", 158);
        champion obj3 = new champion("Alex Rins", "Suzuki Ecstar", 139);
        champion obj4 = new champion("Andrea Dovizioso", "Ducati", 135);
        champion obj5 = new champion("Pol Espargaro", "Red Bull KTM", 135);

        System.out.println("Champion 1:\n Name: "+obj1.name+"\n" + " Motorcycle: "+obj1.motorcycle+"\n" + " Point: "+obj1.point+"\n");
        System.out.println("Champion 2:\n Name: "+obj2.name+"\n" + " Motorcycle: "+obj2.motorcycle+"\n" + " Point: "+obj2.point+"\n");
        System.out.println("Champion 3:\n Name: "+obj3.name+"\n" + " Motorcycle: "+obj3.motorcycle+"\n" + " Point: "+obj3.point+"\n");
        System.out.println("Champion 4:\n Name: "+obj4.name+"\n" + " Motorcycle: "+obj4.motorcycle+"\n" + " Point: "+obj4.point+"\n");
        System.out.println("Champion 5:\n Name: "+obj5.name+"\n" + " Motorcycle: "+obj5.motorcycle+"\n" + " Point: "+obj5.point+"\n");
        }
    }
