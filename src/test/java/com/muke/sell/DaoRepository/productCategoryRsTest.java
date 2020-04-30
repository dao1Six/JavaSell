package com.muke.sell.DaoRepository;

import com.muke.sell.DAO.ProductCategory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class productCategoryRsTest {

    @Autowired
    private ProductCategoryRs ProductCategoryRs;

    @Test
    public void findOneTest(){
        Optional<ProductCategory> productCategory = ProductCategoryRs.findById(1);
        System.out.println(productCategory);
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("日用品",1);
        System.out.println(productCategory);
        ProductCategoryRs.save(productCategory);

    }

    @Test
    public void jsonTest() throws JSONException {
        JSONObject jsonObject = new JSONObject();

        JSONObject jsonObjectUserIDInfo = new JSONObject();

        JSONArray jsonArray = new JSONArray();

        String[] arr={"a","b","c"};
        jsonObjectUserIDInfo.put("产品类型", "日用品");
        jsonObjectUserIDInfo.put("dadasd", arr);
        System.out.println("json_______"+jsonObjectUserIDInfo);

    }

    @Test
    public void jssTest(){

        String[] s = {"","","ddddd"};
        for (String a:s){
            System.out.println(a);
        }

    }


}