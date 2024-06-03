
a = 1
b = 2
c = 17


if a + b > c and a + c > b and b + c > a:
    # ob gleichseitig
    if a == b == c:
        print("\ngleichseitig")
    # ob gleichschenklig
    elif a == b or b == c or a == c:
        print("\ngleichschenklig")
    # ob ungleichschenklig
    else:
        print("\nungleichseitig")
else:
    print("\nDie gegebene Seitenlaengen bilden kein Dreieck.")