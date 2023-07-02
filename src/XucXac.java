import java.util.Random;

public class XucXac {
    private int lan1;
    private int lan2;
    private int lan3;
    private int lan4;
    private static int[] giatri1 = {1,1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
    private static int[] giatri2 = {1,1,1,1,2,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
    private static int[] giatri3 = {1,1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
    private static int[] giatri4 = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,6,6,6,6};

    public void setLan1() {
        Random ran = new Random();
        int i = ran.nextInt(25);
        lan1 = giatri1[i];
        System.out.println("Dicing roll...");
    }

    public int getLan1() {
        return lan1;
    }
    public void setLan2() {
        Random ran = new Random();
        int i = ran.nextInt(25);
        lan2 = giatri2[i];
        System.out.println("Dicing roll...");
    }

    public int getLan2() {
        return lan2;
    }

    public void setLan3() {
        Random ran = new Random();
        int i = ran.nextInt(25);
        lan3 = giatri3[i];
        System.out.println("Dicing roll...");
    }

    public int getLan3() {
        return lan3;
    }

    public void setLan4() {
        Random ran = new Random();
        int i = ran.nextInt(25);
        lan4 = giatri4[i];
        System.out.println("Dicing roll...");
    }

    public int getLan4() {
        return lan4;
    }
}
