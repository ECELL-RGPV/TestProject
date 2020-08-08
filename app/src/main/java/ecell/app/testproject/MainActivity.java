package ecell.app.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splashbutton1);
        button1.startAnimation(animation);
        button2.startAnimation(animation);
    }
}