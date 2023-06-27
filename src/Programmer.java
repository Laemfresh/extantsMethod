public class Programmer extends Person {
    private String companyName;
    public void coding(){
        System.out.println("Java");
    }

    @Override
    public void lear() {
        System.out.println("He is koding");

    }

    @Override
    public void walk() {
        System.out.println("He is not walking");

    }

    @Override
    public void eat() {
        System.out.println("He is eat hamburger");
    }


    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String position, String companyName) {
        super(name, position);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer" +
                "\ncompanyName = " + companyName +
                super.toString();
    }
}
