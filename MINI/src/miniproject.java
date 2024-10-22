
    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class miniproject {
        public static void main(String[] args) {
            // Create the frame
            JFrame frame = new JFrame("Login Page");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300); // Increased size of the form
            frame.setLayout(new GridLayout(4, 2)); // Adjusted layout for more components

            // Center the frame on the screen
            frame.setLocationRelativeTo(null);

            // Set background color
            frame.getContentPane().setBackground(new Color(240, 248, 255)); // Alice Blue

            // Create labels and text fields
            JLabel userLabel = new JLabel("Username:");
            userLabel.setForeground(new Color(70, 130, 180)); // Steel Blue
            JTextField userText = new JTextField();
            styleTextField(userText);

            JLabel passwordLabel = new JLabel("Password:");
            passwordLabel.setForeground(new Color(70, 130, 180)); // Steel Blue
            JPasswordField passwordText = new JPasswordField();
            styleTextField(passwordText);

            JButton loginButton = new JButton("LOGIN");
            styleButton(loginButton);
            JLabel successLabel = new JLabel("");

            // Add action listener to the button
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String username = userText.getText();
                    String password = new String(passwordText.getPassword());

                    // Simple validation
                    if (username.equals("Ropafadzo") && password.equals("vicky04")) {
                        JFrame newFrame = new JFrame("Welcome");
                        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        newFrame.setSize(400, 100); // Increased size of the welcome frame
                        newFrame.setLayout(new FlowLayout());
                        newFrame.getContentPane().setBackground(new Color(240, 248, 255)); // Alice Blue

                        // Create label for the new frame
                        JLabel welcomeLabel = new JLabel("ROPAFADZO MANDIMIKA     REG NUMBER        H230048N");
                        welcomeLabel.setForeground(new Color(70, 130, 180)); // Steel Blue
                        newFrame.add(welcomeLabel);

                        // Center the new frame on the screen
                        newFrame.setLocationRelativeTo(null);

                        // Make the new frame visible
                        newFrame.setVisible(true);

                        // Dispose the old frame
                        frame.dispose();
                    } else {
                        successLabel.setText("Invalid username or password, try again.");
                        successLabel.setForeground(Color.RED); // Error message in red
                    }
                }
            });

            // Add components to the frame
            frame.add(userLabel);
            frame.add(userText);
            frame.add(passwordLabel);
            frame.add(passwordText);
            frame.add(loginButton);
            frame.add(successLabel);

            // Center the frame on the screen
            frame.setLocationRelativeTo(null);

            // Make the frame visible
            frame.setVisible(true);
        }

        // Method to style text fields
        private static void styleTextField(JTextField textField) {
            textField.setBackground(Color.WHITE);
            textField.setForeground(Color.BLACK);
            textField.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 2)); // Steel Blue border
            textField.setFont(new Font("Arial", Font.PLAIN, 14));
            textField.setMargin(new Insets(5, 5, 5, 5)); // Padding inside the text field
        }

        // Method to style buttons
        private static void styleButton(JButton button) {
            button.setBackground(new Color(70, 130, 180)); // Steel Blue
            button.setForeground(Color.WHITE);
            button.setFont(new Font("Arial", Font.BOLD, 14));
            button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Padding around the button
            button.setFocusPainted(false); // Remove focus border
            button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Hand cursor on hover
        }
    }

