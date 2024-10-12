This is my springboot back end React front end web app. Using a MySQL data base it allows user account creation and guides them through the app based on their role permissions.

The implementation idea for this project is similar to a feed platform like instagram/twitter. 

The planned version iteratinos for this project are currently:
1. Implement a Jwt based RBAC system where users are verified after creating an account and loggin and served a different homepage depending on their subscription status.
2. Implement a feed system which serves the user content and allows unlimited viewing if subscriber or serves simulated ads if the user is not a subscriber.
3. Implement a basic KNN algorithm to determine what content to serve a user based off of the friends they have. 
