package nyc.c4q.dereksantos.finalexam_2_12;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

    public void bind(final NavDrawerItem navDrawerItem) {
        navItemImageView.setImageResource(navDrawerItem.getDrawable());
        navItemTextView.setText(navDrawerItem.getButtonText());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (navDrawerItem.getResourceId()) {
                    case R.id.heart_button:
                        Toast.makeText(itemView.getContext(), "Selected Heart Activity", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.message_button:
                        Toast.makeText(itemView.getContext(), "Selected Message Activity", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.settings_button:
                        Intent intent = new Intent(itemView.getContext(), SettingsActivity.class);
                        itemView.getContext().startActivity(intent);
                        break;
                    case R.id.logout_button:
                        Toast.makeText(itemView.getContext(), "Selected Logout Activity", Toast.LENGTH_SHORT).show();
                        ((Activity) itemView.getContext()).finishAffinity();
                        break;
                }
            }
        });
    }
}
