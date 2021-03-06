import sangria.macros._
import types._
object InputVariables {
  object InputVariables extends GraphQLQuery {
    val document: sangria.ast.Document = graphql"""query InputVariables($$humanId: String!) {
  human(id: $$humanId) {
    name
    homePlanet
  }
}"""
    case class Variables(humanId: String)
    case class Data(human: Option[Human])
    case class Human(name: Option[String], homePlanet: Option[String])
  }
}
