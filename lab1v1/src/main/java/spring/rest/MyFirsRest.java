package spring.rest;

import listservice.DataList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;

@RestController
@RequestMapping("/rest/ledger")
public class MyFirsRest {

    private DataList dList = new DataList();

    @RequestMapping(value = "", method = RequestMethod.GET)
    public  ResponseEntity<Object> loadPage(){
        return ResponseEntity.ok(dList.getDataList());
    }

    @RequestMapping(value= "add/{num}/{month_name}/{water}/{electricity}", method = RequestMethod.POST)
    public ResponseEntity<Object> addData(@PathVariable("num") String num_s,
                                          @PathVariable("month_name") String month_name,
                                          @PathVariable("water") String water_s,
                                          @PathVariable("electricity") String electricity_s,
                                          @AuthenticationPrincipal Principal principal)
    {
        if (principal == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
        }
        if (num_s.equals("undefined") || month_name.equals("undefined") || water_s.equals("undefined") || electricity_s.equals("undefined"))
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\" : \"bad\"}");

        int num = Integer.parseInt(num_s);
        double water = Double.parseDouble(water_s);
        double electricity = Double.parseDouble(electricity_s);

        return ResponseEntity.status(HttpStatus.CREATED).body(dList.addData(num, month_name, water, electricity));
    }

    @RequestMapping(value = "delete/{num}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delData(@PathVariable("num") String num, @AuthenticationPrincipal Principal principal) {
        if (principal == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"message\" : \"Unauthorized\"}");
        }
        if (num.equals("undefined"))
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\" : \"wrong\"}");
        if (dList.delData(Integer.parseInt(num))) return ResponseEntity.ok("{\"message\" : \"deleted\"}");
        else return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"message\" : \"not found\"}");
    }
}

