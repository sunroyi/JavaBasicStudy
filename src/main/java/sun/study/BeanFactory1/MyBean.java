package sun.study.BeanFactory1;

public class MyBean {

    private String key;
    private String value;

/*    public MyBean(String key, String value){
        this.key = key;
        this.value = value;
    }*/

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
