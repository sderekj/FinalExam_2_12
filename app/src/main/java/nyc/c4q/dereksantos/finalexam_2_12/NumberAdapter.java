package nyc.c4q.dereksantos.finalexam_2_12;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SACC on 2/12/17.
 */
public class NumberAdapter extends RecyclerView.Adapter<NumberViewHolder> {

    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NumberViewHolder(new TextView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(NumberViewHolder holder, int position) {
        holder.setData(position);
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
