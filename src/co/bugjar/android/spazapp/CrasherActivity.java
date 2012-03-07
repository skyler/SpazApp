package co.bugjar.android.spazapp;

import co.bugjar.android.crasher.R;
import co.bugjar.android.monitor.BugjarMonitor;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CrasherActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        String deviceIdentifier = generateDeviceIdentifier();
        
        BugjarMonitor.initialize(this, "4ef56fcc8fc4230804000001", deviceIdentifier);
        
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
                String foo = null;
                foo.length();
            }
        });
        
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
                int foo = 99;
                int bar = foo / 0;
            }
        });
        
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
                Integer.parseInt("ponies");
            }
        });
        
    }
    
    private String generateDeviceIdentifier()
    {
        // magic goes here
        return "8675309";
    }
   
}