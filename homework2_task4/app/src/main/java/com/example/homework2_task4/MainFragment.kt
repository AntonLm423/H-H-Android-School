package com.example.homework2_task4

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {

    lateinit var textViewFragment : TextView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("FragmentLifecycle", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("FragmentLifecycle", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("FragmentLifecycle", "onCreateView")
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textViewFragment = view.findViewById(R.id.textViewFragment)
        textViewFragment.append("\nOnViewCreated")
        Log.i("FragmentLifecycle", "onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        textViewFragment.append("\nonViewStateRestored")
        Log.i("FragmentLifecycle", "onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        textViewFragment.append("\nOnStart")
        Log.i("FragmentLifecycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        textViewFragment.append("\nOnResume")
        Log.i("FragmentLifecycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        textViewFragment.append("\nOnPause")
        Log.i("FragmentLifecycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        textViewFragment.append("\nOnStop")
        Log.i("FragmentLifecycle", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        textViewFragment.append("\nonSaveInstanceState")
        Log.i("FragmentLifecycle", "onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        textViewFragment.append("\nonDestroyView")
        Log.i("FragmentLifecycle", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        textViewFragment.append("\nonDestroy")
        Log.i("FragmentLifecycle", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        textViewFragment.append("\nonDetach")
        Log.i("FragmentLifecycle", "onDetach")
    }

}