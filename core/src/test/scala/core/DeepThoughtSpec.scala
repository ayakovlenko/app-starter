package core

import org.scalatest.{FlatSpec, Matchers}

class DeepThoughtSpec extends FlatSpec with Matchers {

  it should "answer to the Ultimate Question of Life, the Universe, and Everything" in {
    DeepThought.answerToTheUltimateQuestionOfLifeTheUniverseAndEverything shouldBe 42
  }
}
