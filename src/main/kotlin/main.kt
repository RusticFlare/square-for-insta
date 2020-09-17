import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.types.file

class SquareForInsta : CliktCommand() {

    private val source by argument().file(mustExist = true)

    override fun run() {
        println(source.absolutePath)
    }
}

fun main(args: Array<String>) = SquareForInsta().main(args)
