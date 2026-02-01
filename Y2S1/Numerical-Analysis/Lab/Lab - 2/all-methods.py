import matplotlib.pyplot as plt

def f(x):
    return x**2 + x - 1

def df(x):
    """Derivative of f(x) = x² + x - 1"""
    return 2*x + 1

def bisection_method(a, b, iterations=50, tol=1e-6):
    if f(a) * f(b) >= 0:
        return None
    for _ in range(iterations):
        midpoint = (a + b) / 2
        
        if abs(f(midpoint)) < tol:
            return midpoint
        
        if f(a) * f(midpoint) < 0:
            b = midpoint  
        else:
            a = midpoint  
    
    return midpoint

def false_position_method(a, b, iterations=50, tol=1e-6):
    if f(a) * f(b) >= 0:
        return None
    for _ in range(iterations):
        c = (a * f(b) - b * f(a)) / (f(b) - f(a))
        
        if abs(f(c)) < tol:
            return c
        
        if f(a) * f(c) < 0:
            b = c
        else:
            a = c
    
    return c

def secant_method(x0, x1, iterations=50, tol=1e-6):
    for _ in range(iterations):
        if abs(f(x1) - f(x0)) < 1e-10:
            return None
        x2 = x1 - f(x1) * (x1 - x0) / (f(x1) - f(x0))
        
        if abs(x2 - x1) < tol:
            return x2
        
        x0 = x1
        x1 = x2
    
    return x2

def newton_raphson_method(x0, iterations=50, tol=1e-6):
    """Newton-Raphson method: x_{n+1} = x_n - f(x_n) / f'(x_n)"""
    x = x0
    for _ in range(iterations):
        fx = f(x)
        dfx = df(x)
        
        # Avoid division by zero
        if abs(dfx) < 1e-10:
            return None
        
        x_new = x - fx / dfx
        
        # Check for convergence
        if abs(x_new - x) < tol:
            return x_new
        
        x = x_new
    
    return x

print("Root Finding Methods")
print("1. Bisection Method")
print("2. False Position Method")
print("3. Secant Method")
print("4. Newton-Raphson Method")

choice = input("\nChoose method (1/2/3/4): ")
a = float(input("Enter first value: "))
b = float(input("Enter second value: "))
try:
    iterations = int(input("Enter number of iterations (default: 50): ") or "50")
except ValueError:
    iterations = 50

if choice == '1':
    method = bisection_method
    method_name = "Bisection"
elif choice == '2':
    method = false_position_method
    method_name = "False Position"
elif choice == '3':
    method = secant_method
    method_name = "Secant"
else:
    method = newton_raphson_method
    method_name = "Newton-Raphson"

x_values = []
y_values = []
x = a
step = 0.1
while x <= b:
    x_values.append(x)
    y_values.append(f(x))
    x += step

roots = []
for i in range(len(y_values) - 1):
    if y_values[i] * y_values[i + 1] < 0:
        # Newton-Raphson only needs one initial guess (use midpoint)
        if choice == '4':
            initial_guess = (x_values[i] + x_values[i + 1]) / 2
            root = method(initial_guess, iterations)
        else:
            root = method(x_values[i], x_values[i + 1], iterations)
        if root is not None:
            roots.append(root)

print(f"\n{method_name} Method Results:")
print(f"Found {len(roots)} root(s):")
for i, root in enumerate(roots, 1):
    print(f"  Root {i}: {root:.6f}, f({root:.6f}) = {f(root):.10f}")

plt.plot(x_values, y_values, 'b-', linewidth=2, label='f(x) = x² + x - 1')
plt.axhline(y=0, color='black', linestyle='--', linewidth=1)

if roots:
    root_y = [f(root) for root in roots]
    plt.scatter(roots, root_y, color='red', s=150, zorder=5, label='Roots')
    for i, root in enumerate(roots, 1):
        plt.annotate(f'Root {i}: {root:.4f}', 
                    xy=(root, 0), 
                    xytext=(10, 20 + i*15), 
                    textcoords='offset points',
                    bbox=dict(boxstyle='round', facecolor='yellow', alpha=0.7),
                    arrowprops=dict(arrowstyle='->', color='red'))

plt.xlabel('x')
plt.ylabel('f(x)')
plt.title(f'{method_name} Method - All Roots in [{a}, {b}]')
plt.legend()
plt.grid(True, alpha=0.3)
plt.show()  