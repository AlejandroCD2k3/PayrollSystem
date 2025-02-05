package adapter.inbound;

import core.domain.payrollInformGenerator.PaysheetInformFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generateInform")
public class PayshetInformController {

    PaysheetInformFacade paysheetInformFacade = new PaysheetInformFacade();

    @GetMapping
    public ResponseEntity<String> generateInform(@PathVariable String fileName, @PathVariable String filePath){
        return ResponseEntity.ok(paysheetInformFacade.generatePaysheetInform(fileName, filePath));
    }

}
