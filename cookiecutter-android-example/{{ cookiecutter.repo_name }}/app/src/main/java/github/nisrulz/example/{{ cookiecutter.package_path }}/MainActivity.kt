package {{ cookiecutter.full_package_namespace }}

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import {{ cookiecutter.full_package_namespace }}.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            setupUi(this)
        }
    }

    private fun setupUi(binding: ActivityMainBinding) {
        binding.apply {
            textView.text = "Hello World!"
        }
    }
}
