package pesansingkat;

public class PesanSingkat {
    private LoginPage lp;
    
    public static void main(String[] args) {
        // TODO code application logic here
        PesanSingkat pesan = new PesanSingkat();
        pesan.startApplication();
    }
    
    public void startApplication(){
        this.lp = new LoginPage();
        this.lp.setVisible(true);
    }
}
