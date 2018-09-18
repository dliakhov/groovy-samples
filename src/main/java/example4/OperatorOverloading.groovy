package example4

class Fly {
    double weight

    Fly plus(Cutlet cutlet) {
        new Fly(weight: this.weight + cutlet.weight)
    }
}

class Cutlet {
    double weight

    Cutlet plus(Fly fly) {
        new Cutlet(weight: this.weight + fly.weight / 2)
    }

}
