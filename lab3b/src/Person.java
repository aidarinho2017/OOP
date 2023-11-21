public abstract class Person implements Moveable{
    int legPosition;
    int headPosition;
    int handPosition;
    int age;
    Person(int age, int handPosition, int legPosition, int headPosition){
        this.age = age;
        this.handPosition = handPosition;
        this.legPosition = legPosition;
        this.headPosition = headPosition;
    }
    public int moveLeg(int degree) {
        this.legPosition += degree;
        return legPosition;
    }
    public int moveHead(int degree) {
        this.headPosition += degree;
        return headPosition;
    }
    public int moveHand(int degree) {
        this.handPosition += degree;
        return handPosition;
    }
    public String toString() {
        return
                "age=" + age +
                        ", handPosition=" + handPosition +
                        ", legPosition=" + legPosition +
                        ", headPosition=" + headPosition +
                        '}';
    }
}
