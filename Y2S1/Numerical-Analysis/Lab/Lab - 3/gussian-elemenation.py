def forward_elimination(A, b):
    n = len(A)
    for k in range(n - 1):
        for i in range(k + 1, n):
            factor = A[i][k] / A[k][k]
            b[i] = b[i] - factor * b[k]
            for j in range(k, n):
                A[i][j] = A[i][j] - factor * A[k][j]
    return A, b

def backward_substitution(A, b):
    n = len(A)
    x = [0.0] * n
    
    if abs(A[n - 1][n - 1]) < 1e-10:
        return None
    
    x[n - 1] = b[n - 1] / A[n - 1][n - 1]

    for i in range(n - 2, -1, -1):
        if abs(A[i][i]) < 1e-10:
            return None
        sum_value = b[i]
        for j in range(i + 1, n):
            sum_value = sum_value - A[i][j] * x[j]
        x[i] = sum_value / A[i][i]
    return x

def gaussian_elimination(A, b):
    A_copy = [row[:] for row in A]
    b_copy = b[:]

    A_upper, b_modified = forward_elimination(A_copy, b_copy)

    solution = backward_substitution(A_upper, b_modified)
   
    return solution

n = int(input("Enter the number of equations: "))
print(f"\nEnter the coefficient matrix A ({n}x{n}):")
A = []
for i in range(n):
    row_input = input(f"Row {i + 1}: ").split()
    row = [float(x) for x in row_input]
    A.append(row)

print(f"\nEnter the constant vector b ({n} values):")
b_input = input("b: ").split()
b = [float(x) for x in b_input]

solution = gaussian_elimination(A, b)

if solution is None:
    print("\nSolution not found")
else:
    print("\nSolution:")
    for i, x_val in enumerate(solution, 1):
        print(f"x{i} = {x_val:.3f}")