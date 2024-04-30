package sg.edu.np.mad.madpractical2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            //initialise user
            User user = new User("John Doe", "MAD Development", 1,  false);

            //get the buttons
            TextView tvName = findViewById(R.id.textView2);
            TextView tvDescription = findViewById(R.id.textView3);
            Button btnFollow = findViewById(R.id.button);

            tvName.setText(user.name);
            tvDescription.setText(user.description);
            btnFollow.setText("Follow");
            return insets;
        });
    }




}
