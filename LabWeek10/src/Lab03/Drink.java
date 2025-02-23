package Lab03;

public class Drink {
    private int type;
    private char size;

    Drink (int type, char size) {
        this.type = type;
        this.size = size;
    }

    Drink () {
        this(0, ' ');
    }

    public String getTypeName() {
        switch (type) {
            case 1 : return "Hot";
            case 2 : return "Cold";
        }
        return null;
    }

    public int getTypePrice() {
        switch (type) {
            case 1 : return 10;
            case 2 : return 20;
        }
        return 0;
    }

    public String getSizeName() {
        switch (size) {
            case 's' : case 'S' : return "Short";
            case 'm' : case 'M' : return "Medium";
            case 'l' : case 'L' : return "Large";
        }
        return null;
    }

    public int getSizePrice() {
        switch (size) {
            case 's' : case 'S' : return 15;
            case 'm' : case 'M' : return 20;
            case 'l' : case 'L' : return 25;
        }
        return 0;
    }

    public int getTotalPrice() {
        return this.getTypePrice() + this.getSizePrice();
    }
}
