package org.backend;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Chart {

    public static JPanel createChartPanel(String currencyCode) {
        XYSeries series = new XYSeries("Kursy waluty");
        boolean empty = true;

        double minValue = Double.MAX_VALUE;

        try {
            List<CurrencyData> rates = Database.getRates(currencyCode);
            for (CurrencyData rate : rates) {
                double value = 1 / rate.getRate();
                series.add(rate.getTimestamp().getTime(), value);
                if (value < minValue) {
                    minValue = value;
                }
                empty = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Historia kursu dla waluty: " + currencyCode,
                "Data",
                "Kurs",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        XYPlot plot = chart.getXYPlot();


        DateAxis dateAxis = new DateAxis();
        dateAxis.setLabelFont(new Font("Arial", Font.BOLD, 14));
        dateAxis.setLabel("Data i czas");
        plot.setDomainAxis(dateAxis);


        NumberAxis yAxis = (NumberAxis) plot.getRangeAxis();
        yAxis.setAutoRange(true);
        if (!empty) {

            yAxis.setLowerBound(minValue * 0.95);
        }

        yAxis.setLabelFont(new Font("Arial", Font.BOLD, 14));

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(0, true);
        renderer.setSeriesShapesVisible(0, false);
        plot.setRenderer(renderer);

        return new ChartPanel(chart);
    }
}