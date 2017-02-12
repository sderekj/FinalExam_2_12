package nyc.c4q.dereksantos.finalexam_2_12;

/**
 * Created by SACC on 2/12/17.
 */
public class NavDrawerItem {

    int drawable;
    int resourceId;
    String buttonText;

    public NavDrawerItem(int resourceId ,int drawable, String buttonText) {
        this.resourceId = resourceId;
        this.drawable = drawable;
        this.buttonText = buttonText;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}
