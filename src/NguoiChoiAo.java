import java.util.Scanner;

public class NguoiChoiAo extends NguoiChoi{
    private String reaction;
    public NguoiChoiAo(String name){
        super(name);
        Scanner sc = new Scanner(System.in);
        reaction = sc.nextLine();
    }
    public void react(){
        System.out.println(reaction);
    }
}
