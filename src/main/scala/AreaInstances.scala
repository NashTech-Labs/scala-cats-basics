case class Rectangle(width: Double, length: Double)

case class Circle(radius: Double)

// Type class instances or implicit values are defined

object AreaInstances {
  implicit val rectangleArea: Area[Rectangle] = new Area[Rectangle] {
    def area(a: Rectangle): Double = a.width * a.length
  }

  implicit val circleArea: Area[Circle] = new Area[Circle] {
    def area(a: Circle): Double = Math.PI * (a.radius * a.radius)
  }
}
