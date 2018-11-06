package me.fahriztx.tugasppb;

        import android.content.Intent;
        import android.graphics.Typeface;
        import android.graphics.drawable.Drawable;
        import android.net.Uri;
        import android.os.Build;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.Window;
        import android.view.WindowManager;
        import android.widget.TextView;
        import android.widget.Toast;

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
        Typeface fontAwesomeFontB = Typeface.createFromAsset(getAssets(), "fa-brands-400.ttf");

        TextView github = findViewById(R.id.github);
        TextView linkedin = findViewById(R.id.linkedin);
        TextView instagram = findViewById(R.id.instagram);
        TextView facebook = findViewById(R.id.facebook);
        TextView phone = findViewById(R.id.phone);
        TextView mail = findViewById(R.id.mail);
        TextView whatsapp = findViewById(R.id.whatsapp);

        github.setTypeface(fontAwesomeFont);
        linkedin.setTypeface(fontAwesomeFont);
        instagram.setTypeface(fontAwesomeFont);
        facebook.setTypeface(fontAwesomeFont);
        phone.setTypeface(fontAwesomeFont);
        mail.setTypeface(fontAwesomeFont);
        whatsapp.setTypeface(fontAwesomeFontB);

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/FAHRIZTX")));
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/muhammad-ikraam-fahriono-a6aa28146")));
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/fahriztx_")));
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    v.getContext().getPackageManager().getPackageInfo("com.facebook.katana", 0);
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100003615342366")));
                } catch (Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Gatergel")));
                }
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+6285895784355"));
                startActivity(intent);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:fahriztx77@gmail.com"));
                startActivity(Intent.createChooser(emailIntent, "Send with ..."));
            }
        });

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=6285895784355&text=Hai!")));
            }
        });
    }
}
