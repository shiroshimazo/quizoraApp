package QuizoraApp.Ui.Auth;

/** UI prototype only. Code verification and password persistence require a backend. */
public class forgotPasswordForm extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(forgotPasswordForm.class.getName());
    private int step;

    public forgotPasswordForm() {
        initComponents();
        applySatoshi(getContentPane());
        configurePasswordToggle(passwordField);
        configurePasswordToggle(confirmPasswordField);
        nextButton.addActionListener(event -> advance());
        backButton.addActionListener(event -> {
            if (step == 0) dispose();
            else { step--; codeField.setText(""); clearPasswords(); showStep(); }
        });
        showStep();
    }

    private void showStep() {
        String[] cards = {"email", "code", "password"};
        String[] headings = {"Email address", "Verification code", "New password"};
        ((java.awt.CardLayout) stepsPanel.getLayout()).show(stepsPanel, cards[step]);
        stepLabel.setText("Step " + (step + 1) + " of 3: " + headings[step]);
        nextButton.setText(step == 2 ? "Preview reset" : "Continue");
        backButton.setText(step == 0 ? "Close" : "Back");
        statusLabel.setText(" ");
        (step == 0 ? emailField : step == 1 ? codeField : passwordField).requestFocusInWindow();
    }

    private void advance() {
        if (step == 0) {
            if (!emailField.getText().trim().matches("[^\\s@]+@[^\\s@]+\\.[^\\s@]+")) {
                statusLabel.setText("Enter a valid email address."); return;
            }
        } else if (step == 1) {
            if (!codeField.getText().trim().matches("[0-9]{6}")) {
                statusLabel.setText("Enter exactly six digits."); return;
            }
            // Format validation only; never treat this preview as identity verification.
        } else {
            char[] password = passwordField.getPassword();
            char[] confirmation = confirmPasswordField.getPassword();
            try {
                if (password.length == 0 || !java.util.Arrays.equals(password, confirmation)) {
                    statusLabel.setText("Enter matching passwords in both fields."); return;
                }
                clearPasswords();
                statusLabel.setText("Preview complete. Your password has not been changed.");
            } finally {
                java.util.Arrays.fill(password, '\0');
                java.util.Arrays.fill(confirmation, '\0');
            }
            return;
        }
        step++;
        showStep();
    }

    private void clearPasswords() {
        passwordField.setText(""); confirmPasswordField.setText("");
        for (javax.swing.JPasswordField field : new javax.swing.JPasswordField[]{passwordField, confirmPasswordField})
            for (java.awt.Component component : field.getComponents())
                if (component instanceof javax.swing.JToggleButton toggle) toggle.setSelected(false);
    }

    @Override public void dispose() {
        if (passwordField != null) clearPasswords();
        super.dispose();
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
        brandLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        stepLabel = new javax.swing.JLabel();
        previewLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        stepsPanel = new javax.swing.JPanel();
        emailPanel = new javax.swing.JPanel();
        emailHintLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        codePanel = new javax.swing.JPanel();
        codeHintLabel = new javax.swing.JLabel();
        codeLabel = new javax.swing.JLabel();
        codeField = new javax.swing.JTextField();
        passwordPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quizora | Reset password");
        setResizable(false);
        brandLabel.setFont(new java.awt.Font("Satoshi", 1, 14));
        brandLabel.setText("QUIZORA");
        titleLabel.setFont(new java.awt.Font("Satoshi", 1, 30));
        titleLabel.setText("Reset your password");
        stepLabel.setFont(new java.awt.Font("Satoshi", 1, 14));
        stepLabel.setText("Step 1 of 3: Email address");
        previewLabel.setFont(new java.awt.Font("Satoshi", 0, 12));
        previewLabel.setText("Design preview: no email is sent and no password is changed.");
        statusLabel.setFont(new java.awt.Font("Satoshi", 0, 13));
        statusLabel.setText(" ");
        backButton.setFont(new java.awt.Font("Satoshi", 0, 13));
        backButton.setText("Back");
        backButton.setBackground(new java.awt.Color(168,218,220));
        nextButton.setFont(new java.awt.Font("Satoshi", 1, 14));
        nextButton.setText("Continue");
        nextButton.setBackground(new java.awt.Color(168,218,220));
        stepsPanel.setLayout(new java.awt.CardLayout());
        emailHintLabel.setFont(new java.awt.Font("Satoshi", 0, 14));
        emailHintLabel.setText("Enter the email address associated with your account.");
        emailLabel.setFont(new java.awt.Font("Satoshi", 0, 14));
        emailLabel.setText("Email address");
        emailLabel.setLabelFor(emailField);
        emailField.setFont(new java.awt.Font("Satoshi", 0, 14));
        javax.swing.GroupLayout emailPanelLayout = new javax.swing.GroupLayout(emailPanel);
        emailPanel.setLayout(emailPanelLayout);
        emailPanelLayout.setHorizontalGroup(emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanelLayout.createSequentialGroup().addGap(0).addComponent(emailHintLabel, 540, 540, 540).addGap(0, 0, Short.MAX_VALUE))
            .addGroup(emailPanelLayout.createSequentialGroup().addGap(0).addComponent(emailLabel, 540, 540, 540).addGap(0, 0, Short.MAX_VALUE))
            .addGroup(emailPanelLayout.createSequentialGroup().addGap(0).addComponent(emailField, 540, 540, 540).addGap(0, 0, Short.MAX_VALUE))
        );
        emailPanelLayout.setVerticalGroup(emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanelLayout.createSequentialGroup().addGap(0).addComponent(emailHintLabel, 26, 26, 26).addGap(0, 154, Short.MAX_VALUE))
            .addGroup(emailPanelLayout.createSequentialGroup().addGap(48).addComponent(emailLabel, 20, 20, 20).addGap(0, 112, Short.MAX_VALUE))
            .addGroup(emailPanelLayout.createSequentialGroup().addGap(76).addComponent(emailField, 44, 44, 44).addGap(0, 60, Short.MAX_VALUE))
        );
        stepsPanel.add(emailPanel, "email");
        codeHintLabel.setFont(new java.awt.Font("Satoshi", 0, 14));
        codeHintLabel.setText("Enter the six-digit code from your email.");
        codeLabel.setFont(new java.awt.Font("Satoshi", 0, 14));
        codeLabel.setText("Verification code");
        codeLabel.setLabelFor(codeField);
        codeField.setFont(new java.awt.Font("Satoshi", 0, 22));
        javax.swing.GroupLayout codePanelLayout = new javax.swing.GroupLayout(codePanel);
        codePanel.setLayout(codePanelLayout);
        codePanelLayout.setHorizontalGroup(codePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(codePanelLayout.createSequentialGroup().addGap(0).addComponent(codeHintLabel, 540, 540, 540).addGap(0, 0, Short.MAX_VALUE))
            .addGroup(codePanelLayout.createSequentialGroup().addGap(0).addComponent(codeLabel, 540, 540, 540).addGap(0, 0, Short.MAX_VALUE))
            .addGroup(codePanelLayout.createSequentialGroup().addGap(0).addComponent(codeField, 540, 540, 540).addGap(0, 0, Short.MAX_VALUE))
        );
        codePanelLayout.setVerticalGroup(codePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(codePanelLayout.createSequentialGroup().addGap(0).addComponent(codeHintLabel, 26, 26, 26).addGap(0, 154, Short.MAX_VALUE))
            .addGroup(codePanelLayout.createSequentialGroup().addGap(48).addComponent(codeLabel, 20, 20, 20).addGap(0, 112, Short.MAX_VALUE))
            .addGroup(codePanelLayout.createSequentialGroup().addGap(76).addComponent(codeField, 48, 48, 48).addGap(0, 56, Short.MAX_VALUE))
        );
        stepsPanel.add(codePanel, "code");
        passwordLabel.setFont(new java.awt.Font("Satoshi", 0, 14));
        passwordLabel.setText("New password");
        passwordLabel.setLabelFor(passwordField);
        passwordField.setFont(new java.awt.Font("Satoshi", 0, 14));
        confirmPasswordLabel.setFont(new java.awt.Font("Satoshi", 0, 14));
        confirmPasswordLabel.setText("Confirm new password");
        confirmPasswordLabel.setLabelFor(confirmPasswordField);
        confirmPasswordField.setFont(new java.awt.Font("Satoshi", 0, 14));
        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup().addGap(0).addComponent(passwordLabel, 540, 540, 540).addGap(0, 0, Short.MAX_VALUE))
            .addGroup(passwordPanelLayout.createSequentialGroup().addGap(0).addComponent(passwordField, 540, 540, 540).addGap(0, 0, Short.MAX_VALUE))
            .addGroup(passwordPanelLayout.createSequentialGroup().addGap(0).addComponent(confirmPasswordLabel, 540, 540, 540).addGap(0, 0, Short.MAX_VALUE))
            .addGroup(passwordPanelLayout.createSequentialGroup().addGap(0).addComponent(confirmPasswordField, 540, 540, 540).addGap(0, 0, Short.MAX_VALUE))
        );
        passwordPanelLayout.setVerticalGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup().addGap(0).addComponent(passwordLabel, 20, 20, 20).addGap(0, 160, Short.MAX_VALUE))
            .addGroup(passwordPanelLayout.createSequentialGroup().addGap(28).addComponent(passwordField, 44, 44, 44).addGap(0, 108, Short.MAX_VALUE))
            .addGroup(passwordPanelLayout.createSequentialGroup().addGap(90).addComponent(confirmPasswordLabel, 20, 20, 20).addGap(0, 70, Short.MAX_VALUE))
            .addGroup(passwordPanelLayout.createSequentialGroup().addGap(118).addComponent(confirmPasswordField, 44, 44, 44).addGap(0, 18, Short.MAX_VALUE))
        );
        stepsPanel.add(passwordPanel, "password");
        javax.swing.GroupLayout windowLayout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(windowLayout);
        windowLayout.setHorizontalGroup(windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowLayout.createSequentialGroup().addGap(230).addComponent(brandLabel, 540, 540, 540).addGap(0, 230, Short.MAX_VALUE))
            .addGroup(windowLayout.createSequentialGroup().addGap(230).addComponent(titleLabel, 540, 540, 540).addGap(0, 230, Short.MAX_VALUE))
            .addGroup(windowLayout.createSequentialGroup().addGap(230).addComponent(stepLabel, 540, 540, 540).addGap(0, 230, Short.MAX_VALUE))
            .addGroup(windowLayout.createSequentialGroup().addGap(230).addComponent(stepsPanel, 540, 540, 540).addGap(0, 230, Short.MAX_VALUE))
            .addGroup(windowLayout.createSequentialGroup().addGap(230).addComponent(statusLabel, 540, 540, 540).addGap(0, 230, Short.MAX_VALUE))
            .addGroup(windowLayout.createSequentialGroup().addGap(230).addComponent(backButton, 130, 130, 130).addGap(0, 640, Short.MAX_VALUE))
            .addGroup(windowLayout.createSequentialGroup().addGap(380).addComponent(nextButton, 390, 390, 390).addGap(0, 230, Short.MAX_VALUE))
            .addGroup(windowLayout.createSequentialGroup().addGap(230).addComponent(previewLabel, 540, 540, 540).addGap(0, 230, Short.MAX_VALUE))
        );
        windowLayout.setVerticalGroup(windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowLayout.createSequentialGroup().addGap(26).addComponent(brandLabel, 22, 22, 22).addGap(0, 452, Short.MAX_VALUE))
            .addGroup(windowLayout.createSequentialGroup().addGap(62).addComponent(titleLabel, 42, 42, 42).addGap(0, 396, Short.MAX_VALUE))
            .addGroup(windowLayout.createSequentialGroup().addGap(120).addComponent(stepLabel, 26, 26, 26).addGap(0, 354, Short.MAX_VALUE))
            .addGroup(windowLayout.createSequentialGroup().addGap(164).addComponent(stepsPanel, 180, 180, 180).addGap(0, 156, Short.MAX_VALUE))
            .addGroup(windowLayout.createSequentialGroup().addGap(350).addComponent(statusLabel, 28, 28, 28).addGap(0, 122, Short.MAX_VALUE))
            .addGroup(windowLayout.createSequentialGroup().addGap(394).addComponent(backButton, 42, 42, 42).addGap(0, 64, Short.MAX_VALUE))
            .addGroup(windowLayout.createSequentialGroup().addGap(394).addComponent(nextButton, 42, 42, 42).addGap(0, 64, Short.MAX_VALUE))
            .addGroup(windowLayout.createSequentialGroup().addGap(457).addComponent(previewLabel, 20, 20, 20).addGap(0, 23, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            com.formdev.flatlaf.FlatLightLaf.setup();
            new forgotPasswordForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brandLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel stepLabel;
    private javax.swing.JLabel previewLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JPanel stepsPanel;
    private javax.swing.JPanel emailPanel;
    private javax.swing.JLabel emailHintLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JPanel codePanel;
    private javax.swing.JLabel codeHintLabel;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JTextField codeField;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField confirmPasswordField;
    // End of variables declaration//GEN-END:variables
}
