package ashu.insider;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by apple on 28/03/18.
 */

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder>{

    InsiderDTO lists;
    Context context;

    public EventAdapter(Context context, InsiderDTO lists){
        this.context = context;
        this.lists = lists;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        ViewHolder viewHolder;
        context = parent.getContext();
        view = LayoutInflater.from(context).inflate(R.layout.event_itel, parent, false);
        viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtEvent.setText(lists.getList().get(position).getName());

    }

    @Override
    public int getItemCount() {
        return lists.getList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtEvent;
        ImageView imgEvent;

        public ViewHolder(View itemView) {
            super(itemView);
            txtEvent = (TextView) itemView.findViewById(R.id.txtEvent);
            imgEvent = (ImageView) itemView.findViewById(R.id.imgEvent);
        }
    }
}
