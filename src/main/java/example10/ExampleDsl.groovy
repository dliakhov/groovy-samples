package example10

def show = {println it}
def square_root = { Math.sqrt(it) }

def please(action) {
    [the: { what ->
        [of: {action(what(it))}]
    }]
}


please show the square_root of 100
