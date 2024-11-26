import android.content.Context
import android.provider.ContactsContract.Contacts
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.mad_practical7.R

class ContactAdapter (context:Context, private val contacts: List<Person>): ArrayAdapter<Person>(context, 0, contacts){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_item_contact, parent, false)
        val nameTextView = view.findViewById<TextView>(R.id.name)
        val numberTextView = view.findViewById<TextView>(R.id.number)
        val emailTextView = view.findViewById<TextView>(R.id.email)
        val addressTextView = view.findViewById<TextView>(R.id.address)
        nameTextView.text = contacts?.name
        numberTextView.text = contacts?.number
        emailTextView.text = contacts?.email
        addressTextView.text = contacts?.address
        return view
    }
}