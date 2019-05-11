package in.lco.recyclerviewapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder>
{

    private String[] data;

    public CourseAdapter(String[] data)
    {
        this.data=data;
    }
    @Override
    public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item,parent,false);
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CourseViewHolder holder, int position) {
        String title=data[position];

        holder.textView.setText(title);

    }



    @Override
    public int getItemCount() {
        return data.length;
    }
    public class CourseViewHolder extends  RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView;
        public CourseViewHolder(View itemview)
        {
            super(itemview);
            imageView=itemview.findViewById(R.id.imageview);
            textView=itemview.findViewById(R.id.title);


        }
    }
}
