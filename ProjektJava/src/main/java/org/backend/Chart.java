package org.backend;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.util.List;

    public class Chart {
        public static JPanel createChartPanel(String currencyCode) {
            XYSeries series = new XYSeries("Kursy waluty");

            try {
                List<CurrencyData> rates = Database.getRates(currencyCode);
                for (CurrencyData rate : rates) {
                    series.add(rate.getTimestamp().getTime(), 1/rate.getRate());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            XYSeriesCollection dataset = new XYSeriesCollection(series);
            JFreeChart chart = ChartFactory.createXYLineChart(
                    "Historia kursu dla waluty: "+currencyCode,
                    "Data",
                    "Kurs",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true, true, false);


            XYPlot plot = (XYPlot) chart.getPlot();
            DateAxis dateAxis = new DateAxis();
            dateAxis.setLabelFont((new Font("Arial",Font.BOLD, 14)));
            dateAxis.setLabel("Data i czas");
            plot.setDomainAxis(dateAxis);

            return new ChartPanel(chart);
        }
    }
