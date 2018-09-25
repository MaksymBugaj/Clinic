package com.example.maksy.timproject.Controllers.Calendar;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import com.example.maksy.timproject.Controllers.Appointments.CreateAppointment;
import com.example.maksy.timproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalendarActivity extends AppCompatActivity {

    @BindView(R.id.calendar_view)
    CalendarView calendarView;
    @BindView(R.id.calendar_welcome_text)
    TextView calendarText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        ButterKnife.bind(this);


        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                Intent intent = new Intent(getApplicationContext(), CreateAppointment.class);
                intent.putExtra("year",String.valueOf(i));
                intent.putExtra("month",String.valueOf(i1 + 1));
                intent.putExtra("day",String.valueOf(i2));
                startActivity(intent);

            }
        });


    }

}
