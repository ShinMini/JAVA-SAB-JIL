package model.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

@Builder
public class Product {
   private String product_name;
   private int counts;
   
   
}