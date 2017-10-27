package comandroiddeveloper.imranshaikh24.www.serviceex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bstart,bstop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bstart = (Button)findViewById(R.id.btnStart);
        bstop = (Button)findViewById(R.id.btnStop);
        bstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,TestService.class);
                i.putExtra("imran","hi imran i am service");
                MainActivity.this.startService(i);
            }
        });
        bstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TestService.class);
                MainActivity.this.stopService(i);
            }
        });
    }
}
