package com.example.vasavisgame

class TestClass {
    //day: M, T, W
    //number ( day of the week) key, value pair
    //write a function that takes input of a string or number and returns the number or name of the day of the week

    fun processInput(input: Any): Any?{
        val solution = mutableMapOf("Monday" to 1, "Tuesday" to 2, "Wednedsay" to 3, "Thursday" to  4, "Friday" to 5, "Saturday" to 6, "Sunday" to 7)
        if (input is String){
            return solution[input]
        }
        if(input is Int){
            return solution.filterValues { it == input }
        }
        return null
    }
}
//@Composable
//fun ViewForFunction(){
//    val input = "Monday"
//    val solution = TestClass().processInput(input)
//    Column(){
//        Button(onClick = (TestClass().processInput(input))){
//
//        }
//    }
//}

