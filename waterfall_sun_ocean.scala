import scala.collection.mutable.ListBuffer

object HopeForHorses {

	val horseNames = ListBuffer("Black Beauty", "Silver Star", "Riding Hood", "Dapple Gray", "Midnight Sun")

	def getHorseName(name: String): String = {
		horseNames.find(_ == name).get
	}

	def addHorseName(name: String): Unit = {
		horseNames += name
	}

	def removeHorseName(name: String): Unit = {
		horseNames -= name
	}

	def listHorseNames(): List[String] = {
		horseNames.toList
	}

	def firstLetterMatch(letter: Char): List[String] = {
		horseNames.filter(_.charAt(0) == letter).toList
	}

	def firstAndLastLetterMatch(first: Char, last: Char): List[String] = {
		horseNames.filter(_.charAt(0) == first)
			.filter(_.charAt(horseNames.length - 1) == last).toList
	}

	def findHorsesByName(name: String): List[String] = {
		horseNames.filter(_.contains(name)).toList
	}

	def sortByName(): List[String] = {
		horseNames.sortBy(_.length).toList
	}

	def sortByNameDesc(): List[String] = {
		horseNames.sortBy(_.length).reverse.toList
	}

	def getHorseNameCount(): Int = {
		horseNames.size
	}

}