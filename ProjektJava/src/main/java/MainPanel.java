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
    private JButton sprawdzWaluteButton;
    private JRadioButton AUDRadioButton;
    private JRadioButton TRYRadioButton;
    private JTextArea wybierzInteresujacaCieWaluteTextArea;
    private JLabel giflabel;


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
        $$$setupUI$$$();
        buttonGroup.add(USDRadioButton);
        buttonGroup.add(EURRadioButton);
        buttonGroup.add(TRYRadioButton);
        buttonGroup.add(JPYRadioButton);
        buttonGroup.add(AUDRadioButton);
        buttonGroup.add(CHFRadioButton);
        buttonGroup.add(UAHRadioButton);


        sprawdzWaluteButton.addActionListener(new ActionListener() {
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

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBackground(new Color(-1));
        Font mainPanelFont = this.$$$getFont$$$("Chalkduster", Font.BOLD, 36, mainPanel.getFont());
        if (mainPanelFont != null) mainPanel.setFont(mainPanelFont);
        EURRadioButton = new JRadioButton();
        EURRadioButton.setText("EUR");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        mainPanel.add(EURRadioButton, gbc);
        JPYRadioButton = new JRadioButton();
        JPYRadioButton.setText("JPY");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        mainPanel.add(JPYRadioButton, gbc);
        CHFRadioButton = new JRadioButton();
        CHFRadioButton.setText("CHF");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        mainPanel.add(CHFRadioButton, gbc);
        UAHRadioButton = new JRadioButton();
        UAHRadioButton.setText("UAH");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        mainPanel.add(UAHRadioButton, gbc);
        sprawdzWaluteButton = new JButton();
        sprawdzWaluteButton.setText("Sprawdź walutę");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(sprawdzWaluteButton, gbc);
        USDRadioButton = new JRadioButton();
        USDRadioButton.setText("USD");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        mainPanel.add(USDRadioButton, gbc);
        AUDRadioButton = new JRadioButton();
        AUDRadioButton.setText("AUD");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        mainPanel.add(AUDRadioButton, gbc);
        TRYRadioButton = new JRadioButton();
        TRYRadioButton.setHorizontalAlignment(10);
        TRYRadioButton.setText("TRY");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        mainPanel.add(TRYRadioButton, gbc);
        giflabel = new JLabel();
        giflabel.setAlignmentY(0.5f);
        giflabel.setHorizontalAlignment(0);
        giflabel.setHorizontalTextPosition(0);
        giflabel.setIcon(new ImageIcon(getClass().getResource("/gif/bitbird-character-development.gif")));
        giflabel.setMaximumSize(new Dimension(300, 200));
        giflabel.setMinimumSize(new Dimension(300, 200));
        giflabel.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.1;
        gbc.weighty = 0.1;
        mainPanel.add(giflabel, gbc);
        wybierzInteresujacaCieWaluteTextArea = new JTextArea();
        wybierzInteresujacaCieWaluteTextArea.setBackground(new Color(-1));
        wybierzInteresujacaCieWaluteTextArea.setEditable(false);
        wybierzInteresujacaCieWaluteTextArea.setEnabled(false);
        Font wybierzInteresujacaCieWaluteTextAreaFont = this.$$$getFont$$$("Phosphate", -1, 28, wybierzInteresujacaCieWaluteTextArea.getFont());
        if (wybierzInteresujacaCieWaluteTextAreaFont != null)
            wybierzInteresujacaCieWaluteTextArea.setFont(wybierzInteresujacaCieWaluteTextAreaFont);
        wybierzInteresujacaCieWaluteTextArea.setLineWrap(false);
        wybierzInteresujacaCieWaluteTextArea.setRows(0);
        wybierzInteresujacaCieWaluteTextArea.setSelectedTextColor(new Color(-1));
        wybierzInteresujacaCieWaluteTextArea.setSelectionColor(new Color(-1));
        wybierzInteresujacaCieWaluteTextArea.setSelectionEnd(0);
        wybierzInteresujacaCieWaluteTextArea.setSelectionStart(0);
        wybierzInteresujacaCieWaluteTextArea.setText("Wybierz interesującą Cię walutę:");
        wybierzInteresujacaCieWaluteTextArea.setWrapStyleWord(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.3;
        mainPanel.add(wybierzInteresujacaCieWaluteTextArea, gbc);
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

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }


}
