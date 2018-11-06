package me.fahriztx.tugasppb;

        import android.graphics.Typeface;
        import android.graphics.drawable.Drawable;
        import android.os.Build;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Window;
        import android.view.WindowManager;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            Drawable background = getResources().getDrawable(R.drawable.bg_profile);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(android.R.color.transparent));
            window.setNavigationBarColor(getResources().getColor(android.R.color.transparent));
            window.setBackgroundDrawable(background);
        }

        Typeface fontAwesomeFont = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");

        TextView github = (TextView) findViewById(R.id.github);
        TextView linkedin = (TextView) findViewById(R.id.linkedin);
        TextView instagram = (TextView) findViewById(R.id.instagram);
        TextView facebook = (TextView) findViewById(R.id.facebook);

        github.setTypeface(fontAwesomeFont);
        linkedin.setTypeface(fontAwesomeFont);
        instagram.setTypeface(fontAwesomeFont);
        facebook.setTypeface(fontAwesomeFont);
    }
}
