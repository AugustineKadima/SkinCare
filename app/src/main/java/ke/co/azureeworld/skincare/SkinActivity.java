package ke.co.azureeworld.skincare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class SkinActivity extends AppCompatActivity {
    Button btn_products, btn_skin_complexion;
    TextView oily, dry, normal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);
        
        btn_skin_complexion = (Button) findViewById(R.id.btn_skin_complexion);
        oily = (TextView) findViewById(R.id.oily_skin);
        dry = (TextView) findViewById(R.id.dry_skin);
        normal = (TextView) findViewById(R.id.normal_skin);
        btn_products = (Button) findViewById(R.id.btn_go_to_beauty_products);

        btn_products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SkinActivity.this, ProductsActivity.class));
            }
        });

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SkinActivity.this, NormalSkinActivity2.class));
            }
        });

        oily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SkinActivity.this, OilySkinActivity2.class));
            }
        });

        dry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SkinActivity.this, DrySkinActivity2.class));
            }
        });

        
        btn_skin_complexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skinComplexion();
            }
        });
    }

    private void skinComplexion() {
        startActivity(new Intent(SkinActivity.this, LearnActivity2.class));
    }

//    private void skinTypes() {
//
//
//    }
}