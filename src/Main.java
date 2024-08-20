//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Мурашко Андрей", "Генеральный директор", "ma@primer.ru", "+375293336644", 4000, 55);
        persArray[1] = new Person("Иванкович Дмитрий", "Заместитель директора по строительству", "id@primer.ru", "+375337654455", 3500, 42);
        persArray[2] = new Person("Гусаков Артём", "Начальник сектора по охране труда", "ga@primer.ru", "+375292021234", 2500, 30);
        persArray[3] = new Person("Семенюк Ольга", "Ведущий бухгалтер", "so@primer,ru", "+375336549578", 2000, 29);
        persArray[4] = new Person("Петровский Андрей", "Энергетик", "pa@primer.ru", "+375290123456", 2000, 39);
    for (Person person : persArray) {
        person.print();
    }
        AmuseumentPark park = new AmuseumentPark();
        AmuseumentPark.Attraction attraction1 = new AmuseumentPark.Attraction("Супер 8", "9:00 - 17:00", 5);
        park.addAttraction(attraction1);
        AmuseumentPark.Attraction attraction2 = new AmuseumentPark.Attraction("Машинки", "10:00 - 18:00", 10);
        park.addAttraction(attraction2);
        System.out.println(park);
    }
}