package xander.elasticity.demo.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import xander.elasticity.demo.R;

/**
 * @author amit
 */
public class DemoRecyclerAdapterHorizontal extends DemoRecyclerAdapterBase {

    public DemoRecyclerAdapterHorizontal(LayoutInflater inflater) {
        super(inflater);
    }

    public DemoRecyclerAdapterHorizontal(List items, LayoutInflater inflater) {
        super(inflater, items);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DemoViewHolder(R.layout.horizontal_list_item, parent, mInflater);
    }

}
