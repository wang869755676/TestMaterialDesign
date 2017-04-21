package com.example.recyclerdirection.testmaterialdesign;

import android.app.Activity;
import android.graphics.Outline;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;

public class ToolBarActivity extends Activity {

    private CollapsingToolbarLayout toolbarLayout;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);

        toolbarLayout= (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        toolbarLayout.setTitle("imageView");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerView.Adapter<ViewHolder>() {
            @Override
            public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new ViewHolder(getLayoutInflater().inflate(R.layout.item_layout,null));
            }

            @Override
            public void onBindViewHolder(ViewHolder holder, int position) {
                 holder.tv.setText("位置位置"+position);
            }

            @Override
            public int getItemCount() {
                return 20;
            }
        });


    }
    private class  ViewHolder extends RecyclerView.ViewHolder{
              TextView tv;
        public ViewHolder(View itemView) {
            super(itemView);
            tv= (TextView) itemView.findViewById(R.id.tv);
        }
    }
}
