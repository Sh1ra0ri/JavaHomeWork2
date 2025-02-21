public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer_weight_1 = 78.2;
        var boxer_weight_2 = 82.7;
        var weight =  boxer_weight_1 + boxer_weight_2;
        System.out.println(weight);
        var difference = boxer_weight_2 - boxer_weight_1;
        System.out.println(difference);

        var remainder = boxer_weight_1 % boxer_weight_2;
        System.out.println(remainder);

        var total_hours = 640;
        var hours_for_person = 8;
        var people_counter = total_hours / hours_for_person;
        System.out.println("Всего работников в компании — " + people_counter + " человек");
        var people_counter_2 = 94;
        var total_hours_2 = people_counter_2 * hours_for_person;
        System.out.println("Если в компании работает " + people_counter_2 + " человек, то всего " + total_hours_2 + " часов работы может быть поделено между сотрудниками");

    }
}
