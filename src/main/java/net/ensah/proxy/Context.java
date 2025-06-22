package net.ensah.proxy;

public class Context {

    private final IService service;

    public Context(IService service) {
        this.service = service;
    }

    public void compute() {
        double calculate = service.calculate();
        System.out.println("res => "+calculate);
        System.out.println("**********************");
    }

    public IService getService() {
        return service;
    }
}
