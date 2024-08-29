package app;

public class Client {
    public void run() {

        TransportFactory carFactory = new CarFactory();
        TransportFactory planeFactory = new PlaneFactory();

        Transport car = carFactory.createTransport();
        Transport plane = planeFactory.createTransport();

        car.move();
        plane.move();
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
}

