package dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        ShippingCenter shippingCenter = new ShippingCenter(new DeliveryService(), new NotificationService());

        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}
