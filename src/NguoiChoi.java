public class NguoiChoi {
    private String name;
    private XucXac xucXac;
    private int soDiemHienTai;
    private int soDiemCu;
    private int ketQua;
    public NguoiChoi(String name){
        this.name = name;
        soDiemHienTai = 0;
        soDiemCu = 0;
        xucXac = new XucXac();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSoDiemCu(int soDiemCu) {
        this.soDiemCu = soDiemCu;
    }

    public void setSoDiemHienTai(int soDiemHienTai) {
        this.soDiemHienTai = soDiemHienTai;
    }

    public int getSoDiemHienTai() {
        return soDiemHienTai;
    }

    public int getSoDiemCu() {
        return soDiemCu;
    }
    public int getKetQua(int i){
        if(i == 1){
            xucXac.setLan1();
            ketQua = xucXac.getLan1();
        }
        if(i == 2){
            xucXac.setLan2();
            ketQua = xucXac.getLan2();
        }
        if(i == 3){
            xucXac.setLan3();
            ketQua = xucXac.getLan3();
        }
        if(i == 4){
            xucXac.setLan4();
            ketQua = xucXac.getLan4();
        }
        return ketQua;
    }
}
