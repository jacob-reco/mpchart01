package com.recomedical.mpchart01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LineChart mpLineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mpLineChart=(LineChart) findViewById(R.id.chart1);
        LineDataSet lineDataSet1 = new LineDataSet(dataValues1(),"Data Set 1");
        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(lineDataSet1);

        LineData data = new LineData(dataSets);
        mpLineChart.setData(data);
        mpLineChart.invalidate();
    }

    private ArrayList<Entry> dataValues1() {

        ArrayList<Entry> dataVals = new ArrayList<Entry>();
        dataVals.add(new Entry( 0, 20));
        dataVals.add(new Entry( 1, 24));
        dataVals.add(new Entry( 2, 12));
        dataVals.add(new Entry( 3, 10));
        dataVals.add(new Entry( 4, 18));
        dataVals.add(new Entry( 5, 26));
        dataVals.add(new Entry( 6, 29));
        dataVals.add(new Entry( 7, 33));
        dataVals.add(new Entry( 8, 22));
        dataVals.add(new Entry( 9, 15));
        dataVals.add(new Entry( 10, 36));

        return dataVals;
    }
}