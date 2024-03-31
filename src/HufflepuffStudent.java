public class HufflepuffStudent extends HogwartsStudent{

    private int hardWork;
    private int loyalty;
    private int honesty;


    public HufflepuffStudent(String name, int powerOfMagic, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, powerOfMagic, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    protected int sumOfCharacteristics() {
        return hardWork + loyalty + honesty;
    }

    public void compareTo(HufflepuffStudent hufflepuffStudent) {
        compareToStudent(hufflepuffStudent);
    }
    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", трудолюбие: %d, верность: %d, честность: %d".formatted(hardWork, loyalty, honesty);
    }
}
