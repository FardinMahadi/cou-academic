import numpy as np
import matplotlib.pyplot as plt

class NewtonInterpolator:
    """Newton's divided difference interpolation."""

    def __init__(self, x, y):
        """
        Initialize with data points.

        Args:
            x: array of x-coordinates
            y: array of y-coordinates
        """
        self.x = np.asarray(x, dtype=float)
        self.y = np.asarray(y, dtype=float)

        if len(self.x) != len(self.y):
            raise ValueError("x and y must have the same length")

        self.n = len(self.x)
        self.coefficients = self._compute_divided_differences()

    def _compute_divided_differences(self):
        """Compute Newton's divided difference coefficients."""
        # Create divided difference table
        dd_table = np.zeros((self.n, self.n))
        dd_table[:, 0] = self.y

        for j in range(1, self.n):
            for i in range(self.n - j):
                dd_table[i, j] = (dd_table[i+1, j-1] - dd_table[i, j-1]) / \
                                  (self.x[i+j] - self.x[i])

        # First row contains the coefficients
        return dd_table[0, :]

    def __call__(self, z):
        """
        Evaluate the interpolating polynomial at point(s) z.

        Args:
            z: single value or array of values to interpolate

        Returns:
            Interpolated value(s)
        """
        z = np.asarray(z)
        scalar_input = z.ndim == 0
        z = np.atleast_1d(z)

        result = np.full_like(z, self.coefficients[0], dtype=float)

        for i in range(1, self.n):
            term = self.coefficients[i]
            for j in range(i):
                term *= (z - self.x[j])
            result += term

        return result.item() if scalar_input else result

    def plot(self, num_points=100, show_data=True):
        """Plot the interpolating polynomial and original data points."""
        x_plot = np.linspace(self.x.min(), self.x.max(), num_points)
        y_plot = self(x_plot)

        plt.figure(figsize=(10, 6))
        plt.plot(x_plot, y_plot, 'b-', label='Newton Interpolation', linewidth=2)

        if show_data:
            plt.plot(self.x, self.y, 'ro', markersize=8, label='Data Points')

        plt.xlabel('x', fontsize=12)
        plt.ylabel('y', fontsize=12)
        plt.title("Newton's Divided Difference Interpolation", fontsize=14)
        plt.legend()
        plt.grid(True, alpha=0.3)
        plt.show()


# Example usage
if __name__ == "__main__":
    # Data points
    x = np.array([0, 2, 4, 6, 8, 10], float)
    y = np.array([0, 1.5, 2, 2.5, 3, 3], float)

    # Create interpolator
    interpolator = NewtonInterpolator(x, y)

    # Interpolate at specific points
    z = [2.5, 4.5]
    result = interpolator(z)
    print(f"Interpolated values at {z}: {result}")

    # Can also interpolate single values
    print(f"Interpolated value at 5.0: {interpolator(5.0)}")

    # Plot with your original code
    step = 0.1
    x_list = np.arange(x[0], x[-1]+0.1, step).tolist()
    y_list = interpolator(x_list)
    fig = plt.figure(figsize=(8, 8), dpi=75)
    font1 = {'color':'blue','size':15}
    plt.scatter(x, y, marker='*', c='purple', s=250)
    plt.plot(x_list, y_list, 'b-')
    plt.xlabel('X', fontsize=12)
    plt.ylabel('Function', fontsize=12)
    plt.title('Newton Interpolation Method', fontdict=font1, loc='left')
    plt.grid(color='gray', linestyle='--', linewidth=0.5)
    plt.legend(['Interpolation', 'Data'], loc="lower right")
    plt.show()
