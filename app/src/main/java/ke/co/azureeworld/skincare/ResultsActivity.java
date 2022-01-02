package ke.co.azureeworld.skincare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    TextView present_results, back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        present_results = (TextView) findViewById(R.id.present_result);
        back = (TextView) findViewById(R.id.back);


        Intent intent = getIntent();
        String output = intent.getStringExtra("beautyProduct");
        present_results.setText(output);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity.this, ProductsActivity.class));
            }
        });

    }
}