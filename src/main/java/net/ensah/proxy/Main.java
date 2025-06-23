package net.ensah.proxy;

public class Main {

    public static void main(String[] args) {
//      Context context=new Context(new Proxy(new IServiceImpl()));
//      context.compute();

        Context context=new Context(new ProxyOfProxy(new Proxy(new IServiceImpl())));
        context.compute();


    }
}
