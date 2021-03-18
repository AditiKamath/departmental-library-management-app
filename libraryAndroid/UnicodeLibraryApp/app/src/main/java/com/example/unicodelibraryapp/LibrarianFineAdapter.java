package com.example.unicodelibraryapp;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LibrarianFineAdapter  extends RecyclerView.Adapter<LibrarianFineAdapter.CardViewHolder> {
    Context ct;
    List<String> bookname,bookid,sname,sapid, fineamount,overdue;
    int bookimg[];
    public LibrarianFineAdapter(Context ct){
        ct= ct;

    }
//    ArrayList<>
    @NonNull
    @Override
    public LibrarianFineAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ct);
        View v = inflater.inflate(R.layout.fine_bookcardview,parent ,false);
        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull LibrarianFineAdapter.CardViewHolder holder, int position) {
//        holder.name.setText(bookname[position]);
//        holder.id.setText(bookid[position]);
//        holder.sname.setText(sname[position]);
//        holder.sapid.setText(sapid[position]);
//        holder.fineamt.setText(fineamount[position]);
//        holder.overduedays.setText(overdue[position]);
//        holder.img.setImageResource(Integer.parseInt(bookname[position]));

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class CardViewHolder extends  RecyclerView.ViewHolder{
        TextView name,id,sname,sapid,fineamt,overduedays;
        Button status;
        ImageView img;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.book_cv_title);
            id = itemView.findViewById(R.id.fine_bookid);
            sname = itemView.findViewById(R.id.fine_sname);
            sapid = itemView.findViewById(R.id.fine_sapid);
            name = itemView.findViewById(R.id.book_cv_title);
            fineamt =  itemView.findViewById(R.id.fine_amount);
            overduedays= itemView.findViewById(R.id.fine_overdue);
            status =itemView.findViewById(R.id.status_button);
        }
    }
}

