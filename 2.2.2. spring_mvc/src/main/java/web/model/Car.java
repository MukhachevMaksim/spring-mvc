package web.model;

public class Car {

    private String model;
    private int series;
    private String year;

    public Car() {
    }

    public Car(String model, int series, String year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "model: " + model
                + ", series: " + series
                + ", year of car manufacture: " + year;
    }
}
