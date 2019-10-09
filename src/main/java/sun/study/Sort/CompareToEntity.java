package sun.study.Sort;

public class CompareToEntity implements Comparable<CompareToEntity> {
    private String name;
    private int age;

    public CompareToEntity(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(CompareToEntity o) {
        if (this.getAge() != o.getAge())
            return (this.getAge() - o.getAge());
        if (this.getName().compareTo(o.getName()) > 0)
            return 1;
        if (this.getName().compareTo(o.getName()) < 0)
            return -1;
        return 0;
    }
}
