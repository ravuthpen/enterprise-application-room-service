package com.piseth.java.school.roomservice.service.ulit;

import com.piseth.java.school.roomservice.dto.RoomFilterDTO;
import com.piseth.java.school.roomservice.util.RoomCriteriaBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class RoomCriteriaBuilderTest {
    /*

    @Test
    void shouldReturnEmptyCriteria_whenNoFilterProvider(){

        //given
        RoomFilterDTO filter = new RoomFilterDTO();
        //when
        Criteria criteria = RoomCriteriaBuilder.build(filter);

        //then
        assertThat(criteria.getCriteriaObject().isEmpty());
    }

    @Test
    void shouldAddNameCriteria_whenNameProvider(){
        //give
        RoomFilterDTO filter = new RoomFilterDTO();
        filter.setName("Luxury Room");

        //when
        Criteria criteria = RoomCriteriaBuilder.build(filter);
        String json = criteria.getCriteriaObject().toJson();

        //then
        assertThat(json).contains("name","Luxury Room");

    }

    @Test
    void shouldAddFloorCriteria_whenFloorProvided(){

        RoomFilterDTO filter = new RoomFilterDTO();
        filter.setFloor(3);

        Criteria criteria = RoomCriteriaBuilder.build(filter);
        String json = criteria.getCriteriaObject().toJson();

        assertThat(json).contains("floor","3");

    }

    @Test
    void shouldAddPriceCriteria_withOperationLT(){

        RoomFilterDTO filter = new RoomFilterDTO();
        filter.setPrice(60d);
        filter.setPriceOp("lt");

        Criteria criteria = RoomCriteriaBuilder.build(filter);
        String json = criteria.getCriteriaObject().toJson();

        assertThat(json).contains("price").contains("lt");
    }
    @Test
    void shouldAddPriceCriteria_withOperationLTE(){

        RoomFilterDTO filter = new RoomFilterDTO();
        filter.setPrice(60d);
        filter.setPriceOp("lte");

        Criteria criteria = RoomCriteriaBuilder.build(filter);
        String json = criteria.getCriteriaObject().toJson();

        assertThat(json).contains("price").contains("lte");
    }

    @Test
    void shouldAddPriceCriteria_withOperationGT(){

        RoomFilterDTO filter = new RoomFilterDTO();
        filter.setPrice(60d);
        filter.setPriceOp("gt");

        Criteria criteria = RoomCriteriaBuilder.build(filter);
        String json = criteria.getCriteriaObject().toJson();

        assertThat(json).contains("price").contains("gt");
    }

    @Test
    void shouldAddPriceCriteria_withOperationGTE(){

        RoomFilterDTO filter = new RoomFilterDTO();
        filter.setPrice(60d);
        filter.setPriceOp("gte");

        Criteria criteria = RoomCriteriaBuilder.build(filter);
        String json = criteria.getCriteriaObject().toJson();

        assertThat(json).contains("price").contains("gte");
    }

    @Test
    void shouldAddPriceCriteria_withOperationEQ(){

        RoomFilterDTO filter = new RoomFilterDTO();
        filter.setPrice(60d);
        filter.setPriceOp("eq");

        Criteria criteria = RoomCriteriaBuilder.build(filter);
        String json = criteria.getCriteriaObject().toJson();

        assertThat(json).contains("price").contains("60");
    }

    @Test
    void shouldAddPriceMin_PriceMax(){

        RoomFilterDTO filter = new RoomFilterDTO();
        filter.setPriceMin(60d);
        filter.setPriceMax(80d);

        Criteria criteria = RoomCriteriaBuilder.build(filter);
        String json = criteria.getCriteriaObject().toJson();

        assertThat(json).contains("price").contains("gte").contains("lte");
    }

    @Test
    public void sort_withValidFieldASC(){

        //given
        RoomFilterDTO filter = new RoomFilterDTO();
        filter.setDirection("asc");
        filter.setSortBy("price");

        //when
        Sort sort = RoomCriteriaBuilder.sort(filter);

        //then
        assertThat(sort.getOrderFor("attributes.price")).isNotNull();
        assertThat(sort.getOrderFor("attributes.price").getDirection())
                .isEqualTo(Sort.Direction.ASC);

    }

    @Test
    void sort_withInvalidDField_throwException(){

        //given
        RoomFilterDTO filter = new RoomFilterDTO();
        filter.setDirection("asc");
        filter.setSortBy("type"); //type is invalid field

        assertThatThrownBy(()->RoomCriteriaBuilder.sort(filter))
                .isInstanceOf(IllegalArgumentException.class);
                //.hasMessageContaining("Invalid sort field");
    }

    @Test
    void sort_withDefaultValue(){
        //given
        RoomFilterDTO filter = new RoomFilterDTO();

        //when
        Sort sort = RoomCriteriaBuilder.sort(filter);

        //then
        assertThat(sort.getOrderFor("name")).isNotNull();
        assertThat(sort.getOrderFor("name").getDirection())
                .isEqualTo(Sort.Direction.ASC);
    }

    @Test
    void sort_withDirectionDESC(){
        //given
        RoomFilterDTO filter = new RoomFilterDTO();
        filter.setDirection("desc");

        //when
        Sort sort = RoomCriteriaBuilder.sort(filter);

        //then
        assertThat(sort.getOrderFor("name")).isNotNull();
        assertThat(sort.getOrderFor("name").getDirection())
                .isEqualTo(Sort.Direction.DESC);
    }


*/
}
