# CGPA Calculator using JAVA

This is a CGPA calculator desiged using Java.
My aim is to use this project to show my front end skill.

***This doc is still in progress***

## Table of contents
  
  - [Challenges Faced](#the-challenge)
  - [Screenshot](#screenshot)
  - [Links](#links)
  - [Built with](#built-with)
  - [Author](#author)
  - [Acknowledgments](#acknowledgments)

### The challenge

Users should be able to:

- I got this error when I tried to use the multi-constant case labels `Multi-constant case labels supported from Java 14 onwards only` then I installed the latest jdk by following the instructions in [this video](https://www.youtube.com/watch?v=p-H7Q9PtSc8), then I have to set the.

- using loop to prompt user using scanner doesn't work  eg: 
```java
    for (int currentCourse = 0; currentCourse < maxSemesterCourseCount; currentCourse++) {
      System.out.println("current course = " + currentCourse);
      currentCourseSerialNumber = currentCourse + 1;
      System.out.println("What is course " + currentCourseSerialNumber + " code?");
      courseCode = scannerInput.nextLine();
      System.out.println(courseCode);
    }
```

- In the function below, the line `contOrStop = scannerInput.nextLine();` wasn't working because it was preceded by `student1.scorePercentage[currentCourseIndex] = scannerInput.nextInt();`in the function just befor it. For the `scannerInput.nextInt();` to work, I had to add `scannerInput.nextLine();` to Consume the new line left-over by the `student1.scorePercentage[currentCourseIndex] = scannerInput.nextInt();`
```Java
  private static void areYouDoneAddingCourse() {
    // Prompt user to keep adding course or stop adding course
    System.out.println("Press A to another Course or E to stop adding courses ");
    contOrStop = scannerInput.nextLine();
    System.out.println("contOrStop == " + contOrStop);
    keepAddingCourse = (contOrStop.equals("e") || contOrStop.equals("E")) ? false : true;
  }
``` 
more of it was explained in this [stack overflow post](https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo#:~:text=That's%20because%20the%20Scanner.,behaviour%20when%20you%20use%20Scanner.)


### Screenshot

![](./images/My-four-card-Screenshot.png)


### Built with

- Java 
- 

## Author

- LinkedLn Profile - [Lawal Hamzat Ademola](https://www.linkedin.com/in/hamzat-lawal-a88404239)

- E-Mail- [mrlawalhamzat@gmail.com](mrlawalhamzat@gmail.com)


## Acknowledgments
Thanks to my Parent, Wife and siblings for always being supportive.
