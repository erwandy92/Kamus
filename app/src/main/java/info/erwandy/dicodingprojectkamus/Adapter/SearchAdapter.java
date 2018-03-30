package info.erwandy.dicodingprojectkamus.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

import info.erwandy.dicodingprojectkamus.Model.KamusModel;
import info.erwandy.dicodingprojectkamus.R;
import info.erwandy.dicodingprojectkamus.ViewHolder.SearchViewHolder;

/**
 * Created by Nursing Bank IT Dept on 3/29/2018.
 */

public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder> {

    private ArrayList<KamusModel> list = new ArrayList<>();

    public SearchAdapter() {
    }

    public void replaceAll(ArrayList<KamusModel> items) {
        list = items;
        notifyDataSetChanged();
    }

    @Override
    public SearchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SearchViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.content_list_item, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(SearchViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
