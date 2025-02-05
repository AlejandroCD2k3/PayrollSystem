package adapter.inbound;

import core.domain.fileUnpackagerComponent.UnpackageFacade;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/uploadFile")
public class FileUnpackagerController {

    UnpackageFacade unpackageFacade = new UnpackageFacade();

    @PostMapping
    public void uploadFile(@PathVariable String filePath) throws IOException {
        unpackageFacade.unpackageFile(filePath);
    }
}
