package com.example.homework2_task1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.*

class SecondFragment : Fragment() {

    lateinit var editTextMessage : EditText
    lateinit var buttonSave : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editTextMessage = view.findViewById(R.id.editTextMessage)
        buttonSave = view.findViewById(R.id.buttonSave)

        buttonSave.setOnClickListener() {
            // отправляем измененное сообщение
            setFragmentResult("second_main", bundleOf("message_key" to editTextMessage.text.toString()))

            parentFragmentManager.commit {
                replace(R.id.frameLayoutMain, MainFragment())
            }
        }
    }

    override fun onStart() {
        super.onStart()
        // принимаем исходное сообщение
        setFragmentResultListener("main_second") { _, bundle ->
            editTextMessage.setText(bundle.getString("message_key")) }
    }

}