package com.gultendogan.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gultendogan.runningapp.db.Run
import com.gultendogan.runningapp.repositories.MainRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
): ViewModel() {

    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()

    fun insertRun(run: Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }
}