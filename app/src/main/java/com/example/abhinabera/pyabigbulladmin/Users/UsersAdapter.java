package com.example.abhinabera.pyabigbulladmin.Users;

import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.example.abhinabera.pyabigbulladmin.R;

import org.w3c.dom.Text;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.MyViewHolder> {

    private List<Users> usersList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, mobileNumber;
        public Switch enabDisabled;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.userName);
            mobileNumber = (TextView) view.findViewById(R.id.phoneNumber);
            enabDisabled = (Switch) view.findViewById(R.id.enabSwitch);
            name.setSelected(true);
        }
    }


    public UsersAdapter(List<Users> usersList) {
        this.usersList = usersList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.users_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Users users = usersList.get(position);
        holder.name.setText(users.getName());
        holder.mobileNumber.setText(users.getMobileNumber());
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }
}
