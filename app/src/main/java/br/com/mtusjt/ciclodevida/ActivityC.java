package br.com.mtusjt.ciclodevida;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import br.com.mtusjt.ciclodevida.ActivityA;
import br.com.mtusjt.ciclodevida.ActivityB;
import br.com.mtusjt.ciclodevida.DialogActivity;
import br.com.mtusjt.ciclodevida.R;
import br.com.mtusjt.ciclodevida.StatusTracker;
import br.com.mtusjt.ciclodevida.Utils;

/*
@author Marcelo Victor da silva
@ra 816119006
*/
public class ActivityC extends Activity {

    private String mActivityName;
    private TextView mStatusView;
    private TextView mStatusAllView;
    private StatusTracker mStatusTracker = StatusTracker.getInstance();

    /*
  @author Marcelo Victor da silva
@ra 816119006
    */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        mActivityName = getString(R.string.activity_c_label);
        mStatusView = (TextView) findViewById(R.id.status_view_c);
        mStatusAllView = (TextView) findViewById(R.id.status_view_all_c);
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_create));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    /*
  @author Marcelo Victor da silva
@ra 816119006
    */
    @Override
    protected void onStart() {
        super.onStart();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_start));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    /*
@author Marcelo Victor da silva
@ra 816119006
    */
    @Override
    protected void onRestart() {
        super.onRestart();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_restart));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    /*
@author Marcelo Victor da silva
@ra 816119006
    */
    @Override
    protected void onResume() {
        super.onResume();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_resume));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    /*
    @author Marcelo Victor da silva
@ra 816119006
    */
    @Override
    protected void onPause() {
        super.onPause();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_pause));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    /*
 @author Marcelo Victor da silva
@ra 816119006
    */
    @Override
    protected void onStop() {
        super.onStop();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_stop));
    }

    /*
   @author Marcelo Victor da silva
@ra 816119006
    */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_destroy));
        mStatusTracker.clear();
    }

    /*
  @author Marcelo Victor da silva
@ra 816119006
    */
    public void startDialog(View v) {
        Intent intent = new Intent(ActivityC.this, DialogActivity.class);
        startActivity(intent);
    }

    /*
  @author Marcelo Victor da silva
@ra 816119006
    */
    public void startActivityA(View v) {
        Intent intent = new Intent(ActivityC.this, ActivityA.class);
        startActivity(intent);
    }

    /*
 @author Marcelo Victor da silva
@ra 816119006
    */
    public void startActivityB(View v) {
        Intent intent = new Intent(ActivityC.this, ActivityB.class);
        startActivity(intent);
    }

    /*
    @author Marcelo Victor da silva
@ra 816119006
    */
    public void finishActivityC(View v) {
        ActivityC.this.finish();
    }

}
