package lamda;

public class SuperHero {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;

    private static Integer lastId = 0;

    public SuperHero() {
        this.id = ++lastId;
    }

    public SuperHero (String firstName, String lastName, Integer age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
