interface IDelivery {
    void send(String message);
}

abstract class DeliveryService {
    protected abstract IDelivery createDelivery();

    public void deliver(String msg) {
        IDelivery delivery = createDelivery();
        delivery.send(msg);
    }
}

final class PigeonDelivery extends DeliveryService {
    @Override
    protected IDelivery createDelivery() {
        return m -> System.out.println("Pigeon mail: " + m);
    }
}

final class EmailDelivery extends DeliveryService {
    @Override
    protected IDelivery createDelivery() {
        return m -> System.out.println("Email: " + m);
    }
}

final class PostDelivery extends DeliveryService {
    @Override
    protected IDelivery createDelivery() {
        return m -> System.out.println("Regular mail: " + m);
    }
}

final class Message extends DeliveryService {
    @Override
    protected IDelivery createDelivery() {
        return m -> System.out.println("Message: " + m);
    }
}

public class Main {
    public static void main(String[] args) {
        DeliveryService service;

        if (args.length > 0 && args[0].equals("pigeon")) {
            service = new PigeonDelivery();
        } else if (args.length > 0 && args[0].equals("post")) {
            service = new PostDelivery();
        } else if (args.length > 0 && args[0].equals("message")) {
            service = new Message();
        } else{
            service = new EmailDelivery();            
        }


        service.deliver("Hello!");
    }
}