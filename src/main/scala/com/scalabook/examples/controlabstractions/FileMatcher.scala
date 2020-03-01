package com.scalabook.examples.controlabstractions

import java.io.File

object FileMatcher {

  private def filesHere = new File(".").listFiles

  def filesEnding(suffix: String) = filesHere.filter(file => file.getName.endsWith(suffix))

  def filesContains(substring: String) = filesHere.filter(file => file.getName.contains(substring))

  // Using shorthand notation
  def filesRegex(regex: String) = filesHere.filter(_.getName.matches(regex))

  def filesMatching(matcher: String => Boolean) = filesHere.filter(file => matcher(file.getName))

  // Some abstraction here
  def filesEndingUsingFilesMatching(suffix: String) = filesMatching(_.endsWith(suffix))
}
