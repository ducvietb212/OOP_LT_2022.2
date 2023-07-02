import java.util.ArrayList;
import java.util.Random;

public class TrongTai {
    private ArrayList<NguoiChoi> nguoiChois = new ArrayList<>();
    private boolean endgame = false;
    public TrongTai(ArrayList<NguoiChoi> nguoiChois){
        this.nguoiChois = nguoiChois;
    }
    public void batDauChoi(){
        while(endgame != true){
            Random rand = new Random();
            int i = rand.nextInt(4);
            int j = rand.nextInt(4)+1;
            System.out.println("The turn of player "+ nguoiChois.get(i).getName()+":");
            int ketQua = nguoiChois.get(i).getKetQua(j);
            System.out.println("Number: "+ketQua);
            nguoiChois.get(i).setSoDiemHienTai(nguoiChois.get(i).getSoDiemCu()+ketQua);
            nguoiChois.get(i).setSoDiemCu(nguoiChois.get(i).getSoDiemHienTai());
            System.out.println("The recent point: "+nguoiChois.get(i).getSoDiemHienTai());
            if(nguoiChois.get(i).getSoDiemHienTai() == 21){
                System.out.println("The winner is "+ nguoiChois.get(i).getName());
                for(int k = 0 ; k < 4 ; k ++){
                    if(k != i && nguoiChois.get(k) instanceof NguoiChoiAo){
                        ((NguoiChoiAo) nguoiChois.get(k)).react();
                    }
                }
                endgame = true;
            }
            if(nguoiChois.get(i).getSoDiemHienTai() > 21){
                System.out.println("Reset point");
                nguoiChois.get(i).setSoDiemHienTai(0);
                nguoiChois.get(i).setSoDiemCu(0);
            }
            System.out.println("End turn\n");
        }
    }
}
