package net.ensah.proxy;

public class Proxy implements IService{

    private final IServiceImpl service;

    public Proxy(IServiceImpl service) {
        this.service = service;
    }

    @Override
    public double calculate() {
        System.out.println("**********************");
        double result = service.calculate();

        return result;
    }
}
