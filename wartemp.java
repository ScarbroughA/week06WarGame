package warWeek06Final;
public class wartemp {
private int value;
    private String name;

    public wartemp(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println(name + " of " + value);
    }
}