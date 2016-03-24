package application.android.marshi.androidtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import application.android.marshi.androidtest.databinding.MainActivityBinding;
import application.android.marshi.androidtest.dummy.DummyContent;
import application.android.marshi.androidtest.model.Handler;
import application.android.marshi.androidtest.model.User;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.main_activity);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		User user = new User();
		user.setName("Mikell");
		Handler handler = new Handler(this);

		MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
		binding.setUser(user);
		binding.setHandler(handler);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onListFragmentInteraction(DummyContent.DummyItem item) {

	}
}
