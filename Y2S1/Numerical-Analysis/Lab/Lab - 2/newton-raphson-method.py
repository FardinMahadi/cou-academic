def f(x):
    return x**2 + x - 1

def df(x):
    """Derivative of f(x) = x² + x - 1"""
    return 2*x + 1

def newton_raphson_method(x0, n, tol=1e-6):
    """
    Newton-Raphson method: x_{n+1} = x_n - f(x_n) / f'(x_n)
    
    Parameters:
    x0: Initial guess
    n: Maximum number of iterations
    tol: Tolerance for convergence
    
    Returns:
    Root approximation or None if method fails
    """
    x = x0
    
    for _ in range(n):
        fx = f(x)
        dfx = df(x)
        
        # Avoid division by zero
        if abs(dfx) < 1e-10:
            return None
        
        x_new = x - fx / dfx
        
        # Check for convergence
        if abs(x_new - x) < tol:
            return x_new
        
        # Check if function value is close to zero
        if abs(fx) < tol:
            return x
        
        x = x_new
    
    return x

a = float(input("Enter the first value: "))
b = float(input("Enter the second value: "))
try:
    n = int(input("Enter the number of iterations: "))
except ValueError:
    n = 100

print("\n--------------------------------")
print("Newton-Raphson Method Results:")
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
    x2, fx2 = values[i + 1]

    # If sign changes, use midpoint as initial guess for Newton-Raphson
    if fx1 * fx2 < 0:
        initial_guess = (x1 + x2) / 2
        res = newton_raphson_method(initial_guess, n)
        if res is not None:
            # Avoid duplicate roots
            if not roots_found or min(abs(res - r) for r in roots_found) > 1e-5:
                roots_found.append(res)
                print(f"Root approximation: {res:.6f}")
                print(f"f({res:.6f}) = {f(res):.10f}\n")
   
if not roots_found:
    print("No roots found in the given interval")

