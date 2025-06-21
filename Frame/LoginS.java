import javax.swing.*;


class LoginS extends JFrame{
    public LoginS() {
        setTitle("Login Screen");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        LoginS loginScreen = new LoginS();
        loginScreen.setVisible(true);
    }
}