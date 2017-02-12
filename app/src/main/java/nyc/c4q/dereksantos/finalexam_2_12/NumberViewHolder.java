package nyc.c4q.dereksantos.finalexam_2_12;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/**
 * Created by SACC on 2/12/17.
 */
public class NumberViewHolder extends RecyclerView.ViewHolder {
    public NumberViewHolder(TextView itemView) {
        super(itemView);
    }

    public void setData(Integer position) {
        ((TextView) itemView).setText("Setting - " + String.valueOf(position));
    }
}
