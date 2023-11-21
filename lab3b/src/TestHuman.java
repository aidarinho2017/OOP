public class TestHuman {
    public static void main(String[] args){
        Boy Aidar = new Boy(12, 1, 1, 1, 2, 3);
        Aidar.scoreGoal();
        Aidar.moveHand(45);
        Aidar.moveLeg(-23);
        System.out.println(Aidar.toString());
        Granny Apashka = new Granny(80, 2, 3, 1);
        Apashka.moveHead(10101010);
        System.out.println(Apashka.toString());
        Aidar.run();
        Girl Madina = new Girl(20, 23, 21, 2);
        Madina.moveHand(1111);
        System.out.println(Madina.toString());




    }



}