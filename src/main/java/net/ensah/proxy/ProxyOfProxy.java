package net.ensah.proxy;

public class ProxyOfProxy implements IService{


    private final IService service;

    public ProxyOfProxy(IService service) {
        this.service = service;
    }

    @Override
    public double calculate() {
        System.out.println("---------------");
        return service.calculate();
    }
}
