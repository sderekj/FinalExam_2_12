package nyc.c4q.dereksantos.finalexam_2_12;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static nyc.c4q.dereksantos.finalexam_2_12.R.id.button1;
import static nyc.c4q.dereksantos.finalexam_2_12.R.id.button2;
import static nyc.c4q.dereksantos.finalexam_2_12.R.id.button3;
import static nyc.c4q.dereksantos.finalexam_2_12.R.id.button4;

/**
 * Created by SACC on 2/12/17.
 */
public class NavDrawerAdapter extends RecyclerView.Adapter<DrawerItemViewHolder> {

    List<NavDrawerItem> list = new ArrayList<>();

    @Override
    public DrawerItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DrawerItemViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(DrawerItemViewHolder holder, int position) {
        NavDrawerItem navDrawerItem = list.get(position);
        holder.bind(navDrawerItem);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setData(List<NavDrawerItem> list) {
        this.list = list;
        notifyDataSetChanged();
    }

}
