import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int soNguoiChoi;
        ArrayList<NguoiChoi> nguoiChois = new ArrayList<>();
        TrongTai trongTai = new TrongTai(nguoiChois);
        System.out.println("Enter number of player: ");
        soNguoiChoi = sc.nextInt();
        for(int i = 0; i < soNguoiChoi; i++){
            System.out.println("Enter the name of the player: ");
            String name = sc.next();
            NguoiChoi tmp = new NguoiChoi(name);
            nguoiChois.add(tmp);
        }
        for(int i = 0; i < 4-soNguoiChoi; i++){
            System.out.println("Enter the name of virtual player");
            String name = sc.next();
            NguoiChoiAo tmp = new NguoiChoiAo(name);
            nguoiChois.add(tmp);
        }
        trongTai.batDauChoi();
    }
}