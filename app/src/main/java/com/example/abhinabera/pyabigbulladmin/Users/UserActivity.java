package com.example.abhinabera.pyabigbulladmin.Users;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.example.abhinabera.pyabigbulladmin.R;

import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity {

    private List<Users> usersList = new ArrayList<>();
    private RecyclerView userRecycler;
    private UsersAdapter usersAdapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user);
        getSupportActionBar().hide();

        userRecycler = (RecyclerView) findViewById(R.id.usersRecycler);

        usersAdapter = new UsersAdapter(usersList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        userRecycler.setLayoutManager(mLayoutManager);
        userRecycler.setItemAnimator(new DefaultItemAnimator());
        userRecycler.setAdapter(usersAdapter);

        prepareUsersData();
    }

    private void prepareUsersData() {
        Users users = new Users("Abhinandan Nabera", "8939033399");
        usersList.add(users);

        users = new Users("Rakesh Nabera", "9884062014");
        usersList.add(users);

        users = new Users("Avinash Kumar Ranjan", "8939033399");
        usersList.add(users);

        usersAdapter.notifyDataSetChanged();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.enter1, R.anim.exit1);
    }
}
