package QuizoraApp;

/** Application entry point. */
public class quizoraApp {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            com.formdev.flatlaf.FlatLightLaf.setup();
            new QuizoraApp.Ui.Auth.loginForm().setVisible(true);
        });
    }
}
