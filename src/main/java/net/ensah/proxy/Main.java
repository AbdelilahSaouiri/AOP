package net.ensah.proxy;

public class Main {

    public static void main(String[] args) {
      Context context=new Context(new Proxy(new IServiceImpl()));
      context.compute();

    }
}
