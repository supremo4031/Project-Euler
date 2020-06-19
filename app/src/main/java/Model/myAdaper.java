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

    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView profile, post;
        public TextView name, date, description, like, comment;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
