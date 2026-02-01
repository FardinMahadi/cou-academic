def f(x):
    return x**2 + x - 1

def bisection_method(a, b, n, tol = 1e-6):
    if f(a) * f(b) >= 0:
        print("Error: f(a) and f(b) must have opposite signs")
        return None

    for _ in range(n):
        c = (a + b) / 2

        if abs(f(c)) < tol:
            return c

        if f(a) * f(c) < 0:
            b = c
        else:
            a = c
    
    return c

a = float(input("Enter the first value: "))
b = float(input("Enter the second value: "))
try:
    n = int(input("Enter the number of iterations: "))
except ValueError:
    n = 100

print("\n--------------------------------")
print("Bisection Method Results:")
print("--------------------------------\n")

values = []
step = 0.1
x = a
while x <= b:
    values.append((x, f(x)))
    x += step

roots_found = []

for i in range(len(values) - 1):
    x1, fx1 = values[i]
    x2, fx2 = values[i+1]

    if fx1 * fx2 < 0:
        res = bisection_method(x1, x2, n)
        if res is not None:
            roots_found.append(res)
            print(f"Root approximation: {res:.6f}")
            print(f"f({res:.6f}) = {f(res):.6f}\n")

if not roots_found:
    print("No roots found in the given interval")