package delivery.model;

public class Parcel {

    private String name;
    private String address;

    protected double weight;

    String trackNumber;

    public Parcel() {
    }

    public Parcel(String name, String address,
                  double weight, String trackNumber) {

        this.name = name;
        this.address = address;
        this.weight = weight;
        this.trackNumber = trackNumber;
    }

    public double calculateDeliveryPrice() {
        return 100 + weight * 30;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Weight: " + weight);
        System.out.println("Track: " + trackNumber);
    }
}
