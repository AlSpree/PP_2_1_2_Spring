import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld anotherBean = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println("Равны ли ссылки для bean и anotherBean? -- " + (bean == anotherBean));
        System.out.println("--------------");


        Cat catFirst = applicationContext.getBean("cat", Cat.class);
        Cat catSecond = applicationContext.getBean("cat", Cat.class);

        System.out.println("Равны ли ссылки для catFirst и catSecond? -- " + (catFirst == catSecond));
        System.out.println(catFirst + " -- ссылка catFirst");
        System.out.println(catSecond + " -- ссылка catSecond");
    }
}