
public class Country implements Comparable<Country> {

    private String name;
    private int year;
    private String gender;
    private double rate;

    public Country(String name, int year, String gender, double rate) {
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.rate = rate;
    }

    public double getRate() {
        return this.rate;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.year + "), " + this.gender + ", " + this.rate;
    }

    @Override
    public int compareTo(Country c) {
        return Double.compare(this.getRate(), c.getRate());
    }

}
