public class TestPencilCase {

    public static void main(String[] args) {
    	//using the functions I made
        PencilCase pc = new PencilCase("Blue");

        Pencil p1 = new Pencil("Red", true, 5.5);
        Pencil p2 = new Pencil("Green", false, 3.0);

        pc.addPencil(p1);
        pc.addPencil(p2);

        System.out.println(pc.getColor());
        System.out.println(pc);
        System.out.println("Total price: " + pc.calculateOverallPrice());
    }
}