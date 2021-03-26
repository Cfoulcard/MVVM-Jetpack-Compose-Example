package com.example.mvvm_example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.ViewTreeLifecycleOwner

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [StarListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StarListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = ComposeView(requireContext())
        view.apply {
            val view = inflater.inflate(R.layout.fragment_star_list, container, false)
            view.findViewById<ComposeView>(R.id.composeView).setContent {


                Column(modifier = Modifier.border(border = BorderStroke(1.dp, Color.Black))
                ) {
                    Text(text = "Composable inside the fragment")
                    Spacer(modifier = Modifier.padding(10.dp))
                    CircularProgressIndicator()
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Beautiful")

                    val customView = HorizontalDottedProgress(requireContext())

                }
            }

            // return inflater.inflate(R.layout.fragment_star_list, container, false)
            return view
        }

    }
}