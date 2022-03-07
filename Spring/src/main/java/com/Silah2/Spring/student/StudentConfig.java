package com.Silah2.Spring.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

      @Bean
      CommandLineRunner commandLineRunner(StudentRepository repository){
          return args -> {
            Student brian = new Student(
                "Brian",
                "brian.silah@gmail.com",
                LocalDate.of(2002, Month.OCTOBER, 1)

            );
            Student ilhan = new Student(
                "Ilhan",
                "martiilhan@gmail.com",
                LocalDate.of(1998, Month.SEPTEMBER, 13)

            );
            repository.saveAll(
                List.of(brian,ilhan)
            );
          };
      }
}
