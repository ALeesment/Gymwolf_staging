## Estimation
Will be submitted before friday 18.12.2020 noon.

## Managing project QA  processes
- a)
    - Start testing in early stages of development
    - Make a list of requirements
    - Assess, what kind of testing is needed (is automated tests needed/in scope etc)
    - Analyze appeared problems (if there are deeper issues)
    - Keep focus on improving the quality
    - Involve users as soon as possible
    - Constant monitoring for application behavior
    - Analyze users feedback
    
 - b)
    - The best practise for this is to contact with product owner/analyst.
    Product owner or analyst has best overview of the application, because most likely
    this person has written the requirements, knows the user flow and use cases.
    - Second solution is to get acquainted with development documentation - analysis,
    architecture, api-docs etc.
    - Third possible solution is similar to second one. In development process is most likely
    used some kind of issue tracking application. Combined with exploratory testing can 
    give a good overview of the application.  
      
## Session based exploratory testing
- Charter. 
  - Testing workout generation/marking related functionality
- Area tested
  - Almost full application functionality. Not included: Report a problem, 
    send feedback, "Get this trainer" functionality, Chat
- Notes on how testing was conducted.
  - Application download
  - Create user
    - Add e-mail, password and other params
  - Create new workout
    - Add params, add exercise, add exercise params nad notes, save
      - Add exercise: select exercise group - > select exercise group -> add params
  - Create new workout plan
- A list of any bugs found.
  - Add exercise -> add "reps" -> after first number entry, cursor/entering
    jumps to new line and generates new set. For double digit reps, need to
    navigate back previous set lane. Should let enter a 2 or 3-digit number to
    "Reps" column.
  - When adding new exercise and adding sets, "copy last set" generates an empty line.
  - Empty "set", under "sets & reps", delete button does not work.
- A list of issues
  - Some exercises don't have pictures
  - In abdominal workout section, there's duplicate exercise for sit-ups
  - In personal trainer selection, there is a trainer named "Gymwolf user"
  - Creating workplan is not located user friendly or logically. Found this only once. 
- Percentage of the session spent on the charter vs investigating new opportunities.
  - 90%/10%
- Percentage of the session spent on:
    - Testing - creating and executing tests.
      - 80 %
    - Bug investigation / reporting. 
      - 17%
    - Session setup or other non-testing activities.
      - 3%
- Session Start time: 17.12.2020 23:00, duration: 2.5 hours. 


## Automated tests

Created few simple tests. Covered user creation and checking 
if exercises are present. Used TestNG, Selenium in Gradle Java project
for creating tests.
 - Problems
    - UI is not automation friendly
        - Elements lack of attributes 
            - It is good practise to add attributes to elements. Code is
            more readable, automation is more effective (shorter code and
              simpler locators). For example for accessibility elements should 
              be named. Accessibility is one branch of performance testing. For
              automation setting id's for elements are probably the best solution,
              because other attributes might change in dev process. Sometimes setting 
              id's for attributes is not possible/reasonable.

## Feedback

I really liked the assignment, because I did not know what to expect.
Automation was challenging, because lack of attributes on elements. It
was difficult to focus on writing code, when I see an issue, that can be 
fixed or improved. This is why I enjoyed this task the most, and the least.
Initial estimation matched actual time spent.
To be honest, I wouldn't remove anything. I believe this assignment gives
a good overview about the candidate. Maybe would add a discussion about appeared
issues.