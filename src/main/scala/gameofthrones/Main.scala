package gameofthrones

import scala.io.Source

object Main extends App {

  object readFile {

    val characters : Seq[CharacterDefinition] = Seq(CharacterDefinition("","",""))//Seq(Seq[String])// = List(())

    def assignCharData (filename: String): Unit = {
      for (line <- Source.fromFile(filename).getLines) {
        //println(line)
        val info = line.split(",").map(_.trim)

        //println(info(0))
        val character = new CharacterDefinition(info(0), info(1), info(2))

        //val list2 = characters :: character

        //are you from WF
        //if()
      }
    }
  }

  val filename = "/home/shadeegun/Documents/GameOfThrones.txt"

  readFile.assignCharData(filename)

}
