package de.ingoreschke.composetutorial

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import de.ingoreschke.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MessageCard(MyMessage("Android", "Jetpack Compose"))
                }
            }
        }
    }
}

data class MyMessage(val author:String, val body:String);

@Composable
fun MessageCard(msg: MyMessage) {
    Column() {
        Text(text = msg.author)
        Text(text = msg.body)
    }
}

@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard(
        msg = MyMessage("Ingo", "Have fun with that stuff")
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTutorialTheme {
        MessageCard(MyMessage("Android", "Test this jetpackstuff"))
    }
}