package comjava.udemy.designpattern.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class File {

    private String name;
    
    public abstract void ls();
    
    public abstract void addFile(File file);
    
    public abstract File[] getFiles();
    
    public abstract boolean removeFile(File file);
}
