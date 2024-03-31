import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        GriffindorStudent harry = generateGriffindorStudent("Гарри Поттер");
        GriffindorStudent ron = generateGriffindorStudent("Рон Уизли");
        GriffindorStudent germiona = generateGriffindorStudent("Гермиона Грейнджер");
        SlytherinStudent drako = generateSlytherinStudent("Драко Малфой");
        SlytherinStudent grahem = generateSlytherinStudent("Грэхэм Монтегю");
        SlytherinStudent gregory = generateSlytherinStudent("Грегори Гойл");
        HufflepuffStudent zacharia = generateHufflepuffStudent("Захария Смит");
        HufflepuffStudent sedric = generateHufflepuffStudent("Седрик Диггори");
        HufflepuffStudent justin = generateHufflepuffStudent("Джастин Финч-Флетчли");
        RavenclawStudent chjou = generateRavenclawStudent("Чжоу Чанг");
        RavenclawStudent padma = generateRavenclawStudent("Падма Патил");
        RavenclawStudent markus = generateRavenclawStudent("Маркус Белби");

        harry.print();
        ron.print();
        germiona.print();
        drako.print();
        grahem.print();
        gregory.print();
        zacharia.print();
        sedric.print();
        justin.print();
        chjou.print();
        padma.print();
        markus.print();
        System.out.println();

        harry.compareTo(ron);
        drako.compareTo(gregory);
        zacharia.compareTo(sedric);
        chjou.compareTo(padma);
        System.out.println();

        harry.compareToStudent(drako);

    }

    private static GriffindorStudent generateGriffindorStudent(String name) {
        return new GriffindorStudent(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

    private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

    private static RavenclawStudent generateRavenclawStudent(String name) {
        return new RavenclawStudent(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }
}
