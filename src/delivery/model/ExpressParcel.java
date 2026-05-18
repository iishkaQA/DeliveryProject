package delivery.model;

public class ExpressParcel extends Parcel {

    private int deliveryHours;

    public ExpressParcel(String name,
                         String address,
                         double weight,
                         String trackNumber,
                         int deliveryHours) {

        super(name, address, weight, trackNumber);

        this.deliveryHours = deliveryHours;
    }

    @Override
    public double calculateDeliveryPrice() {

        if (deliveryHours < 24) {
            return super.calculateDeliveryPrice() + 500;
        }

        return super.calculateDeliveryPrice();
    }

    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println("Delivery hours: "
                + deliveryHours);
    }
}
