package ly.generalassemb.drewmahrt.userinfotabs;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by drewmahrt on 2/18/16.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public MyPageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        TabFragment1 tab1 = new TabFragment1();
        Bundle bundle = new Bundle();
        bundle.putString("SECTION", Section.getSections()[position]);
        tab1.setArguments(bundle);
        return tab1;

    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
