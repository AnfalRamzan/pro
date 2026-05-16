package com.dineout.code.extras; 
 
import android.app.AlertDialog; 
import android.content.Context; 
import android.widget.Toast; 
 
public class ExtraFeatures { 
    public static void callWaiter(Context ctx) { 
        Toast.makeText(ctx, "Waiter has been called!", Toast.LENGTH_SHORT).show(); 
    } 
 
    public static void submitFeedback(Context ctx, String feedback) { 
        new AlertDialog.Builder(ctx) 
            .setTitle("Feedback") 
            .setMessage("Thanks for your feedback: " + feedback) 
            .setPositiveButton("OK", null).show(); 
    } 
 
    public static void showPromotions(Context ctx) { 
        new AlertDialog.Builder(ctx) 
            .setTitle("Today's Promotions") 
            .setMessage(" Buy 1 Get 1 Free on Pizzas\n 20%% off on Bills above Rs. 2000") 
            .setPositiveButton("OK", null).show(); 
    } 
 
    public static void orderHistory(Context ctx) { 
        new AlertDialog.Builder(ctx) 
            .setTitle("Order History") 
            .setMessage("Last order: Chicken Biryani - Rs. 350\nPrevious: Burger - Rs. 250") 
            .setPositiveButton("OK", null).show(); 
    } 
 
    public static void reserveTable(Context ctx) { 
        new AlertDialog.Builder(ctx) 
            .setTitle("Table Reservation") 
            .setMessage("Table reserved for you at 8 PM. Enjoy!") 
            .setPositiveButton("OK", null).show(); 
    } 
} 
