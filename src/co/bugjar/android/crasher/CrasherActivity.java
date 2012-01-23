package co.bugjar.android.crasher;

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
        
        BugjarMonitor.initialize(this, "4ef56fcc8fc4230804000001");
        
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
                crashMe();
            }
        });
        
    }
    
    private void crashMe()
    {
        String foo = null;
        foo.length();
    }
}