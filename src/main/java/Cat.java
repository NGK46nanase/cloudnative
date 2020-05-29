@Entity
public class Cat {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    Cat() {

    }

    public Cat(String name) {
        this.name = name;
    }

    public String toString() {
        return 'Cat{' + 'id=' + id + ', name=' + name + '\'' + '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}