package growithbig.technest.scheduledtask.Activites;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import growithbig.technest.scheduledtask.HomeScreen.HomeFragment;
import growithbig.technest.scheduledtask.HomeScreen.TransactionFragment;
import growithbig.technest.scheduledtask.R;

public class DashboardActivity extends AppCompatActivity {
    private TextView mTextMessage;
    private Fragment fragment = null;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme_NoActionBar);
        setContentView(R.layout.activity_dashboard);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadFragment(new HomeFragment());
    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment = new HomeFragment();
  //                  mTextMessage.setText(R.string.title_home);
                    break;
                case R.id.navigation_dashboard:
                    fragment = new TransactionFragment();
//                    mTextMessage.setText(R.string.title_dashboard);
                    break;
                case R.id.navigation_notifications:
             //       mTextMessage.setText(R.string.title_notifications);
                    break;
            }
            return loadFragment(fragment);
        }
    };



    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

}
