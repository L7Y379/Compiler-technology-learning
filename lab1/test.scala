/*
 * Copyright (C) 2007-2008 Artima, Inc. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Example code from:
 *
 * Programming in Scala (First Edition, Version 6)
 * by Martin Odersky, Lex Spoon, Bill Venners
 *
 * http://booksites.artima.com/programming_in_scala

abstract    case        catch       class       def
do          else        extends     false       final
finally     for         forSome     if          implicit
import      lazy        macro       match       new
null        object      override    package     private
protected   return      sealed      super       this
throw       trait       try         true        type
val         var         while       with        yield
_    :    =    =>    <-    <:    <%     >:    #    @


 */
  object FileMatcher {
    private def filesHere = (new java.io.File(".")).listFiles

    private def filesMatching(matcher: String => Boolean) =
      for (file <- filesHere; if matcher(file.getName))
        yield file
  
    def filesEnding(query: String) =
      filesMatching(_.endsWith(query))
  
    def filesContaining(query: String) =
      filesMatching(_.contains(query))
  
    def filesRegex(query: String) =
      filesMatching(_.matches(query))
  }

  def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num < 0)
        exists = true
    exists
  }


//这里是中文注释
object Files {
  object FileMatcher {
    private def filesHere = (new java.io.File(".")).listFiles
  
    private def filesMatching(matcher: String => Boolean) =
      for (file <- filesHere; if matcher(file.getName))
        yield file
  
    def filesEnding(query: String) =
      filesMatching(_.endsWith(query))
  
    def filesContaining(query: String) =
      filesMatching(_.contains(query))
  
    def filesRegex(query: String) =
      filesMatching(_.matches(query))
  }

  def main(args: Array[String]) {
    println("FileMatcher.filesEnding(\"scala\").toList [" +
            FileMatcher.filesEnding("scala").toList + "]")
    println("FileMatcher.filesContaining(\"Files1\").toList [" + 
            FileMatcher.filesContaining("Files1").toList + "]")
    println("FileMatcher.filesRegex(\".*Re.ex.*\").toList [" + 
            FileMatcher.filesRegex(".*Re.ex.*").toList + "]")
  }
}

class Time {

    private[this] var h = 12
    private[this] var m = 12

    def hour: Int = h
    def hour_= (x: Int) {
      require(0 <= x && x < 24)
      h = x
    }

    def minute = m
    def minute_= (x: Int) {
      require(0 <= x && x < 60)
      m = x
    }
  } 

