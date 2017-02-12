package nyc.c4q.dereksantos.finalexam_2_12;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SACC on 2/12/17.
 */
public class DrawerItemViewHolder extends RecyclerView.ViewHolder {

    private final ImageView navItemImageView;
    private final TextView navItemTextView;

    public DrawerItemViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        navItemImageView = (ImageView) itemView.findViewById(R.id.nav_drawer_icon);
        navItemTextView = (TextView) itemView.findViewById(R.id.nav_drawer_text);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.nav_drawer_item_viewholder, parent, false);
    }

    public void bind(NavDrawerItem navDrawerItem) {
        navItemImageView.setImageResource(navDrawerItem.getDrawable());
        navItemTextView.setText(navDrawerItem.getButtonText());
    }

    public void setOnClickListener(NavDrawerItem navDrawerItem) {
        switch (navDrawerItem.getButtonText()) {
            case "Button 1":

                break;
            case "Button 2":
                break;
            case "Button 3":
                break;
            case "Button 4":
                break;
        }
    }
}
