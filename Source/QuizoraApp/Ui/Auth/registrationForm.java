package QuizoraApp.Ui.Auth;

/** Registration presentation only; account persistence is not connected. */
public class registrationForm extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(registrationForm.class.getName());

    public registrationForm() {
        initComponents();
        applySatoshi(getContentPane());
        configurePasswordToggle(passwordField);
        configurePasswordToggle(confirmPasswordField);
    }

    private void configurePasswordToggle(javax.swing.JPasswordField field) {
        field.putClientProperty("FlatLaf.style", "showRevealButton: true");
        for (java.awt.Component component : field.getComponents()) {
            if (component instanceof javax.swing.JToggleButton toggle) {
                toggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Icons/UIcons/eye_closed.png")));
                toggle.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Icons/UIcons/eye.png")));
                toggle.setToolTipText("Show password");
                toggle.getAccessibleContext().setAccessibleName("Show password");
                toggle.addItemListener(event -> {
                    String action = toggle.isSelected() ? "Hide password" : "Show password";
                    toggle.setToolTipText(action);
                    toggle.getAccessibleContext().setAccessibleName(action);
                });
            }
        }
    }

    private void applySatoshi(java.awt.Container container) {
        try (java.io.InputStream regularStream = getClass().getResourceAsStream("/QuizoraApp/Resources/Fonts/Satoshi-Regular.ttf");
             java.io.InputStream boldStream = getClass().getResourceAsStream("/QuizoraApp/Resources/Fonts/Satoshi-Bold.ttf")) {
            java.awt.Font regular = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, regularStream);
            java.awt.Font bold = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, boldStream);
            applyFont(container, regular, bold);
        } catch (java.io.IOException | java.awt.FontFormatException ex) {
            logger.log(java.util.logging.Level.WARNING, "Unable to load bundled Satoshi fonts", ex);
        }
    }

    private void applyFont(java.awt.Container container, java.awt.Font regular, java.awt.Font bold) {
        for (java.awt.Component component : container.getComponents()) {
            java.awt.Font current = component.getFont();
            if (current != null) component.setFont((current.isBold() ? bold : regular).deriveFont(current.getSize2D()));
            if (component instanceof java.awt.Container nested) applyFont(nested, regular, bold);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrationPanel = new javax.swing.JPanel();
        brandLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        fullNameLabel = new javax.swing.JLabel();
        fullNameField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        backToLoginButton = new javax.swing.JButton();
        panelImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quizora | Create account");
        setResizable(false);

        registrationPanel.setBackground(new java.awt.Color(255, 255, 255));

        brandLabel.setFont(new java.awt.Font("Satoshi", 1, 14)); // NOI18N
        brandLabel.setForeground(new java.awt.Color(56, 121, 125));
        brandLabel.setText("QUIZORA");

        titleLabel.setFont(new java.awt.Font("Satoshi", 1, 30)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(37, 50, 56));
        titleLabel.setText("Create your account");

        subtitleLabel.setFont(new java.awt.Font("Satoshi", 0, 13)); // NOI18N
        subtitleLabel.setForeground(new java.awt.Color(104, 119, 125));
        subtitleLabel.setText("Join Quizora and start your learning journey.");

        fullNameLabel.setFont(new java.awt.Font("Satoshi", 1, 13)); // NOI18N
        fullNameLabel.setForeground(new java.awt.Color(37, 50, 56));
        fullNameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Icons/UIcons/user_male.png"))); // NOI18N
        fullNameLabel.setLabelFor(fullNameField);
        fullNameLabel.setText("Full name");

        fullNameField.setBackground(new java.awt.Color(247, 250, 252));
        fullNameField.setFont(new java.awt.Font("Satoshi", 0, 14)); // NOI18N
        fullNameField.setForeground(new java.awt.Color(37, 50, 56));

        usernameLabel.setFont(new java.awt.Font("Satoshi", 1, 13)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(37, 50, 56));
        usernameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Icons/UIcons/user_male.png"))); // NOI18N
        usernameLabel.setLabelFor(usernameField);
        usernameLabel.setText("Username");

        usernameField.setBackground(new java.awt.Color(247, 250, 252));
        usernameField.setFont(new java.awt.Font("Satoshi", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(37, 50, 56));

        emailLabel.setFont(new java.awt.Font("Satoshi", 1, 13)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(37, 50, 56));
        emailLabel.setLabelFor(emailField);
        emailLabel.setText("Email address");

        emailField.setBackground(new java.awt.Color(247, 250, 252));
        emailField.setFont(new java.awt.Font("Satoshi", 0, 14)); // NOI18N
        emailField.setForeground(new java.awt.Color(37, 50, 56));

        passwordLabel.setFont(new java.awt.Font("Satoshi", 1, 13)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(37, 50, 56));
        passwordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Icons/UIcons/lock.png"))); // NOI18N
        passwordLabel.setLabelFor(passwordField);
        passwordLabel.setText("Password");

        passwordField.setBackground(new java.awt.Color(247, 250, 252));
        passwordField.setFont(new java.awt.Font("Satoshi", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(37, 50, 56));

        confirmPasswordLabel.setFont(new java.awt.Font("Satoshi", 1, 13)); // NOI18N
        confirmPasswordLabel.setForeground(new java.awt.Color(37, 50, 56));
        confirmPasswordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Icons/UIcons/lock.png"))); // NOI18N
        confirmPasswordLabel.setLabelFor(confirmPasswordField);
        confirmPasswordLabel.setText("Confirm password");

        confirmPasswordField.setBackground(new java.awt.Color(247, 250, 252));
        confirmPasswordField.setFont(new java.awt.Font("Satoshi", 0, 14)); // NOI18N
        confirmPasswordField.setForeground(new java.awt.Color(37, 50, 56));
        confirmPasswordField.addActionListener(this::confirmPasswordFieldActionPerformed);

        registerButton.setBackground(new java.awt.Color(168, 218, 220));
        registerButton.setFont(new java.awt.Font("Satoshi", 1, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(37, 50, 56));
        registerButton.setText("Create account");
        registerButton.addActionListener(this::registerButtonActionPerformed);

        backToLoginButton.setFont(new java.awt.Font("Satoshi", 0, 12)); // NOI18N
        backToLoginButton.setForeground(new java.awt.Color(56, 121, 125));
        backToLoginButton.setText("Already have an account?               Sign in");
        backToLoginButton.setBorderPainted(false);
        backToLoginButton.setContentAreaFilled(false);
        backToLoginButton.addActionListener(this::backToLoginButtonActionPerformed);

        javax.swing.GroupLayout registrationPanelLayout = new javax.swing.GroupLayout(registrationPanel);
        registrationPanel.setLayout(registrationPanelLayout);
        registrationPanelLayout.setHorizontalGroup(
            registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationPanelLayout.createSequentialGroup()
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(brandLabel, 420, 420, 420))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(titleLabel, 420, 420, 420))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(subtitleLabel, 420, 420, 420))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(fullNameLabel, 202, 202, 202))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(fullNameField, 202, 202, 202))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(usernameLabel, 202, 202, 202))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(usernameField, 202, 202, 202))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(emailLabel, 420, 420, 420))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(emailField, 420, 420, 420))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(passwordLabel, 202, 202, 202))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(passwordField, 202, 202, 202))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(confirmPasswordLabel, 202, 202, 202))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(confirmPasswordField, 202, 202, 202))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(registerButton, 420, 420, 420))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(backToLoginButton, 420, 420, 420)))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        registrationPanelLayout.setVerticalGroup(
            registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationPanelLayout.createSequentialGroup()
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(brandLabel, 22, 22, 22))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(titleLabel, 40, 40, 40))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(subtitleLabel, 22, 22, 22))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(fullNameLabel, 20, 20, 20))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(fullNameField, 42, 42, 42))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(usernameLabel, 20, 20, 20))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(usernameField, 42, 42, 42))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(emailLabel, 20, 20, 20))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(emailField, 42, 42, 42))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(passwordLabel, 20, 20, 20))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(passwordField, 42, 42, 42))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(confirmPasswordLabel, 20, 20, 20))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(confirmPasswordField, 42, 42, 42))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(registerButton, 44, 44, 44))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(backToLoginButton, 32, 32, 32)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Images/loginPanelImage.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(registrationPanel)
                .addGap(0, 0, 0)
                .addComponent(panelImageLabel, 500, 500, 500))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrationPanel)
            .addComponent(panelImageLabel, 500, 500, 500)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backToLoginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    private void confirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordFieldActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            com.formdev.flatlaf.FlatLightLaf.setup();
            new registrationForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToLoginButton;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField fullNameField;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JLabel panelImageLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel registrationPanel;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
