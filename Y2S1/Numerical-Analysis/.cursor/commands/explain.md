# /explain {topic} Command for Numerical Analysis

The `/explain {topic}` command provides clear and concise explanations for various topics in numerical analysis. Its goal is to facilitate self-learning with simple examples, best practices, and effective formatting.

## Usage

```
/explain {topic}
```

- Replace `{topic}` with the concept or method you wish to learn about (e.g., Gaussian Elimination).

When invoked, the command returns:

- An introduction to the topic
- Simple, well-formatted explanations and examples
- Best practices and useful guidelines
- Additional resources or web-sourced content (if needed)

## Explanation Format

All responses from `/explain` should be structured as follows:

1. **Introduction**

   - Provide a brief overview and significance of the topic.

2. **Simple Example(s)**

   - Illustrate the core concept with concise, step-by-step code or mathematical examples (in Python or pseudocode when possible).
   - Use proper formatting for code and equations.

3. **Best Practices / Notes**

   - Share tips, common pitfalls, and practical advice.

4. **References and Further Reading**
   - List additional resources or textbook pages (if available), and links if web content is included.

---

## Sample Command Usage

### Example 1: Gaussian Elimination

```
/explain Gaussian Elimination
```

**Expected Output**

1. **Introduction**  
   Gaussian Elimination is an algorithm to solve systems of linear equations. It systematically reduces the system to row-echelon form and performs back-substitution.

2. **Simple Example**  
   _Solve: 2x + 3y = 8, 3x + 4y = 11_

```python
# Augmented Matrix
A = [[2, 3, 8],
     [3, 4, 11]]
# Step 1: Make leading coefficient `1` in Row 1 (divide by 2)
# Step 2: Eliminate x in Row 2
# Step 3: Back-substitute for y, then x
```

3. **Best Practices / Notes**

- Watch for division by zero.
- Pivot rows if needed for numerical stability.

4. **References and Further Reading**

- Any basic Numerical Analysis textbook, chapter on Linear Systems.

---

### Example 2: Newton’s Method

```
/explain Newton's Method
```

**Expected Output**

1. **Introduction**  
   Newton’s Method is an iterative technique to approximate roots of a real-valued function.

2. **Simple Example**  
   _Find a root of f(x) = x² - 2 starting at x₀ = 1._

```python
def f(x): return x**2 - 2
def df(x): return 2*x
x = 1
for _ in range(5):
    x = x - f(x)/df(x)
    print(x)
```

3. **Best Practices / Notes**

- Choose starting value close to the root.
- Ensure derivative isn’t zero.

4. **References**

- Textbook, section on Nonlinear Equations.

---

## Automatic Web Search

If the explanation or examples for a topic are not comprehensive or clear enough, the `/explain` command will automatically search the internet for additional explanations, code snippets, diagrams, or video links relevant to the requested concept.

When web resources are used, the answer will cite the sources or include hyperlinks directly in the response, merged seamlessly with the original formatted output.

---
