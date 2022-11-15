package item1

interface Element {
    val active: Boolean
}

class ActualElement: Element {
    override var active: Boolean = false
}