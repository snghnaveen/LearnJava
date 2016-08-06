package learnjavatut.learnjava;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoreJava extends ListFragment {

    Intent intent;
    public MoreJava() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        String[] value= getResources().getStringArray(R.array.topicMoreJava);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, value);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        TextView temp =(TextView ) v;
        switch (temp.getText().toString()) {

            case "Java Swing" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java Swing");
                startActivity(intent);
                break;

            case "Java applet" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java applet");
                startActivity(intent);
                break;

            case "Java Servlet" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java Servlet");
                startActivity(intent);
                break;


            case "Criticism of Java" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Criticism of Java");
                startActivity(intent);
                break;


            case "JavaServer Pages" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "JavaServer Pages");
                startActivity(intent);
                break;


            default:


        }

    }
}
