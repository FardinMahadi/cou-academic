def f(x):
    return x**3 - 6*x**2 + 11*x - 6

a = -5
b = 2
tolerance = 0.0001
iteration = 1

print("-----------------------------------------")
print("|Iter\t|a\t|b\t|c\t|f(c)\t|")
print("-----------------------------------------")

while (b - a) >= tolerance:
    c = (a + b) / 2

    print("|", iteration, "\t|", round(a,2), "\t|", round(b,2), "\t|", round(c,2), "\t|", round(f(c),2), "\t|")

    if f(c) == 0:
        break
    elif f(a) * f(c) < 0:
        b = c
    else:
        a = c

    iteration += 1

print("-----------------------------------------")
print("\nApproximate root is:", round(c,5))
