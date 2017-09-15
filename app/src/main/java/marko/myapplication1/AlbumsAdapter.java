package marko.myapplication1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by HIREN AMALIYAR on 15-09-2017.
 */

class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyviewHolder>{
    private Context mContext;
    private List<Album> albumList;

    public class MyviewHolder extends RecyclerView.ViewHolder {

        public ImageView thumbnail;

        public MyviewHolder(View view) {
            super(view);

            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);

        }
    }

    public AlbumsAdapter(Context mContext, List<Album> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.album_card, parent, false);

        return new MyviewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(final MyviewHolder holder, int position) {
        Album album = albumList.get(position);


        // loading album cover using Glide library
        Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);


    }

    /**
     * Showing popup menu when tapping on 3 dots
     */


    /**
     * Click listener for popup menu items
     */


    @Override
    public int getItemCount() {
        return albumList.size();
    }


}
