package android.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     ratingBar = findViewById(R.id.ratingbar);
     button = findViewById(R.id.ratingbutton);

     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             int x = ratingBar.getNumStars();

             float y = ratingBar.getRating();
              if(y<=0)
              {
                  Toast.makeText(MainActivity.this, "Rate first", Toast.LENGTH_SHORT).show();
              }
             Toast.makeText(getApplicationContext(), x +" " + y , Toast.LENGTH_SHORT).show();
         }
     });



    }
}