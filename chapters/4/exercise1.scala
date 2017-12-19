// setup a map of prices for a number of gizmos that u covet.
// then setup a second map with the same keys and the prices at a 10% discount

val gizmos = Map("mac" -> 2500, "vinly-plyr" -> 450, "balenciaga" -> 720, "thousand" -> 1000)

val gizmoKeys = gizmos.keys
val discountedValues = gizmos.values.map(_ * .9)

val discountedGizmos = gizmoKeys.zip(discountedValues).toMap
