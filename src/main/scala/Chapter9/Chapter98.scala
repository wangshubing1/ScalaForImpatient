package Chapter9
import scala.io.Source
object Chapter98 extends App {
    val source = Source.fromURL("http://home.ustc.edu.cn/~xubo245/").mkString  
    val pattern = """<img[^>]+(src\s*=\s*"[^>^"]+")[^>]*>""".r   
    for (pattern(str) <- pattern.findAllIn(source)) println(str)  
}