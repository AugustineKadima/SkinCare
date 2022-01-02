package ke.co.azureeworld.skincare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ProductsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button btn_skin_type, btn_skin_complexion, btn_find_beauty_products;
    Spinner complexion_input, skin_type_input;
    String skin_Type, skin_Complexion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        btn_skin_complexion = (Button) findViewById(R.id.btn_skin_complexion);
        btn_skin_type = (Button) findViewById(R.id.btn_skin_type);
        complexion_input = (Spinner) findViewById(R.id.complexion_input);
        skin_type_input = (Spinner) findViewById(R.id.skin_type_input);
        btn_find_beauty_products = (Button) findViewById(R.id.btn_find_beauty_products);


        String[] complexion = {"Select your skin complexion", "light", "dark"};
        String[] skinType = {"Select your skin type","dry", "oily", "normal"};
        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, complexion);
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, skinType);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        complexion_input.setAdapter(adapter1);
        skin_type_input.setAdapter(adapter2);
        complexion_input.setOnItemSelectedListener(this);
        skin_type_input.setOnItemSelectedListener(this);

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

        btn_find_beauty_products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = Product.getBeautyProducts(skin_Complexion, skin_Type);
                System.out.println(result);

                Intent intent = new Intent(ProductsActivity.this, ResultsActivity.class);
                intent.putExtra("beautyProduct", result);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(adapterView.getId() == R.id.complexion_input) {
            String valueFromSpinner = adapterView.getItemAtPosition(i).toString();
            skin_Complexion = valueFromSpinner;
        }
        if(adapterView.getId() == R.id.skin_type_input) {
            String valueFromSpinner = adapterView.getItemAtPosition(i).toString();
            skin_Type = valueFromSpinner;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}