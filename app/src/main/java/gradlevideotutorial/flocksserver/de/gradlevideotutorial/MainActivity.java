package gradlevideotutorial.flocksserver.de.gradlevideotutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(BuildConfig.SHOW_MY_RELEASE_TOAST){
            Toast.makeText(this,"yes release version!",Toast.LENGTH_LONG).show();
        }
    }
}
