package com.example.daniwebandroidnativeinjectworkerdepswithhilt

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class ExampleWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted workerParams: WorkerParameters,
    exampleDependency: ExampleDependency
) : Worker(context, workerParams) {
    override fun doWork(): Result {
        return Result.success()
    }
}