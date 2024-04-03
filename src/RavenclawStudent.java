public class RavenclawStudent extends HogwartsStudent {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public RavenclawStudent(String name, int powerOfMagic, int transgressionDistance, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    protected int sumOfCharacteristics() {
        return smart + wise + witty + fullOfCreativity;
    }

    public void compareTo(RavenclawStudent ravenclawStudent) {
        compareToStudent(ravenclawStudent);
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return super.toString() + ", ум: %d, мудрость: %d, остроумие: %d, творчество: %d".formatted(smart, wise, witty, fullOfCreativity);
    }

}
