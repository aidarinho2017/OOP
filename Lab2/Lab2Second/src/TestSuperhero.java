import java.util.HashSet;
import java.util.Set;
public class TestSuperhero {
    public static void main(String[] args) {
        Set<Superhero> superheroes = new HashSet<>();
        Superhero batman = new Superhero("Bruce", "fight", "DBDBDBDBDBBDBDB", 32);
        Superhero superman = new Superhero("Clark", "fly", "DBDBDBDBDBBDBDB", 35);
        Superhero wonderWoman = new Superhero("Jessy", "run", "DBDBDBDBDB", 20);
        Superhero flash = new Superhero("Clark", "speed", "DBDBD", 15);
        Superhero flash2 = new Superhero("Clark", "speed", "DBDBD", 15);
        Superhero spiderMan = new Avenger("Peter", "Parker", "shoot", "DBDBDBDB", 17, 3301);
        Superhero spiderMan2 = new Avenger("Peter", "Parker", "shoot", "DBDBDBDBDB", 17, 3301);
        Superhero spiderMan3 = new Avenger("Peter", "Parker", "shoot", "DBDBDBDBDB", 17, 3301);
        Superhero spiderMan4 = new Avenger("Peter", "Parker", "shoot", "DBDBDBDBDB", 17, 3303);
        System.out.println(spiderMan.equals(spiderMan2));
        System.out.println(batman.equals(superman));
        System.out.println(batman.equals(spiderMan));
        superheroes.add(batman);
        superheroes.add(superman);
        superheroes.add(wonderWoman);
        superheroes.add(flash);
        superheroes.add(flash2);
        superheroes.add(spiderMan);
        superheroes.add(spiderMan2);
        superheroes.add(spiderMan3);
        superheroes.add(spiderMan4);
        System.out.println(superheroes.size());
        System.out.println(spiderMan.getAge());

    }
}
