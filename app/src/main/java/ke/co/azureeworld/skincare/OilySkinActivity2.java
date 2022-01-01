package ke.co.azureeworld.skincare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OilySkinActivity2 extends AppCompatActivity {
    Button products, btn_skin_complexion, btn_skin_type;
    TextView back, next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oily_skin2);

        products = (Button) findViewById(R.id.btn_go_to_beauty_products);
        back = (TextView) findViewById(R.id.back);
        next = (TextView)  findViewById(R.id.next);
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OilySkinActivity2.this, ProductsActivity.class));
            }
        });

        btn_skin_complexion = (Button) findViewById(R.id.btn_skin_complexion);
        btn_skin_type = (Button) findViewById(R.id.btn_skin_type);
        btn_skin_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OilySkinActivity2.this, SkinActivity.class));
            }
        });
        btn_skin_complexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OilySkinActivity2.this, LearnActivity2.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OilySkinActivity2.this, NormalSkinActivity2.class));
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OilySkinActivity2.this, DrySkinActivity2.class));
            }
        });
    }
}