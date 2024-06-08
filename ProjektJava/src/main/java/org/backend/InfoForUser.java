package org.backend;
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.List;

public class InfoForUser extends JPanel {
    private JLabel titleLabel;
    private JLabel currencyLabel;
    private JLabel dateLabel;
    private JLabel rateLabel;
    private JLabel rate2Label;

    public InfoForUser(String currencyCode) {
        try {
            setBackground(Color.WHITE);
            DecimalFormat df = new DecimalFormat("#.###");

            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 2;

            CurrencyData lastCurrencyData = Database.getLast(currencyCode);

            titleLabel = new JLabel("Ostatni kurs waluty :");
            currencyLabel = new JLabel("Waluta :");
            dateLabel = new JLabel("Data:");
            rateLabel = new JLabel("Kurs PLN/%s:".formatted(currencyCode));
            rate2Label = new JLabel("Kurs %s/PLN:".formatted(currencyCode));

            titleLabel.setForeground(Color.BLACK);
            currencyLabel.setForeground(Color.BLACK);
            dateLabel.setForeground(Color.BLACK);
            rateLabel.setForeground(Color.BLACK);
            rate2Label.setForeground(Color.BLACK);

            Font font = new Font("Arial", Font.BOLD, 16);
            titleLabel.setFont(font);
            currencyLabel.setFont(font);
            dateLabel.setFont(font);
            rateLabel.setFont(font);
            rate2Label.setFont(font);

            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            add(titleLabel, gbc);

            gbc.gridy++;
            gbc.gridwidth = 1;



            add(currencyLabel, gbc);
            gbc.gridx++;
            JLabel Label = new JLabel(lastCurrencyData.getCurrencyCode());
            Label.setHorizontalAlignment(SwingConstants.CENTER);
            add(Label, gbc);

            gbc.gridx = 0;
            gbc.gridy++;
            add(dateLabel, gbc);
            gbc.gridx++;

            Label = new JLabel(lastCurrencyData.getTimestamp().toString());
            Label.setHorizontalAlignment(SwingConstants.CENTER);
            add(Label, gbc);


            gbc.gridx = 0;
            gbc.gridy++;
            add(rateLabel, gbc);
            gbc.gridx++;

            Label = new JLabel(String.valueOf(lastCurrencyData.getRate()));
            Label.setHorizontalAlignment(SwingConstants.CENTER);
            add(Label, gbc);

            gbc.gridx = 0;
            gbc.gridy++;
            add(rate2Label, gbc);
            gbc.gridx++;

            Label = new JLabel(String.valueOf(df.format(1/lastCurrencyData.getRate())));
            Label.setHorizontalAlignment(SwingConstants.CENTER);
            add(Label, gbc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
