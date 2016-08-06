package learnjavatut.learnjava;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ImageView imageView ;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }

        imageView = (ImageView) findViewById(R.id.mainimage);
        textView = (TextView) findViewById(R.id.mainTextView);
        textView.setShadowLayer(
                6f /* radius*/,
                0f /* x-offset */,
                2f /* y-offset */,
                Color.BLACK);

        ObjectAnimator anim = (ObjectAnimator) AnimatorInflater.loadAnimator(getApplicationContext(), R.animator.mainanimator);
        anim.setTarget(imageView);
        anim.setDuration(1000);
        anim.start();

        Animation an2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein);
        textView.startAnimation(an2);

        an2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                finish();
                Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
                startActivity(intent);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

        });

    }
}
