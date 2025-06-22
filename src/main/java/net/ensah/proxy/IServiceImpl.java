package net.ensah.proxy;

public class IServiceImpl implements IService {

    @Override
    public double calculate() {
        return 10*Math.round(Math.random()*(10-5)+5);
    }
}
