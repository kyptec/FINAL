package com.example.arthur.mockup;

import android.os.StrictMode;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.LinearLayout;


import org.jsoup.Jsoup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;


public class menu_2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_2);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

//            ////////////////////////////////////////////////////////////////////////
//            ////////////////////////////////////////////////////////////////////////
//
              View rootView = inflater.inflate(R.layout.fragment_menu_2, container, false);
//            RecyclerView recyclerView;
//            recyclerView = (RecyclerView) rootView.findViewById(R.id.my_recycler_view);
//            // use a linear layout manager
//            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
//
////            recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_menu_2, container, false).findViewById(R.id.my_recycler_view);
//            recyclerView.setLayoutManager(mLayoutManager);
//
//            // improve performance if you know that changes in content
//            // do not change the size of the RecyclerView
//            recyclerView.setHasFixedSize(true);
//
//
//            ArrayList<String> myDataset = new ArrayList<String>();
//
//            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//            StrictMode.setThreadPolicy(policy);
//
//            try {
//
//                URL url = new URL("http://pacelosangeles.weebly.com/");
//
//                // read text returned by server
//                //  this guy get html code
//                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
//
//                String line = "";
//                String tempLine = "";
//                while ((line = in.readLine()) != null) {
//                    if(line.indexOf("blog-title-link") > 0)
//                        tempLine += "Tittle : " + (html2text(line)) + "\n";//System.out.println(html2text(line));
//                    if(line.indexOf("date-text") > 0)
//                        tempLine += "Date : " + (html2text(line)) + "\n";//System.out.println(html2text(line));
//                    if(line.indexOf("paragraph") > 0) {
//                        tempLine += (html2text(line)) + "\n\n"; //System.out.println(html2text(line));
//                        System.out.println(tempLine);
//                        myDataset.add(tempLine);
//                        tempLine = "";
//                    }
//                }
//                in.close();
//
//            }
//            catch (MalformedURLException e) {
//                System.out.println("Malformed URL: " + e.getMessage());
//            }
//            catch (IOException e) {
//                System.out.println("I/O Error: " + e.getMessage());
//            }
//
//
//            // Create the adapter
//            RecyclerView.Adapter adapter = new MyAdapter(getActivity(), myDataset);
//            recyclerView.setAdapter(adapter);
//
//            ////////////////////////////////////////////////////////////////////////
//            ////////////////////////////////////////////////////////////////////////

            return rootView;
        }
    }

    public static String html2text(String html) {
        return Jsoup.parse(html).text();
    }
}
