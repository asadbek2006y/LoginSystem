public class Main{

    public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords();

        idandPasswords.getLoginInfo();
        
        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
    }
}