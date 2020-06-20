package Model;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gohool.projecteuler.R;

import java.util.List;

public class myAdaper extends RecyclerView.Adapter<myAdaper.ViewHolder> {

    Context context;
    List<Listitem> listitems;

    public myAdaper(Context context, List<Listitem> listitems) {
        this.context = context;
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

         holder.profile.setImageResource(listitem.getUser_image());
         holder.post.setImageResource(listitem.getPost_image());
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
        public ImageView profile, post, likeImage, commentImage;
        public TextView name, date, description, like, comment;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            profile = itemView.findViewById(R.id.main_user_image);
            post = itemView.findViewById(R.id.user_post_image);
            name = itemView.findViewById(R.id.user_name);
            date = itemView.findViewById(R.id.user_time_post);
            description = itemView.findViewById(R.id.user_text);
            like = itemView.findViewById(R.id.LikeInfo);
            comment = itemView.findViewById(R.id.ShareInfo);
            likeImage = itemView.findViewById(R.id.likeImage);
            commentImage = itemView.findViewById(R.id.commentImage);

            likeImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Listitem listitem = listitems.get(getLayoutPosition());
                    listitem.likes++;
                    like.setText(String.valueOf(listitem.getLikes()) + " likes");
                }
            });

            commentImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Listitem listitem = listitems.get(getLayoutPosition());
                    listitem.comments++;
                    comment.setText(String.valueOf(listitem.getComments()) + " comments");
                }
            });

        }

    }
}
