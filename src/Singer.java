public class Singer extends Person {
    private String bandName;
    public void playGitara(){
        System.out.println("rokenrol");


    }
    public void singing(){
        System.out.println("gruppa crovi");

    }


    @Override
    public void lear() {
        System.out.println("bilbeymin");

    }

    @Override
    public void walk() {
        System.out.println("He is go to school");

    }

    @Override
    public void eat() {
        System.out.println("chizburger");
    }



    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String position, String bandName) {
        super(name, position);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return " Singer " +
                "\nbandName = " + bandName +
                super.toString();
    }
}
