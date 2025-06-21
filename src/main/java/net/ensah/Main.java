package net.ensah;
import net.ensah.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(value = {"net.ensah.config","net.ensah.service","net.ensah.springAspect"})
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        IUserService service=context.getBean(IUserService.class);
        service.add("abdelilah");
       // service.add("saouiri");
      //  service.add("med");
        //service.add("sa");
        System.out.println(service.getClass().getName());
       // service.delete("saouiri");
      //  service.getAll().forEach(System.out::println);

    }
}