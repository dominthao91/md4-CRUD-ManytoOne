package thao.demospringboot.model.motor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import thao.demospringboot.model.category.Category;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Motor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String description;
    @ManyToOne(fetch = FetchType.EAGER,targetEntity = Category.class)
    @JoinColumn(name = "category_id")
    private Category category;
    private String image;
}
