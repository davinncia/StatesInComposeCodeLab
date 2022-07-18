package com.example.statesincomposecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*

// It's a good practice to provide a default Modifier to all composable functions, as it increases reusability.
// It should appear as the first optional parameter in the parameter list, after all required parameters.
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count by remember { mutableStateOf(0) }

    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text(
                text = "You've had ${count} glasses.",
                modifier = modifier.padding(16.dp)
            )
        }
        Button(onClick = { count++ }, Modifier.padding(top = 8.dp), enabled = count < 10) {
            Text("Add one")
        }
    }

}