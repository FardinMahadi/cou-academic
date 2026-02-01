def f(x):
    return x**2 + x - 1

def secent_method(x0, x1, n, tol = 1e-6):
    for _ in range(n):
        x2 = x1 - (f(x1) * ((x1 - x0) / (f(x1) - f(x0))))

        if abs(x2 - x1) < tol:
            return x2
            
        x0 = x1
        x1 = x2
        
    return x2

a = float(input("Enter the first value: "))
b = float(input("Enter the second value: "))
try:
    n = int(input("Enter the number of iterations: "))
except ValueError:
    n = 100

print("\n--------------------------------")
print("Secent Method Results:")
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
        res = secent_method(x1, x2, n)
        if res is not None:
            roots_found.append(res)
            print(f"Root approximation: {res:.6f}")
            print(f"f({res:.6f}) = {f(res):.6f}\n")
   
if not roots_found:
    print("No roots found in the given interval")