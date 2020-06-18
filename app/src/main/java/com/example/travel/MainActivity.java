package com.example.travel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.commonmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.wishlist:
                startActivity(new Intent(this, WishlistActivity.class));
                return true;
            case R.id.contactus:
                context = getBaseContext();
                AlertDialog.Builder builder_ = new AlertDialog.Builder(this);
                builder_.setTitle("Contact Us");
                builder_.setMessage("demo");
                builder_.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
