package com.example.courstuto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.courstuto.ui.theme.CoursTutoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursTutoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AfficherNom() {
    var nomEntree by remember { mutableStateOf("") }
    val texteBouton: String = "Afficher le nom"

    Column {
        TextField(
            value = nomEntree,
            onValueChange = { nouvelleValeur -> nomEntree = nouvelleValeur },
            label = { Text("Entrez votre nom") }
        )
        Button(onClick = { println("Bonjour, $nomEntree !") }) {
            Text(text = texteBouton)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoursTutoTheme {
        AfficherNom()
    }
}