package app

import core.DeepThought

object Main extends App {

  configure()

  println(DeepThought.answerToTheUltimateQuestionOfLifeTheUniverseAndEverything)

  def configure(): Unit = {
    util.Properties.setProp("scala.time", "true")
  }
}
