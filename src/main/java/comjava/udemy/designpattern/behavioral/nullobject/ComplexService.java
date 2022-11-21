package comjava.udemy.designpattern.behavioral.nullobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComplexService {

    private String reportName;

    private StorageService storageService;

    public void generateReport() {
        System.out.println("generateReport");

        storageService.save(new Report("report name"));

    }
}
