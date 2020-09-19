# Restaurant System

## Problem Statement:
Design and implement the services and their interfaces of a restaurant. What changes (services and interfaces) would you introduce to make the restaurant a more viable business during the Pandemic. Illustrate your design showing the services as a diagram and commit a skeleton implementation to your account in github.com
___
## Dine-in Process:
User interaction journey look like for Dine-in: ![Restaurant System Existing User](images/Dine-in.png)

Assumption: All the existing API which I have listed below are capable to support dine-in options.

## After Pandemic:
After pandemic restaurant can offer two other options:
1) Order pickup
2) Order Delivery

To accommodate the above options we can provide addition above two options to select the delivery method. Update restaurant web application to allow place order online as well by using below mention apis.

___
## Propose solution for online orders:

As soon as user visit the restaurant web application user can login to their account or place an order as guest user. 
There are two kind of users
1) Restaurant User
2) Guest User 
____
### Existing Restaurant User Flow
![Restaurant System Existing User](images/Restaurent-order-process-existing-user.png)
____
### Guest User Flow
![Restaurant System Guest User](images/Restaurent-order-process-guest-user.png)
____
### Service interaction design
![Service interaction design](images/service-interaction.png)

____
### Service API information
![Service API information](images/apis.png)

