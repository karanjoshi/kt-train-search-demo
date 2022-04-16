val trainDepartureTime = mapOf(
        "train 1" to "11:30",
        "train 2" to "10:30",
        "train 3" to "11:30",
)
val trainSources = mapOf(
        "train 1" to "Mumbai",
        "train 2" to "Surat",
        "train 3" to "Surat"
)
val trainDestinations = mapOf(
        "train 1" to "Surat",
        "train 2" to "Delhi",
        "train 3" to "Delhi"
)


fun main(args: Array<String>) {
    if (args.isEmpty() || args.size < 2)
        throw IllegalArgumentException("Pass input in following format <filterType> <filterValue>" +
                "\nName <train>" +
                "\nDepartureTime hh:mm" +
                "\nSource <city>" +
                "\nDestination <city>")

    val filterType = args[0]
    val filterInput = args[1]

    when (filterType) {
        "Name" -> filterByName(filterInput)
        "Source" -> filterBySource(filterInput)
        "Destination" -> filterByDestination(filterInput)
        "DepartureTime" -> filterByDepartureTime(filterInput)
        else -> throw UnsupportedOperationException("filterType \"$filterType\" not supported")
    }
}

private fun showTrainDetailsByName(name: String) {
    println("<$name>\n${trainSources[name]} <==> ${trainDestinations[name]}\n" +
            "Departure Time: ${trainDepartureTime[name]}")
}

fun filterByName(name: String) {
    if (!trainSources.containsKey(name))
        throw Exception("No trains found with name $name")
    showTrainDetailsByName(name)
}

fun filterBySource(source: String) {
    val trains = trainSources.filter { it.value == source }
    if (trains.isEmpty())
        throw Exception("No trains found from $source")
    trains.forEach {
        showTrainDetailsByName(it.key)
    }
}


fun filterByDestination(destination: String) {
    val trains = trainDestinations.filter { it.value == destination }
    if (trains.isEmpty())
        throw Exception("No trains found to $destination")
    trains.forEach {
        showTrainDetailsByName(it.key)
    }
}

fun filterByDepartureTime(departureTime: String) {
    val trains = trainDepartureTime.filter { it.value == departureTime }
    if (trains.isEmpty())
        throw Exception("No trains found which departs at $departureTime")
    trains.forEach {
        showTrainDetailsByName(it.key)
    }
}