package day_48_constructors_static;

public class Customer {

    private  String name;
    private int id;

    //No-Args Constructor
    public Customer(){
        System.out.println("This is No-Args Constructor");
        name = "new customer";
        id = -1;

    }

    public Customer(String name, int id) {
        System.out.println("2 Args constructor");
        this.name = name;   //setName(name) same
        this.id = id;       //setId(id)
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
