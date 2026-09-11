# Java Swing UI Development Rules

## Framework and screen structure

Build the desktop UI with javax.swing and java.awt. Use one application JFrame,
JPanel screens, and owned JDialog windows for modal editing and confirmation.
Use CardLayout to switch authentication screens and role workspaces. Dashboard
shells use BorderLayout with sidebar navigation and a central workspace.

Use GridBagLayout for hand-written forms, BoxLayout for vertical groups, and
GroupLayout for NetBeans GUI Builder forms. Avoid null layouts and fixed control
coordinates. A layout manager does not automatically provide breakpoint reflow;
explicitly adapt card/chart column counts when workspace width changes.

NetBeans GUI Builder is optional. Keep each .form beside its matching .java file,
use meaningful component variable names, and edit generated layout through the
GUI Builder rather than manually changing guarded initComponents blocks. Attach
presentation behavior after initialization or through supported event hooks.

## Components and naming

| Component | Example field |
| --- | --- |
| JLabel | titleLabel |
| JButton | loginButton |
| JTextField | usernameField |
| JPasswordField | passwordField |
| JPanel | sidebarPanel |
| JTable | studentTable |
| JComboBox | subjectComboBox |
| JScrollPane | quizScrollPane |

Use dedicated table models for record tables. Keep screen classes focused on
layout and rendering; presentation controllers handle navigation, listeners,
validation feedback, and worker lifecycle. Services own business validation,
authorization, quiz scoring, and transaction coordination; DAOs own SQL.

## Threading and events

Create and show the application on the Event Dispatch Thread (EDT):

```java
SwingUtilities.invokeLater(() -> {
    // Initialize the shared theme, wire dependencies, and show appFrame here.
});
```

Use ActionListener or shared Swing Actions for commands. Run authentication,
database operations, file reading, and expensive calculations in
SwingWorker.doInBackground(). Update Swing controls in done() or process(),
which run on the EDT. Never block the EDT waiting for worker completion.
Handle worker failures, restore controls, and show meaningful error messages.
Cancel obsolete work where possible and reject stale callbacks after navigation,
logout, or session changes. Use javax.swing.Timer only for short UI updates such
as a countdown display; assessment timing rules belong in the service layer.

## Shared visual design

Use the palette in [System UI Rules](System%20UI%20Rules.md.md).
Centralize Color, Font, Insets, borders, and UIManager defaults under Ui/Theme/.
Reuse styled controls under Ui/Components/. Fonts and icons load from classpath
resources, not absolute filesystem paths. Bundle Satoshi fonts before using them
and fall back to a logical font when unavailable.

Implement hover, pressed, selected, disabled, error, and visible keyboard focus
states with Swing button models, borders, and shared styling helpers. Swing has
no built-in chart suite: choose a Swing-compatible chart dependency or implement
shared Java2D chart components before delivering dashboard charts.

## Sizing, accessibility, and validation

Authentication uses the documented 1000 x 500 window. Role dashboards are
resizable, open at up to 1440 x 900 capped at 92% of the screen work area, and have
a 900 x 650 minimum reduced for smaller screens. Use scroll panes and deliberate
card/chart reflow to keep content accessible.

Associate labels with inputs using JLabel.setLabelFor(), give controls accessible
names, and maintain logical focus traversal. Preserve visible keyboard focus,
provide appropriate mnemonics/default buttons, and display field-level validation
without relying on color alone. Use JPasswordField.getPassword() for password
input and clear temporary password arrays after use.

## Organization and references

Follow [Recommended Folder Structure](../System/Recommended%20Folder%20Structure.md).
Follow [Database Rules](Database%20Rules.md.md) for persistence boundaries.

The concurrency and panel navigation rules follow Oracle's
[Swing concurrency guidance](https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html)
and [CardLayout guidance](https://docs.oracle.com/javase/tutorial/uiswing/layout/card.html).
