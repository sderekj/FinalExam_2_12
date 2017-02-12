package nyc.c4q.dereksantos.finalexam_2_12;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

/**
 * Created by SACC on 2/12/17.
 */
public class NavDrawerAdapter extends RecyclerView.Adapter<DrawerItemViewHolder> {

    List<NavDrawerItem> list = Arrays.asList(
            new NavDrawerItem(R.drawable.ic_devices_other_black_24dp, "Button 1"),
            new NavDrawerItem(R.drawable.ic_email_black_24dp, "Button 2"),
            new NavDrawerItem(R.drawable.ic_settings_black_24dp, "Button 3"),
            new NavDrawerItem(R.drawable.ic_close_black_24dp, "Logout")
    );

    @Override
    public DrawerItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DrawerItemViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(DrawerItemViewHolder holder, int position) {
        NavDrawerItem navDrawerItem = list.get(position);
        holder.bind(navDrawerItem);
        holder.setOnClickListener(navDrawerItem);
    }

    private void buildNavItemClickListener(NavDrawerItem navDrawerItem) {
        if (navDrawerItem != null) {

        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
