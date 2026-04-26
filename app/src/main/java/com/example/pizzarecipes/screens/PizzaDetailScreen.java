package com.example.pizzarecipes.screens;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.pizzarecipes.R;
import com.example.pizzarecipes.manager.PizzaManager;
import com.example.pizzarecipes.models.Pizza;

public class PizzaDetailScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        Toolbar toolbar = findViewById(R.id.toolbarDetail);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        }

        toolbar.setNavigationOnClickListener(v -> finish());

        long pizzaId = getIntent().getLongExtra("PIZZA_ID", -1);
        Pizza pizza = PizzaManager.getInstance().getById(pizzaId);

        ImageView photo = findViewById(R.id.img);
        TextView titleView = findViewById(R.id.title);
        TextView metaView = findViewById(R.id.meta);
        TextView ingredView = findViewById(R.id.ingredients);
        TextView descView = findViewById(R.id.desc);
        TextView stepsView = findViewById(R.id.steps);

        if (pizza != null) {
            photo.setImageResource(pizza.getPhoto());
            titleView.setText(pizza.getTitle());
            metaView.setText("⏱ " + pizza.getCookTime() + "   •   " + pizza.getCost() + " €");
            ingredView.setText(pizza.getIngredientList());
            descView.setText(pizza.getAbout());
            stepsView.setText(pizza.getInstructions());
        } else {
            titleView.setText("Pizza non trouvée.");
        }
    }
}