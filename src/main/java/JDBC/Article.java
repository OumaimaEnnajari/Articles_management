package JDBC;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.element.NestingKind;
@Data
@Builder
public class Article {
    private String code ;
    private String designation ;
    private float prix ;

}
