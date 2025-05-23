public class Person {
    private int id;
    private String name;
    
    
    public Person(String name){
        this.name = name;
    }
    public Person (int i ,String name){
        id = i;
        name = name;
    }

    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
}
