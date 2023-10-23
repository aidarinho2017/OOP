public class TestingThisClassLab2FirstA {
    public static void main(String[] args) {
        Cube C = new Cube("f", "gg");
        System.out.println(C.getVolume(3));
        System.out.println(C.surfaceArea(3));
        C.setColor("Green");
        C.getColor();
        Cylinder q = new Cylinder("ff", "qq");
        System.out.println(q.getVolume(3, 15));
        q.setColor("blue");
        q.getColor();
        q.surfaceArea(5);
        Sphere S = new Sphere("ff", "fgh");
        System.out.println(S.getVolume(3.2));
        S.setMaterial("stone");
        S.getMaterial();
        Cylinder g = new Cylinder("hhh", "lll");
        System.out.println(g.surfaceArea(30.5, 9));
    }
}
