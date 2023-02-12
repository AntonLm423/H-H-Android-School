package com.example.homework2_task1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.*


class MainFragment : Fragment() {

   lateinit var textViewMessage : TextView
   lateinit var buttonNext : Button


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textViewMessage = view.findViewById<TextView>(R.id.textViewMessage)
        buttonNext = view.findViewById<Button>(R.id.buttonNext)

        buttonNext.setOnClickListener() {
            // отправляем исходное сообщение
            setFragmentResult("main_second", bundleOf("message_key" to textViewMessage.text))

            parentFragmentManager.commit {
                replace(R.id.frameLayoutMain, SecondFragment())
            }
        }
    }

    override fun onStart() {
        super.onStart()
        // принимаем измененное сообщение
        setFragmentResultListener("second_main") { _, bundle ->
            textViewMessage.text = bundle.getString("message_key") }
    }

}