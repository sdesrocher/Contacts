/*
* Created by Sara Desrocher
* Created on 2/25/17
* Gives users the ability of choosing to call or text a selected message to one of their three favorite contacts. 
 */

package css.cis3334.contacts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btnCall1, btnText1, btnCall2, btnText2, btnCall3, btnText3;
    TextView textName1, textNumber1, textResult, textName2, textNumber2, textName3, textNumber3;
    Spinner spin1,spin2, spin3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupButtonClickEvents();

        textResult = (TextView) findViewById(R.id.textViewResult);
        textName1 = (TextView) findViewById(R.id.textViewName);
        textNumber1 = (TextView) findViewById(R.id.textViewNumber);
        textName2 = (TextView) findViewById(R.id.textViewName2);
        textNumber2 = (TextView) findViewById(R.id.textViewNumber2);
        textName3 = (TextView) findViewById(R.id.textViewName3);
        textNumber3 = (TextView) findViewById(R.id.textViewNumber3);
        spin1 = (Spinner) findViewById(R.id.spinner1);
        spin2 = (Spinner) findViewById(R.id.spinner2);
        spin3 = (Spinner) findViewById(R.id.spinner3);
    }

    private void setupButtonClickEvents(){

        /**
         * Set up when the Call button is clicked.
         */

        btnCall1 = (Button) findViewById(R.id.buttonCall1);
        btnCall1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //show something when btn clicks
                textResult.setText("Calling " + textName1.getText());

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + textNumber1.getText()));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        /**
         * When Text button clicked
         */
        btnText1 = (Button) findViewById(R.id.buttonText1);
        btnText1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //show something when btn clicks
                textResult.setText("Texting "+ textName1.getText());
                //intent to call number
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:6511234567"));
                sendIntent.putExtra("sms_body", spin1.getSelectedItem().toString());
                startActivity(sendIntent);
            }
        });

        /** START NUMBER 2
         *
         */
        /**
         * Set up when the Call button is clicked.
         */

        btnCall2 = (Button) findViewById(R.id.buttonCall2);
        btnCall2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //show something when btn clicks
                textResult.setText("Calling " + textName2.getText());

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + textNumber2.getText()));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        /**
         * When Text button clicked
         */
        btnText2 = (Button) findViewById(R.id.buttonText2);
        btnText2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //show something when btn clicks
                textResult.setText("Texting "+textName2.getText() );
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:6129876543"));
                sendIntent.putExtra("sms_body",  spin2.getSelectedItem().toString());
                startActivity(sendIntent);
            }
        });

        /* NUMBER 3
        *
         */

        /**
         * Set up when the Call button is clicked.
         */

        btnCall3 = (Button) findViewById(R.id.buttonCall3);
        btnCall3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //show something when btn clicks
                textResult.setText("Calling " + textName3.getText());
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + textNumber3.getText()));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        /**
         * When Text button clicked
         */
        btnText3 = (Button) findViewById(R.id.buttonText3);
        btnText3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //show something when btn clicks
                textResult.setText("Texting "+textName3.getText());
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:7155671234"));
                sendIntent.putExtra("sms_body",  spin3.getSelectedItem().toString());
                startActivity(sendIntent);
            }
        });
    }
}
