### Wiring the beans using the @Bean annotated method’s parameters

Another approach of wiring beans to establish relationship between them is ***auto-wiring***.

We pass the bean to be owned into the owning bean as method parameter. This instructs String to 
provide a bean in its context as a parameter to the method and as a result a relationship is established

This is an example of DI (Dependency Injection) which is done by Spring.

To establish a relationship between a Person and a Parrot beans - (classes given below), 
we do it like below in the configuration file:

```
    @Configuration
    public class Config {
    
        // Create Parrot bean
        @Bean
        public Parrot parrot() {
            Parrot parrot = new Parrot();
            parrot.setName("Koko");
            return parrot;
        }
    
        // Create Person bean
        @Bean
        public Person person(Parrot p) {
            Person person = new Person();
            person.setName("Tom");
            person.setParrot(p);
            return person;
        }
    }
```


Person Class:
```
    public class Person {
        private String name;
        private Parrot parrot;
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public Parrot getParrot() {
            return parrot;
        }
    
        public void setParrot(Parrot parrot) {
            this.parrot = parrot;
        }
    
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", parrot=" + parrot +
                    '}';
        }
    }
```

Parrot Class:
```
    public class Parrot {
        private String name;
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        @Override
        public String toString() {
            return "Parrot{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
```
