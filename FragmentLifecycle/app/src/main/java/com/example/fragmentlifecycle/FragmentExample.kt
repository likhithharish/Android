package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentExample : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("MESSAGE/","FRAG onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MESSAGE/","FRAG onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        return inflater.inflate(R.layout.fragment_new, container, false)
        Log.d("MESSAGE/","FRAG onCreateView")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("MESSAGE/","FRAG onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MESSAGE/","FRAG onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MESSAGE/","FRAG onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MESSAGE/","FRAG onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MESSAGE/","FRAG onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("MESSAGE/","FRAG onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MESSAGE/","FRAG onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("MESSAGE/","FRAG onDetach")
    }

}