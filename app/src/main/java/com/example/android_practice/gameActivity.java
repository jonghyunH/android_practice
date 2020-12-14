package com.example.android_practice;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Header;

public class gameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String userKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzb2NpYWxJZCI6MTQ3OTUwMzM4MCwiZW1haWwiOiJ5bWluazcxNkBnbWFpbC5jb20iLCJpYXQiOjE2MDQxMzg5NTAsImV4cCI6MTYwNDc0Mzc1MH0.ZVLwEjgLG7yGNs33jFy8BSyvEbSi9kzfO5n2l6Dq5PU'";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        // 리사이클러뷰에 LinearLayoutManager 객체 지정.
        RecyclerView recyclerView = findViewById(R.id.recycler1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 리사이클러뷰에  객체 지정.
        final RecyclerViewAdapter adapter = new RecyclerViewAdapter();
        recyclerView.setAdapter(adapter);

        retrofitInterface inter = RetrofitClient.getInstance().create(retrofitInterface.class);
        Call<User> call = inter.user(userKey);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.isSuccessful()){
                    User item = (User)response.body();
                    adapter.add(item);
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
    }
}
