package application.android.marshi.androidtest;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * @author mukai_masaki on 2016/03/27.
 *         Copyright: CYBER AGNET. INC
 */
public class BindingHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {

	public final T binding;

	public BindingHolder(@NonNull Context context, @NonNull ViewGroup parent, @LayoutRes int layoutResid) {
		super(LayoutInflater.from(context).inflate(layoutResid, parent, false));
		binding = DataBindingUtil.bind(itemView);
	}

}
