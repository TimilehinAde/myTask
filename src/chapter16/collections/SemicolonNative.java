package chapter16.collections;

public class SemicolonNative implements Comparable<SemicolonNative>{
    private String name;
    private int cohort;
    private int numberOfLaptop;

    public SemicolonNative(String name, int cohort, int numberOfLaptop) {
        this.name = name;
        this.cohort = cohort;
        this.numberOfLaptop = numberOfLaptop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCohort() {
        return cohort;
    }

    public void setCohort(int cohor) {
        this.cohort = cohort;
    }

    public int getNumberOfLaptop() {
        return numberOfLaptop;
    }

    public void setNumberOfLaptop(int numberOfLaptop) {
        this.numberOfLaptop = numberOfLaptop;
    }

    @Override
    public String toString() {
        return "SemicolonNative{" +
                "name='" + name + '\'' +
                ", cohort=" + cohort +
                ", numberOfLaptop=" + numberOfLaptop +
                '}';
    }

    @Override
    public int compareTo(SemicolonNative o) {
        return 0;
    }
}
