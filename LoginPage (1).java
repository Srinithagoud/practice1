import javax.swing.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {
    // Components
    private JTextField userText;
    private JPasswordField passText;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginPage() {
        // Frame settings
        setTitle("Login Page");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Username Label and Text Field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 30, 80, 25);
        add(userLabel);

        userText = new JTextField();
        userText.setBounds(150, 30, 120, 25);
        add(userText);

        // Password Label and Password Field
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 70, 80, 25);
        add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(150, 70, 120, 25);
        add(passText);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(120, 110, 80, 25);
        loginButton.addActionListener(this);
        add(loginButton);

        // Message Label
        messageLabel = new JLabel("");
        messageLabel.setBounds(50, 140, 250, 25);
        add(messageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = new String(passText.getPassword());

        // Dummy validation (replace with real authentication)
        if(username.equals("admin") && password.equals("password")) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}