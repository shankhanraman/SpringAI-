package com.example.neo4j.spring_boot_neo4j.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface LessonRepostiory extends Neo4jRepository<Lesson,Long> {
}
