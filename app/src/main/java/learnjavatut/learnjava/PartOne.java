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
public class PartOne extends ListFragment {


    Intent intent;

    public PartOne() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        String[] value= getResources().getStringArray(R.array.topicPartOne);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
               android.R.layout.simple_list_item_1, value);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
      super.onListItemClick(l, v, position, id);
              TextView temp =(TextView ) v;
            switch (temp.getText().toString()) {

                    case "Java Hello World Program" :
                   intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                        intent.putExtra("chk", "Java Hello World Program");
                    startActivity(intent);
                        break;

            case "Java Comments" :
                 intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java Comments");
                startActivity(intent);
                break;

            case "Java Data and Variables" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java Data and Variables");
                startActivity(intent);
                break;

            case "Java Command Line Arguments" :
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java Command Line Arguments");
                startActivity(intent);
                break;






            default:


        }

    }
}
