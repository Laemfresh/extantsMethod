public class Main {
    public static void main(String[] args) {
        Person person =new Person();
        person.setName("bobur");
        person.setPosition("programmer");
        person.lear();
        person.walk();
        person.eat();
        System.out.println(person);



        Programmer programmer = new Programmer("IT.KG");
        programmer.setName("Ahrorbek");
        programmer.setPosition("junior");
        programmer.lear();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println(programmer);

        Dancer dancer = new Dancer("Nasvai");
        dancer.setName("Nursultan");
        dancer.setPosition("hip hop");
        dancer.dancing();
        dancer.lear();
        dancer.walk();
        dancer.eat();
        System.out.println(dancer);

        Singer singer = new Singer("ice cube");
        singer.setName("marsel");
        singer.setPosition("vakalist");
        singer.lear();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitara();
        System.out.println(singer);
    }
}