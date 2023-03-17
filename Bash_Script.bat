cd C:\Users\Admin\IdeaProjects\kodilla-course\build\libs
del *.jar
cd C:\Users\Admin\IdeaProjects\kodilla-course
call gradlew build
cd C:\Users\Admin\IdeaProjects\kodilla-course\build\libs
IF EXISTS *.jar (mkdir project copy *.jar project)
ELSE (echo compilation error)
