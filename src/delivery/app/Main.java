package delivery.app;

import delivery.model.Parcel;
import delivery.model.FragileParcel;
import delivery.model.ExpressParcel;
import delivery.service.ParcelService;

public class Main {

    public static void main(String[] args) {

        Parcel p1 = new Parcel(
                "Ivan",
                "Moscow",
                2,
                "111"
        );

        FragileParcel p2 = new FragileParcel(
                "Anna",
                "Kazan",
                1.5,
                "222",
                true
        );

        ExpressParcel p3 = new ExpressParcel(
                "Petr",
                "Sochi",
                3,
                "333",
                12
        );

        Parcel p4 = new Parcel();

        Parcel[] parcels = {p1, p2, p3, p4};

        ParcelService service = new ParcelService();

        service.printParcelsReport(parcels);
    }
}
