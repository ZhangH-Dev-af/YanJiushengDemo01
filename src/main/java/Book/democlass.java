package Book;

public class democlass {
    private int id;
    private String name;
    private int age;
    private String classes;
    private String comments;

    public democlass() {

    }

//    public democlass(int id, String name, int age, String classes, String comments) {
//        super();
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.classes = classes;
//        this.comments = comments;
//    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClasses() {
        return classes;
    }

    public String getComments() {
        return comments;
    }


}
