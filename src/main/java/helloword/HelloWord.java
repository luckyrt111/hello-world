package helloword;

/**
 * Created by DELL on 05/30/17.
 */
public class HelloWord {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void println(){
        System.out.println("name: "+name);
    }

    public String getName() {
        return name;
    }
}
