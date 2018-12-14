package atmempresaconsultoria.com.example.roberto.exercise1;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity {
    private Button button1, button2;
    private TextView textview;
    private String color[] = {"#FFFF0000", "#8B9997", "#8B1177", "#3B9497", "#6B2297", "#8B0097",
            "#1B1877"};
    private static int cbuton1 = 0, cbuton2 = 0;

    public int numAleatorio(int num) {
        Random random = new Random();
        return random.nextInt(num);
    }

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.idButton1); // Push Me
        button2 = (Button) findViewById(R.id.idButton2); // Click Me
        textview = (TextView) findViewById(R.id.idTextView); // This is a Test

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++cbuton1;
                Toast.makeText(getApplicationContext(), "Botão Push Me foi clicado " + cbuton1 + " vez(es)",
                        Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textview.setTextColor(Color.parseColor("#" + numAleatorio(8) + "B" + numAleatorio(9997)));
                textview.setTextColor(Color.parseColor(color[numAleatorio(7)]));
                ++cbuton2;
                Toast.makeText(getApplicationContext(), "Botão Click Me foi clicado " + cbuton2 + " vez(es)",
                        Toast.LENGTH_LONG).show();
            }
        });

        /*
        public void pushMe(View v){
            ++cbuton1;
            Toast.makeText(getApplicationContext(), "Botão Push Me foi clicado " + cbuton1 + " vez(es)",
            Toast.LENGTH_LONG).show();
        }

        public void clickMe(View v){
            textview = (TextView)findViewById(R.id.idTextView); // This is a Test
            //textview.setTextColor(Color.parseColor("#" + numAleatorio(8) + "B" + numAleatorio(9997)));
            textview.setTextColor(Color.parseColor(color[numAleatorio(7)]));
            ++cbuton2;
            Toast.makeText(getApplicationContext(), "Botão Click Me foi clicado " + cbuton2 + " vez(es)",
            Toast.LENGTH_LONG).show();
        }
        */
    }
}
