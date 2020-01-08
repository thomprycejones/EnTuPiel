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

class JuegoFragmentFragment: Fragment(){

    lateinit var inicioButton: RelativeLayout
    lateinit var juegoButton: RelativeLayout
    lateinit var migracionButton: RelativeLayout

    lateinit var goToJuegoBuscador: RelativeLayout
    lateinit var goToJuegoExplicacion: RelativeLayout


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_juego,container,false)

        inicioButton = view.findViewById(R.id.rv_inicio)
        inicioButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_juegoFragmentFragment_to_inicioFragment)
        }
        juegoButton = view.findViewById(R.id.rv_eljuego)
        juegoButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_juegoFragmentFragment_self)
        }
        migracionButton = view.findViewById(R.id.rv_migracion)
        migracionButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_juegoFragmentFragment_to_migracionFragment)
        }

        goToJuegoBuscador = view.findViewById(R.id.goToJuegoBuscador)
        goToJuegoBuscador.setOnClickListener {
            this.findNavController().navigate(R.id.action_juegoFragmentFragment_to_juegoBuscadorFragment)
        }
        goToJuegoExplicacion = view.findViewById(R.id.goToJuegoExplicacion)
        goToJuegoExplicacion.setOnClickListener {
            this.findNavController().navigate(R.id.action_juegoFragmentFragment_to_juegoExplicacionFragment)
        }

        return view
    }

}