def find_pivot_row(A, start_row, col):
    n = len(A)
    max_val = abs(A[start_row][col])
    pivot_row = start_row
    
    for i in range(start_row + 1, n):
        if abs(A[i][col]) > max_val:
            max_val = abs(A[i][col])
            pivot_row = i
    
    return pivot_row

def swap_rows(A, b, row1, row2):
    A[row1], A[row2] = A[row2], A[row1]
    b[row1], b[row2] = b[row2], b[row1]

def forward_elimination_to_echelon(A, b):
    n = len(A)
    m = len(A[0])
    
    pivot_row = 0
    for col in range(min(n, m)):
        pivot_row_idx = find_pivot_row(A, pivot_row, col)
        
        if pivot_row_idx != pivot_row:
            swap_rows(A, b, pivot_row, pivot_row_idx)
        
        if abs(A[pivot_row][col]) < 1e-10:
            continue
        
        for i in range(pivot_row + 1, n):
            if abs(A[i][col]) > 1e-10:
                factor = A[i][col] / A[pivot_row][col]
                b[i] = b[i] - factor * b[pivot_row]
                for j in range(col, m):
                    A[i][j] = A[i][j] - factor * A[pivot_row][j]
        
        pivot_row += 1
        if pivot_row >= n:
            break
    
    return A, b

def backward_elimination_to_reduced(A, b):
    n = len(A)
    m = len(A[0])
    
    for i in range(n - 1, -1, -1):
        pivot_col = -1
        for j in range(m):
            if abs(A[i][j]) > 1e-10:
                pivot_col = j
                break
        
        if pivot_col == -1:
            continue
        
        pivot_val = A[i][pivot_col]
        if abs(pivot_val) > 1e-10:
            b[i] = b[i] / pivot_val
            for j in range(pivot_col, m):
                A[i][j] = A[i][j] / pivot_val
        
        for k in range(i - 1, -1, -1):
            if abs(A[k][pivot_col]) > 1e-10:
                factor = A[k][pivot_col]
                b[k] = b[k] - factor * b[i]
                for j in range(pivot_col, m):
                    A[k][j] = A[k][j] - factor * A[i][j]
    
    return A, b

def reduced_echelon_form(A, b):
    A_copy = [row[:] for row in A]
    b_copy = b[:]
    
    A_echelon, b_echelon = forward_elimination_to_echelon(A_copy, b_copy)
    
    A_reduced, b_reduced = backward_elimination_to_reduced(A_echelon, b_echelon)
    
    return A_reduced, b_reduced

def print_matrix(A, b, title="Matrix"):
    print(f"\n{title}:")
    print("-" * 50)
    n = len(A)
    m = len(A[0])
    
    for i in range(n):
        row_str = "["
        for j in range(m):
            row_str += f"{A[i][j]:8.3f} "
        row_str += f"| {b[i]:8.3f}]"
        print(row_str)
    print("-" * 50)

n = int(input("Enter the number of equations: "))
m = int(input("Enter the number of variables: "))

print(f"\nEnter the coefficient matrix A ({n}x{m}):")
A = []
for i in range(n):
    row_input = input(f"Row {i + 1}: ").split()
    row = [float(x) for x in row_input]
    A.append(row)

print(f"\nEnter the constant vector b ({n} values):")
b_input = input("b: ").split()
b = [float(x) for x in b_input]

print("\nOriginal Augmented Matrix [A|b]:")
print_matrix(A, b, "Original")

A_reduced, b_reduced = reduced_echelon_form(A, b)

print("\nReduced Row Echelon Form [R|b']:")
print_matrix(A_reduced, b_reduced, "Reduced Echelon Form")
        
print("\nAnalysis:")
n = len(A_reduced)
m = len(A_reduced[0])
rank_A = 0
rank_Ab = 0

for i in range(n):
    row_has_pivot = False
    for j in range(m):
        if abs(A_reduced[i][j]) > 1e-10:
            row_has_pivot = True
            break
    if row_has_pivot:
        rank_A += 1
    if row_has_pivot or abs(b_reduced[i]) > 1e-10:
        rank_Ab += 1

print(f"Rank of A: {rank_A}")
print(f"Rank of [A|b]: {rank_Ab}")

if rank_A < rank_Ab:
    print("No solution exists (system is inconsistent)")
elif rank_A == m:
    print("Unique solution exists:")
    solution = []
    for i in range(min(n, m)):
        if abs(A_reduced[i][i]) > 1e-10:
            solution.append(b_reduced[i])
    for i, x_val in enumerate(solution, 1):
        print(f"x{i} = {x_val:.6f}")
else:
    print(f"Infinitely many solutions exist ({m - rank_A} free variables)")

