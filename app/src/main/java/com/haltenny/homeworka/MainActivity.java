 package com.haltenny.homeworka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.haltenny.homeworka.model.BusExcursion;
import com.haltenny.homeworka.model.BusExcursionChild;
import com.haltenny.homeworka.model.BusExcursionOld;

 public class MainActivity extends AppCompatActivity {

    BusExcursion busExcursion = new BusExcursion(70, 9);
    BusExcursionChild busExcursionChild = new BusExcursionChild(70, 11, 50);
    BusExcursionOld busExcursionOld = new BusExcursionOld(70, 5, 30);

    private TextView busTicketOut;
    private TextView busTicketTotalOut;
    private TextView busTicketChildOut;
    private TextView busTicketOldOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        busTicketOut = findViewById(R.id.busTicketOut);
        busTicketChildOut = findViewById(R.id.busTicketChildOut);
        busTicketTotalOut = findViewById(R.id.busTicketTotalOut);
        busTicketOldOut = findViewById(R.id.busTicketOldOut);

        busTicketOut.setText("Взрослый: " +  Float.toString(busExcursion.ticketPriceAll()) + " монет");
        busTicketOldOut.setText("Пенсионерский: " + Float.toString(busExcursionOld.ticketPriceAll()) + " монет");
        busTicketChildOut.setText("Детский: " + Float.toString(busExcursionChild.ticketPriceAll()) + " монет");
        busTicketTotalOut.setText("Всего: " +Float.toString(busExcursion.ticketPriceAll() + busExcursionChild.ticketPriceAll() + busExcursionOld.ticketPriceAll()) + " монет");



    }

 }
