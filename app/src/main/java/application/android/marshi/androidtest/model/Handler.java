package application.android.marshi.androidtest.model;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * @author mukai_masaki on 2016/03/13.
 *         Copyright: CYBER AGNET. INC
 */
public class Handler {

	private Context contxt;

	public Handler(Context contxt) {
		this.contxt = contxt;
	}

	public void onClick(View view) {
		Toast.makeText(contxt, "toast test", Toast.LENGTH_LONG).show();
	}

}
