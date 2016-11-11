package Main;

/**
 * Created by Nathan on 11/10/16.
 */
public class Guitar {
    private String id;
    private String make;
    private String model;
    private Integer price;

    public Guitar(String id, String make, String model, Integer price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
