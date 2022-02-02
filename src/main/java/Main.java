import config.Config;
import domain.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ProjectName: SpringBean_AutoWiring
 * @Author: Temesgen D.
 * @Date: 2/1/22
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean(Person.class);
        System.out.println("person = " + person);

        // output will be:
        // person = Person{name='Tom', parrot=Parrot{name='Koko'}}
    }
}
