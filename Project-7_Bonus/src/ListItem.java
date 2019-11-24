/**
 * @author UGURINAL
 * on 11/24/2019
 * at 12:22 AM
 * Project-7_Bonus
 */

public abstract class ListItem {
    protected ListItem nextItem = null;
    protected int taban;
    protected int katSayi;
    protected int us;

    public ListItem(int katSayi, int taban, int us) {
        this.taban = taban;
        this.katSayi = katSayi;
        this.us = us;
    }

    public int getTaban() {
        return taban;
    }

    public int getKatSayi() {
        return katSayi;
    }

    public int getUs() {
        return us;
    }

    public void setTaban(int taban) {
        this.taban = taban;
    }

    public void setKatSayi(int katSayi) {
        this.katSayi = katSayi;
    }

    public void setUs(int us) {
        this.us = us;
    }

    abstract ListItem next();

    abstract ListItem setNext(ListItem item);

}
