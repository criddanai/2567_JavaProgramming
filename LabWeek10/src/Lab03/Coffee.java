package Lab03;

public class Coffee extends Drink {
    private int typeCoffee;
    private char sizeCoffee;
    private Barista barista;

    Coffee (int type, int typeCoffee, char sizeCoffee, Barista barista) {
        super(type, sizeCoffee);
        this.sizeCoffee = sizeCoffee;
        this.typeCoffee = typeCoffee;
        this.barista = barista;
    }

    Coffee () {
        this(0, 0, ' ', new Barista());
    }

    Barista getBarista() {
        return this.barista;
    }

    public String getTypeName() {
        switch (typeCoffee) {
            case 1 : return "Americano";
            case 2 : return "Espresso";
            case 3 : return "Cappuccino";
        }
        return null;
    }

    public int getTypePrice() {
        switch (typeCoffee) {
            case 1:
                return 50;
            case 2:
                return 55;
            case 3:
                return 65;
        }
        return 0;
    }

    public String getSizeName() {
        switch (sizeCoffee) {
            case 's' : case 'S' : return "Short";
            case 't' : case 'T' : return "Tall";
            case 'g' : case 'G' : return "Grande";
            case 'v' : case 'V' : return "Venti";
        }
        return null;
    }

    public int getSizePrice() {
        switch (sizeCoffee) {
            case 's' : case 'S' : return 100;
            case 't' : case 'T' : return 150;
            case 'g' : case 'G' : return 200;
            case 'v' : case 'V' : return 250;
        }
        return 0;
    }

    public int getTotalPrice() {
        return this.getTypePrice() + (this.getSizePrice() + super.getTypePrice());
    }

    public String toString() {
        return super.getTypeName() + " " + this.getTypeName() + " (" + this.getSizeName()
                + ") is " + this.getTotalPrice() + " bath" + "\nBarista: " + this.barista.getName() + " "
                + (this.barista.getGenderName());
    }
}
