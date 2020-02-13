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
                cpu.setImageResource(R.drawable.goo)
                result.text = "引き分けです"
                result.setTextColor(Color.parseColor( "#000000"))
            }
            1 -> {
                cpu.setImageResource(R.drawable.choki)
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.parseColor( "#2196f3"))



            }
            2 -> {
                cpu.setImageResource(R.drawable.paa)
                result.text = "あなたの負けです"
                result.setTextColor(Color.parseColor( "#000000"))

            }
        }
    }

    fun choki(view: View?){
        player.text = "あなたの手はちょきです"
        val number = Random().nextInt(3)

        when (number){
            0-> {
                cpu.setImageResource(R.drawable.choki)
                result.text = "引き分けです"
                result.setTextColor(Color.parseColor( "#000000"))
            }
            1 -> {
                cpu.setImageResource(R.drawable.paa)
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.parseColor( "#2196f3"))


            }
            2 -> {
                cpu.setImageResource(R.drawable.goo)
                result.text = "あなたの負けです"
                result.setTextColor(Color.parseColor( "#000000"))

            }
        }
    }

    fun paa(view: View?){
        player.text = "あなたの手はぱーです"
        val number = Random().nextInt(3)

        when (number){
            0-> {
                cpu.setImageResource(R.drawable.paa)
                result.text = "引き分けです"
                result.setTextColor(Color.parseColor( "#000000"))
            }
            1 -> {
                cpu.setImageResource(R.drawable.goo)
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.parseColor( "#2196f3"))


            }
            2 -> {
                cpu.setImageResource(R.drawable.choki)
                result.text = "あなたの負けです"
                result.setTextColor(Color.parseColor( "#000000"))

            }
        }
    }

}
