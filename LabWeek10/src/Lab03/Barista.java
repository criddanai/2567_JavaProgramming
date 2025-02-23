package Lab03;

public class Barista {
    private String name;
    private char gender;

    Barista (String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    Barista () {
        this(null, ' ');
    }

    public String getName() {
        return this.name;
    }

    public String getGenderName() {
        switch (gender) {
            case 'm' : case 'M' : return "(Male)";
            case 'f' : case 'F' : return "(Female)";
        }
        return null;
    }
}
