package fr.yugo.traducteur;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {
    private Context context;
    private final String[] mobileValues;

    public Adapter(Context context, String[] mobileValues) {
        this.context = context;
        this.mobileValues = mobileValues;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(context);

            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.mobil, null);
            // set image based on selected text
            ImageView imageView = (ImageView) gridView
                    .findViewById(R.id.grid_item_image);

            String mobile = mobileValues[position];

            if (mobile.equals("a")) {
                imageView.setImageResource(R.drawable.a);
            } else if (mobile.equals("b")) {
                imageView.setImageResource(R.drawable.b);
            } else if (mobile.equals("c")) {
                imageView.setImageResource(R.drawable.c);
            } else if (mobile.equals("d")) {
                imageView.setImageResource(R.drawable.d);
            } else if (mobile.equals("e")) {
                imageView.setImageResource(R.drawable.e);
            } else if (mobile.equals("f")) {
                imageView.setImageResource(R.drawable.f);
            } else if (mobile.equals("g")) {
                imageView.setImageResource(R.drawable.g);
            } else if (mobile.equals("h")) {
                imageView.setImageResource(R.drawable.h);
            } else if (mobile.equals("i")) {
                imageView.setImageResource(R.drawable.i);
            } else if (mobile.equals("j")) {
                imageView.setImageResource(R.drawable.j);
            } else if (mobile.equals("k")) {
                imageView.setImageResource(R.drawable.k);
            } else if (mobile.equals("l")) {
                imageView.setImageResource(R.drawable.l);
            } else if (mobile.equals("m")) {
                imageView.setImageResource(R.drawable.m);
            } else if (mobile.equals("n")) {
                imageView.setImageResource(R.drawable.n);
            } else if (mobile.equals("o")) {
                imageView.setImageResource(R.drawable.o);
            } else if (mobile.equals("p")) {
                imageView.setImageResource(R.drawable.p);
            } else if (mobile.equals("q")) {
                imageView.setImageResource(R.drawable.q);
            } else if (mobile.equals("r")) {
                imageView.setImageResource(R.drawable.r);
            } else if (mobile.equals("s")) {
                imageView.setImageResource(R.drawable.s);
            } else if (mobile.equals("t")) {
                imageView.setImageResource(R.drawable.t);
            } else if (mobile.equals("u")) {
                imageView.setImageResource(R.drawable.u);
            } else if (mobile.equals("v")) {
                imageView.setImageResource(R.drawable.v);
            } else if (mobile.equals("w")) {
                imageView.setImageResource(R.drawable.w);
            } else if (mobile.equals("x")) {
                imageView.setImageResource(R.drawable.x);
            } else if (mobile.equals("y")) {
                imageView.setImageResource(R.drawable.y);
            } else if (mobile.equals("z")) {
                imageView.setImageResource(R.drawable.z);
            }

        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }

    @Override
    public int getCount() {
        return mobileValues.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
