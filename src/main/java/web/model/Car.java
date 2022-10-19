package web.model;

public class Car {

    private Long id;
    private String brand;

    private String model;

    private int yearOfRealese;

    public Car() {
    }

    public Car(Long id, String brand, String model, int yearOfRealese) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfRealese = yearOfRealese;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRealese() {
        return yearOfRealese;
    }

    public void setYearOfRealese(int yearOfRealese) {
        this.yearOfRealese = yearOfRealese;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRealese=" + yearOfRealese +
                '}';
    }
}
