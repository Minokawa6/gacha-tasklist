package com.miling.gachatasklist.core.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.miling.gachatasklist.tasklist.presentation.TasklistComposable
import com.miling.gachatasklist.core.presentation.theme.GachaTasklistTheme
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GachaTasklistTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Tasklist,
                        modifier = Modifier.padding(innerPadding)
                    ){
                        composable<Tasklist> {
                            TasklistComposable()
                        }
                    }
                }
            }
        }
    }
}

@Serializable
object Tasklist

@Preview
@Composable
fun MainActPreview(){

}