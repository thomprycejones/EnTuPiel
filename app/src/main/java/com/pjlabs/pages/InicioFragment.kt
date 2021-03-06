package com.pjlabs.pages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.navigation.fragment.findNavController

import com.pjlabs.R

class InicioFragment: Fragment(){

    lateinit var inicioButton: RelativeLayout
    lateinit var juegoButton: RelativeLayout
    lateinit var migracionButton: RelativeLayout

    lateinit var goToMigracion: RelativeLayout
    lateinit var goToJuego: RelativeLayout


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_inicio,container,false)

        inicioButton = view.findViewById(R.id.rv_inicio)
        inicioButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_inicioFragment_self)
        }
        juegoButton = view.findViewById(R.id.rv_eljuego)
        juegoButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_inicioFragment_to_juegoFragmentFragment)
        }
        migracionButton = view.findViewById(R.id.rv_migracion)
        migracionButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_inicioFragment_to_migracionFragment)
        }

        goToMigracion = view.findViewById(R.id.goToMigracion)
        goToMigracion.setOnClickListener {
            this.findNavController().navigate(R.id.action_inicioFragment_to_migracionFragment)
        }

        goToJuego = view.findViewById(R.id.goToJuego)
        goToJuego.setOnClickListener {
            this.findNavController().navigate(R.id.action_inicioFragment_to_juegoFragmentFragment)
        }

        return view

    }

}