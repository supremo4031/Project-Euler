package Model;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.gohool.projecteuler.R;

import java.util.ArrayList;
import java.util.List;

public class homeAdapter extends RecyclerView.Adapter<homeAdapter.ViewHolder> {

    ArrayList<Listitem> listitems;

    public homeAdapter(ArrayList<Listitem> listitems) {
        this.listitems = listitems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_model_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
         Listitem listitem = listitems.get(position);
         String likes = listitem.getLikes() + " likes";
         String comments = listitem.getComments() + " comments";

         holder.profile.setImageResource(listitem.getUserImage());
         holder.post.setImageResource(listitem.setPostImage());
         holder.description.setText(listitem.getDescription());
         holder.name.setText(listitem.getName());
         holder.date.setText(listitem.getDate());
         holder.like.setText(likes);
         holder.comment.setText(comments);

    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView profile, post, likeImage;
        public TextView name, date, description, like, comment, commentImage, likeText;
        private LinearLayout likeContainer;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            profile = itemView.findViewById(R.id.main_user_image);
            post = itemView.findViewById(R.id.user_post_image);
            name = itemView.findViewById(R.id.user_name);
            date = itemView.findViewById(R.id.user_time_post);
            description = itemView.findViewById(R.id.user_text);
            like = itemView.findViewById(R.id.LikeInfo);
            comment = itemView.findViewById(R.id.ShareInfo);
            likeContainer = itemView.findViewById(R.id.likeContainer);
            commentImage = itemView.findViewById(R.id.commentImage);

            likeImage = itemView.findViewById(R.id.likeImage);
            likeText = itemView.findViewById(R.id.likeText);

            likeContainer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Listitem listitem = listitems.get(getLayoutPosition());
                    if(listitem.getLikeFlag() == 0) {
                        listitem.setLikes(listitem.getLikes() + 1);
                        like.setText(String.valueOf(listitem.getLikes()) + " likes");
                        likeImage.setImageResource(R.drawable.ic_thumb_up);
                        likeText.setText(R.string.Liked);
                        listitem.setLikeFlag(1);
                    } else {
                        listitem.setLikes(listitem.getLikes() - 1);
                        like.setText(String.valueOf(listitem.getLikes()) + " likes");
                        likeImage.setImageResource(R.drawable.ic_outline_thumb_up);
                        likeText.setText(R.string.Like);
                        listitem.setLikeFlag(0);
                    }
                }
            });

            commentImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Listitem listitem = listitems.get(getLayoutPosition());
                    listitem.setComments(listitem.getComments() + 1);
                    comment.setText(String.valueOf(listitem.getComments()) + " comments");
                }
            });

        }

    }
}
