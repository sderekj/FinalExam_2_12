package nyc.c4q.dereksantos.finalexam_2_12;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

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
