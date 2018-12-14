package atmempresaconsultoria.com.example.roberto.exercise;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    private String color[] = {"#FFFF0000","#8B9997","#8B1177","#3B9497","#6B2297","#8B0097", "#1B1877"};
    private TextView textview;
    private Random random;
    private static int cb1 = 0, cb2 = 0;
    private Button bt1, bt2;
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.idButton1);
        bt2 = findViewById(R.id.idButton2);
        //tv2 = (TextView)findViewById(R.id.idBox);
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv2 = (TextView)findViewById(R.id.idBox);
                ++cb1;
                pushMe(v);
                tv2.setText("O Botão Push Me foi clicado " + cb1 + " veze(s) \nO botão Click Me "
                + "foi clicado " + cb2 + " veze(s)");
            }
        }); // Push Me
        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ++cb2;
                clickMe(v);
                tv2.setText("O Botão Push Me foi clicado " + cb1 + " veze(s) \nO botão Click Me "
                + "foi clicado " + cb2 + " veze(s)");
            }
        }); // Click Me

    }

    public void pushMe(View v){
        random = new Random();
        int index = random.nextInt(7);
        textview = (TextView)findViewById(R.id.idTextView);
        textview.setTextColor(Color.parseColor(color[index]));
    }

    public void clickMe(View v){
        random = new Random();
        int index = random.nextInt(7);
        textview = (TextView)findViewById(R.id.idTextView);
        textview.setTextColor(Color.parseColor(color[index]));

    }
}
