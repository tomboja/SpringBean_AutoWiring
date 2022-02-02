package domain;

/**
 * @ProjectName: SpringBean_AutoWiring
 * @Author: Temesgen D.
 * @Date: 2/1/22
 */

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
