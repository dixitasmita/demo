**Bugs**

1.
**Summary**: There is not validation on the Zip/postal code 
**Description**: When try to register as new user, while providing the details, user is able to resgister 
by add fake/invalid details

**Steps**: 
1. Open the site
2. CLick on create a account
3. Provide the email and other deatils
4. While adding the profile details add "test" in the postal code and register

**Actual Result**: 
User is registered

**Expected Result**: 
As we are validating a user, its location should also be validated.


2.
**Summary**: User still navigate to side by adding false card details
**Description**: By passing false card details user can bypass the screen and can navigate/view
other pages of the application

**Test Data**:

Card number : 4032031009355545 

Expiry date : 10/2024 

CVC code : 217


**Steps**:
1. Open the site
2. Login with valid account
3. Add dummy visa card details
4. Click on cancel pop-up button after closing the popup

**Actual Result**:
User is able to navigate the home screen

**Expected Result**:
User should be stricktly blocked to view other section of site until he/she deposit the amount


