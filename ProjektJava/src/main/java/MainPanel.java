import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class MainPanel {
    private JPanel mainPanel;
    private JRadioButton USDRadioButton;
    private JRadioButton EURRadioButton;
    private JRadioButton JPYRadioButton;
    private JRadioButton CHFRadioButton;
    private JRadioButton UAHRadioButton;
    private JButton sprawdźWalutęButton;
    private JRadioButton AUDRadioButton;
    private JRadioButton TRYRadioButton;
    private JTextArea wybierzInteresującąCięWalutęTextArea;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikacja do sprawdzania kursów polskiej waluty");


        frame.setContentPane(new MainPanel().mainPanel);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    MainPanel() {

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(USDRadioButton);
        buttonGroup.add(EURRadioButton);
        buttonGroup.add(TRYRadioButton);
        buttonGroup.add(JPYRadioButton);
        buttonGroup.add(AUDRadioButton);
        buttonGroup.add(CHFRadioButton);
        buttonGroup.add(UAHRadioButton);

        sprawdźWalutęButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




                if (USDRadioButton.isSelected()) {
                    JFrame detailsFrame = new JFrame("Okno ze szczegółami");
                    detailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    DetailsPanel detailsPanel = new DetailsPanel("USD");
                    detailsFrame.setContentPane(detailsPanel.$$$getRootComponent$$$());
                    detailsFrame.pack();
                    detailsFrame.setVisible(true);
                    SwingUtilities.getWindowAncestor(mainPanel).dispose();
                } else if (EURRadioButton.isSelected()) {
                    JFrame detailsFrame = new JFrame("Okno ze szczegółami");
                    detailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    DetailsPanel detailsPanel = new DetailsPanel("EUR");
                    detailsFrame.setContentPane(detailsPanel.$$$getRootComponent$$$());
                    detailsFrame.pack();
                    detailsFrame.setVisible(true);
                    SwingUtilities.getWindowAncestor(mainPanel).dispose();
                } else if (JPYRadioButton.isSelected()) {
                    JFrame detailsFrame = new JFrame("Okno ze szczegółami");
                    detailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    DetailsPanel detailsPanel = new DetailsPanel("JPY");
                    detailsFrame.setContentPane(detailsPanel.$$$getRootComponent$$$());
                    detailsFrame.pack();
                    detailsFrame.setVisible(true);
                    SwingUtilities.getWindowAncestor(mainPanel).dispose();
                } else if (CHFRadioButton.isSelected()) {
                    JFrame detailsFrame = new JFrame("Okno ze szczegółami");
                    detailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    DetailsPanel detailsPanel = new DetailsPanel("CHF");
                    detailsFrame.setContentPane(detailsPanel.$$$getRootComponent$$$());
                    detailsFrame.pack();
                    detailsFrame.setVisible(true);
                    SwingUtilities.getWindowAncestor(mainPanel).dispose();
                } else if (UAHRadioButton.isSelected()) {
                    JFrame detailsFrame = new JFrame("Okno ze szczegółami");
                    detailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    DetailsPanel detailsPanel = new DetailsPanel("UAH");
                    detailsFrame.setContentPane(detailsPanel.$$$getRootComponent$$$());
                    detailsFrame.pack();
                    detailsFrame.setVisible(true);
                    SwingUtilities.getWindowAncestor(mainPanel).dispose();
                } else if (AUDRadioButton.isSelected()) {
                    JFrame detailsFrame = new JFrame("Okno ze szczegółami");
                    detailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    DetailsPanel detailsPanel = new DetailsPanel("AUD");
                    detailsFrame.setContentPane(detailsPanel.$$$getRootComponent$$$());
                    detailsFrame.pack();
                    detailsFrame.setVisible(true);
                    SwingUtilities.getWindowAncestor(mainPanel).dispose();
                } else if (TRYRadioButton.isSelected()) {
                    JFrame detailsFrame = new JFrame("Okno ze szczegółami");
                    detailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    DetailsPanel detailsPanel = new DetailsPanel("TRY");
                    detailsFrame.setContentPane(detailsPanel.$$$getRootComponent$$$());
                    detailsFrame.pack();
                    detailsFrame.setVisible(true);
                    SwingUtilities.getWindowAncestor(mainPanel).dispose();
                } else {
                    JOptionPane.showMessageDialog(mainPanel, "Proszę zaznaczyć interesującą Cię walutę", "Brak zaznaczonej waluty", JOptionPane.ERROR_MESSAGE);

                }

            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(9, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.setBackground(new Color(-1));
        Font mainPanelFont = this.$$$getFont$$$("Chalkduster", Font.BOLD, 36, mainPanel.getFont());
        if (mainPanelFont != null) mainPanel.setFont(mainPanelFont);
        EURRadioButton = new JRadioButton();
        EURRadioButton.setText("EUR");
        mainPanel.add(EURRadioButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        JPYRadioButton = new JRadioButton();
        JPYRadioButton.setText("JPY");
        mainPanel.add(JPYRadioButton, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        CHFRadioButton = new JRadioButton();
        CHFRadioButton.setText("CHF");
        mainPanel.add(CHFRadioButton, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        UAHRadioButton = new JRadioButton();
        UAHRadioButton.setText("UAH");
        mainPanel.add(UAHRadioButton, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        sprawdźWalutęButton = new JButton();
        sprawdźWalutęButton.setText("Sprawdź walutę");
        mainPanel.add(sprawdźWalutęButton, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        USDRadioButton = new JRadioButton();
        USDRadioButton.setText("USD");
        mainPanel.add(USDRadioButton, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        AUDRadioButton = new JRadioButton();
        AUDRadioButton.setText("AUD");
        mainPanel.add(AUDRadioButton, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        TRYRadioButton = new JRadioButton();
        TRYRadioButton.setHorizontalAlignment(10);
        TRYRadioButton.setText("TRY");
        mainPanel.add(TRYRadioButton, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        wybierzInteresującąCięWalutęTextArea = new JTextArea();
        wybierzInteresującąCięWalutęTextArea.setEditable(false);
        wybierzInteresującąCięWalutęTextArea.setEnabled(true);
        Font wybierzInteresującąCięWalutęTextAreaFont = this.$$$getFont$$$("Phosphate", -1, 28, wybierzInteresującąCięWalutęTextArea.getFont());
        if (wybierzInteresującąCięWalutęTextAreaFont != null)
            wybierzInteresującąCięWalutęTextArea.setFont(wybierzInteresującąCięWalutęTextAreaFont);
        wybierzInteresującąCięWalutęTextArea.setLineWrap(false);
        wybierzInteresującąCięWalutęTextArea.setRows(0);
        wybierzInteresującąCięWalutęTextArea.setText("Wybierz interesującą Cię walutę:");
        wybierzInteresującąCięWalutęTextArea.setWrapStyleWord(false);
        mainPanel.add(wybierzInteresującąCięWalutęTextArea, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 50), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

}
