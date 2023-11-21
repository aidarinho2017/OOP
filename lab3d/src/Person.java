public class Person {
    String name;
    Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return "Name: " + this.name;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name.equals(person.name);
    }

}
