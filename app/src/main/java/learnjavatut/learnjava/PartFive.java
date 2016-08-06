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
public class PartFive extends ListFragment {

    Intent intent;
    public PartFive() {
        // Required empty public constructor
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        String[] value = getResources().getStringArray(R.array.topicPartFive);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, value);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        TextView temp = (TextView) v;
        switch (temp.getText().toString()) {

            case "Catching Exceptions":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Catching Exceptions");
                startActivity(intent);
                break;

            case "File I/O and Streams":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "File I/O and Streams");
                startActivity(intent);
                break;


            case "Make executable jar files in JDK1.3.1":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Make executable jar files in JDK1.3.1");
                startActivity(intent);
                break;


            default:


        }

    }
}
