package shop.mtcoding.blog.board;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.sql.Timestamp;

@Data
@Table(name = "board_tb")
@Entity
public class Board { // 모델링
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    private String username;
    private Timestamp createdAt;
}