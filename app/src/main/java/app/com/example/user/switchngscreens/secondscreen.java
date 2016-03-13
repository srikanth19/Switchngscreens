package app.com.example.user.switchngscreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 13-Mar-16.
 */
public class secondscreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Intent activitythatcalled=getIntent();
        String previousactivity=activitythatcalled.getExtras().getString("calling activity");
        TextView callingmsg=(TextView) findViewById(R.id.calling_activity_info);
        callingmsg.append(" "+previousactivity);


    }

    public void sendname(View view) {
        EditText usernameet=(EditText) findViewById(R.id.edt_txt);
        String username=String.valueOf(usernameet.getText());
        Intent goingback=new Intent();
        goingback.putExtra("username",username);
        setResult(RESULT_OK,goingback);
        finish();
    }
}
