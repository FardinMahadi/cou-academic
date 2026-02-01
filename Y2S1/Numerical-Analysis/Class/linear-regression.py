import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression

# 1. Expanded Dataset: Hours Worked vs Coffee Consumption (ml)
X = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]).reshape(-1, 1)
y = np.array([20, 30, 55, 70, 85, 100, 140, 115, 150, 165])

# X = np.array([3, 2, 5, 7, 8]).reshape(-1, 1)
# y = np.array([55, 30, 85, 140, 115])


# 2. Train the model
model = LinearRegression()
model.fit(X, y)

# Extract b0 (Intercept) and b1 (Slope)
b0 = model.intercept_
b1 = model.coef_[0]

# 3. Predict values for the line
y_pred = model.predict(X)

# 4. Visualization
plt.figure(figsize=(12, 8))

# Set limits early so the threshold line calculation works correctly
plt.xlim(0, 11)
plt.ylim(0, 180)

# Scatter plot of actual data
plt.scatter(X, y, color='blue', s=80, zorder=5, label='Actual Data')

# Regression Line using b0 and b1
plt.plot(X, y_pred, color='red', linewidth=2.5, 
         label=f'Line: $y = {b0:.2f} + {b1:.2f}x$')

# 5. Add horizontal thresholds (from Y-axis to each specific X point)
for i in range(len(X)):
    # Calculate xmax as a fraction of the current axis range (0.0 to 1.0)
    xmin_val, xmax_val = plt.xlim()
    xmax_fraction = (X[i][0] - xmin_val) / (xmax_val - xmin_val)
    
    plt.axhline(y=y[i], color='gray', linestyle='--', alpha=0.4, xmax=xmax_fraction)
    plt.text(xmin_val, y[i], f' {y[i]}ml', color='gray', va='bottom', fontsize=9)

# 6. Explicitly show b0 and b1 on the chart
plt.text(0.5, 165, f'$b_0$ (Intercept) = {b0:.2f}', fontsize=12, color='darkgreen', 
         bbox=dict(facecolor='white', alpha=0.8))
plt.text(0.5, 155, f'$b_1$ (Slope) = {b1:.2f}', fontsize=12, color='darkred', 
         bbox=dict(facecolor='white', alpha=0.8))

# Formatting
plt.title('Coffee Consumption: Linear Regression with Specific Thresholds', fontsize=14)
plt.xlabel('Hours Worked (X)')
plt.ylabel('Coffee Consumption in ml (y)')
plt.legend(loc='lower right')
plt.grid(True, linestyle=':', alpha=0.3)

plt.tight_layout()
plt.show()

# Print mathematical results
print(f"Intercept (b0): {b0:.2f}")
print(f"Slope (b1): {b1:.2f}")
print(f"Regression Equation: y = {b0:.2f} + {b1:.2f}x")