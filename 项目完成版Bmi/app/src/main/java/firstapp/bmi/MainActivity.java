package firstapp.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
    private Button btn=null;
    private  Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.btn2);
        btn=(Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,OtherActivity.class);
                startActivity(intent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float height=Float.parseFloat(((EditText)
                        findViewById(R.id.height)).getText().toString());
                float weight=Float.parseFloat(((EditText)
                        findViewById(R.id.weight)).getText().toString());
                float bmi=weight/((height/100)*(height/100));
                String s="BMI:"+bmi;
                if(bmi>=18.5&&bmi<=23.9)
                    s=s+"you are well";
                else
                    s=s+"maybe you are not very well ," +
                            "if you is greater than 23.9," + "you should be more play ," +
                            "if you is less than 18.5" + ",you should eat more";
                Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
