# Lionel Lynch
# Objects.py
# Examples of classes and Object interacting 

# Example 1:
class Students:
    def __init__(self, name, age, grade):
        self.name = name
        self.age = age
        self.grade = grade
    
    def giveName(self):
        return self.name 
    
    def getGrade(self):
        return self.grade

class Course:
    def __init__(self, name, maxStudents):
        self.name = name 
        self.maxStudents = maxStudents
        self.studentsList = []

    def addStudent(self, student):
        if len(self.studentsList) < self.maxStudents:
            self.studentsList.append(student)
            print(f"{student.giveName()}, you are now enrolled in {self.name}.\n")
        else: 
            print(f"{student.giveName()}, {self.name} has reach max capacity.\n") 

    def averageGrade(self):
        value = 0
        for student in self.studentsList:
            value += student.getGrade()

        return value / len(self.studentsList)

s1 = Students('Clark', 29, 89)
s2 = Students('Tom', 20, 93)
s3 = Students('Harry', 19, 98)

course1 = Course('Calculus', 2)
course2 = Course('Physics', 3)

# course1.addStudent(s1)
# course2.addStudent(s1)

# course1.addStudent(s2)
# course2.addStudent(s2)

# course1.addStudent(s3)
# course2.addStudent(s3)


# Example 2:
class Pet:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def show(self):
        print(f'My name is {self.name} I am {self.age} years old.\n')

    def speak(self):
        print("I can't speak.\n")
    
class Cat(Pet):
    def __init__(self, name, age, color):
        super().__init__(name, age)
        self.color = color 
    
    def speak(self):
        print('Meow\n')

class Dog(Pet):
    def __init__(self, name, age, color):
        super().__init__(name, age)
        self.color = color 
    
    def speak(self):
        print('Bark\n')

class Fish(Pet):
    pass

d = Dog('Scobby', 8, "Brown")
d.speak()
d.show()

c = Cat('Tom', 7, 'Grey')
c.speak()
c.show()

f = Fish('Nemo', 2)
f.speak()
f.show()
