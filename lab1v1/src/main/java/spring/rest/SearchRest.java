package spring.rest;

import listservice.Data;
import listservice.DataList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/search")
public class SearchRest {

    private DataList dataList = new DataList();

    @RequestMapping(value = "/{month_name}", method = RequestMethod.POST)
    public ResponseEntity<Object> searchData(@PathVariable("month_name") String month_name) {
        if (month_name.equals("undefined"))
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\" : \"wrooong\"}");
        List<Data> searchResult = dataList.searchData(month_name);
        if (searchResult.isEmpty())
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"message\" : \"not found\"}");
        else return ResponseEntity.ok(searchResult);
    }

}
