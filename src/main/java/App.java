import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        System.out.println("helloworld ссылки равны: " + (bean == bean2));

        PojoCat cat = (PojoCat) applicationContext.getBean("cat");
        PojoCat cat2 = (PojoCat) applicationContext.getBean("cat");
        System.out.println("pojocat ссылки равны: "+ (cat == cat2));
    }
}