package com.tasneem.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewProducts);

        // The reference layout displays products in two columns.
        // GridLayoutManager is therefore the appropriate LayoutManager.
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setHasFixedSize(true);

        List<Product> products = Arrays.asList(
                new Product("Wireless Headphones", "$45.00", "🎧", "POPULAR"),
                new Product("Smart Watch", "$59.00", "⌚", "NEW"),
                new Product("Running Shoes", "$72.00", "👟", "POPULAR"),
                new Product("Backpack", "$35.00", "🎒", "SALE"),
                new Product("Camera", "$120.00", "📷", "NEW"),
                new Product("Sunglasses", "$25.00", "🕶️", "POPULAR")
        );

        recyclerView.setAdapter(new ProductAdapter(products));
    }
}
