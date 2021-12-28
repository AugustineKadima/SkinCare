package ke.co.azureeworld.skincare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingActivity2 extends AppCompatActivity {

    Button btn_learn, btn_products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing2);

        btn_learn = (Button) findViewById(R.id.btn_start_learn);
        btn_products = (Button) findViewById(R.id.btn_start_products);

        btn_products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LandingActivity2.this, ProductsActivity.class));
            }
        });
        btn_learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LandingActivity2.this, LearnActivity2.class));
            }
        });
    }
}