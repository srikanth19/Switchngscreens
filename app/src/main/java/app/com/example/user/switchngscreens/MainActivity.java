package app.com.example.user.switchngscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getnameonclick(View view) {
        Intent opensecondscreenIntent=new Intent(this,secondscreen.class);
        int result=1;
        opensecondscreenIntent.putExtra("calling activity","MainActivity");
        startActivityForResult(opensecondscreenIntent,result);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView usernamesent=(TextView) findViewById(R.id.snt_txt);
        String namesentbacK=data.getStringExtra("username");
        usernamesent.append(" "+namesentbacK);
    }
}
