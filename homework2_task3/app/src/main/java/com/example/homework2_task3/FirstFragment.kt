package com.example.homework2_task3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.homework2_task3.fragments.FragmentA
import com.example.homework2_task3.fragments.FragmentB
import com.example.homework2_task3.fragments.FragmentC

class FirstFragment : Fragment() {

    lateinit var buttonA : Button
    lateinit var buttonB : Button
    lateinit var buttonC : Button


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        childFragmentManager.commit {
            add<FragmentA>(R.id.frameLayoutABC)
        }

        buttonA = view.findViewById(R.id.buttonA)
        buttonB = view.findViewById(R.id.buttonB)
        buttonC = view.findViewById(R.id.buttonC)

        buttonA.setOnClickListener() {
            childFragmentManager.commit {
                replace(R.id.frameLayoutABC, FragmentA())
            }
        }

        buttonB.setOnClickListener() {
            childFragmentManager.commit {
                replace(R.id.frameLayoutABC, FragmentB())
            }
        }

        buttonC.setOnClickListener() {
            childFragmentManager.commit {
                replace(R.id.frameLayoutABC, FragmentC())
            }
        }

    }
}