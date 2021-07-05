package web.model;

public class Car{

    private Long id;
    private String model;

    private int year;

    public Car() {

    }

    public Car(Long id, String model, int year) {
        this.id = id;
        this.model = model;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}