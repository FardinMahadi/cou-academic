import math

def euclidean_distance():
    print("Enter the coordinates of the two points: ")

    p1 = (
        float(input("Enter x1: ")),
        float(input("Enter y1: "))
    )

    p2 = (
        float(input("Enter x2: ")),
        float(input("Enter y2: "))
    )

    x1, y1 = p1
    x2, y2 = p2

    diff_x = x2 - x1
    diff_y = y2 - y1

    distance = math.sqrt(diff_x**2 + diff_y**2)
    print(f"Distance: {distance}\n")

def grade_analyzer():
    print("Enter marks for 40 students:")
    marks = []

    lowest_mark = float('inf')
    highest_mark = float('-inf')

    result = {
        "lowest_mark": lowest_mark,
        "highest_mark": highest_mark,
        "average_mark": 0,
        "grade_count": {
            "A": 0,
            "B": 0,
            "C": 0,
            "D": 0,
            "F": 0,
        }
    }   

    for i in range(5):
        mark = float(input(f"Enter mark for student {i+1}: "))
        marks.append(mark)
        
        if mark < lowest_mark:
            lowest_mark = mark
        if mark > highest_mark:
            highest_mark = mark
        if mark > 80:
            result["grade_count"]['A'] = result["grade_count"]['A'] + 1
        elif mark > 70:
            result["grade_count"]['B'] = result["grade_count"]['B'] + 1
        elif mark > 60:
            result["grade_count"]['C'] = result["grade_count"]['C'] + 1
        elif mark >= 40:
            result["grade_count"]['D'] = result["grade_count"]['D'] + 1
        elif mark < 40:
            result["grade_count"]['F'] = result["grade_count"]['F'] + 1


    average_mark = sum(marks) / 5

    result["lowest_mark"] = lowest_mark
    result["highest_mark"] = highest_mark
    result["average_mark"] = average_mark

    print(result)
    print("\n")

running = True
while running: 
    print("\nWhich problem do you want to solve? If you want to exit, enter 0.")

    print("0. Exit")
    print("1. Euclidean Distance")
    print("2. Grade Analyzer")
    
    choice = int(input("Enter your choice: "))
    
    if choice == 1:
        euclidean_distance()
    elif choice == 2:
        grade_analyzer()
    elif choice == 0:
        print("\nGoodbye!")
        running = False
    else:
        print("Invalid choice")

