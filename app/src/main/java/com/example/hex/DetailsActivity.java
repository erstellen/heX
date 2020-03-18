package com.example.hex;


import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DetailsActivity extends AppCompatActivity {

    TextView nameDetailTextView,propellantDetailTextView,dateDetailTextView,destinationDetailTextView;
    CheckBox techExistsDetailCheckBox;
    ImageView teacherDetailImageView;

    private void initializeWidgets(){
        nameDetailTextView= findViewById(R.id.nameDetailTextView);
        propellantDetailTextView= findViewById(R.id.propellantDetailTextView);
        dateDetailTextView= findViewById(R.id.dateDetailTextView);
        destinationDetailTextView=findViewById(R.id.destinationDetailTextView);
        techExistsDetailCheckBox= findViewById(R.id.techExistsDetailCheckBox);
        teacherDetailImageView=findViewById(R.id.teacherDetailImageView);
    }
    private String getDateToday(){
        DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
        Date date=new Date();
        String today= dateFormat.format(date);
        return today;
    }
    private String getRandomDestination(){
        String[] destinations={"VV Sephei","KY Cygni","Polaris","Betelgeuse","Aldebaran"};
        Random random=new Random();
        int index=random.nextInt(destinations.length-1);
        return destinations[index];
    }

    private void receiveAndShowData(){
        //RECEIVE DATA FROM ITEMS ACTIVITY VIA INTENT
        Intent i=this.getIntent();
        String name=i.getExtras().getString("NAME_KEY");
        String propellant=i.getExtras().getString("PROPELLANT_KEY");
        String destination=i.getExtras().getString("DESTINATION_KEY");
        String technologyExists=i.getExtras().getString("TECHNOLOGY_EXISTS_KEY");
        String imageURL=i.getExtras().getString("IMAGE_KEY");

        //SET RECEIVED DATA TO TEXTVIEWS AND IMAGEVIEWS
        nameDetailTextView.setText(name);
        propellantDetailTextView.setText(propellant);
        dateDetailTextView.setText(getDateToday());
        destinationDetailTextView.setText(destination);
        techExistsDetailCheckBox.setChecked(technologyExists.equalsIgnoreCase("YES"));
        techExistsDetailCheckBox.setEnabled(false);
        Picasso.get().load(imageURL).placeholder(R.drawable.placeholder).into(teacherDetailImageView);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initializeWidgets();
        receiveAndShowData();
    }
}