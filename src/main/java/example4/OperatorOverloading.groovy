package example4

class Fly {
    double weight

    Fly plus(Cutlet cutlet) {
        new Fly(weight: this.weight + cutlet.weight)
    }
}

class Cutlet {
    double weight

    Fly plus(Fly fly) {
        new Fly(weight: this.weight + fly.weight / 2)
    }

}
