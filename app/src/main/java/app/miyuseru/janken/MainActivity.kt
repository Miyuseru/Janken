package app.miyuseru.janken

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun goo(view: View?){
        player.text = "あなたの手はぐーです"
        val number = Random().nextInt(3)

        when (number){
            0-> {
                cpu.text = "相手の手はぐーです"
                result.text = "引き分けです"
            }
            1 -> {
                cpu.text = "相手の手はちょきです"
                result.text = "あなたの勝ちです"


            }
            2 -> {
                cpu.text = "相手の手はぱーです"
                result.text = "あなたの負けです"

            }
        }
    }

    fun choki(view: View?){
        player.text = "あなたの手はちょきです"
        val number = Random().nextInt(3)
        if(number == 1){
            (result).setTextColor(Color.rgb(255, 0, 0))
        }

        when (number){
            0-> {
                cpu.text = "相手の手はちょきです"
                result.text = "引き分けです"
            }
            1 -> {
                cpu.text = "相手の手はぱーです"
                result.text = "あなたの勝ちです"


            }
            2 -> {
                cpu.text = "相手の手はぐーです"
                result.text = "あなたの負けです"

            }
        }
    }

    fun paa(view: View?){
        player.text = "あなたの手はぱーです"
        val number = Random().nextInt(3)

        when (number){
            0-> {
                cpu.text = "相手の手はぱーです"
                result.text = "引き分けです"
            }
            1 -> {
                cpu.text = "相手の手はぐーです"
                result.text = "あなたの勝ちです"


            }
            2 -> {
                cpu.text = "相手の手はちょきです"
                result.text = "あなたの負けです"

            }
        }
    }

}
