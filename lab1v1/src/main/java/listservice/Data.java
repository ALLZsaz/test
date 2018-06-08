package listservice;

public class Data {
    private int num;
    private String month_name;
    private double water;
    private double electricity;

    public Data(int num, String month_name, double water, double electricity) {
        this.month_name = month_name;
        this.water = water;
        this.electricity = electricity;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String getMonth_name() {
        return month_name;
    }

    public double getWater() {
        return water;
    }

    public double getElectricity() {
        return electricity;
    }
}
