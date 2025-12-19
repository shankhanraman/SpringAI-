package com.example.neo4j.spring_boot_neo4j.repositories;

import com.example.neo4j.spring_boot_neo4j.models.Course;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import java.util.Optional;

@EnableNeo4jRepositories
public interface CourseRepository extends Neo4jRepository<Course,Long> {
    Optional<Course> findCourseByIdentifier(String identifier);
}
