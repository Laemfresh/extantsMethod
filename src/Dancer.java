public class Dancer extends Person{
    private String gruppName;
    public void dancing(){
        System.out.println("lezginka");
    }
    @Override
    public void lear() {
        System.out.println("I don't noy");

    }

    @Override
    public void walk() {
        System.out.println("He is walking SuperMarket");
    }

    @Override
    public void eat() {
        System.out.println("He is eat Hot Dog");
    }


    public Dancer(String gruppName) {
        this.gruppName = gruppName;
    }

    public Dancer(String name, String position, String gruppName) {
        super(name, position);
        this.gruppName = gruppName;
    }

    public String getGruppName() {
        return gruppName;
    }

    public void setGruppName(String gruppName) {
        this.gruppName = gruppName;
    }

    @Override
    public String toString() {
        return "Dancer" +
                "\ngruppName = " + gruppName +
                super.toString();
    }
}
