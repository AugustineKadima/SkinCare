package ke.co.azureeworld.skincare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProductsActivity extends AppCompatActivity {
    Button btn_skin_type, btn_skin_complexion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        btn_skin_complexion = (Button) findViewById(R.id.btn_skin_complexion);
        btn_skin_type = (Button) findViewById(R.id.btn_skin_type);

        btn_skin_complexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProductsActivity.this, LearnActivity2.class));
            }
        });

        btn_skin_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProductsActivity.this, SkinActivity.class));
            }
        });
    }
}