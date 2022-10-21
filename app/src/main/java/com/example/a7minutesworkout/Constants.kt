package com.example.a7minutesworkout

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>
    {
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks= ExerciseModel(
            1,"Jumping Jacks", R.drawable.juminjacki,
            false,false
        )
        exerciseList.add(jumpingJacks)
        val Lunges= ExerciseModel(
            2,"Lunges", R.drawable.lunges,
            false,false
        )
        exerciseList.add(Lunges)
        val mountainclimbers= ExerciseModel(
            3,"Mountain climbers", R.drawable.mountainclimbers,
            false,false
        )
        exerciseList.add(mountainclimbers)
        val plank= ExerciseModel(
            4,"Plank", R.drawable.plink,
            false,false
        )
        exerciseList.add(plank)
        val pushUps= ExerciseModel(
            5,"Push Ups", R.drawable.pushups,
            false,false
        )
        exerciseList.add(pushUps)
        val sidePlank= ExerciseModel(
            6,"Side Plank", R.drawable.side,
            false,false
        )
        exerciseList.add(sidePlank)
        val Squat= ExerciseModel(
            7,"Squat", R.drawable.squat,
            false,false
        )
        exerciseList.add(Squat)

        val tricepsdips= ExerciseModel(
            8,"Tricep Dips", R.drawable.tricepsdips,
            false,false
        )
        exerciseList.add(tricepsdips)

        val wallsit= ExerciseModel(
            9,"Wall Sit", R.drawable.wallsit,
            false,false
        )
        exerciseList.add(wallsit)
        val highknees= ExerciseModel(
            10,"High Knees", R.drawable.highknees,
            false,false
        )
        exerciseList.add(highknees)
        val calfraise= ExerciseModel(
            11,"Calf Raises", R.drawable.calfraises,
            false,false
        )
        exerciseList.add(calfraise)
        val Toetouches= ExerciseModel(
            12,"Toe Touches", R.drawable.toetouches,
        false,false
        )
        exerciseList.add(Toetouches)

        return exerciseList
    }
}