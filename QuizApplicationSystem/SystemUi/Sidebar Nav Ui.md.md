# Sidebar Navigation Panel

The Sidebar Navigation Panel serves as the main navigation area after user login.

The sidebar will be a Swing JPanel containing navigation buttons, styled through the shared Java theme. Its controller exposes destinations for the signed-in role and switches workspace panels with CardLayout. Services must independently enforce authorization.

The system consists of three user panels:

## 1. Administrator Panel

### Navigation Menu:
- Dashboard
- Student Management
- Teacher Management
- Quiz Management
- Subject/Category Management
- Reports
- Results
- Account Management
- Logout

### Panel Size:
- **Resizable; opens up to 1440x900 pixels within the screen work area**

---

## 2. Teacher Panel

### Navigation Menu:
- Dashboard
- Create Quiz
- Assigned Subjects
- Student Results
- Quiz Statistics
- Profile
- Logout

### Panel Size:
- **Resizable; opens up to 1440x900 pixels within the screen work area**

---

## 3. Student Panel

### Navigation Menu:
- Dashboard
- Available Quizzes
- Take Quiz
- Quiz Results
- Profile
- Logout

### Panel Size:
- **Resizable; opens up to 1440x900 pixels within the screen work area**
