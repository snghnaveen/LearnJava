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
public class PartFour extends ListFragment {

    Intent intent;
    public PartFour() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        String[] value= getResources().getStringArray(R.array.topicPartFour);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, value);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        TextView temp =(TextView ) v;
        switch (temp.getText().toString()) {

            case "Methods" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Methods");
                startActivity(intent);
                break;

            case "Arrays" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Arrays");
                startActivity(intent);
                break;

            case "Classes and Objects" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Classes and Objects");
                startActivity(intent);
                break;

            case "Interfaces" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Interfaces");
                startActivity(intent);
                break;






            default:


        }

    }
}
