package com.example.landingpageactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class ItemListActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<Item> mItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_list_hanif);

        mRecyclerView = findViewById(R.id.item_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mItemList = new ArrayList<>();
        mItemList.add(new Item(R.drawable.gambar_bengkel, "Item 1", "Item 1 Description", 4.5f, 123));
        mItemList.add(new Item(R.drawable.gambar_bengkel, "Item 2", "Item 2 Description", 3.5f, 45));
        mItemList.add(new Item(R.drawable.gambar_bengkel, "Item 3", "Item 3 Description", 5f, 789));

        ItemAdapter adapter = new ItemAdapter();
        adapter.setData(mItemList);
    }

        private class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {
        private List<Item> mItemList;

            public void setData(List<Item> itemList) {
                mItemList = itemList;
                notifyDataSetChanged();
            }

        @NonNull
        @Override
        public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.layout_item, parent, false);
            return new ItemViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
            Item item = mItemList.get(position);
            holder.bind(item);
        }

        @Override
        public int getItemCount() {
            return mItemList.size();
        }
    }

    private class ItemViewHolder extends RecyclerView.ViewHolder {

        private ImageView mItemImage;
        private TextView mItemName;
        private TextView mItemDescription;
        private TextView mItemRating;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            mItemImage = itemView.findViewById(R.id.item_image);
            mItemName = itemView.findViewById(R.id.item_name);
            mItemDescription = itemView.findViewById(R.id.item_description);
            mItemRating = itemView.findViewById(R.id.item_rating);
        }

        public void bind(Item item) {
            mItemImage.setImageResource(item.getImageResource());
            mItemName.setText(item.getName());
            mItemDescription.setText(item.getDescription());
            mItemRating.setText(String.format("%.1f (%d)", item.getRating(), item.getRatingCount()));
        }
    }

    private class Item {
        private int mImageResource;
        private String mName;
        private String mDescription;
        private float mRating;
        private int mRatingCount;

        public Item(int imageResource, String name, String description, float rating, int ratingCount) {
            mImageResource = imageResource;
            mName = name;
            mDescription = description;
            mRating = rating;
            mRatingCount = ratingCount;
        }

        public int getImageResource() {
            return mImageResource;
        }

        public String getName() {
            return mName;
        }

        public String getDescription() {
            return mDescription;
        }

        public float getRating() {
            return mRating;
        }

        public int getRatingCount() {
            return mRatingCount;
        }
    }
}

