package animal;

public class Animal {
	private String name;
    private int old;

    public Animal() {
    	name = "no Name";
        old = 0;
    }

    public  Animal(String name,  int old) {
        this.name = name;
        this.old = old;
    }

    public String name() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getold() {
        return old;
    }

    public void setold(int old) {
        this.old = old;
    }

    public void say() {
        System.out.println( name + "です。" + old + "歳です。");

	  }
}
