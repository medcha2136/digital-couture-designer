# Digital Couture Designer

A web application for designing and customizing outfits digitally.

## Features
- User login (phone-based)
- Create new designs
- Save measurements
- View design history

## Tech Stack
- Frontend: HTML, CSS, JavaScript
- Backend: Spring Boot
- Database: PostgreSQL

## Setup
1. Run backend:
   ./mvnw spring-boot:run
2. Open frontend login.html

## Future Enhancements
- Image-based design search
- AI recommendations
- Cart & order system

## API Endpoints

POST /auth/login
Body:
{ "phone": "string" }

POST /designs
Body:
{ "fabric": "string", "color": "string", "userId": number }

GET /designs/{userId}

POST /measurements
Body:
{ "chest": "", "waist": "", "hip": "", "userId": number }
