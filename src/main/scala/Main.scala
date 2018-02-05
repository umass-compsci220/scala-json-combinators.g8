import hw.json._
import hw.combinator.{CombinatorLike, JsonProc}

object Combinators extends CombinatorLike {

  def key(key: String) = new JsonProc[Json,Json](json => json match {
    case JsonDict(map) => map.get(JsonString(key)) match {
      case Some(value) => List(value)
      case None => Nil
    }
    case v => Nil
  })


  def number: JsonProc[Json,Double] = ???
  def index(n: Int): JsonProc[Json,Json] = ???
  def iter: JsonProc[Json,Json] = ???
  def addAll(json: Json): Double = ???

  def recur: JsonProc[Json, Json] = ???
  def split[S]: JsonProc[S, (S, S)] = ???
  def swap[A, B]: JsonProc[(A, B), (B, A)] = ???
  def first[A, B, C](proc: JsonProc[A, B]): JsonProc[(A, C), (B, C)] = ???
  def second[A, B, C](proc: JsonProc[A, B]): JsonProc[(C, A), (C, B)] = ???
  def combine[A]: JsonProc[(A, A), A] = ???

}
