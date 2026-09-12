
package QuizoraApp.Ui.Admin;

/** Screenshot-based administrator dashboard. All displayed figures are illustrative. */
public class adminDashboardForm extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(adminDashboardForm.class.getName());
    public adminDashboardForm() {
        initComponents();
        applySatoshi(getContentPane());
        setMinimumSize(getSize());
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

        sidebarPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        brandLabel = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        navigation0Button = new javax.swing.JButton();
        navigation1Button = new javax.swing.JButton();
        navigation2Button = new javax.swing.JButton();
        navigation3Button = new javax.swing.JButton();
        navigation4Button = new javax.swing.JButton();
        navigation5Button = new javax.swing.JButton();
        navigation6Button = new javax.swing.JButton();
        navigation7Button = new javax.swing.JButton();
        avatarLabel = new javax.swing.JLabel();
        accountLabel = new javax.swing.JLabel();
        handleLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        metricsLabel = new javax.swing.JLabel();
        demoLabel = new javax.swing.JLabel();
        metric0Panel = new javax.swing.JPanel();
        metric0PanelTitle = new javax.swing.JLabel();
        metric0PanelValue = new javax.swing.JLabel();
        metric0PanelNote = new javax.swing.JLabel();
        metric1Panel = new javax.swing.JPanel();
        metric1PanelTitle = new javax.swing.JLabel();
        metric1PanelValue = new javax.swing.JLabel();
        metric1PanelNote = new javax.swing.JLabel();
        metric2Panel = new javax.swing.JPanel();
        metric2PanelTitle = new javax.swing.JLabel();
        metric2PanelValue = new javax.swing.JLabel();
        metric2PanelNote = new javax.swing.JLabel();
        metric3Panel = new javax.swing.JPanel();
        metric3PanelTitle = new javax.swing.JLabel();
        metric3PanelValue = new javax.swing.JLabel();
        metric3PanelNote = new javax.swing.JLabel();
        metric4Panel = new javax.swing.JPanel();
        metric4PanelTitle = new javax.swing.JLabel();
        metric4PanelValue = new javax.swing.JLabel();
        metric4PanelNote = new javax.swing.JLabel();
        learningLabel = new javax.swing.JLabel();
        learningHintLabel = new javax.swing.JLabel();
        chart0Panel = new javax.swing.JPanel();
        chart0PanelTitle = new javax.swing.JLabel();
        chart0PanelHint = new javax.swing.JLabel();
        chart0 = new QuizoraApp.Ui.Components.dashboardChart();
        chart1Panel = new javax.swing.JPanel();
        chart1PanelTitle = new javax.swing.JLabel();
        chart1PanelHint = new javax.swing.JLabel();
        chart1 = new QuizoraApp.Ui.Components.dashboardChart();
        chart2Panel = new javax.swing.JPanel();
        chart2PanelTitle = new javax.swing.JLabel();
        chart2PanelHint = new javax.swing.JLabel();
        chart2 = new QuizoraApp.Ui.Components.dashboardChart();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quizora - Administrator Panel");

        sidebarPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setFont(new java.awt.Font("Satoshi", 1, 28)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(59, 133, 140));
        logoLabel.setText("Q");

        brandLabel.setFont(new java.awt.Font("Satoshi", 1, 22)); // NOI18N
        brandLabel.setForeground(new java.awt.Color(37, 50, 56));
        brandLabel.setText("Quizora");

        roleLabel.setFont(new java.awt.Font("Satoshi", 0, 10)); // NOI18N
        roleLabel.setForeground(new java.awt.Color(104, 119, 125));
        roleLabel.setText("ADMINISTRATOR");

        navigation0Button.setBackground(new java.awt.Color(189, 224, 254));
        navigation0Button.setFont(new java.awt.Font("Satoshi", 0, 12)); // NOI18N
        navigation0Button.setForeground(new java.awt.Color(37, 50, 56));
        navigation0Button.setText("Dashboard");
        navigation0Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navigation0Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Icons/UIcons/home.png"))); // NOI18N
        navigation0Button.setBorderPainted(false);

        navigation1Button.setFont(new java.awt.Font("Satoshi", 0, 12)); // NOI18N
        navigation1Button.setForeground(new java.awt.Color(104, 119, 125));
        navigation1Button.setText("Student Management");
        navigation1Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navigation1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Icons/UIcons/users.png"))); // NOI18N
        navigation1Button.setBorderPainted(false);

        navigation2Button.setFont(new java.awt.Font("Satoshi", 0, 12)); // NOI18N
        navigation2Button.setForeground(new java.awt.Color(104, 119, 125));
        navigation2Button.setText("Teacher Management");
        navigation2Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navigation2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Icons/UIcons/user_male.png"))); // NOI18N
        navigation2Button.setBorderPainted(false);

        navigation3Button.setFont(new java.awt.Font("Satoshi", 0, 12)); // NOI18N
        navigation3Button.setForeground(new java.awt.Color(104, 119, 125));
        navigation3Button.setText("Quiz Management");
        navigation3Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navigation3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Icons/UIcons/clipboard.png"))); // NOI18N
        navigation3Button.setBorderPainted(false);

        navigation4Button.setFont(new java.awt.Font("Satoshi", 0, 12)); // NOI18N
        navigation4Button.setForeground(new java.awt.Color(104, 119, 125));
        navigation4Button.setText("Subject/Category Management");
        navigation4Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navigation4Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Icons/UIcons/book.png"))); // NOI18N
        navigation4Button.setBorderPainted(false);

        navigation5Button.setFont(new java.awt.Font("Satoshi", 0, 12)); // NOI18N
        navigation5Button.setForeground(new java.awt.Color(104, 119, 125));
        navigation5Button.setText("Reports");
        navigation5Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navigation5Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Icons/UIcons/clipboard.png"))); // NOI18N
        navigation5Button.setBorderPainted(false);

        navigation6Button.setFont(new java.awt.Font("Satoshi", 0, 12)); // NOI18N
        navigation6Button.setForeground(new java.awt.Color(104, 119, 125));
        navigation6Button.setText("Results");
        navigation6Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navigation6Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Icons/UIcons/eye.png"))); // NOI18N
        navigation6Button.setBorderPainted(false);

        navigation7Button.setFont(new java.awt.Font("Satoshi", 0, 12)); // NOI18N
        navigation7Button.setForeground(new java.awt.Color(104, 119, 125));
        navigation7Button.setText("Account Management");
        navigation7Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navigation7Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizoraApp/Resources/Icons/UIcons/settings.png"))); // NOI18N
        navigation7Button.setBorderPainted(false);

        avatarLabel.setFont(new java.awt.Font("Satoshi", 1, 18)); // NOI18N
        avatarLabel.setForeground(new java.awt.Color(59, 133, 140));
        avatarLabel.setText("QA");

        accountLabel.setFont(new java.awt.Font("Satoshi", 1, 12)); // NOI18N
        accountLabel.setForeground(new java.awt.Color(37, 50, 56));
        accountLabel.setText("Quizora Administrator");

        handleLabel.setFont(new java.awt.Font("Satoshi", 0, 11)); // NOI18N
        handleLabel.setForeground(new java.awt.Color(104, 119, 125));
        handleLabel.setText("@admin");

        logoutButton.setFont(new java.awt.Font("Satoshi", 0, 12)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(104, 119, 125));
        logoutButton.setText("Logout");
        logoutButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logoutButton.addActionListener(this::logoutButtonActionPerformed);

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(logoLabel, 40, 40, 40))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(brandLabel, 165, 165, 165))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(roleLabel, 165, 165, 165))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(navigation0Button, 246, 246, 246))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(navigation1Button, 246, 246, 246))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(navigation2Button, 246, 246, 246))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(navigation3Button, 246, 246, 246))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(navigation4Button, 246, 246, 246))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(navigation5Button, 246, 246, 246))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(navigation6Button, 246, 246, 246))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(navigation7Button, 246, 246, 246))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(avatarLabel, 46, 46, 46))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(accountLabel, 180, 180, 180))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(handleLabel, 160, 160, 160))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(logoutButton, 224, 224, 224)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(logoLabel, 44, 44, 44))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(brandLabel, 28, 28, 28))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(roleLabel, 20, 20, 20))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(navigation0Button, 43, 43, 43))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(navigation1Button, 43, 43, 43))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(navigation2Button, 43, 43, 43))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(navigation3Button, 43, 43, 43))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(navigation4Button, 43, 43, 43))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(navigation5Button, 43, 43, 43))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(navigation6Button, 43, 43, 43))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(navigation7Button, 43, 43, 43))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(590, 590, 590)
                        .addComponent(avatarLabel, 42, 42, 42))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(588, 588, 588)
                        .addComponent(accountLabel, 24, 24, 24))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(614, 614, 614)
                        .addComponent(handleLabel, 20, 20, 20))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(644, 644, 644)
                        .addComponent(logoutButton, 34, 34, 34)))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        contentPanel.setBackground(new java.awt.Color(247, 250, 252));

        titleLabel.setFont(new java.awt.Font("Satoshi", 1, 28)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(37, 50, 56));
        titleLabel.setText("Dashboard");

        subtitleLabel.setFont(new java.awt.Font("Satoshi", 0, 13)); // NOI18N
        subtitleLabel.setForeground(new java.awt.Color(104, 119, 125));
        subtitleLabel.setText("Review system activity and administration shortcuts.");

        metricsLabel.setFont(new java.awt.Font("Satoshi", 1, 18)); // NOI18N
        metricsLabel.setForeground(new java.awt.Color(37, 50, 56));
        metricsLabel.setText("Key metrics");

        demoLabel.setFont(new java.awt.Font("Satoshi", 1, 10)); // NOI18N
        demoLabel.setForeground(new java.awt.Color(59, 133, 140));
        demoLabel.setText("DEMO DATA");

        metric0Panel.setBackground(new java.awt.Color(255, 255, 255));
        metric0Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 229, 232), 1, true));

        metric0PanelTitle.setFont(new java.awt.Font("Satoshi", 0, 11)); // NOI18N
        metric0PanelTitle.setForeground(new java.awt.Color(104, 119, 125));
        metric0PanelTitle.setText("Total Students");

        metric0PanelValue.setFont(new java.awt.Font("Satoshi", 1, 25)); // NOI18N
        metric0PanelValue.setForeground(new java.awt.Color(37, 50, 56));
        metric0PanelValue.setText("1,248");

        metric0PanelNote.setFont(new java.awt.Font("Satoshi", 0, 9)); // NOI18N
        metric0PanelNote.setForeground(new java.awt.Color(104, 119, 125));
        metric0PanelNote.setText("+86 this term");

        javax.swing.GroupLayout metric0PanelLayout = new javax.swing.GroupLayout(metric0Panel);
        metric0Panel.setLayout(metric0PanelLayout);
        metric0PanelLayout.setHorizontalGroup(
            metric0PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(metric0PanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(metric0PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(metric0PanelTitle, 146, 146, 146)
                    .addComponent(metric0PanelValue, 146, 146, 146)
                    .addComponent(metric0PanelNote, 146, 146, 146))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        metric0PanelLayout.setVerticalGroup(
            metric0PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(metric0PanelLayout.createSequentialGroup()
                .addGroup(metric0PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(metric0PanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(metric0PanelTitle, 22, 22, 22))
                    .addGroup(metric0PanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(metric0PanelValue, 34, 34, 34))
                    .addGroup(metric0PanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(metric0PanelNote, 18, 18, 18)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        metric1Panel.setBackground(new java.awt.Color(255, 255, 255));
        metric1Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 229, 232), 1, true));

        metric1PanelTitle.setFont(new java.awt.Font("Satoshi", 0, 11)); // NOI18N
        metric1PanelTitle.setForeground(new java.awt.Color(104, 119, 125));
        metric1PanelTitle.setText("Total Teachers");

        metric1PanelValue.setFont(new java.awt.Font("Satoshi", 1, 25)); // NOI18N
        metric1PanelValue.setForeground(new java.awt.Color(37, 50, 56));
        metric1PanelValue.setText("64");

        metric1PanelNote.setFont(new java.awt.Font("Satoshi", 0, 9)); // NOI18N
        metric1PanelNote.setForeground(new java.awt.Color(104, 119, 125));
        metric1PanelNote.setText("+5 this term");

        javax.swing.GroupLayout metric1PanelLayout = new javax.swing.GroupLayout(metric1Panel);
        metric1Panel.setLayout(metric1PanelLayout);
        metric1PanelLayout.setHorizontalGroup(
            metric1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(metric1PanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(metric1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(metric1PanelTitle, 146, 146, 146)
                    .addComponent(metric1PanelValue, 146, 146, 146)
                    .addComponent(metric1PanelNote, 146, 146, 146))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        metric1PanelLayout.setVerticalGroup(
            metric1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(metric1PanelLayout.createSequentialGroup()
                .addGroup(metric1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(metric1PanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(metric1PanelTitle, 22, 22, 22))
                    .addGroup(metric1PanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(metric1PanelValue, 34, 34, 34))
                    .addGroup(metric1PanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(metric1PanelNote, 18, 18, 18)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        metric2Panel.setBackground(new java.awt.Color(255, 255, 255));
        metric2Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 229, 232), 1, true));

        metric2PanelTitle.setFont(new java.awt.Font("Satoshi", 0, 11)); // NOI18N
        metric2PanelTitle.setForeground(new java.awt.Color(104, 119, 125));
        metric2PanelTitle.setText("Total Quizzes");

        metric2PanelValue.setFont(new java.awt.Font("Satoshi", 1, 25)); // NOI18N
        metric2PanelValue.setForeground(new java.awt.Color(37, 50, 56));
        metric2PanelValue.setText("36");

        metric2PanelNote.setFont(new java.awt.Font("Satoshi", 0, 9)); // NOI18N
        metric2PanelNote.setForeground(new java.awt.Color(104, 119, 125));
        metric2PanelNote.setText("8 currently active");

        javax.swing.GroupLayout metric2PanelLayout = new javax.swing.GroupLayout(metric2Panel);
        metric2Panel.setLayout(metric2PanelLayout);
        metric2PanelLayout.setHorizontalGroup(
            metric2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(metric2PanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(metric2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(metric2PanelTitle, 146, 146, 146)
                    .addComponent(metric2PanelValue, 146, 146, 146)
                    .addComponent(metric2PanelNote, 146, 146, 146))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        metric2PanelLayout.setVerticalGroup(
            metric2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(metric2PanelLayout.createSequentialGroup()
                .addGroup(metric2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(metric2PanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(metric2PanelTitle, 22, 22, 22))
                    .addGroup(metric2PanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(metric2PanelValue, 34, 34, 34))
                    .addGroup(metric2PanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(metric2PanelNote, 18, 18, 18)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        metric3Panel.setBackground(new java.awt.Color(255, 255, 255));
        metric3Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 229, 232), 1, true));

        metric3PanelTitle.setFont(new java.awt.Font("Satoshi", 0, 11)); // NOI18N
        metric3PanelTitle.setForeground(new java.awt.Color(104, 119, 125));
        metric3PanelTitle.setText("Total Subjects");

        metric3PanelValue.setFont(new java.awt.Font("Satoshi", 1, 25)); // NOI18N
        metric3PanelValue.setForeground(new java.awt.Color(37, 50, 56));
        metric3PanelValue.setText("12");

        metric3PanelNote.setFont(new java.awt.Font("Satoshi", 0, 9)); // NOI18N
        metric3PanelNote.setForeground(new java.awt.Color(104, 119, 125));
        metric3PanelNote.setText("All categories");

        javax.swing.GroupLayout metric3PanelLayout = new javax.swing.GroupLayout(metric3Panel);
        metric3Panel.setLayout(metric3PanelLayout);
        metric3PanelLayout.setHorizontalGroup(
            metric3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(metric3PanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(metric3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(metric3PanelTitle, 146, 146, 146)
                    .addComponent(metric3PanelValue, 146, 146, 146)
                    .addComponent(metric3PanelNote, 146, 146, 146))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        metric3PanelLayout.setVerticalGroup(
            metric3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(metric3PanelLayout.createSequentialGroup()
                .addGroup(metric3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(metric3PanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(metric3PanelTitle, 22, 22, 22))
                    .addGroup(metric3PanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(metric3PanelValue, 34, 34, 34))
                    .addGroup(metric3PanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(metric3PanelNote, 18, 18, 18)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        metric4Panel.setBackground(new java.awt.Color(255, 255, 255));
        metric4Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 229, 232), 1, true));

        metric4PanelTitle.setFont(new java.awt.Font("Satoshi", 0, 11)); // NOI18N
        metric4PanelTitle.setForeground(new java.awt.Color(104, 119, 125));
        metric4PanelTitle.setText("Recent Activities");

        metric4PanelValue.setFont(new java.awt.Font("Satoshi", 1, 25)); // NOI18N
        metric4PanelValue.setForeground(new java.awt.Color(37, 50, 56));
        metric4PanelValue.setText("18");

        metric4PanelNote.setFont(new java.awt.Font("Satoshi", 0, 9)); // NOI18N
        metric4PanelNote.setForeground(new java.awt.Color(104, 119, 125));
        metric4PanelNote.setText("Recorded today");

        javax.swing.GroupLayout metric4PanelLayout = new javax.swing.GroupLayout(metric4Panel);
        metric4Panel.setLayout(metric4PanelLayout);
        metric4PanelLayout.setHorizontalGroup(
            metric4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(metric4PanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(metric4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(metric4PanelTitle, 146, 146, 146)
                    .addComponent(metric4PanelValue, 146, 146, 146)
                    .addComponent(metric4PanelNote, 146, 146, 146))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        metric4PanelLayout.setVerticalGroup(
            metric4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(metric4PanelLayout.createSequentialGroup()
                .addGroup(metric4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(metric4PanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(metric4PanelTitle, 22, 22, 22))
                    .addGroup(metric4PanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(metric4PanelValue, 34, 34, 34))
                    .addGroup(metric4PanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(metric4PanelNote, 18, 18, 18)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        learningLabel.setFont(new java.awt.Font("Satoshi", 1, 18)); // NOI18N
        learningLabel.setForeground(new java.awt.Color(37, 50, 56));
        learningLabel.setText("Learning activity");

        learningHintLabel.setFont(new java.awt.Font("Satoshi", 0, 11)); // NOI18N
        learningHintLabel.setForeground(new java.awt.Color(104, 119, 125));
        learningHintLabel.setText("A snapshot of the current term");

        chart0Panel.setBackground(new java.awt.Color(255, 255, 255));
        chart0Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 229, 232), 1, true));

        chart0PanelTitle.setFont(new java.awt.Font("Satoshi", 1, 14)); // NOI18N
        chart0PanelTitle.setForeground(new java.awt.Color(37, 50, 56));
        chart0PanelTitle.setText("Quiz Attempts");

        chart0PanelHint.setFont(new java.awt.Font("Satoshi", 0, 11)); // NOI18N
        chart0PanelHint.setForeground(new java.awt.Color(104, 119, 125));
        chart0PanelHint.setText("Attempts by subject");

        chart0.setForeground(new java.awt.Color(37, 50, 56));
        chart0.setFont(new java.awt.Font("Satoshi", 0, 13)); // NOI18N

        javax.swing.GroupLayout chart0PanelLayout = new javax.swing.GroupLayout(chart0Panel);
        chart0Panel.setLayout(chart0PanelLayout);
        chart0PanelLayout.setHorizontalGroup(
            chart0PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chart0PanelLayout.createSequentialGroup()
                .addGroup(chart0PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chart0PanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(chart0PanelTitle, 230, 230, 230))
                    .addGroup(chart0PanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(chart0PanelHint, 230, 230, 230))
                    .addGroup(chart0PanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(chart0, 250, 250, 250)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        chart0PanelLayout.setVerticalGroup(
            chart0PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chart0PanelLayout.createSequentialGroup()
                .addGroup(chart0PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chart0PanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(chart0PanelTitle, 24, 24, 24))
                    .addGroup(chart0PanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(chart0PanelHint, 20, 20, 20))
                    .addGroup(chart0PanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(chart0, 240, 240, 240)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        chart1Panel.setBackground(new java.awt.Color(255, 255, 255));
        chart1Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 229, 232), 1, true));

        chart1PanelTitle.setFont(new java.awt.Font("Satoshi", 1, 14)); // NOI18N
        chart1PanelTitle.setForeground(new java.awt.Color(37, 50, 56));
        chart1PanelTitle.setText("Weekly Participation");

        chart1PanelHint.setFont(new java.awt.Font("Satoshi", 0, 11)); // NOI18N
        chart1PanelHint.setForeground(new java.awt.Color(104, 119, 125));
        chart1PanelHint.setText("Active students by day");

        chart1.setFont(new java.awt.Font("Satoshi", 0, 13)); // NOI18N
        chart1.setForeground(new java.awt.Color(37, 50, 56));
        chart1.setChartType(1);

        javax.swing.GroupLayout chart1PanelLayout = new javax.swing.GroupLayout(chart1Panel);
        chart1Panel.setLayout(chart1PanelLayout);
        chart1PanelLayout.setHorizontalGroup(
            chart1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chart1PanelLayout.createSequentialGroup()
                .addGroup(chart1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chart1PanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(chart1PanelTitle, 230, 230, 230))
                    .addGroup(chart1PanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(chart1PanelHint, 230, 230, 230))
                    .addGroup(chart1PanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(chart1, 250, 250, 250)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        chart1PanelLayout.setVerticalGroup(
            chart1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chart1PanelLayout.createSequentialGroup()
                .addGroup(chart1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chart1PanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(chart1PanelTitle, 24, 24, 24))
                    .addGroup(chart1PanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(chart1PanelHint, 20, 20, 20))
                    .addGroup(chart1PanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(chart1, 240, 240, 240)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        chart2Panel.setBackground(new java.awt.Color(255, 255, 255));
        chart2Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 229, 232), 1, true));

        chart2PanelTitle.setFont(new java.awt.Font("Satoshi", 1, 14)); // NOI18N
        chart2PanelTitle.setForeground(new java.awt.Color(37, 50, 56));
        chart2PanelTitle.setText("Quiz Completion");

        chart2PanelHint.setFont(new java.awt.Font("Satoshi", 0, 11)); // NOI18N
        chart2PanelHint.setForeground(new java.awt.Color(104, 119, 125));
        chart2PanelHint.setText("Current quiz status");

        chart2.setFont(new java.awt.Font("Satoshi", 0, 13)); // NOI18N
        chart2.setForeground(new java.awt.Color(37, 50, 56));
        chart2.setChartType(2);

        javax.swing.GroupLayout chart2PanelLayout = new javax.swing.GroupLayout(chart2Panel);
        chart2Panel.setLayout(chart2PanelLayout);
        chart2PanelLayout.setHorizontalGroup(
            chart2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chart2PanelLayout.createSequentialGroup()
                .addGroup(chart2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chart2PanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(chart2PanelTitle, 230, 230, 230))
                    .addGroup(chart2PanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(chart2PanelHint, 230, 230, 230))
                    .addGroup(chart2PanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(chart2, 250, 250, 250)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        chart2PanelLayout.setVerticalGroup(
            chart2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chart2PanelLayout.createSequentialGroup()
                .addGroup(chart2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chart2PanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(chart2PanelTitle, 24, 24, 24))
                    .addGroup(chart2PanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(chart2PanelHint, 20, 20, 20))
                    .addGroup(chart2PanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(chart2, 240, 240, 240)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(metric0Panel)
                .addGap(0, 726, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(metric1Panel)
                .addGap(0, 552, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(metric2Panel)
                .addGap(0, 378, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(558, 558, 558)
                .addComponent(metric3Panel)
                .addGap(0, 204, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(732, 732, 732)
                .addComponent(metric4Panel)
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(chart0Panel)
                .addGap(0, 618, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(chart1Panel)
                .addGap(0, 328, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(616, 616, 616)
                .addComponent(chart2Panel)
                .addGap(0, 38, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(titleLabel, 500, 500, 500))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(subtitleLabel, 700, 700, 700))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(metricsLabel, 400, 400, 400))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(790, 790, 790)
                        .addComponent(demoLabel, 95, 95, 95))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(learningLabel, 600, 600, 600))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(learningHintLabel, 600, 600, 600)))
                .addGap(0, 43, Short.MAX_VALUE))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(metric0Panel)
                .addGap(0, 423, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(metric1Panel)
                .addGap(0, 423, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(metric2Panel)
                .addGap(0, 423, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(metric3Panel)
                .addGap(0, 423, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(metric4Panel)
                .addGap(0, 423, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(chart0Panel)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(chart1Panel)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(chart2Panel)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(titleLabel, 36, 36, 36))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(subtitleLabel, 24, 24, 24))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(metricsLabel, 26, 26, 26))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(demoLabel, 22, 22, 22))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(learningLabel, 28, 28, 28))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(learningHintLabel, 20, 20, 20)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebarPanel)
                .addGap(0, 928, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(contentPanel))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebarPanel)
            .addComponent(contentPanel)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            com.formdev.flatlaf.FlatLightLaf.setup();
            new adminDashboardForm().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountLabel;
    private javax.swing.JLabel avatarLabel;
    private javax.swing.JLabel brandLabel;
    private QuizoraApp.Ui.Components.dashboardChart chart0;
    private javax.swing.JPanel chart0Panel;
    private javax.swing.JLabel chart0PanelHint;
    private javax.swing.JLabel chart0PanelTitle;
    private QuizoraApp.Ui.Components.dashboardChart chart1;
    private javax.swing.JPanel chart1Panel;
    private javax.swing.JLabel chart1PanelHint;
    private javax.swing.JLabel chart1PanelTitle;
    private QuizoraApp.Ui.Components.dashboardChart chart2;
    private javax.swing.JPanel chart2Panel;
    private javax.swing.JLabel chart2PanelHint;
    private javax.swing.JLabel chart2PanelTitle;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel demoLabel;
    private javax.swing.JLabel handleLabel;
    private javax.swing.JLabel learningHintLabel;
    private javax.swing.JLabel learningLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel metric0Panel;
    private javax.swing.JLabel metric0PanelNote;
    private javax.swing.JLabel metric0PanelTitle;
    private javax.swing.JLabel metric0PanelValue;
    private javax.swing.JPanel metric1Panel;
    private javax.swing.JLabel metric1PanelNote;
    private javax.swing.JLabel metric1PanelTitle;
    private javax.swing.JLabel metric1PanelValue;
    private javax.swing.JPanel metric2Panel;
    private javax.swing.JLabel metric2PanelNote;
    private javax.swing.JLabel metric2PanelTitle;
    private javax.swing.JLabel metric2PanelValue;
    private javax.swing.JPanel metric3Panel;
    private javax.swing.JLabel metric3PanelNote;
    private javax.swing.JLabel metric3PanelTitle;
    private javax.swing.JLabel metric3PanelValue;
    private javax.swing.JPanel metric4Panel;
    private javax.swing.JLabel metric4PanelNote;
    private javax.swing.JLabel metric4PanelTitle;
    private javax.swing.JLabel metric4PanelValue;
    private javax.swing.JLabel metricsLabel;
    private javax.swing.JButton navigation0Button;
    private javax.swing.JButton navigation1Button;
    private javax.swing.JButton navigation2Button;
    private javax.swing.JButton navigation3Button;
    private javax.swing.JButton navigation4Button;
    private javax.swing.JButton navigation5Button;
    private javax.swing.JButton navigation6Button;
    private javax.swing.JButton navigation7Button;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
