package Chapter6

object Hello extends App {
  if(args.length>0)
    for(i<-0 until args.length) println(i+":"+args(i))
    else
      println("Hello")
}
