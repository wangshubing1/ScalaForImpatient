package Chapter4

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val s1=Array("[","-","]")                       //> s1  : Array[String] = Array([, -, ])
     val s2=Array(2,5,2)                          //> s2  : Array[Int] = Array(2, 5, 2)
     var s3= s1.zip(s2)                           //> s3  : Array[(String, Int)] = Array(([,2), (-,5), (],2))
     
    // s3.foreach()
    println(java.util.Calendar.MONDAY)            //> 2
    //java.rutime.name
    var sp1="Fred Smith".split("\\s+")            //> sp1  : Array[String] = Array(Fred, Smith)
    
    
    
    
    
    
    System.getProperties()                        //> res0: java.util.Properties = {java.runtime.name=Java(TM) SE Runtime Environm
                                                  //| ent, sun.boot.library.path=D:\1win81\java\jre7\bin, java.vm.version=24.79-b0
                                                  //| 2, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com
                                                  //| /, path.separator=;, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.en
                                                  //| coding.pkg=sun.io, user.country=CN, user.script=, sun.java.launcher=SUN_STAN
                                                  //| DARD, sun.os.patch.level=Service Pack 1, java.vm.specification.name=Java Vir
                                                  //| tual Machine Specification, user.dir=D:\1win7\eclipse, java.runtime.version=
                                                  //| 1.7.0_79-b15, java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment, java.en
                                                  //| dorsed.dirs=D:\1win81\java\jre7\lib\endorsed, os.arch=amd64, java.io.tmpdir=
                                                  //| C:\Users\xubo\AppData\Local\Temp\, line.separator=
                                                  //| , java.vm.specification.vendor=Oracle Corporation, user.variant=, os.name=Wi
                                                  //| ndows 7, sun.jnu.encoding=GBK, java.library.path=D:\1win81\java\jre7\bin;C:\
                                                  //| Windows\Sun\Java\bin;C:\Windows\system32;C:\Windo
                                                  //| Output exceeds cutoff limit.
    
    
}