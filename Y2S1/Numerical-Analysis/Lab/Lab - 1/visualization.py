import numpy as np  # type: ignore
import matplotlib.pyplot as plt  # type: ignore
from mpl_toolkits import mplot3d  # type: ignore  
import matplotlib.animation as animation  # type: ignore

n = 1000
x = np.linspace(0, 6*np.pi, n)
y = np.sin(x)

# Initialize the figure
fig, ax = plt.subplots()
ax.set_xlim(0, 6*np.pi)
ax.set_ylim(-1.5, 1.5)
ax.set_xlabel("x")
ax.set_ylabel("sin(x)")
ax.set_title("Red circle following a blue sine wave")

# Plot the sine wave
sine_line, = ax.plot(x, y, "b", linewidth=2, label="sin(x)")
# Initialize the red circle
red_circle, = ax.plot([], [], "ro", markersize=10, label="Moving point")
ax.legend()
ax.grid(True, alpha=0.3)

# Animation function
def animate(frame):
    x0 = x[frame]
    y0 = y[frame]
    red_circle.set_data([x0], [y0])  # Update circle position
    return red_circle,

# Create animation (no FFmpeg required)
anim = animation.FuncAnimation(fig, animate, frames=n, interval=20, blit=True, repeat=True)

plt.tight_layout()
plt.show()
