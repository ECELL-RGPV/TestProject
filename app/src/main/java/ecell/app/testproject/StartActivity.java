package ecell.app.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
    Button button1, button2;
    Button button3;
    private Handler splashHandle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splashbutton1);
        button1.startAnimation(animation);
        button2.startAnimation(animation);

        splashHandle = new Handler();
        splashHandle.postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    startActivity(new Intent(StartActivity.this, MainActivity.class));
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        },5000);

        splashHandle.removeCallbacks(null);
    }


}