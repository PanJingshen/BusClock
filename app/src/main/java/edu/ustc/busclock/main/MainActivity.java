package edu.ustc.busclock.main;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import edu.ustc.busclock.R;
import edu.ustc.busclock.main.account.AccountFragment;
import edu.ustc.busclock.main.account.AccountPresenter;
import edu.ustc.busclock.main.achieve.AchieveFragment;
import edu.ustc.busclock.main.achieve.AchievePresenter;
import edu.ustc.busclock.main.clock.ClockFragment;
import edu.ustc.busclock.main.clock.ClockPresenter;
import edu.ustc.busclock.main.history.HistoryFragment;
import edu.ustc.busclock.main.history.HistoryPresenter;
import edu.ustc.busclock.main.index.IndexFragment;
import edu.ustc.busclock.main.index.IndexPresenter;
import edu.ustc.busclock.utils.ActivityUtils;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, PopupMenu.OnMenuItemClickListener {


    private IndexFragment indexFragment;
    private AccountFragment accountFragment;
    private ClockFragment clockFragment;
    private AchieveFragment achieveFragment;
    private HistoryFragment historyFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        //config the app bar
//        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
//        getSupportActionBar().hide();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setLogo(R.mipmap.ic_bus);
        toolbar.setTitle("BusClock");
        setSupportActionBar(toolbar);


        //config the drawer
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        initFragment();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_actionbar, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_addclock:
                PopupMenu popupMenu = new PopupMenu(this, findViewById(R.id.action_addclock));
                MenuInflater popupInflater = popupMenu.getMenuInflater();
                popupInflater.inflate(R.menu.main_popupmenu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(this);
                popupMenu.show();
                break;

        }
        return true;
    }

    /**
     * config the fragment
     */
    private void initFragment() {

        if (indexFragment == null) {
            indexFragment = IndexFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    indexFragment, R.id.contentFrame);
        }
        new IndexPresenter(indexFragment);

        if (accountFragment == null) {
            accountFragment = AccountFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    accountFragment, R.id.contentFrame);
        }
        new AccountPresenter(accountFragment);

        if (clockFragment == null) {
            clockFragment = ClockFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    clockFragment, R.id.contentFrame);
        }
        new ClockPresenter(clockFragment);

        if (achieveFragment == null) {
            achieveFragment = AchieveFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    achieveFragment, R.id.contentFrame);
        }
        new AchievePresenter(achieveFragment);

        if (historyFragment == null) {
            historyFragment = HistoryFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    historyFragment, R.id.contentFrame);
        }
        new HistoryPresenter(historyFragment);

        //inited fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.contentFrame, indexFragment).commit();
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_index) {
            getSupportFragmentManager().beginTransaction().replace(R.id.contentFrame, indexFragment).commit();
        } else if (id == R.id.nav_common) {
            getSupportFragmentManager().beginTransaction().replace(R.id.contentFrame, accountFragment).commit();
        } else if (id == R.id.nav_history) {
            getSupportFragmentManager().beginTransaction().replace(R.id.contentFrame, historyFragment).commit();
        } else if (id == R.id.nav_achieve) {
            getSupportFragmentManager().beginTransaction().replace(R.id.contentFrame, achieveFragment).commit();
        } else if (id == R.id.nav_setting) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    /**
     * 响应popmenu的点击事件
     *
     * @param item
     * @return
     */
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_addclock_comon:

                break;
            case R.id.action_addclock_quick:

                break;
        }
        // false : close the menu; true : not close the menu
        return false;
    }
}
