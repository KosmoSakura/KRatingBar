package cos.mos.bar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private KRatingBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bar = findViewById(R.id.rating_bar);
        findViewById(R.id.btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        bar.setStarEmpty(R.drawable.ic_stars_off)
            .setStarFill(R.drawable.ic_stars)
            .setStarMax(5)
            .setRating(3)
            .setRatingChangeListener(new KRatingBar.RatingChangeListener() {
                @Override
                public void onRatingChange(int rating) {
                    Toast.makeText(MainActivity.this, "感谢您的" + rating + "个星星", Toast.LENGTH_SHORT).show();
                }
            }).runAnim();
    }
}
