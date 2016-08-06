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
public class PartTwo extends ListFragment {

    Intent intent;

    public PartTwo() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        String[] value = getResources().getStringArray(R.array.topicPartTwo);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, value);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        TextView temp = (TextView) v;
        switch (temp.getText().toString()) {

            case "Java Arithmetic Operators":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java Arithmetic Operators");
                startActivity(intent);
                break;

            case "Java Assignment Operators":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java Assignment Operators");
                startActivity(intent);
                break;


            case "Java Increment and Decrement Operators":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java Increment and Decrement Operators");
                startActivity(intent);
                break;


            case "Java Relational Operators":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java Relational Operators");
                startActivity(intent);
                break;


            case "Java Boolean Operators":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java Boolean Operators");
                startActivity(intent);
                break;

            case "Java Conditional Operators":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java Conditional Operators");
                startActivity(intent);
                break;


            default:


        }

    }
}
