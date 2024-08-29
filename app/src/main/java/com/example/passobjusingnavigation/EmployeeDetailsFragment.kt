package com.example.passobjusingnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.passobjusingnavigation.databinding.FragmentEmployeeDetailsBinding


class EmployeeDetailsFragment : Fragment() {
    private lateinit var binding: FragmentEmployeeDetailsBinding
    private val args: EmployeeDetailsFragmentArgs by navArgs()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEmployeeDetailsBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val employee = args.data
        binding.email.text = employee.email
        binding.phone.text = employee.phone
        binding.address.text = employee.address
        binding.salary.text = employee.salary


        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_employeeDetailsFragment_to_employeeFragment)
        }

    }


}