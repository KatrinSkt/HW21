public class GriffindorStudent extends HogwartsStudent {

    private int nobility;
    private int honor;
    private int courage;

    public GriffindorStudent(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    protected int sumOfCharacteristics() {
        return nobility + honor + courage;
    }

    public void compareTo(GriffindorStudent griffindorStudent) {
        compareToStudent(griffindorStudent);
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString() + ", благородство: %d, честь: %d, храбрость: %d".formatted(nobility, honor, courage);
    }
}

