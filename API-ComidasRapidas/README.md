# API-ComidasRapidas

REST API for managing a fast food business. Handles products, menus, orders, payments, and users.

## Technologies

- **Java 17**
- **Spring Boot 4.0.0**
- **Spring Data MongoDB**
- **Lombok**
- **MapStruct**
- **Hibernate Validator**
- **Springdoc OpenAPI (Swagger UI)**
- **JaCoCo** (test coverage)
- **SonarQube** (code quality analysis)

## Requirements

- Java 17+
- Maven 3.8+
- MongoDB (local or remote instance)

## Configuration

The application requires the `MONGODB_URI` environment variable with the MongoDB connection URI:

```bash
# MongoDB Atlas example
MONGODB_URI=mongodb+srv://<user>:<password>@cluster.mongodb.net/fastfood

# Local example
MONGODB_URI=mongodb://localhost:27017/fastfood
```

## Running the Application

```bash
# Clone the repository
git clone <repository-url>
cd API-ComidasRapidas

# Run with Maven
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8080`.

Interactive documentation (Swagger UI) will be at `http://localhost:8080/swagger-ui.html`.

## Endpoints

All resources expose standard CRUD operations:

| Method   | Path              | Description                  |
|----------|-------------------|------------------------------|
| GET      | `/{resource}`     | List all records             |
| GET      | `/{resource}/{id}`| Get a record by ID           |
| POST     | `/{resource}`     | Create a new record          |
| PUT      | `/{resource}/{id}`| Update a record              |
| DELETE   | `/{resource}/{id}`| Delete a record              |

### Available Resources

| Resource  | Base Path   |
|-----------|-------------|
| Products  | `/product`  |
| Menus     | `/menu`     |
| Orders    | `/order`    |
| Payments  | `/payment`  |
| Users     | `/user`     |

## Models

### Product
| Field         | Type        | Description                              |
|---------------|-------------|------------------------------------------|
| `id`          | String      | Unique identifier                        |
| `name`        | String      | Product name                             |
| `description` | String      | Description                              |
| `type`        | ProductType | `HAMBURGUER`, `DRINK`, `ACCOMPANIMIENTS` |
| `price`       | BigDecimal  | Price                                    |

### Menu
| Field      | Type            | Description         |
|------------|-----------------|---------------------|
| `id`       | String          | Unique identifier   |
| `products` | List\<Product\> | List of products    |

### Order
| Field          | Type            | Description         |
|----------------|-----------------|---------------------|
| `id`           | String          | Unique identifier   |
| `customerName` | String          | Customer name       |
| `products`     | List\<Product\> | Ordered products    |

### Payment
| Field    | Type           | Description                 |
|----------|----------------|-----------------------------|
| `id`     | String         | Unique identifier           |
| `method` | PaymentMethods | `CARD`, `CASH`, `TRANSFER`  |
| `amount` | BigDecimal     | Payment amount              |

### User
| Field   | Type           | Description              |
|---------|----------------|--------------------------|
| `id`    | String         | Unique identifier        |
| `name`  | String         | User name                |
| `email` | String         | Unique email             |
| `phone` | String         | Phone number             |
| `order` | List\<String\> | Associated order IDs     |
| `role`  | UserRole       | `ADMIN`, `CLIENT`        |

## Tests

```bash
./mvnw test
```

The JaCoCo coverage report is generated at `target/site/jacoco/index.html`.

## Project Structure

```
src/
└── main/
    └── java/edu/dosw/api/
        ├── controller/          # REST controllers
        ├── service/             # Service interfaces
        │   └── Implementation/  # Service implementations
        ├── repository/          # MongoDB repositories
        ├── model/
        │   ├── entity/          # Entities and enums
        │   └── dtos/            # Request and response DTOs
        ├── mapper/              # MapStruct mappers
        └── exception/           # Global exception handling
```

## Author

**Julian Lopez**
