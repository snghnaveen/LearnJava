package learnjavatut.learnjava;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Intro extends ListFragment {

    Intent intent;
    public Intro() {
        // Required empty public constructor
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        String[] value= getResources().getStringArray(R.array.topicIntro);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, value);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        TextView temp =(TextView ) v;
        switch (temp.getText().toString()) {

            case "Java" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java");
                startActivity(intent);
                break;

            case "History" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "History");
                startActivity(intent);
                break;

            case "Object-oriented programming" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Object-oriented programming");
                startActivity(intent);
                break;

            case "Philosophy" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Philosophy");
                startActivity(intent);
                break;






            default:


        }

    }
}
