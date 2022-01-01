package ke.co.azureeworld.skincare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ke.co.azureeworld.skincare.fragments.SkinTypesFragment;

public class SkinActivity extends AppCompatActivity {
    Button btn_skin_types, btn_skin_complexion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);
        
        btn_skin_complexion = (Button) findViewById(R.id.btn_skin_complexion);
        btn_skin_types = (Button) findViewById(R.id.btn_skin_type);
        skinTypes();
        
        btn_skin_types.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skinTypes();
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

    private void skinTypes() {
        btn_skin_types.setTextColor(getResources().getColor(R.color.skin_care_btnColor));
        btn_skin_complexion.setTextColor(getResources().getColor(R.color.skin_care_grey));
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        SkinTypesFragment skinTypesFragment = new SkinTypesFragment();
        fragmentTransaction.replace(R.id.container_skin_type, skinTypesFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}