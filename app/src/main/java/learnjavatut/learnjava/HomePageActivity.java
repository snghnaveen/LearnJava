package learnjavatut.learnjava;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomePageActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager mViewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        mViewPager = (ViewPager) findViewById(R.id.container);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new Intro(), "Intro");
        viewPagerAdapter.addFragment(new PartOne(), "PART-1");
        viewPagerAdapter.addFragment(new PartTwo(), "PART-2");
        viewPagerAdapter.addFragment(new PartThree(), "PART-3");
        viewPagerAdapter.addFragment(new PartFour(), "PART-4");
        viewPagerAdapter.addFragment(new PartFive(), "PART-5");
        viewPagerAdapter.addFragment(new JavaPrograms(), "Programs");
        viewPagerAdapter.addFragment(new MoreJava(), "Java");
        viewPagerAdapter.addFragment(new Interview(), "Interview");


        mViewPager.setAdapter(viewPagerAdapter);


        tabLayout.setupWithViewPager(mViewPager);


    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(HomePageActivity.this);
        builder.setTitle("Exit");
        builder.setMessage("Do you really want to exit? ");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });


        builder.setCancelable(true);

      //  AlertDialog alert = builder.create();

        builder.show();
    }
}
