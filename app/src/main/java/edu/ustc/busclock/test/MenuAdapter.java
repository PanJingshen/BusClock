package edu.ustc.busclock.test;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import edu.ustc.busclock.R;

/**
 * Created by lenovo on 2016-11-4.
 */

public class MenuAdapter extends SwipeMenuAdapter<MenuAdapter.DefaultViewHolder> {

    protected List<ItemModel> mDataList = new ArrayList<>();

    public List<ItemModel> getDataList() {
        return mDataList;
    }

    public void addAll(Collection<ItemModel> list) {
        int lastIndex = this.mDataList.size();
        if (this.mDataList.addAll(list)) {
            notifyItemRangeInserted(lastIndex, list.size());
        }
    }

    public void remove(int position) {
        mDataList.remove(position);
        notifyItemRemoved(position);
        if(position != mDataList.size()){ // 如果移除的是最后一个，忽略
            notifyItemRangeChanged(position, mDataList.size() - position);
        }

    }

    public void clear() {
        mDataList.clear();
        notifyDataSetChanged();
    }




    @Override
    public MenuAdapter.DefaultViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DefaultViewHolder(parent);
    }


    /**
     * 绑定ViewHolder
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(MenuAdapter.DefaultViewHolder holder, int position) {
        String item = mDataList.get(position).title;

        DefaultViewHolder viewHolder = holder;
        viewHolder.tvTitle.setText(item);
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public class DefaultViewHolder extends RecyclerView.ViewHolder{

        TextView tvTitle;

        public DefaultViewHolder(View itemView) {
            super(itemView);
        }
    }
}
