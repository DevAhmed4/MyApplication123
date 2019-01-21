package com.example.lenovo.myapplication.RecyclerViewAdapter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.lenovo.myapplication.Models.Comment;
import com.example.lenovo.myapplication.Models.Player;
import com.example.lenovo.myapplication.Models.post;
import com.example.lenovo.myapplication.R;

import java.net.URI;
import java.util.List;

public class postsRecyclerViewAdapter extends RecyclerView.Adapter<postsRecyclerViewAdapter.ViewHolder> {

    private List<post> mPosts;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    // data is passed into the constructor
    postsRecyclerViewAdapter(Context context, List<post> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mPosts = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.posts_news_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        int postID = mPosts.get(i).getPostID();
        int team1_result = mPosts.get(i).getmTeam1_result();
        int team2_result = mPosts.get(i).getmTeam2_result();
        int number0fLikes = mPosts.get(i).getmNumberOfLikes();
        String title = mPosts.get(i).getmTitle();
        String team1_logo = mPosts.get(i).getmTeam1_Logo();
        String team2_logo = mPosts.get(i).getmTeam2_Logo();
        List<Player> playersHowLikesPost = mPosts.get(i).getmPlayerHowLikes();
        List<Comment> comments = mPosts.get(i).getmComments();

        viewHolder.team1_result.setText(team1_result);
        viewHolder.team2_result.setText(team2_result);
        viewHolder.post_title.setText(title);
        viewHolder.team1_logo.setImageURI(Uri.parse(team1_logo));
        viewHolder.team2_logo.setImageURI(Uri.parse(team2_logo));
        

    }

    @Override
    public int getItemCount() {
        return mPosts.size();
    }

    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView post_title;
        TextView team1_result;
        TextView team2_result;
        ImageView team1_logo;
        ImageView team2_logo;
        Button share_post;
        Button comment_post;
        Button like_post;


        ViewHolder(View itemView) {
            super(itemView);
            post_title = itemView.findViewById(R.id.textView_post_title);
            team1_result = itemView.findViewById(R.id.textView_team1_result);
            team2_result = itemView.findViewById(R.id.textView_team2_result);
            team1_logo = itemView.findViewById(R.id.imageView_team1);
            team2_logo = itemView.findViewById(R.id.imageView_team2);
            share_post = itemView.findViewById(R.id.button_share);
            comment_post = itemView.findViewById(R.id.button_comment);
            like_post = itemView.findViewById(R.id.button_like);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    post getItem(int id) {
        return mPosts.get(id);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

}
