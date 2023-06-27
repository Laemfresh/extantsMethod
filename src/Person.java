public class Person {
    private String name;
    private String position;
    public void lear(){
        System.out.println("He is learning");
    }
    public void walk(){
        System.out.println("He is walking");

    }
    public void eat(){
        System.out.println("He is eating");
    }

    public Person() {
    }

    public Person(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person" +
                "\nname = " + name +
                "\nposition = " + position  ;
    }
}
