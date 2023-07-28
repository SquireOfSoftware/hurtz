docker run --name main-db -e POSTGRES_PASSWORD=docker -p 5432:5432 -d postgres
docker run --name quartz-db -e POSTGRES_PASSWORD=docker -p 5433:5432 -d postgres
