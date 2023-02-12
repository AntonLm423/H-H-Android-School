package com.example.homework2_task3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.homework2_task3.fragments.*

class SecondFragment : Fragment() {

    lateinit var button1 : Button
    lateinit var button2 : Button
    lateinit var button3 : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        childFragmentManager.commit {
            add<Fragment1>(R.id.frameLayout123)
        }

        button1 = view.findViewById(R.id.button1)
        button2 = view.findViewById(R.id.button2)
        button3 = view.findViewById(R.id.button3)

        button1.setOnClickListener() {
            childFragmentManager.commit {
                replace(R.id.frameLayout123, Fragment1())
            }
        }

        button2.setOnClickListener() {
            childFragmentManager.commit {
                replace(R.id.frameLayout123, Fragment2())
            }
        }

        button3.setOnClickListener() {
            childFragmentManager.commit {
                replace(R.id.frameLayout123, Fragment3())
            }
        }

    }


}