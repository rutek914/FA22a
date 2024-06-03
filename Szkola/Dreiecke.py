
a = 5
b = 5
c = 5


if a + b > c and a + c > b and b + c > a:
    # ob gleichseitig
    if a == b == c:
        print("gleichseitig")
    # ob gleichschenklig
    elif a == b or b == c or a == c:
        print("gleichschenklig")
    # ob ungleichschenklig
    else:
        print("ungleichseitig")
else:
    print("Die gegebene Seitenlaengen bilden kein Dreieck.")
